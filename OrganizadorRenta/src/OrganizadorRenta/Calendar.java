package OrganizadorRenta;

import java.beans.PropertyChangeEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Calendar extends javax.swing.JFrame {
    //Fredes no toques thx : ^)
    private MainMenu menu;
    private Alquiler alqui = new Alquiler();

    public Calendar(MainMenu men, Usuario usuario, Alquiler alqui) {
        initComponents();
        this.menu = men;
        this.alqui = alqui;

        nameLabel.setText(usuario.getNombre());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        AreaTexto = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        btnVolverMenu = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();
        BtnAlquilar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        calendario = new com.toedter.calendar.JCalendar();
        selecIFecha = new com.toedter.calendar.JDateChooser();
        selecFFecha = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        CantMayores = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        CantMenores = new javax.swing.JTextField();
        Ofrece = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AreaTexto.setColumns(20);
        AreaTexto.setRows(5);
        jScrollPane1.setViewportView(AreaTexto);

        jLabel1.setText("Alquilar Propiedad");

        btnVolverMenu.setText("Menu");
        btnVolverMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverMenuActionPerformed(evt);
            }
        });

        Cancelar.setText("Cancelar");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });

        BtnAlquilar.setText("Alquilar");
        BtnAlquilar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAlquilarActionPerformed(evt);
            }
        });

        jLabel2.setText("Aqui se mostrara si esta disponible y podra dejar mensajes para reservar");

        jLabel3.setText("Iniciado como:");

        calendario.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                calendarioPropertyChange(evt);
            }
        });

        jLabel4.setText("Hasta que dia desea alquilar");

        jLabel5.setText("Desde que dia desea alquilar");

        jLabel6.setText("Cantidad de mayores");

        jLabel7.setText("Cantidad de menores");

        jLabel8.setText("Ofrece");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnVolverMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(589, 589, 589))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(calendario, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3)
                                            .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(selecIFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(selecFFecha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(CantMenores, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(CantMayores, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(29, 29, 29)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(Ofrece, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(BtnAlquilar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(0, 250, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                                    .addComponent(calendario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(44, 44, 44)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel8)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(selecIFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(CantMayores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Ofrece, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel4)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CantMenores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Cancelar))
                    .addComponent(selecFFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(BtnAlquilar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVolverMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverMenuActionPerformed
        volverMenu();
    }//GEN-LAST:event_btnVolverMenuActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        Cancel();
    }//GEN-LAST:event_CancelarActionPerformed

    private void BtnAlquilarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAlquilarActionPerformed
        Alquilar();
    }//GEN-LAST:event_BtnAlquilarActionPerformed

    private void calendarioPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_calendarioPropertyChange
        try {
            abrirtxt();
        } catch (IOException ex) {
            Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_calendarioPropertyChange

    public void volverMenu() {
        this.dispose();
        menu.setVisible(true);
    }

    public void Cancel() {
        CantMayores.setText("");
        CantMenores.setText("");
        Ofrece.setText("");
    }

    public void Alquilar() {
        alqui.setCantAdults(Integer.parseInt(CantMayores.getText()));
        alqui.setCantNinos(Integer.parseInt(CantMenores.getText()));
        alqui.setDinero(Integer.parseInt(Ofrece.getText()));

//dia inicio
        Date dateI = selecIFecha.getDate();
        alqui.setStrDateI(DateFormat.getDateInstance().format(dateI));
        String strDateI = alqui.getStrDateI();
        LocalDate localDate = dateI.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int IYear = localDate.getYear();
        int IMonth = localDate.getMonthValue();
        int IDay = localDate.getDayOfMonth();
        int fechaI = IYear + IMonth + IDay;
//dia final
        Date dateF = selecFFecha.getDate();
        alqui.setStrDateF(DateFormat.getDateInstance().format(dateF));
        LocalDate localDate2 = dateF.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
         
        String strDateF = alqui.getStrDateF();
        int FYear = localDate2.getYear();
        int FMonth = localDate2.getMonthValue();
        int FDay = localDate2.getDayOfMonth();
        int fechaF = FYear + FMonth + FDay;
        if (!strDateF.equals("") && !strDateI.equals("") && !CantMayores.getText().equals("") && !CantMenores.getText().equals("") && !Ofrece.getText().equals("")) {
            if (fechaI > fechaF) {
                String error = JOptionPane.showInputDialog(null, "Ha ingresado fechas incompatibles la fecha de inicio es mayor a la final", "Error", JOptionPane.DEFAULT_OPTION);

            } else {
                try {
                    String diaItxt = "/home/teodoro/Escritorio/Proyecto github/OrganizadorDeRenta/" + strDateF.replace('/', '-') + ".txt";
                    File archivo = new File(diaItxt);
                    try (FileWriter escritor = new FileWriter(archivo)) {
                        escritor.write(CantMayores.getText());
                        escritor.close();
                    }

                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
            if (strDateI.equals(strDateF)) {

            } else {
                List<Date> dias = new ArrayList<Date>();

                String incio_dia = strDateI;
                String final_dia = strDateF;

                DateFormat formatter;

                formatter = new SimpleDateFormat("dd/MM/yyyy");
                Date startDate = null;
                try {
                    startDate = (Date) formatter.parse(strDateI);
                } catch (ParseException e) {

                    e.printStackTrace();
                }
                Date endDate = null;
                try {
                    endDate = (Date) formatter.parse(strDateF);
                } catch (ParseException e) {

                    e.printStackTrace();
                }
                long interval = 24 * 1000 * 60 * 60;
                long endTime = endDate.getTime();
                long curTime = startDate.getTime();
                while (curTime <= endTime) {
                    dias.add(new Date(curTime));
                    curTime += interval;
                }
                for (int i = 0; i < dias.size(); i++) {
                    Date lDate = (Date) dias.get(i);
                    String ds = formatter.format(lDate);
                    try {
                        System.out.println(ds);
                        String diaTxt = "/home/teodoro/Escritorio/Proyecto github/OrganizadorDeRenta/" + ds.replace('/', '-') + ".txt";
                        File archivo = new File(diaTxt);
                        try (FileWriter escritor = new FileWriter(archivo)) {
                            escritor.write(CantMayores.getText());
                            escritor.close();
                        }

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

            }
        }
    }

    public void abrirtxt() throws FileNotFoundException, IOException {
        Date dateC = calendario.getDate();
        String strDateC = DateFormat.getDateInstance().format(dateC);
        LocalDate localDate3 = dateC.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int CYear = localDate3.getYear();
        int CMonth = localDate3.getMonthValue();
        String SMonth = "";
        if (CMonth < 9) {
            SMonth = "0" + CMonth;
            System.out.println(SMonth);
        } else {
            SMonth = "" + CMonth;
            System.out.println(SMonth);
        }
        int CDay = localDate3.getDayOfMonth();
        String diaCalendar = CDay + "-" + SMonth + "-" + CYear;
        String dia = "/home/teodoro/Escritorio/Proyecto github/OrganizadorDeRenta/" + diaCalendar + ".txt";
        File archivodia = new File(dia);
        System.out.println(archivodia);
        if (archivodia.exists()) {
            BufferedReader lector = new BufferedReader(new FileReader(archivodia));
            String linea;
            while ((linea = lector.readLine()) != null) {
                AreaTexto.setText(linea);
            }

        } else {
            AreaTexto.setText("");
        };
    }

//String diaI = "/home/teodoro/Escritorio/Proyecto github/OrganizadorDeRenta/" + strDatei + ".txt";
//String diaF = "/home/teodoro/Escritorio/Proyecto github/OrganizadorDeRenta/" + strDatef + ".txt";

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea AreaTexto;
    private javax.swing.JButton BtnAlquilar;
    private javax.swing.JButton Cancelar;
    private javax.swing.JTextField CantMayores;
    private javax.swing.JTextField CantMenores;
    private javax.swing.JTextField Ofrece;
    private javax.swing.JButton btnVolverMenu;
    private com.toedter.calendar.JCalendar calendario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nameLabel;
    private com.toedter.calendar.JDateChooser selecFFecha;
    private com.toedter.calendar.JDateChooser selecIFecha;
    // End of variables declaration//GEN-END:variables
}
