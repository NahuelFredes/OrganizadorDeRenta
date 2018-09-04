package OrganizadorRenta;

import com.toedter.calendar.JCalendar;
import java.beans.PropertyChangeListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Administracion extends javax.swing.JFrame {

    private MainMenu menu;
    private Alquiler alqui3;
    private Usuario usu;
    private UsuarioPremium usup3;
    private Admin admin = new Admin();

    public Administracion(MainMenu men, Usuario usuario, Alquiler alqui, UsuarioPremium usupM) {
        initComponents();
        this.alqui3 = alqui;
        this.usup3 = usupM;
        this.usu = usuario;
        this.menu = men;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_volverAdmin = new javax.swing.JButton();
        costoMantenimiento = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        monthChooser = new com.toedter.calendar.JMonthChooser();
        jLabel2 = new javax.swing.JLabel();
        gananciaMes = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        resultadoMes = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AreaUsuarios = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        anioChooser = new com.toedter.calendar.JYearChooser();
        ListarUsuarios = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_volverAdmin.setText("Volver");
        btn_volverAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_volverAdminActionPerformed(evt);
            }
        });

        jLabel1.setText("Cuanto cuesta el mantenimiento");

        monthChooser.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                monthChooserPropertyChange(evt);
            }
        });

        jLabel2.setText("Cuanto gana en el mes de :");

        jLabel3.setText("Esto ganas o pierdes en el mes seleccionado:");

        jButton1.setText("Calcular ganancia al mes");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        AreaUsuarios.setColumns(20);
        AreaUsuarios.setRows(5);
        jScrollPane1.setViewportView(AreaUsuarios);

        jLabel4.setText("Muestra lista de personas con sus datos:");

        ListarUsuarios.setText("Listar Usuarios");
        ListarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListarUsuariosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btn_volverAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ListarUsuarios)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(costoMantenimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(resultadoMes, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(gananciaMes, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(monthChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(anioChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE))
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(costoMantenimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(gananciaMes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(monthChooser, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                    .addComponent(anioChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resultadoMes, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(ListarUsuarios)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 267, Short.MAX_VALUE)
                        .addComponent(btn_volverAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_volverAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_volverAdminActionPerformed
        cerrarAdmin();
    }//GEN-LAST:event_btn_volverAdminActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        calcTotal();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void monthChooserPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_monthChooserPropertyChange
        try {
            calcGanancia();

        } catch (IOException ex) {
            Logger.getLogger(Administracion.class
                    .getName()).log(Level.SEVERE, null, ex);

        } catch (ParseException ex) {
            Logger.getLogger(Administracion.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_monthChooserPropertyChange

    private void ListarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListarUsuariosActionPerformed
        try {
            cargarUsuarios();
        } catch (IOException ex) {
            Logger.getLogger(Administracion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ListarUsuariosActionPerformed

    public void cerrarAdmin() {
        this.dispose();
        menu.setVisible(true);

    }

    public void calcGanancia() throws IOException, ParseException {
        String Nombre = "";
        int contN = 0;
        try {
            if (!usup3.getNombre().equals("")) {
                Nombre = usup3.getNombre();
            }
        } catch (Exception e) {
        }
        try {
            if (!usu.getNombre().equals("")) {
                Nombre = usu.getNombre();
            }
        } catch (Exception e) {
        }
        String linea = "";
        int costoTotalMes = 0;
        int anioChoose = anioChooser.getYear();
        int mesGanancia = monthChooser.getMonth() + 1;
        System.out.println(mesGanancia);
        String NMonth = "";
        if (mesGanancia <= 9) {
            NMonth = "0" + mesGanancia;
        } else {
            NMonth = "" + mesGanancia;
        }

        // TODO Auto-generated method stub
        List<Date> dates = new ArrayList<Date>();

        String str_date = "01/" + NMonth + "/" + anioChoose;
        String end_date = "31/" + NMonth + "/" + anioChoose;
        System.out.println(str_date);
        System.out.println(end_date);

        DateFormat formatter;

        formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date startDate = null;
        startDate = (Date) formatter.parse(str_date);
        Date endDate = null;

        try {
            endDate = (Date) formatter.parse(end_date);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        long interval = 24 * 1000 * 60 * 60; // 1 hora en milisegundos
        long endTime = endDate.getTime(); // create your endtime here, possibly using Calendar or Date
        long curTime = startDate.getTime();
        while (curTime <= endTime) {
            dates.add(new Date(curTime));
            curTime += interval;
        }
        for (int i = 0; i < dates.size(); i++) {
            int contador = 0;
            Date lDate = (Date) dates.get(i);
            String fecha = formatter.format(lDate);
            String mesFile = "/home/teodoro/Escritorio/Proyecto github/OrganizadorDeRenta/" + fecha.replace('/', '-') + ".txt";
            File archivomes = new File(mesFile);

            if (archivomes.exists()) {
                BufferedReader lector = new BufferedReader(new FileReader(mesFile));
                linea = lector.readLine();
                linea = linea.replaceAll("Alquilado por: ", "");
                String costo_linea;
                try {
                    if (!usup3.getNombre().equals("")) {
                        if (!Nombre.equals(usup3.getNombre())) {
                            Nombre = linea.replaceAll("Alquilado por: ", "");
                            while ((lector.readLine()) != null) {
                                contador = contador + 1;
                                if (contador == 2) {
                                    costo_linea = lector.readLine();
                                    System.out.println(costo_linea);
                                    String strcostomes = costo_linea.replace("Costo: ", "");
                                    int costomes = Integer.parseInt(strcostomes);
                                    costoTotalMes = costomes + costoTotalMes;
                                    admin.setMonto_mes(costoTotalMes);
                                    String strcostoTotalMes = "" + costoTotalMes;
                                    gananciaMes.setText(strcostoTotalMes);
                                    System.out.println(strcostoTotalMes);

                                }

                            }
                        }
                    }
                    if (Nombre.equals(usup3.getNombre()) && contN == 0) {
                        contN = 1;
                        while ((lector.readLine()) != null) {
                            contador = contador + 1;
                            if (contador == 2) {
                                costo_linea = lector.readLine();
                                System.out.println(costo_linea);
                                String strcostomes = costo_linea.replace("Costo: ", "");
                                int costomes = Integer.parseInt(strcostomes);
                                costoTotalMes = costomes + costoTotalMes;
                                admin.setMonto_mes(costoTotalMes);
                                String strcostoTotalMes = "" + costoTotalMes;
                                gananciaMes.setText(strcostoTotalMes);
                                System.out.println(strcostoTotalMes);

                            }
                            //String preciom = costoMantenimiento.getText();
                            //int precioMantenimiento = Integer.parseInt(preciom);
                            //String gananciasMes = gananciaMes.getText();
                            //int intgananciasMes = Integer.parseInt(gananciasMes);
                            //int precioMes = intgananciasMes - precioMantenimiento;
                        }
                    }
                } catch (Exception e) {
                }
                try {
                    if (!usu.getNombre().equals("")) {
                        if (!Nombre.equals(usu.getNombre())) {
                            Nombre = linea.replaceAll("Alquilado por: ", "");

                            while ((lector.readLine()) != null) {
                                contador = contador + 1;
                                if (contador == 2) {

                                    costo_linea = lector.readLine();
                                    System.out.println(costo_linea);
                                    String strcostomes = costo_linea.replace("Costo: ", "");
                                    int costomes = Integer.parseInt(strcostomes);
                                    costoTotalMes = costomes + costoTotalMes;
                                    admin.setMonto_mes(costoTotalMes);
                                    String strcostoTotalMes = "" + costoTotalMes;
                                    gananciaMes.setText(strcostoTotalMes);
                                    System.out.println(strcostoTotalMes);

                                }

                            }
                        }
                        if (Nombre.equals(usu.getNombre()) && contN == 0) {
                            contN = 1;
                            while ((lector.readLine()) != null) {
                                contador = contador + 1;
                                if (contador == 2) {
                                    costo_linea = lector.readLine();
                                    System.out.println(costo_linea);
                                    String strcostomes = costo_linea.replace("Costo: ", "");
                                    int costomes = Integer.parseInt(strcostomes);
                                    costoTotalMes = costomes + costoTotalMes;
                                    admin.setMonto_mes(costoTotalMes);
                                    String strcostoTotalMes = "" + costoTotalMes;
                                    gananciaMes.setText(strcostoTotalMes);
                                    System.out.println(strcostoTotalMes);

                                }
                            }

                        }
                    }

                } catch (Exception e) {
                }

            }
        }

    }

    public void calcTotal() {
        String preciom = costoMantenimiento.getText();
        if (preciom == null) {
            JOptionPane.showMessageDialog(null, "No ingreso precio de mantenimiento", "Error", JOptionPane.WARNING_MESSAGE);

        } else {
            int precioMantenimiento = Integer.parseInt(preciom);
            String gananciasMes = gananciaMes.getText();
            int intgananciasMes = Integer.parseInt(gananciasMes);
            admin.setMonto_total(intgananciasMes - precioMantenimiento);
            resultadoMes.setText(admin.getMonto_total() + "");

        }

    }

    public void cargarUsuarios() throws IOException {

        File carpeta = new File("/home/teodoro/Escritorio/Proyecto github/OrganizadorDeRenta/cuentas/");
        File[] listOfFiles = carpeta.listFiles();

        for (File file : listOfFiles) {
            if (file.isFile()) {
                String usuario = "/home/teodoro/Escritorio/Proyecto github/OrganizadorDeRenta/cuentas/" + file.getName();
                File usuarios = new File(usuario);
                System.out.println(usuarios);
                if (usuarios.exists()) {
                    BufferedReader lector6 = new BufferedReader(new FileReader(usuarios));
                    String linea;
                    while ((linea = lector6.readLine()) != null) {
                        String save = AreaUsuarios.getText();
                        AreaUsuarios.append("\n" + linea + "\n");
                    }
                    AreaUsuarios.append("-------------------------");
                };

            }
        }

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea AreaUsuarios;
    private javax.swing.JButton ListarUsuarios;
    private com.toedter.calendar.JYearChooser anioChooser;
    private javax.swing.JButton btn_volverAdmin;
    private javax.swing.JTextField costoMantenimiento;
    private javax.swing.JLabel gananciaMes;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JMonthChooser monthChooser;
    private javax.swing.JLabel resultadoMes;
    // End of variables declaration//GEN-END:variables

}
