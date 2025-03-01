/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sanfranciscoasis;

import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import database.ConexionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author User
 */
public class Register extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Register() {
      
        initComponents();
        ButtonGroup grupo = new ButtonGroup();
        grupo.add(confirmEstudiante);
        grupo.add(confirmProfesor);
        this.setLocationRelativeTo(null);
        this.setSize(1150,790);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        titulocontra = new javax.swing.JLabel();
        titulousuario = new javax.swing.JLabel();
        confirmEstudiante = new javax.swing.JRadioButton();
        RegistroUsuario = new javax.swing.JTextField();
        confirmProfesor = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        passwordRegistro = new javax.swing.JPasswordField();
        registrarse = new javax.swing.JButton();
        Volverpantprincipalregister1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        titulousuario1 = new javax.swing.JLabel();
        RegistroUsuario1 = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 147, 224));

        jLabel2.setFont(new java.awt.Font("Roboto SemiCondensed ExtraBold", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("COLEGIO SAN FRANCISCO DE ASÍS I.E.D");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 0, 1000, 170));

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        jLabel1.setText("REGISTRARSE");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 227, -1, -1));

        titulocontra.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        titulocontra.setText("CONTRASEÑA");
        jPanel1.add(titulocontra, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 477, -1, -1));

        titulousuario.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        titulousuario.setText("CORREO");
        jPanel1.add(titulousuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 330, -1, -1));

        confirmEstudiante.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        confirmEstudiante.setText("ESTUDIANTE");
        confirmEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmEstudianteActionPerformed(evt);
            }
        });
        jPanel1.add(confirmEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 680, 130, 30));

        RegistroUsuario.setForeground(new java.awt.Color(102, 102, 102));
        RegistroUsuario.setBorder(null);
        RegistroUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        RegistroUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistroUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(RegistroUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 380, 410, 40));

        confirmProfesor.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        confirmProfesor.setText("PROFESOR");
        jPanel1.add(confirmProfesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 680, 130, 30));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 550, 418, 10));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 420, 418, 10));

        passwordRegistro.setForeground(new java.awt.Color(102, 102, 102));
        passwordRegistro.setBorder(null);
        passwordRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordRegistroActionPerformed(evt);
            }
        });
        jPanel1.add(passwordRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 516, 420, 30));

        registrarse.setBackground(new java.awt.Color(0, 147, 224));
        registrarse.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        registrarse.setForeground(new java.awt.Color(255, 255, 255));
        registrarse.setText("REGISTRARSE");
        registrarse.setActionCommand("");
        registrarse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarseActionPerformed(evt);
            }
        });
        jPanel1.add(registrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 670, 150, 50));

        Volverpantprincipalregister1.setBackground(new java.awt.Color(0, 147, 224));
        Volverpantprincipalregister1.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        Volverpantprincipalregister1.setForeground(new java.awt.Color(255, 255, 255));
        Volverpantprincipalregister1.setText("ATRAS");
        Volverpantprincipalregister1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Volverpantprincipalregister1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Volverpantprincipalregister1ActionPerformed(evt);
            }
        });
        jPanel1.add(Volverpantprincipalregister1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 670, 130, 50));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 170, 1160, 10));

        titulousuario1.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        titulousuario1.setText("USUARIO");
        jPanel1.add(titulousuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 325, -1, -1));

        RegistroUsuario1.setForeground(new java.awt.Color(102, 102, 102));
        RegistroUsuario1.setBorder(null);
        RegistroUsuario1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(RegistroUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 380, 410, 40));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 418, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 791, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passwordRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordRegistroActionPerformed
 
    }//GEN-LAST:event_passwordRegistroActionPerformed

    private void registrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarseActionPerformed
        String nombre = RegistroUsuario1.getText().trim();
        String contrasena = new String(passwordRegistro.getPassword()).trim();
        String correo = RegistroUsuario.getText().trim(); // Se obtiene correctamente el correo
        String tipo;

        if (confirmProfesor.isSelected()) {
            tipo = "Profesor";
        } else if (confirmEstudiante.isSelected()) {
            tipo = "Estudiante";
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione si es Profesor o Estudiante", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (nombre.isEmpty() || contrasena.isEmpty() || correo.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Verificar si el usuario ya existe
        if (usuarioExiste(nombre)) {
            JOptionPane.showMessageDialog(this, "El usuario ya está registrado.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Insertar el nuevo usuario en la base de datos
        String sql = "INSERT INTO usuarios (nombre, correo,contrasena, tipo) VALUES (?, ?, ?, ?)";

        try (Connection con = ConexionDB.conectar();
             PreparedStatement pstmt = con.prepareStatement(sql)) {

            pstmt.setString(1, nombre);
            pstmt.setString(2, correo);
            pstmt.setString(3, contrasena);
            pstmt.setString(4, tipo);
            pstmt.executeUpdate();

            JOptionPane.showMessageDialog(this, "Usuario registrado exitosamente.");
            Login nuevologin= new Login();
            nuevologin.setVisible(true);
            this.setVisible(false);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error al registrar usuario: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
 
    }   

    // Método para verificar si el usuario ya existe
    private boolean usuarioExiste(String usuario) {
        String sql = "SELECT usuario FROM usuarios WHERE usuario = ?";
        try (Connection con = ConexionDB.conectar();
             PreparedStatement pstmt = con.prepareStatement(sql)) {

            pstmt.setString(1, usuario);
            ResultSet rs = pstmt.executeQuery();

            return rs.next(); // Devuelve true si el usuario ya existe
        } catch (SQLException ex) {
            System.out.println("Error al verificar usuario: " + ex.getMessage());
            return false;
        }

    }//GEN-LAST:event_registrarseActionPerformed

    private void Volverpantprincipalregister1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Volverpantprincipalregister1ActionPerformed
        PantallaPrincipal p1 = new PantallaPrincipal();
        p1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Volverpantprincipalregister1ActionPerformed

    private void confirmEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmEstudianteActionPerformed
       
    }//GEN-LAST:event_confirmEstudianteActionPerformed

    private void RegistroUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistroUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RegistroUsuarioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> new Register().setVisible(true));
            
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField RegistroUsuario;
    private javax.swing.JTextField RegistroUsuario1;
    private javax.swing.JButton Volverpantprincipalregister1;
    private javax.swing.JRadioButton confirmEstudiante;
    private javax.swing.JRadioButton confirmProfesor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPasswordField passwordRegistro;
    private javax.swing.JButton registrarse;
    private javax.swing.JLabel titulocontra;
    private javax.swing.JLabel titulousuario;
    private javax.swing.JLabel titulousuario1;
    // End of variables declaration//GEN-END:variables
}
