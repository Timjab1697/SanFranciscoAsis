
package sanfranciscoasis;
import javax.swing.*;
import javax.swing.table.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;



public class VistaProfesor extends javax.swing.JFrame {

  private Connection conectar() {
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\User\\Documents\\basededatosSanfrancisco/colegio.db"); // Asegúrate de que el archivo database.db exista
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al conectar la base de datos: " + e.getMessage());
        }
        return con;
}

    private void cargarTareas() {
        DefaultTableModel modelo = (DefaultTableModel) TablaTareas.getModel(); // Asegúrate de que 'TablaTareas' es el nombre correcto del JTable
        modelo.setRowCount(0); // Limpiar la tabla antes de cargar datos

        String sql = "SELECT id, titulo, descripcion, fecha_entrega FROM tareas"; // Ajusta los nombres de las columnas según tu base de datos
        
        try (Connection con = conectar();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

           while (rs.next()) {
                modelo.addRow(new Object[]{
                    rs.getInt("id"),
                    rs.getString("titulo"),
                    rs.getString("descripcion"),
                    rs.getString("fecha_entrega")
                });
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al cargar tareas: " + e.getMessage());
        }
    }
    public VistaProfesor() {
                initComponents();
       this.setLocationRelativeTo(null);
        this.setSize(1150,790);
        String[] columnas = {"ID", "Título", "Descripción", "Fecha de Entrega"};
        DefaultTableModel modelo = new DefaultTableModel(null, columnas);
        TablaTareas.setModel(modelo);

        // Habilitar ordenamiento de filas
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(modelo);
        TablaTareas.setRowSorter(sorter);

        // Cargar tareas en la tabla
        cargarTareas();
        

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Asignatura = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Fecha = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TituloTarea = new javax.swing.JTextField();
        Descripcion = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaTareas = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);

        Asignatura.setBackground(new java.awt.Color(255, 255, 255));
        Asignatura.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
                .addContainerGap(199, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );

        Asignatura.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 0, 1000, 170));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1160, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        Asignatura.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 170, 1160, 10));

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel1.setText("Descripción");
        Asignatura.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 140, 20));
        Asignatura.add(Fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 470, -1));

        jLabel4.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel4.setText("TituloTarea");
        Asignatura.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel5.setText("Asignatura");
        Asignatura.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 140, 20));

        TituloTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TituloTareaActionPerformed(evt);
            }
        });
        Asignatura.add(TituloTarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 470, -1));
        Asignatura.add(Descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 470, 190));
        Asignatura.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 470, -1));

        jLabel6.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel6.setText("Fecha");
        Asignatura.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 140, 20));

        jButton2.setBackground(new java.awt.Color(0, 147, 224));
        jButton2.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Eliminar");
        jButton2.setActionCommand("");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        Asignatura.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 660, 150, 60));

        jButton1.setBackground(new java.awt.Color(0, 147, 224));
        jButton1.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        Asignatura.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 660, 150, 60));

        TablaTareas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(TablaTareas);

        Asignatura.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 220, 580, -1));

        jButton3.setBackground(new java.awt.Color(0, 147, 224));
        jButton3.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Volver");
        jButton3.setActionCommand("");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        Asignatura.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 660, 150, 60));

        jButton4.setBackground(new java.awt.Color(0, 147, 224));
        jButton4.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Editar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        Asignatura.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 660, 150, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Asignatura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Asignatura, javax.swing.GroupLayout.PREFERRED_SIZE, 791, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        
        String titulo = TituloTarea.getText();
    String descripcion = Descripcion.getText();
    String fecha = Fecha.getText();
    int profesorId = obtenerIdProfesor();
    int estudianteId = obtenerIdEstudianteSeleccionado(); // Se debe obtener de una lista de estudiantes

    if (titulo.isEmpty() || fecha.isEmpty() || estudianteId == -1) {
        JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos y seleccione un estudiante.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    String sqlTarea = "INSERT INTO tareas (titulo, descripcion, fecha_entrega, profesor_id) VALUES (?, ?, ?, ?)";
    
    try (Connection conn = database.ConexionDB.conectar();
         PreparedStatement pstmtTarea = conn.prepareStatement(sqlTarea, PreparedStatement.RETURN_GENERATED_KEYS)) {

        pstmtTarea.setString(1, titulo);
        pstmtTarea.setString(2, descripcion);
        pstmtTarea.setString(3, fecha);
        pstmtTarea.setInt(4, profesorId);
        pstmtTarea.executeUpdate();

        ResultSet generatedKeys = pstmtTarea.getGeneratedKeys();
        if (generatedKeys.next()) {
            int tareaId = generatedKeys.getInt(1);

            // Ahora asignamos la tarea al estudiante
            String sqlAsignar = "INSERT INTO tareas_estudiantes (tarea_id, estudiante_id, estado) VALUES (?, ?, 'Pendiente')";
            try (PreparedStatement pstmtAsignar = conn.prepareStatement(sqlAsignar)) {
                pstmtAsignar.setInt(1, tareaId);
                pstmtAsignar.setInt(2, estudianteId);
                pstmtAsignar.executeUpdate();
            }
            
            JOptionPane.showMessageDialog(this, "Tarea asignada correctamente.");
        }
        limpiarCampos();

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Tarea asignada correctamente.");
    }  
        this.dispose();  
new VistaProfesor().setVisible(true); 
}  

    private int obtenerIdEstudianteSeleccionado() {
    // Aquí deberás agregar lógica para seleccionar el estudiante, por ahora es un valor fijo
    return 1;

     
    }//GEN-LAST:event_jButton1ActionPerformed
   
    
    private int obtenerIdProfesor() {
        return 1; // Por ahora es un valor fijo, luego se obtendrá del usuario autenticado
    }
   private void limpiarCampos() {
        TituloTarea.setText("");
        jTextField4.setText(""); // Asignatura
        Descripcion.setText("");
        Fecha.setText("");
    }
    private void TituloTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TituloTareaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TituloTareaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       int filaSeleccionada = TablaTareas.getSelectedRow();
    
    if (filaSeleccionada == -1) {
        JOptionPane.showMessageDialog(this, "Selecciona una fila para eliminar.");
        return;
    }

    int confirmacion = JOptionPane.showConfirmDialog(this, "¿Estás seguro de eliminar esta tarea?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION);
    if (confirmacion != JOptionPane.YES_OPTION) {
        return;
    }

    try (Connection conn = database.ConexionDB.conectar()) {
        String sql = "DELETE FROM tareas WHERE id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            int id = Integer.parseInt(TablaTareas.getValueAt(filaSeleccionada, 0).toString()); // Obtener ID de la tarea
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        }

        // Eliminar la fila de la JTable
        DefaultTableModel modelo = (DefaultTableModel) TablaTareas.getModel();
        modelo.removeRow(filaSeleccionada);

        JOptionPane.showMessageDialog(this, "Tarea eliminada correctamente.");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error al eliminar tarea: " + e.getMessage());
    }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
