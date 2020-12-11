package proyectofinal;

public class InterfazDatos extends javax.swing.JFrame {

    public InterfazDatos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        OpcionHombreMujer = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        OpcionHombreMujer1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        OpcionHombreMujer2 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        Nombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Encuesta concientización ");
        setPreferredSize(new java.awt.Dimension(500, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("¿A que te dedicas?");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, -1, 20));

        OpcionHombreMujer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estudiante", "Empleado", "Independiente", "Prefiero no decirlo" }));
        getContentPane().add(OpcionHombreMujer, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 140, -1));

        jLabel3.setText("¿Cuál es tu género?");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, -1, 20));

        OpcionHombreMujer1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hombre", "Mujer", "Prefiero no decirlo" }));
        getContentPane().add(OpcionHombreMujer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 140, -1));

        jLabel4.setText("Bienvenid@, selecciona una opción:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, -1, -1));

        jLabel5.setText("¿Que edad tienes?");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, -1, 20));

        OpcionHombreMujer2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Menos de 18 años", "18-25", "26-34", "35-43", "Más de 43 años" }));
        OpcionHombreMujer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpcionHombreMujer2ActionPerformed(evt);
            }
        });
        getContentPane().add(OpcionHombreMujer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 140, -1));

        jButton1.setText("Siguiente Pregunta");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, -1, -1));

        Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreActionPerformed(evt);
            }
        });
        getContentPane().add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 130, -1));

        jLabel2.setText("Ingresa tu nombre");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Object genero= OpcionHombreMujer.getSelectedItem();
        ProyectoFinal.Genero=String.valueOf(genero);
        Object edad= OpcionHombreMujer1.getSelectedItem();
        ProyectoFinal.Edad= String.valueOf(edad);
        Object profesion= OpcionHombreMujer2.getSelectedItem();
        ProyectoFinal.Profesion=String.valueOf(profesion);
        try {
            Object nombre= Nombre.getText();
            ProyectoFinal.Nombre= String.valueOf(nombre);
        } catch (Exception e){
            System.out.println("ERROR: El nombre ingresado es nulo.");
        }
        setVisible(false);
        InterfazPregunta01 Ipregunta1 = new InterfazPregunta01();
        Ipregunta1.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void OpcionHombreMujer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpcionHombreMujer2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OpcionHombreMujer2ActionPerformed

    private void NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazDatos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Nombre;
    private javax.swing.JComboBox<String> OpcionHombreMujer;
    private javax.swing.JComboBox<String> OpcionHombreMujer1;
    private javax.swing.JComboBox<String> OpcionHombreMujer2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
