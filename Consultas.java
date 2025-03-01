package database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Consultas {
    public static void mostrarUsuarios() {
        Connection conexion = ConexionDB.conectar();
        if (conexion != null) {
            try {
                Statement stmt = conexion.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM usuarios");

                System.out.println("Lista de Usuarios:");
                while (rs.next()) {
                    System.out.println("ID: " + rs.getInt("id") + 
                                       ", Nombre: " + rs.getString("nombre") + 
                                       ", Correo: " + rs.getString("correo") + 
                                       ", Tipo: " + rs.getString("tipo"));
                }
                rs.close();
                stmt.close();
                conexion.close();
            } catch (SQLException e) {
                System.out.println("Error en la consulta: " + e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        mostrarUsuarios(); // Prueba de consulta
    }
}
