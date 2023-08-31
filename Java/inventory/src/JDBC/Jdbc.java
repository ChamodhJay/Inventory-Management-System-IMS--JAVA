
package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*; 

public class Jdbc {
    static String url = "jdbc:mysql://localhost:3306/inventory_management_system";
    
    public static Connection con() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection(url,"root","1234");  
        return con;
    }

    public void putdata(String sql) throws Exception {
        Statement st = con().createStatement();
        st.executeUpdate(sql);
       
    }

    public ResultSet getdata(String sql) throws Exception {
        Statement st = con().createStatement();
        ResultSet r = st.executeQuery(sql);
        return r;

    }
}
