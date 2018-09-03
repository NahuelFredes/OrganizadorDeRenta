/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OrganizadorRenta;

import com.sun.istack.internal.logging.Logger;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import static java.util.logging.Level.SEVERE;

public class Chat extends javax.swing.JFrame implements Runnable {

    private MainMenu menu;
    Socket cli;
    Socket soc;
    ServerSocket ss;
    int puerto = 1024;
    int puerto2 = 1025;
    private Usuario user;

    public Chat(MainMenu men, Usuario user) {
        this.user = user;
        initComponents();
        this.menu = men;
        mostrar.setEditable(false);
        escribir.addKeyListener(new KeyAdapter() {

            @Override
            public void keyPressed(KeyEvent e) {
                int key = e.getKeyCode();
                if (key == KeyEvent.VK_ENTER) {

                    enviarMsj();

                }

            }
        });
        Thread myhilo = new Thread(this);
        myhilo.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        mostrar = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        escribir = new javax.swing.JTextField();
        btn_enviar = new javax.swing.JButton();
        btn_volver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mostrar.setColumns(20);
        mostrar.setRows(5);
        jScrollPane1.setViewportView(mostrar);

        jLabel1.setText("CHAT");

        escribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escribirActionPerformed(evt);
            }
        });

        btn_enviar.setText("Enviar");
        btn_enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_enviarActionPerformed(evt);
            }
        });

        btn_volver.setText("Volver");
        btn_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_volverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_enviar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                            .addComponent(escribir))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(escribir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_enviar)
                    .addComponent(btn_volver))
                .addGap(97, 97, 97))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_enviarActionPerformed
        //enviarMsj();
        String ipDest = "192.168.1.9";
        String ipOri = "192.168.1.9";
        try {
            InetAddress direccion = InetAddress.getLocalHost();
            String ip = direccion.getHostAddress();
            cli = new Socket(ipDest, puerto);
            Paquete pack = new Paquete();
            pack.setIpDestino(ipDest);
            pack.setIpOrigen(ipOri);
            pack.setMensaje(escribir.getText());
            pack.setUserName(user.getNombre());
            ObjectOutputStream out = new ObjectOutputStream(cli.getOutputStream());
            out.writeObject(pack);
            cli.close();

        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(Chat.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_btn_enviarActionPerformed

    private void btn_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_volverActionPerformed
        closeChat();
    }//GEN-LAST:event_btn_volverActionPerformed

    private void escribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escribirActionPerformed

    }//GEN-LAST:event_escribirActionPerformed

    public void closeChat() {
        this.dispose();
        menu.setVisible(true);

    }

    public void enviarMsj() {
        String escrito = escribir.getText();
        mostrar.append(escrito + "\n");
        escribir.setText("");

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_enviar;
    private javax.swing.JButton btn_volver;
    private javax.swing.JTextField escribir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea mostrar;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        try {
            ss = new ServerSocket(puerto2);
            String ipd, ipo, usser, msj;
            Paquete pack;
            while (true) {
                soc = ss.accept();
                ObjectInputStream in = new ObjectInputStream(soc.getInputStream());
                pack = (Paquete) in.readObject();
                ipd = pack.getIpDestino();
                ipo = pack.getIpOrigen();
                usser = pack.getUserName();
                msj = pack.getMensaje();
                mostrar.append(ipo+ ": "+ ipd +"\n");
                mostrar.append(usser + ": "+ msj+"\n");
                soc.close();
            }
        } catch (Exception e) {
        }
    }
}
