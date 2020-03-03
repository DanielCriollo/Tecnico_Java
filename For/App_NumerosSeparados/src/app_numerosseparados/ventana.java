package app_numerosseparados;

public class ventana extends javax.swing.JFrame {

    public ventana() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        view = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        view.setColumns(20);
        view.setRows(5);
        jScrollPane1.setViewportView(view);

        jButton1.setText("Iniciar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jScrollPane1)
                    .addComponent(jButton1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //
        String cadena = "";
        int sumando = 1, resultado = 0;

        for (int i = 0; i <= 10; i++) {
            resultado += sumando;
            cadena += " " + resultado;
            sumando += 2;
        }
        //
        cadena += "\n";
        sumando = 1;
        resultado = 1;

        for (int i = 1; i <= 10; i++) {
            resultado += sumando;
            cadena += " " + resultado;
            sumando += 2;
        }
        //
        cadena += "\n";
        sumando = 1;
        resultado = 1;

        for (int i = 1; i <= 10; i++) {
            resultado += sumando;
            cadena += " " + resultado;
            sumando += 2;
        }
        //
        cadena += "\n";
      

        for (int i = 1; i <= 8; i++) {
            double r = 1 / i;

            cadena += " " + r;

        }
        view.setText(cadena);
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea view;
    // End of variables declaration//GEN-END:variables
}
