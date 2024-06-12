package book;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class koneksi {
    public static Connection connectionmysql;  

    public static Connection ConnectionDB() {
        try {
            if (connectionmysql == null || connectionmysql.isClosed()) {
                String url = "jdbc:mysql://localhost:3306/bookstore";
                String user = "root";
                String pass = ""; 
                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                connectionmysql = DriverManager.getConnection(url, user, pass);
                JOptionPane.showMessageDialog(null, "Connection Successful");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Connection Failed: " + e.getMessage());
        }
        return connectionmysql;      
    }  

    public static void main(String args[]) {
        ConnectionDB();
    }
}