PantallaPrincipal pantprin = new PantallaPrincipal();
pantprin.setVisible(true);
this.setVisible(false);

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
                                       
    int filaSeleccionada = TablaTareas.getSelectedRow();

    if (filaSeleccionada == -1) {
        JOptionPane.showMessageDialog(this, "Selecciona una tarea para editar.");
        return;
    }

    // Obtener los valores de la fila seleccionada
    int id = Integer.parseInt(TablaTareas.getValueAt(filaSeleccionada, 0).toString());
    String titulo = TituloTarea.getText();
    String descripcion = Descripcion.getText();
    String fecha = Fecha.getText();

    if (titulo.isEmpty() || fecha.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.");
        return;
    }

    String sql = "UPDATE tareas SET titulo = ?, descripcion = ?, fecha_entrega = ? WHERE id = ?";

    try (Connection conn = database.ConexionDB.conectar();
         PreparedStatement pstmt = conn.prepareStatement(sql)) {

        pstmt.setString(1, titulo);
        pstmt.setString(2, descripcion);
        pstmt.setString(3, fecha);
        pstmt.setInt(4, id);

        int filasActualizadas = pstmt.executeUpdate();
        if (filasActualizadas > 0) {
            JOptionPane.showMessageDialog(this, "Tarea actualizada correctamente.");
            cargarTareas();  // Refresca la tabla
            limpiarCampos();
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo actualizar la tarea.");
        }

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error al actualizar tarea: " + e.getMessage());
    }

    }//GEN-LAST:event_jButton4ActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaProfesor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Asignatura;
    private javax.swing.JTextField Descripcion;
    private javax.swing.JTextField Fecha;
    private javax.swing.JTable TablaTareas;
    private javax.swing.JTextField TituloTarea;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
