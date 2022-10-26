package controlador;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.*;

public class ScrollingDemo {
    
    private static Statement stmt = null;
    private static ResultSet rset = null;
        
    public static Proveedor login(String consulta){
        try {
            ConnectionFactory.abrirConexion();
            stmt = ConnectionFactory.getConexion().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, 
                                  ResultSet.CONCUR_READ_ONLY);
            rset = stmt.executeQuery(consulta);
            if (!rset.first()) {
                JOptionPane.showMessageDialog(null, "El usuario o la contraseña no son correctos");
                return null;
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error con la consulta");
            
        }
        return devolverProveedor();
    }
    
    public static void crearConsulta(String consulta){
        try {
            stmt = ConnectionFactory.getConexion().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, 
                                  ResultSet.CONCUR_READ_ONLY);
            rset = stmt.executeQuery(consulta);
            if (rset.next()) {
                rset.first();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    public static Proveedor devolverProveedor() {
        Proveedor pv = null;
        try {
            pv = new Proveedor(rset.getInt(1),
                    rset.getString(2),
                    rset.getString(3),
                    rset.getString(4),
                    rset.getFloat(5));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ha habido un problema al extraer el proveedor");
        }
        
        return pv;
    }
    
    // Arraylist
    /*
    public ArrayList listaApellido()
    {
        ArrayList<String> listaApellido = new ArrayList<String>();
        try {
        System.out.println(rset.getObject(1).toString());
            rset.first();
            listaApellido.add(rset.getString(1));
            
            while (rset.next()) {
                listaApellido.add(rset.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ScrollingDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
        cerrarStmtyRset();

        return listaApellido;
    }*/
    
    
    public boolean siguienteEmpleado()
    {
        try {
            return rset.next();
        } catch (SQLException ex) {
            Logger.getLogger(ScrollingDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public boolean anteriorEmpleado()
    {
        try {
            return rset.previous();
        } catch (SQLException ex) {
            Logger.getLogger(ScrollingDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public boolean esPrimero()
    {
        try {
            if(rset.isFirst())
                return true;
        } catch (SQLException ex) {
            Logger.getLogger(ScrollingDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public boolean esUltimo()
    {
        try {
            if(rset.isLast())
                return true;
        } catch (SQLException ex) {
            Logger.getLogger(ScrollingDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public void cerrarStmtyRset() {
        try {
            rset.close();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(ScrollingDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}