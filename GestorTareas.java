package database;

import java.sql.*;

public class GestorTareas {

    // Método para agregar una tarea
    public static void agregarTarea(String titulo, String descripcion, String fechaEntrega, int idDocente, int idEstudiante) {
        Connection conexion = ConexionDB.conectar();
        if (conexion != null) {
            String sql = "INSERT INTO tareas (titulo, descripcion, fecha_entrega, id_docente, id_estudiante) VALUES (?, ?, ?, ?, ?)";
            try {
                PreparedStatement stmt = conexion.prepareStatement(sql);
                stmt.setString(1, titulo);
                stmt.setString(2, descripcion);
                stmt.setString(3, fechaEntrega);
                stmt.setInt(4, idDocente);
                stmt.setInt(5, idEstudiante);

                stmt.executeUpdate();
                System.out.println("✅ Tarea asignada con éxito.");
                
                stmt.close();
                conexion.close();
            } catch (SQLException e) {
                System.out.println("❌ Error al asignar la tarea: " + e.getMessage());
            }
        }
    }

    // Método para mostrar todas las tareas
    public static void mostrarTareas() {
        Connection conexion = ConexionDB.conectar();
        if (conexion != null) {
            String sql = "SELECT * FROM tareas";
            try {
                Statement stmt = conexion.createStatement();
                ResultSet rs = stmt.executeQuery(sql);

                System.out.println("📋 Lista de Tareas:");
                while (rs.next()) {
                    System.out.println("🆔 ID: " + rs.getInt("id") +
                            ", 📌 Título: " + rs.getString("titulo") +
                            ", 📅 Fecha de entrega: " + rs.getString("fecha_entrega") +
                            ", 📖 Estado: " + rs.getString("estado"));
                }

                rs.close();
                stmt.close();
                conexion.close();
            } catch (SQLException e) {
                System.out.println("❌ Error al obtener las tareas: " + e.getMessage());
            }
        }
    }

    // Método para actualizar una tarea
    public static void actualizarTarea(int idTarea, String nuevoTitulo, String nuevaDescripcion, String nuevaFechaEntrega) {
        Connection conexion = ConexionDB.conectar();
        if (conexion != null) {
            String sql = "UPDATE tareas SET titulo = ?, descripcion = ?, fecha_entrega = ? WHERE id = ?";
            try {
                PreparedStatement stmt = conexion.prepareStatement(sql);
                stmt.setString(1, nuevoTitulo);
                stmt.setString(2, nuevaDescripcion);
                stmt.setString(3, nuevaFechaEntrega);
                stmt.setInt(4, idTarea);

                int filasAfectadas = stmt.executeUpdate();
                if (filasAfectadas > 0) {
                    System.out.println("✅ Tarea actualizada con éxito.");
                } else {
                    System.out.println("⚠️ No se encontró la tarea con el ID proporcionado.");
                }

                stmt.close();
                conexion.close();
            } catch (SQLException e) {
                System.out.println("❌ Error al actualizar la tarea: " + e.getMessage());
            }
        }
    }

    // Método para eliminar una tarea
    public static void eliminarTarea(int idTarea) {
        Connection conexion = ConexionDB.conectar();
        if (conexion != null) {
            String sql = "DELETE FROM tareas WHERE id = ?";
            try {
                PreparedStatement stmt = conexion.prepareStatement(sql);
                stmt.setInt(1, idTarea);

                int filasAfectadas = stmt.executeUpdate();
                if (filasAfectadas > 0) {
                    System.out.println("✅ Tarea eliminada con éxito.");
                } else {
                    System.out.println("⚠️ No se encontró la tarea con el ID proporcionado.");
                }

                stmt.close();
                conexion.close();
            } catch (SQLException e) {
                System.out.println("❌ Error al eliminar la tarea: " + e.getMessage());
            }
        }
    }

    // Método para notificar tareas próximas a vencer
    public static void notificarTareasPendientes() {
        Connection conexion = ConexionDB.conectar();
        if (conexion != null) {
            String sql = "SELECT * FROM tareas WHERE fecha_entrega <= date('now', '+3 days')";
            try {
                Statement stmt = conexion.createStatement();
                ResultSet rs = stmt.executeQuery(sql);

                System.out.println("🔔 Tareas próximas a vencer:");
                while (rs.next()) {
                    System.out.println("📌 " + rs.getString("titulo") +
                            " vence el " + rs.getString("fecha_entrega"));
                }

                rs.close();
                stmt.close();
                conexion.close();
            } catch (SQLException e) {
                System.out.println("❌ Error en la notificación de tareas: " + e.getMessage());
            }
        }
    }
}
