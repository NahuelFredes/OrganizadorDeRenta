package OrganizadorRenta;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class IniciarSesion extends javax.swing.JFrame {

    private MainMenu menu;
    private Usuario persona = new Usuario();

    public IniciarSesion() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ingresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        remember = new javax.swing.JCheckBox();
        lbl_nombre = new javax.swing.JTextField();
        lbl_password = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ingresar.setText("Ingresar");
        ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarActionPerformed(evt);
            }
        });

        jLabel1.setText("LOGIN");

        jLabel2.setText("Usuario:");

        jLabel3.setText("Contraseña:");

        remember.setText("Recordarme");
        remember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rememberActionPerformed(evt);
            }
        });

        lbl_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbl_nombreActionPerformed(evt);
            }
        });

        lbl_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbl_passwordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(remember)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_nombre, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_password))))
                .addGap(12, 12, 12))
            .addGroup(layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lbl_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lbl_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(remember)
                    .addComponent(ingresar))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarActionPerformed
        persona.setNombre(lbl_nombre.getText());

        cerrar();
    }//GEN-LAST:event_ingresarActionPerformed

    private void rememberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rememberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rememberActionPerformed

    private void lbl_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbl_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_nombreActionPerformed

    private void lbl_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbl_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_passwordActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        IniciarSesion iniciarsesion = new IniciarSesion();
        iniciarsesion.setVisible(true);
        iniciarsesion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void cerrar() {
        MainMenu menu = new MainMenu(persona);
        if (!lbl_password.getText().equals("") && (!lbl_nombre.getText().equals(""))) {

            this.setVisible(false);
            menu.setVisible(true);
        }
        if (lbl_nombre.getText().equals("")) {
            JOptionPane.showConfirmDialog(null, "Usted no ha completado su nombre de usuario", "Ingresar", JOptionPane.CANCEL_OPTION);
        } else {
            if (remember.isSelected()) {

            } else {

                lbl_nombre.setText("");

            }
        }
        if (lbl_password.getText().equals("")) {
            JOptionPane.showConfirmDialog(null, "Usted no ha completado su contraseña", "Ingresar", JOptionPane.CANCEL_OPTION);

        } else {
            if (remember.isSelected()) {

                lbl_password.setText("");

            } else {

                lbl_nombre.setText("");
                lbl_password.setText("");

            }

        }

        persona.setContraseña(lbl_password.getText());
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ingresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField lbl_nombre;
    private javax.swing.JPasswordField lbl_password;
    private javax.swing.JCheckBox remember;
    // End of variables declaration//GEN-END:variables
}
