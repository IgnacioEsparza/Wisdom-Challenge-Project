/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wisdomjframe;
import wisdomchallenge.Conf;
/**
 *
 * @author Ignacio Esparza
 */
public class PuntajeObtenido extends javax.swing.JFrame {
     Conf c = new Conf ();
    /**
     * Creates new form PuntajeObtenido
     */
    public PuntajeObtenido() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Tu Puntaje Actual");
        setResizable(false);
        setSize(550, 580);
        puntajeObtenido.setText(String.valueOf(100));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jcMousePanel1 = new jcMousePanel.jcMousePanel();
        puntObtenido = new javax.swing.JLabel();
        puntajeObtenido = new javax.swing.JLabel();
        volverMenuPO = new javax.swing.JButton();
        puntajeObtenido1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jcMousePanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/generalbg.png"))); // NOI18N
        jcMousePanel1.setMaximumSize(new java.awt.Dimension(550, 520));
        jcMousePanel1.setMinimumSize(new java.awt.Dimension(550, 520));

        puntObtenido.setFont(new java.awt.Font("Diogenes", 0, 24)); // NOI18N
        puntObtenido.setText("Puntaje Obtenido");

        puntajeObtenido.setFont(new java.awt.Font("Diogenes", 0, 24)); // NOI18N
        puntajeObtenido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        puntajeObtenido.setText("0");

        volverMenuPO.setFont(new java.awt.Font("Diogenes", 0, 18)); // NOI18N
        volverMenuPO.setText("Volver");
        volverMenuPO.setMaximumSize(new java.awt.Dimension(1071, 477));
        volverMenuPO.setMinimumSize(new java.awt.Dimension(1071, 477));
        volverMenuPO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverMenuPOActionPerformed(evt);
            }
        });

        puntajeObtenido1.setFont(new java.awt.Font("Diogenes", 0, 24)); // NOI18N
        puntajeObtenido1.setText("Tu Puntaje Ha sido de :");

        javax.swing.GroupLayout jcMousePanel1Layout = new javax.swing.GroupLayout(jcMousePanel1);
        jcMousePanel1.setLayout(jcMousePanel1Layout);
        jcMousePanel1Layout.setHorizontalGroup(
            jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jcMousePanel1Layout.createSequentialGroup()
                .addGap(225, 225, 225)
                .addComponent(volverMenuPO, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jcMousePanel1Layout.createSequentialGroup()
                .addContainerGap(168, Short.MAX_VALUE)
                .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jcMousePanel1Layout.createSequentialGroup()
                        .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(puntObtenido)
                            .addGroup(jcMousePanel1Layout.createSequentialGroup()
                                .addComponent(puntajeObtenido)
                                .addGap(77, 77, 77)))
                        .addGap(185, 185, 185))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jcMousePanel1Layout.createSequentialGroup()
                        .addComponent(puntajeObtenido1)
                        .addGap(158, 158, 158))))
        );
        jcMousePanel1Layout.setVerticalGroup(
            jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jcMousePanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(puntObtenido)
                .addGap(122, 122, 122)
                .addComponent(puntajeObtenido1)
                .addGap(18, 18, 18)
                .addComponent(puntajeObtenido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 197, Short.MAX_VALUE)
                .addComponent(volverMenuPO, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jcMousePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jcMousePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void volverMenuPOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverMenuPOActionPerformed
        Menu m = new Menu();
        m.setVisible(true);
        dispose();
    }//GEN-LAST:event_volverMenuPOActionPerformed

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
            java.util.logging.Logger.getLogger(PuntajeObtenido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PuntajeObtenido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PuntajeObtenido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PuntajeObtenido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PuntajeObtenido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private jcMousePanel.jcMousePanel jcMousePanel1;
    private javax.swing.JLabel puntObtenido;
    private javax.swing.JLabel puntajeObtenido;
    private javax.swing.JLabel puntajeObtenido1;
    private javax.swing.JButton volverMenuPO;
    // End of variables declaration//GEN-END:variables
}