package Servlet;

import Servlet.Usuario;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsuarioDAO {

    private static final String URL = "jdbc:mysql://localhost:8080/proyecto_william";
    private static final String USER = "usuario";
    private static final String PASSWORD = "contraseña";

    public boolean registrarUsuario(Usuario usuario) {
        String sql = "INSERT INTO usuarios (tipo_documento, documento, nombre, contrasena, ficha, telefono, correo, id_rol) VALUES (?, ?, ?, ?, ?, ?, ?, 8)";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, usuario.getTipoDocumento());
            pstmt.setString(2, usuario.getDocumento());
            pstmt.setString(3, usuario.getNombre());
            pstmt.setString(4, encryptPassword(usuario.getContrasena())); // Asegúrate de encriptar la contraseña
            pstmt.setString(5, usuario.getFicha());
            pstmt.setString(6, usuario.getTelefono());
            pstmt.setString(7, usuario.getEmail());
            pstmt.setInt(8, 2); // Asumiendo id_rol para 'usuario' es 2

            int rowsAffected = pstmt.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    private String encryptPassword(String password) {
        // Implementa la lógica para encriptar la contraseña aquí
        // Puedes usar BCrypt o alguna otra biblioteca de encriptación
        return password; // Cambia esto por la contraseña encriptada
    }
}
