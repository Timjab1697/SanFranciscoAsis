package database;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ConexionDB 
{
    private static final String URL = "jdbc:sqlite:C:\\Users\\User\\Documents\\basededatosSanfrancisco/colegio.db";
    
    public static Connection conectar() {
        Connection conexion = null;
        try {
            Class.forName("org.sqlite.JDBC");
            conexion = DriverManager.getConnection(URL);
            System.out.println(" Conexion exitosa a la base de datos.");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(" Error al conectar: " + e.getMessage());
        }
        return conexion;
    }
    
   public static ArrayList<String[]> obtenerTareas(int idEstudiante) {
    ArrayList<String[]> listaTareas = new ArrayList<>();
    String sql = "SELECT titulo, descripcion, fecha_entrega, estado FROM tareas WHERE id IN (SELECT tarea_id FROM tareas_estudiantes WHERE estudiante_id = ?)";

    try (Connection conn = ConexionDB.conectar();
         PreparedStatement pstmt = conn.prepareStatement(sql)) {  // Aquí corregimos la declaración

        pstmt.setInt(1, idEstudiante);
        
        try (ResultSet rs = pstmt.executeQuery()) { // Aquí también lo corregimos
            while (rs.next()) {
                String[] tarea = {
                    rs.getString("titulo"),
                    rs.getString("descripcion"),
                    rs.getString("fecha_entrega"),
                    rs.getString("estado")
                };
                listaTareas.add(tarea);
            }
        }
        
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al obtener tareas: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    
    return listaTareas;
}

   public boolean autenticarUsuario(String usuario, String contraseña) {
    String sql = "SELECT * FROM usuarios WHERE nombre = ? AND contrasena = ?";
    
    try (Connection con = conectar();
         PreparedStatement pst = con.prepareStatement(sql)) {
        
        pst.setString(1, usuario);
        pst.setString(2, contraseña);
        
        try (ResultSet rs = pst.executeQuery()) {
            return rs.next(); // Si hay resultados, el usuario es válido
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error en la autenticación: " + e.getMessage());
    }
    return false;
}
 
    
    
    
    public static void main(String[] args) {
        conectar(); 
    }
}
