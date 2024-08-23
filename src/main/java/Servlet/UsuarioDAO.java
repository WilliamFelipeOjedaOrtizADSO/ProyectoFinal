package Servlet;

import Servlet.Usuario;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsuarioDAO {

    private Connection conectar() {
        // Implementa tu conexión a la base de datos aquí
        // Por ejemplo:
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/proyectowilliam", "usuario", "contraseña");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }

    public boolean registrarUsuario(Usuario usuario) {
        Connection con = conectar();
        if (con != null) {
            try {
                String sql = "INSERT INTO usuarios (tipoDocumento, documento, nombre, contrasena, ficha, telefono, email) VALUES (?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(1, usuario.getTipoDocumento());
                ps.setString(2, usuario.getDocumento());
                ps.setString(3, usuario.getNombre());
                ps.setString(4, usuario.getContrasena());
                ps.setString(5, usuario.getFicha());
                ps.setString(6, usuario.getTelefono());
                ps.setString(7, usuario.getEmail());
                int resultado = ps.executeUpdate();
                ps.close();
                con.close();
                return resultado > 0;
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return false;
    }
}
