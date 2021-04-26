/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventana;

import java.awt.event.KeyEvent;

import javax.swing.JOptionPane;
import Controlador_BD_Historial.Conexion_BD_Historial;
import modelo.historial;

/**
 * @author Usuario
 */
public class Ventana_oscura extends javax.swing.JFrame {
private String enlace;
private String direccion;
private Conexion_BD_Historial conexionHistorial;
private historial hist;

    public Ventana_oscura() {
        initComponents();
        setLocationRelativeTo(null); 
        conexionHistorial = new Conexion_BD_Historial();
    }
    void buscador() {
        System.out.println(enlace);
    if(java.awt.Desktop.isDesktopSupported()){
            java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
            
            if(desktop.isSupported(java.awt.Desktop.Action.BROWSE)){
                try{
                    java.net.URI uri = new java.net.URI(enlace);
                    desktop.browse(uri);
      
                }catch (Exception ex){
                    System.out.println(ex);
                }
            }
        }
}
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        titulo = new javax.swing.JLabel();
        texto1 = new javax.swing.JTextField();
        modo_claro = new javax.swing.JButton();
        fondito = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo.setFont(new java.awt.Font("DigifaceWide", 1, 36)); // NOI18N
        titulo.setText("YERGIX");
        jDesktopPane1.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, -1, -1));

        texto1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                texto1KeyPressed(evt);
            }
        });
        jDesktopPane1.add(texto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 290, -1));

        modo_claro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/dom (1).png"))); // NOI18N
        modo_claro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modo_claroActionPerformed(evt);
            }
        });
        jDesktopPane1.add(modo_claro, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        fondito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/depositphotos_8214705-stock-photo-grunge-industrial-background.jpg"))); // NOI18N
        jDesktopPane1.add(fondito, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 570, 290));

        jMenu1.setText("Atajo");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Historial");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void texto1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_texto1KeyPressed
        char x=evt.getKeyChar();
        if(x == KeyEvent.VK_ENTER){
            direccion = texto1.getText();
            enlace="https://scholar.google.es/scholar?hl=es&as_sdt=0%2C5&q="+direccion+"&btnG=";
            hist = new historial(enlace);
            conexionHistorial.ingresarPersona(hist);
            texto1.setText("");
            buscador();
        }
        char a=evt.getKeyChar();
         if(a == KeyEvent.VK_SPACE){
          JOptionPane.showMessageDialog(null,"Utilize el + en lugar de espacios por favor, gracias.");
             texto1.setText("");
       }
    }//GEN-LAST:event_texto1KeyPressed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
histo v_histo =new histo();
v_histo.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void modo_claroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modo_claroActionPerformed
        Ventana ventana=new Ventana();
        this.setVisible(false);
        ventana.setVisible(true);
    }//GEN-LAST:event_modo_claroActionPerformed

    
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
            java.util.logging.Logger.getLogger(Ventana_oscura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_oscura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_oscura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_oscura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_oscura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondito;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JButton modo_claro;
    private javax.swing.JTextField texto1;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
