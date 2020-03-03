package examenfor;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ventana extends javax.swing.JFrame {

    public ventana() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cantEncuestas = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        viewResultado = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Encuestas");

        jLabel2.setText("Número de encuestas:");

        jButton1.setText("Encuestar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        viewResultado.setColumns(20);
        viewResultado.setRows(5);
        jScrollPane3.setViewportView(viewResultado);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel2)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cantEncuestas, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(jButton1)))
                        .addGap(0, 40, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cantEncuestas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int deEscritorio = 0;
        int portatil = 0;
        int bandaAncha = 0;
        int planDatos = 0;
        int encuestas = Integer.parseInt(cantEncuestas.getValue().toString());

        for (int i = 1; i <= encuestas; i++) {
            JOptionPane.showMessageDialog(this, "Encuesta No. " + i);

            String respuesta = JOptionPane.showInputDialog("Qué tipo de computadora tiene ?"
                    + "\n1. De escritorio"
                    + "\n2. Portátil");
            if (respuesta.equalsIgnoreCase("1")) {
                deEscritorio++;
            } else {
                portatil++;
            }

            respuesta = JOptionPane.showInputDialog("Qué tipo de internet tiene ?"
                    + "\n1. Banda Ancha"
                    + "\n2. Plan de datos");
            if (respuesta.equalsIgnoreCase("1")) {
                bandaAncha++;
            } else {
                planDatos++;
            }

        }

        viewResultado.setText("Número Encuestados: " + encuestas
                + "\nPersonas con computadoras de escritorio: " + deEscritorio + "    Porcentaje: " + (deEscritorio * 100 / encuestas) + " %"
                + "\nPersonas con computadoras portátiles: " + portatil + "  Porcentaje: " + (portatil * 100 / encuestas) + " %"
                + "\nPersonas con acceso a internet banda ancha: " + bandaAncha + "  Porcentaje: " + (bandaAncha * 100 / encuestas) + " %"
                + "\nPersonas con acceso a plan de datos: " + planDatos + "   Porcentaje: " + (planDatos * 100 / encuestas) + " %");


    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner cantEncuestas;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea viewResultado;
    // End of variables declaration//GEN-END:variables
}
