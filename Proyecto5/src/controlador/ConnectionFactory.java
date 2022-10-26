package controlador;

import java.sql.*;

public class ConnectionFactory {

    private static Connection conexion = null;

    public static void abrirConexion() throws SQLException {

        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) {
            System.out.println("ERROR: exception loading driver class");
        }

        String url = "jdbc:derby://localhost:1527/proveedores";

        try {
            System.out.println("hola");
            conexion = DriverManager.getConnection(url, "proveedores", "proveedores");
        } catch (SQLException ex) {
            System.out.println("ERROR: conexion");
        }

    }

    public static void close(Connection conn) {
        if (conn != null)
      try {
            conn.close();
        } catch (SQLException ignored) {
        }
    }

    public static Connection getConexion() {
        return conexion;
    }
}