package proyectofinal;

public class InterfazPregunta13 extends javax.swing.JFrame {

    public InterfazPregunta13() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pregunta 13");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Siguiente Pregunta");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 140, 50));

        BotonSi.setSelected(true);
        BotonSi.setText("Si");
        BotonSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSiActionPerformed(evt);
            }
        });
        getContentPane().add(BotonSi, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 60, 30));

        BotonNo.setText("No");
        getContentPane().add(BotonNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, -1, -1));

        jLabel1.setText("13. ¿Consumes bebidas y alimentos que se encuentran dentro de envoltorios plásticos ?");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, 40));

        jLabel2.setText("Sobre el uso de plásticos...");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(BotonSi.isSelected()){
            ProyectoFinal.EcoPuntos= ProyectoFinal.EcoPuntos + 10;
        } else{
            ProyectoFinal.EcoPuntos= ProyectoFinal.EcoPuntos - 10;
        }
        setVisible(false);
        InterfazPregunta14 Ipregunta14 = new InterfazPregunta14();
        Ipregunta14.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BotonSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonSiActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazPregunta13().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton BotonNo;
    private javax.swing.JRadioButton BotonSi;
    private javax.swing.ButtonGroup GrupoBotones;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
