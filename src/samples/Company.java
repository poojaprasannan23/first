package samples;
import java.sql.*;

/**
 * Created by expert on 8/3/18.
 */
public class Company {
    public static void main(String[] args) throws ClassNotFoundException,SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","root");
        Statement statement=connection.createStatement();
        ResultSet rs=statement.executeQuery("select avg(salary)from Employee");
        while(rs.next()){
            System.out.println("Average salary:"+rs.getInt(1));
        }
        ResultSet rs1=statement.executeQuery("select * from Product order by name");
        while(rs1.next()){
            System.out.println(rs1.getInt(1)+" "+rs1.getString(2)+" "+rs1.getInt(3)+" "+rs1.getInt(4));
        }
        Statement statement2=connection.createStatement();
        ResultSet rs2=statement.executeQuery("select * from Employee where salary>15000 and gender='m'");
        while(rs2.next()){
            System.out.println(rs2.getInt(1)+" "+rs2.getString(2)+" "+rs2.getString(3)+" "+rs2.getInt(4));
        }
        Statement statement3=connection.createStatement();
        statement.executeUpdate("update Product set price=12 where idProduct=101");
        ResultSet rs3=statement3.executeQuery("select *from Product");

        while(rs3.next()){
            System.out.println(rs3.getInt(1)+" "+rs3.getString(2)+" "+rs3.getInt(3)+" "+rs3.getInt(4));

        }


    }
}
