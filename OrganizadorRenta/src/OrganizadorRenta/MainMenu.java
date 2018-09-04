package OrganizadorRenta;

import javax.swing.JFrame;

public class MainMenu extends javax.swing.JFrame {

    private IniciarSesion iniciarSesion;
    private Chat chat;
    private Administracion admin;
    private Calendar alquilerc;
    private Usuario user;
    private Alquiler alqui2;
    private UsuarioPremium usupM;

    public MainMenu(Usuario usuario, Alquiler alqui,UsuarioPremium userC) {
        this.iniciarSesion = new IniciarSesion();
        this.user = usuario;
        this.alqui2 = alqui;
        this.usupM = userC;
        initComponents();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        jLabel1 = new javax.swing.JLabel();
        boton_admin = new javax.swing.JButton();
        boton_alquilar = new javax.swing.JButton();
        boton_Cerrar = new javax.swing.JButton();
        botton_chat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("MAIN MENU");

        boton_admin.setText("Administracion");
        boton_admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_adminActionPerformed(evt);
            }
        });

        boton_alquilar.setText("Alquiler");
        boton_alquilar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_alquilarActionPerformed(evt);
            }
        });

        boton_Cerrar.setText("Cerrar Sesion");
        boton_Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_CerrarActionPerformed(evt);
            }
        });

        botton_chat.setText("Chat");
        botton_chat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botton_chatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(boton_admin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(boton_alquilar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(boton_Cerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botton_chat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(38, 38, 38))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(130, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(130, 130, 130))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton_admin)
                    .addComponent(botton_chat))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton_alquilar)
                    .addComponent(boton_Cerrar))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_adminActionPerformed
        abrirAdmin();
    }//GEN-LAST:event_boton_adminActionPerformed

    private void boton_CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_CerrarActionPerformed
        closeSesion();
    }//GEN-LAST:event_boton_CerrarActionPerformed

    private void botton_chatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botton_chatActionPerformed
        abrirChat();
    }//GEN-LAST:event_botton_chatActionPerformed

    private void boton_alquilarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_alquilarActionPerformed
        abrirAlquiler();
    }//GEN-LAST:event_boton_alquilarActionPerformed

    public void closeSesion() {

        
        this.dispose();
        iniciarSesion.setVisible(true);

    }

    public void abrirChat() {
        chat = new Chat(this);
        this.setVisible(false);
        chat.setVisible(true);
    }

    public void abrirAdmin() {
        admin = new Administracion(this,user,alqui2,usupM);
        this.setVisible(false);
        admin.setVisible(true);
    }

    public void abrirAlquiler() {
        alquilerc = new Calendar(this, user, alqui2,usupM);
        this.setVisible(false);
        alquilerc.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_Cerrar;
    private javax.swing.JButton boton_admin;
    private javax.swing.JButton boton_alquilar;
    private javax.swing.JButton botton_chat;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
