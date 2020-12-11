package proyectofinal;
public class ResultadosEncuesta extends javax.swing.JFrame {

    public ResultadosEncuesta() {
        initComponents();
        Age.setText("Edad: "+ ProyectoFinal.Edad);
        Genre.setText("Género: "+ ProyectoFinal.Genero);
        Name.setText("Nombre: " + ProyectoFinal.Nombre);
        Profession.setText("Profesión: " + ProyectoFinal.Profesion);
        Points.setText("Cantidad de contaminación: "+ ProyectoFinal.EcoPuntos + "/200");
        if (ProyectoFinal.EcoPuntos<50){
            Rank.setText("Rango: Ciudadano ejemplar B)");
        } else{ 
            if (ProyectoFinal.EcoPuntos>50){
                if (ProyectoFinal.EcoPuntos<110){
                    Rank.setText("Rango: Ciudadano promedio");
                } else{
                    Rank.setText("Rango: Ey, ey, no le queremos hacer competencia a las multinacionales");
                }
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BotonSalir = new javax.swing.JButton();
        Name = new javax.swing.JLabel();
        Genre = new javax.swing.JLabel();
        Age = new javax.swing.JLabel();
        Profession = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Points = new javax.swing.JLabel();
        Rank = new javax.swing.JLabel();
        BotonDeNuevo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Resultados de la encuesta");
        setMinimumSize(new java.awt.Dimension(500, 300));
        setPreferredSize(new java.awt.Dimension(500, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Resultados encuesta:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, -1, -1));

        BotonSalir.setText("Salir");
        BotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(BotonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, -1, -1));

        Name.setText("Nombre: ");
        getContentPane().add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        Genre.setText("Género: ");
        getContentPane().add(Genre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        Age.setText("Edad:");
        getContentPane().add(Age, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        Profession.setText("Profesión:");
        getContentPane().add(Profession, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabel7.setText("¡Recuerda que esto no es nada comparado con la contaminación de las grandes");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        jLabel8.setText("empresas! Elige la produccion y compra local y no olvides levantar tu voz.");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        Points.setText("Cantidad de contaminación: ");
        getContentPane().add(Points, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        Rank.setText("Rango:");
        getContentPane().add(Rank, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        BotonDeNuevo.setText("De nuevo");
        BotonDeNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDeNuevoActionPerformed(evt);
            }
        });
        getContentPane().add(BotonDeNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_BotonSalirActionPerformed

    private void BotonDeNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDeNuevoActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        InterfazDatos otra= new InterfazDatos();
        otra.setVisible(true);
    }//GEN-LAST:event_BotonDeNuevoActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ResultadosEncuesta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Age;
    private javax.swing.JButton BotonDeNuevo;
    private javax.swing.JButton BotonSalir;
    private javax.swing.JLabel Genre;
    private javax.swing.JLabel Name;
    private javax.swing.JLabel Points;
    private javax.swing.JLabel Profession;
    private javax.swing.JLabel Rank;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
