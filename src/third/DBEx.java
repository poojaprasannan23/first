package third;
import java.sql.*;

/**
 * Created by expert on 7/31/18.
 */
public class DBEx {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root", "root");
        PreparedStatement ps = connection.prepareStatement("select * from student where id=?");
        ps.setInt(1, 1);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) ;
        System.out.println(rs.getString(1) + " " + rs.getString(2));


        CallableStatement cs = connection.prepareCall("" + "{call getDepartment(?,?,?)}");
        cs.setInt(1, 102);
        cs.setString(2, "cse");
        cs.registerOutParameter(3, Types.INTEGER);
        cs.execute();
//        ResultSet rs1 = cs.getResultSet();
//        while (rs1.next()) {
//            System.out.println(rs1.getInt("deptid") + " " + rs1.getString("deptname"));
//        }
         int x=cs.getInt(3);
        //or
        //int y = cs.getInt("total");
        System.out.println(x);
        connection.close();

    }

}

