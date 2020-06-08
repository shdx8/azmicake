package main;
/* @author shdx*/
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class koneksi {
    
    public static Connection con;
    public static Statement stm;
    public static ResultSet res;
    public void config(){
        
        try {
            String url="jdbc:mysql://localhost/azmicake"; //url database
            String user="root"; //user database
            String pass=""; //password database
            Class.forName("com.mysql.jdbc.Driver");
            con=(Connection) DriverManager.getConnection(url,user,pass);
            stm=(Statement) con.createStatement();
            
        } catch (Exception e) {
            
        }
    }
    
    
    private static Connection mysqlconfig;
    public static Connection configDB()throws SQLException{
        try {
            String url="jdbc:mysql://localhost:3306/azmicake"; //url database
            String user="root"; //user database
            String pass=""; //password database
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            mysqlconfig=DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
             //perintah menampilkan error pada koneksi
        }
        return mysqlconfig;
    }
}