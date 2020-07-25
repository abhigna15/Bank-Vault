package mymp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection{
    Connection conn;
    public MyConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Searching for connection class.....");
        }catch(ClassNotFoundException cnf){
            System.out.println("class not found..."+cnf.getLocalizedMessage());
        }
        try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost/bank","ABHIGNA KV","MySQLdatabaseabhigna");
        }catch(SQLException e2){
            e2.printStackTrace();
        }
    }
    public Connection getConnection(){
        return conn;
    }
    
    
}
