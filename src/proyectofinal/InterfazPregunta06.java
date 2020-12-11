package proyectofinal;

public class InterfazPregunta06 extends javax.swing.JFrame {

    public InterfazPregunta06() {
        initComponents();
        GrupoBotones.add(BotonSi);
        GrupoBotones.add(BotonNo);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrupoBotones = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        BotonSi = new javax.swing.JRadioButton();
        BotonNo = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pregunta 6");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Siguiente Pregunta");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 140, 50));

        BotonSi.setSelected(true);
        BotonSi.setText("Sí");
        BotonSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSiActionPerformed(evt);
            }
        });
        getContentPane().add(BotonSi, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 60, 30));

        BotonNo.setText("No");
        getContentPane().add(BotonNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, -1, -1));

        jLabel2.setText("6. ¿Utilizas cubiertos y/o platos de plástico frecuentemente?");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, -1, -1));

        jLabel3.setText("¿Y que hay de tus implementos?");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(BotonSi.isSelected()){
            ProyectoFinal.EcoPuntos= ProyectoFinal.EcoPuntos + 10;
        } else{
            ProyectoFinal.EcoPuntos= ProyectoFinal.EcoPuntos - 10;
        }
        setVisible(false);
        InterfazPregunta07 Ipregunta7 = new InterfazPregunta07();
        Ipregunta7.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BotonSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonSiActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazPregunta06().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton BotonNo;
    private javax.swing.JRadioButton BotonSi;
    private javax.swing.ButtonGroup GrupoBotones;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
