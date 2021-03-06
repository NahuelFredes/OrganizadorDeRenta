package OrganizadorRenta;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class CrearCuenta extends javax.swing.JFrame {

    private IniciarSesion iniciarSesion;
    private MainMenu menu;
    private Alquiler alquiI;
    private Usuario userc;
    private UsuarioPremium usupC;

    public CrearCuenta(Usuario usuario, Alquiler alqui, UsuarioPremium usup) {
        initComponents();
        this.userc = usuario;
        this.alquiI = alqui;
        this.usupC = usup;
        this.iniciarSesion = new IniciarSesion();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCalendar1 = new com.toedter.calendar.JCalendar();
        nombreLbl = new javax.swing.JTextField();
        mailLbl = new javax.swing.JTextField();
        apellidoLbl = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        dateLbl = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        btn_crearCuenta = new javax.swing.JButton();
        btn_cancel = new javax.swing.JButton();
        cuenta_premium = new javax.swing.JRadioButton();
        tarjetaLbl = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        contraLbl = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nombreLbl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreLblActionPerformed(evt);
            }
        });

        mailLbl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mailLblActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre");

        jLabel2.setText("Apellido");

        jLabel3.setText("Mail");

        jLabel5.setText("Fecha de nacimiento");

        btn_crearCuenta.setText("Crear cuenta");
        btn_crearCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_crearCuentaActionPerformed(evt);
            }
        });

        btn_cancel.setText("Cancelar");
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });

        cuenta_premium.setText("Cuenta premium");

        jLabel6.setText("Ingrese n° de tarjeta de credito");

        jLabel7.setText("Contraseña");

        contraLbl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contraLblActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_crearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 27, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(cuenta_premium)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(contraLbl, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tarjetaLbl, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mailLbl, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(apellidoLbl, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombreLbl, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dateLbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombreLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(apellidoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contraLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mailLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addGap(7, 7, 7)
                .addComponent(dateLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cuenta_premium)
                .addGap(8, 8, 8)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tarjetaLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cancel)
                    .addComponent(btn_crearCuenta))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mailLblActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mailLblActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mailLblActionPerformed

    private void nombreLblActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreLblActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreLblActionPerformed

    private void btn_crearCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_crearCuentaActionPerformed
        try {
            crearCuenta();
        } catch (IOException ex) {
            Logger.getLogger(CrearCuenta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_crearCuentaActionPerformed

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        volverInicio();

    }//GEN-LAST:event_btn_cancelActionPerformed

    private void contraLblActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contraLblActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contraLblActionPerformed

    public void volverInicio() {
        this.dispose();
        iniciarSesion.setVisible(true);

    }

    public Date getDate(Date dateLbl) {
        return dateLbl;
    }

    public void setDate() {
        this.dateLbl = dateLbl;
    }

    public void crearCuenta() throws IOException {
        MainMenu menu = new MainMenu(userc, alquiI, usupC);

        if (cuenta_premium.isSelected()) {
            if (!nombreLbl.getText().equals("") && (!apellidoLbl.getText().equals("")) && (!contraLbl.getText().equals("")) && (!mailLbl.getText().equals("")) && (!tarjetaLbl.getText().equals("")) && (!dateLbl.getDate().equals(null))) {
                String file = "/home/nahuelfredes/Escritorio/OrganizadorDeRenta/IC/Premium/" + nombreLbl.getText() + ".txt";
                File archivoname = new File(file);
                if (archivoname.exists()) {
                    JOptionPane.showMessageDialog(null, "La cuenta ya existe", "Error", JOptionPane.WARNING_MESSAGE);
                } else {
                    int costo = 100;
                    usupC.setNombre(nombreLbl.getText());
                    usupC.setApellido(apellidoLbl.getText());
                    usupC.setContraseña(contraLbl.getText());
                    usupC.setCorreo(mailLbl.getText());
                    usupC.setNacimiento(dateLbl.getDate());
                    Date dateBirthP = dateLbl.getDate();
                    String strDateBirthP = DateFormat.getDateInstance().format(dateBirthP);
                    usupC.setTarjetaCredito(tarjetaLbl.getText());
                    usupC.setPremium(true);
                    usupC.setDescuento(30);
                    usupC.calcDescuento(costo);
                    String datosP = "/home/nahuelfredes/Escritorio/OrganizadorDeRenta/cuentas/" + usupC.getNombre() + usupC.getApellido() + ".txt";
                    File archivo = new File(datosP);
                    try (FileWriter writer = new FileWriter(archivo)) {
                        writer.write("Nombre del Usuario: " + usupC.getNombre()
                                + "\nApellido del Usuario: " + usupC.getApellido()
                                + "\nConstraseña del Usuario: " + usupC.getContraseña()
                                + "\nCorreo del Usuario: " + usupC.getCorreo()
                                + "\nFecha de nacimiento del Usuario: " + strDateBirthP
                                + "\nEl Usuario es Premium: " + " Si"
                                + "\nTarjeta de credito del Usuario: " + usupC.getTarjetaCredito()
                        );
                        writer.close();
                    }
                    String directionIC = "/home/nahuelfredes/Escritorio/OrganizadorDeRenta/IC/Premium/" + usupC.getNombre() + ".txt";
                    File archivoIC = new File(directionIC);
                    try (FileWriter writer = new FileWriter(archivoIC)) {
                        writer.write(
                                usupC.getContraseña()
                        );
                        writer.close();
                    }
                    this.setVisible(false);
                    menu.setVisible(true);
                }

            } else {
                JOptionPane.showConfirmDialog(null, "Usted no ha completado todos los campos requeridos", "Crear Cuenta", JOptionPane.CANCEL_OPTION);
                nombreLbl.setText("");
                apellidoLbl.setText("");
                contraLbl.setText("");
                mailLbl.setText("");
                tarjetaLbl.setText("");
            }
        } else if (!nombreLbl.getText().equals("") && (!apellidoLbl.getText().equals("")) && (!contraLbl.getText().equals("")) && (!mailLbl.getText().equals("")) && (!dateLbl.getDate().equals(null))) {
            String file = "../../../IC/" + nombreLbl.getText() + ".txt";
            File archivoname = new File(file);
            if (archivoname.exists()) {
                JOptionPane.showMessageDialog(null, "La cuenta ya existe", "Error", JOptionPane.WARNING_MESSAGE);

            } else {
                userc.setNombre(nombreLbl.getText());
                userc.setApellido(apellidoLbl.getText());
                userc.setContraseña(contraLbl.getText());
                userc.setCorreo(mailLbl.getText());
                userc.setNacimiento(dateLbl.getDate());
                Date dateBirthN = dateLbl.getDate();
                String strDateBirthN = DateFormat.getDateInstance().format(dateBirthN);
                String datosN ="/home/nahuelfredes/Escritorio/OrganizadorDeRenta/cuentas/" + userc.getNombre() + userc.getApellido() + ".txt";
                File archivo = new File(datosN);
                try (FileWriter writer = new FileWriter(archivo)) {
                    writer.write("Nombre del Usuario: " + userc.getNombre()
                            + "\nApellido del Usuario: " + userc.getApellido()
                            + "\nConstraseña del Usuario: " + userc.getContraseña()
                            + "\nCorreo del Usuario: " + userc.getCorreo()
                            + "\nFecha de nacimiento del Usuario: " + strDateBirthN
                            + "\nEl Usuario es Premium: " + " NO"
                    );
                    writer.close();
                }
                String directionIC ="/home/nahuelfredes/Escritorio/OrganizadorDeRenta/IC/" + userc.getNombre() + ".txt";
                File archivoIC = new File(directionIC);
                try (FileWriter writer = new FileWriter(archivoIC)) {
                    writer.write(
                            userc.getContraseña()
                    );
                    writer.close();
                }
                this.setVisible(false);
                menu.setVisible(true);
            }

        } else {
            JOptionPane.showConfirmDialog(null, "Usted no ha completado todos los campos requeridos", "Crear Cuenta", JOptionPane.CANCEL_OPTION);
            nombreLbl.setText("");
            apellidoLbl.setText("");
            contraLbl.setText("");
            mailLbl.setText("");
            tarjetaLbl.setText("");
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidoLbl;
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_crearCuenta;
    private javax.swing.JPasswordField contraLbl;
    private javax.swing.JRadioButton cuenta_premium;
    private com.toedter.calendar.JDateChooser dateLbl;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField mailLbl;
    private javax.swing.JTextField nombreLbl;
    private javax.swing.JTextField tarjetaLbl;
    // End of variables declaration//GEN-END:variables
}
