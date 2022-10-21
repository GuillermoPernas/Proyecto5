package controlador;

import java.sql.*;

public class ConnectionFactory {
    
    private ConnectionFactory() {
    }

    public static Connection getConnection() throws SQLException {
        
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");	
        } catch (ClassNotFoundException e) {
            System.out.println("ERROR: exception loading driver class");
        } 
        
        String url = "jdbc:derby://localhost:1527/proveedores";
        
        return DriverManager.getConnection(url,"proveedores","proveedores");
    } 

    public static void close(Connection conn) {
      try {
        conn.close();
      } catch (SQLException ignored) {}
    } 
}