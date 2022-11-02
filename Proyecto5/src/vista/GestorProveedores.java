/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import controlador.ConnectionFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.plaf.basic.BasicArrowButton;
import modelo.Proveedor;

/**
 *
 * @author Pernas
 */
public class GestorProveedores extends javax.swing.JFrame {

    private Proveedor prov = null;
    JPanelLogin panelUsuario = null;
    JPanelDetalle panelDetalle = null;
    JPanelResumen panelResumen = null;
    /**
     * Creates new form GestorProveedores
     */
    public GestorProveedores() {
        initComponents();
        
        setLocationRelativeTo(null);
        jMenuItemCerrar.setEnabled(false);
        jMenuVisualizar.setEnabled(false);
        jMenuAcercaDe.setEnabled(false);
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
        jMenuItemCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCerrarActionPerformed(evt);
            }
        });
        jMenuConexion.add(jMenuItemCerrar);

        jMenuBar1.add(jMenuConexion);

        jMenuVisualizar.setText("Visualizar");

        jMenuItemDetalle.setText("Detalle");
        jMenuItemDetalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemDetalleActionPerformed(evt);
            }
        });
        jMenuVisualizar.add(jMenuItemDetalle);

        jMenuItemResumen.setText("Resumen");
        jMenuItemResumen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemResumenActionPerformed(evt);
            }
        });
        jMenuVisualizar.add(jMenuItemResumen);

        jMenuBar1.add(jMenuVisualizar);

        jMenuAcercaDe.setText("Acerca de...");
        jMenuAcercaDe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuAcercaDeMouseClicked(evt);
            }
        });
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
        if(panelUsuario == null){
            panelUsuario = new JPanelLogin(jMenuItemCerrar, jMenuItemAbrir, jMenuVisualizar, jMenuAcercaDe);
        }
        ConnectionFactory.abrirConexion();
        setContentPane(panelUsuario);
        panelUsuario.setVisible(true);
        pack();
        
    }//GEN-LAST:event_jMenuItemAbrirActionPerformed

    private void jMenuItemCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCerrarActionPerformed
        ConnectionFactory.close();
        deshabilitaMenu();
        pack();
    }//GEN-LAST:event_jMenuItemCerrarActionPerformed

    private void jMenuAcercaDeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuAcercaDeMouseClicked
        AcercaDe dialogoAcercaDe = new AcercaDe(this, true);
        dialogoAcercaDe.setVisible(true);
//        dialogoAcercaDe.setSize(300, 300);
//        dialogoAcercaDe.setLocation(800, 200);
//        JLabel acercaDeLabel = new JLabel("AUTORES:\n Inmaculada Rueda \n Guillermo Pernas \n\n Fecha: 28/10/2022");
//        JButton acercaDeButton = new JButton("Hola");
//        dialogoAcercaDe.add(acercaDeLabel);
//        dialogoAcercaDe.add(acercaDeButton);
//        dialogoAcercaDe.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        //showMessageDialog(null, "AUTORES:\n Inmaculada Rueda \n Guillermo Pernas \n\n Fecha: 28/10/2022");
        //pack();
    }//GEN-LAST:event_jMenuAcercaDeMouseClicked

    private void jMenuItemDetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemDetalleActionPerformed
        if(panelDetalle == null){
            panelDetalle = new JPanelDetalle();
        }
        //ConnectionFactory.abrirConexion();
        panelDetalle.setVisible(true);
        setContentPane(panelDetalle);
        pack();
    }//GEN-LAST:event_jMenuItemDetalleActionPerformed

    private void jMenuItemResumenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemResumenActionPerformed
        if(panelResumen == null){
            panelResumen = new JPanelResumen();
        }
        //ConnectionFactory.abrirConexion();
        panelResumen.setVisible(true);
        setContentPane(panelResumen);
        pack();
    }//GEN-LAST:event_jMenuItemResumenActionPerformed

    
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

    
    public void deshabilitaMenu() {
        jMenuItemCerrar.setEnabled(false);
        jMenuItemAbrir.setEnabled(true);
        jMenuVisualizar.setEnabled(false);
        jMenuAcercaDe.setEnabled(false);
    }
}
