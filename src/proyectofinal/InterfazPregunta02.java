package proyectofinal;

public class InterfazPregunta02 extends javax.swing.JFrame {

    public InterfazPregunta02() {
        initComponents();
        GrupoBotones.add(BotonMenos);
        GrupoBotones.add(BotonMas);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrupoBotones = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        BotonMenos = new javax.swing.JRadioButton();
        BotonMas = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pregunta 2");
        setPreferredSize(new java.awt.Dimension(500, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Siguiente Pregunta");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 140, 50));

        BotonMenos.setSelected(true);
        BotonMenos.setText("Menos de 10 minutos");
        BotonMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMenosActionPerformed(evt);
            }
        });
        getContentPane().add(BotonMenos, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 130, 30));

        BotonMas.setText("Más de 10 minutos");
        BotonMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMasActionPerformed(evt);
            }
        });
        getContentPane().add(BotonMas, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, -1, -1));

        jLabel2.setText("2. ¿Cuanto te demoras tomando un baño?");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (BotonMenos.isSelected()){
            ProyectoFinal.EcoPuntos= ProyectoFinal.EcoPuntos - 10;
        } else{
            ProyectoFinal.EcoPuntos= ProyectoFinal.EcoPuntos + 10;
        }
        setVisible(false);
        InterfazPregunta03 Ipregunta3 = new InterfazPregunta03();
        Ipregunta3.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BotonMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMenosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonMenosActionPerformed

    private void BotonMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonMasActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazPregunta02().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton BotonMas;
    private javax.swing.JRadioButton BotonMenos;
    private javax.swing.ButtonGroup GrupoBotones;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
