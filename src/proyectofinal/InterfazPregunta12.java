package proyectofinal;

public class InterfazPregunta12 extends javax.swing.JFrame {

    public InterfazPregunta12() {
        initComponents();
        GrupoBotones.add(BotonPublico);
        GrupoBotones.add(BotonPropio);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrupoBotones = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        BotonPublico = new javax.swing.JRadioButton();
        BotonPropio = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pregunta 12");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Siguiente Pregunta");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 140, 50));

        BotonPublico.setSelected(true);
        BotonPublico.setText("Público");
        BotonPublico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPublicoActionPerformed(evt);
            }
        });
        getContentPane().add(BotonPublico, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 60, 30));

        BotonPropio.setText("Propio");
        getContentPane().add(BotonPropio, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, -1, -1));

        jLabel3.setText("Al salir de casa,");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, -1, -1));

        jLabel4.setText("12. ¿Tomas transporte público o propio?");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(BotonPublico.isSelected()){
            ProyectoFinal.EcoPuntos= ProyectoFinal.EcoPuntos - 10;
        } else{
            ProyectoFinal.EcoPuntos= ProyectoFinal.EcoPuntos + 10;
        }
        setVisible(false);
        InterfazPregunta13 Ipregunta13 = new InterfazPregunta13();
        Ipregunta13.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BotonPublicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPublicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonPublicoActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazPregunta12().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton BotonPropio;
    private javax.swing.JRadioButton BotonPublico;
    private javax.swing.ButtonGroup GrupoBotones;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
