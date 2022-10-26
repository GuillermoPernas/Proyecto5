/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import controlador.ScrollingDemo;
import modelo.Proveedor;

/**
 *
 * @author Pernas
 */
public class GestorProveedores extends javax.swing.JFrame {

    private Proveedor prov = null;
    JPanelLogin panelUsuario = null;
    /**
     * Creates new form GestorProveedores
     */
    public GestorProveedores() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuConexion = new javax.swing.JMenu();
        jMenuItemAbrir = new javax.swing.JMenuItem();
        jMenuItemCerrar = new javax.swing.JMenuItem();
        jMenuVisualizar = new javax.swing.JMenu();
        jMenuItemDetalle = new javax.swing.JMenuItem();
        jMenuItemResumen = new javax.swing.JMenuItem();
        jMenuAcercaDe = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenuConexion.setText("Conexion");

        jMenuItemAbrir.setText("Abrir");
        jMenuItemAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAbrirActionPerformed(evt);
            }
        });
        jMenuConexion.add(jMenuItemAbrir);

        jMenuItemCerrar.setText("Cerrar");
        jMenuConexion.add(jMenuItemCerrar);

        jMenuBar1.add(jMenuConexion);

        jMenuVisualizar.setText("Visualizar");

        jMenuItemDetalle.setText("Detalle");
        jMenuVisualizar.add(jMenuItemDetalle);

        jMenuItemResumen.setText("Resumen");
        jMenuVisualizar.add(jMenuItemResumen);

        jMenuBar1.add(jMenuVisualizar);

        jMenuAcercaDe.setText("Acerca de...");
        jMenuBar1.add(jMenuAcercaDe);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 547, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAbrirActionPerformed
        if(panelUsuario == null)
            panelUsuario = new JPanelLogin();
        setContentPane(panelUsuario);
    }//GEN-LAST:event_jMenuItemAbrirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GestorProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestorProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestorProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestorProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestorProveedores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenuAcercaDe;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuConexion;
    private javax.swing.JMenuItem jMenuItemAbrir;
    private javax.swing.JMenuItem jMenuItemCerrar;
    private javax.swing.JMenuItem jMenuItemDetalle;
    private javax.swing.JMenuItem jMenuItemResumen;
    private javax.swing.JMenu jMenuVisualizar;
    // End of variables declaration//GEN-END:variables

    public void recogeDatosLogin() {
        prov = ScrollingDemo.login("select * from proveedor where usuario='"   + "' and contrasena='"   + "'");
    }
    
    public void defineProveedor(String consulta) {
        prov = ScrollingDemo.login(consulta);
        if (prov == null){
            panelUsuario.setVisible(false);
        }else{
            jMenuItemCerrar.setEnabled(true);
            jMenuItemAbrir.setEnabled(false);
            jMenuVisualizar.setEnabled(true);
            jMenuAcercaDe.setEnabled(true);
        }
            
            
        
    }
}
