package third;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.*;
/**
 * Created by expert on 7/30/18.
 */
public class DBConnection {
    public static void main(String[] args) throws ClassNotFoundException,SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","root");
        Statement statement=connection.createStatement();

       int i= statement.executeUpdate("insert into student values(1,'pooja')");
        ResultSet rs=statement.executeQuery("select * from student");
        while(rs.next()){
            System.out.println(rs.getInt(1)+" "+rs.getString("name"));



        }
        PreparedStatement ps=connection.prepareStatement("insert into"+"student values(?,?)");
        ps.setInt(1,20);
        ps.setString(1,"anu");
        ps.executeUpdate();
        connection.close();
    }
}
