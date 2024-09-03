package Servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/RegistroServlet")
public class RegistroServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Obtener los datos del formulario
        String tipoDocumento = request.getParameter("TipoDocumento");
        String documento = request.getParameter("nuevoDocumento");
        String nombre = request.getParameter("nombre");
        String contrasena = request.getParameter("nuevaContrasena");
        String ficha = request.getParameter("ficha");
        String telefono = request.getParameter("telefono");
        String email = request.getParameter("email");

        // Validar los datos
        if (tipoDocumento == null || tipoDocumento.isEmpty() ||
                documento == null || documento.isEmpty() ||
                nombre == null || nombre.isEmpty() ||
                contrasena == null || contrasena.isEmpty() ||
                ficha == null || ficha.isEmpty() ||
                telefono == null || telefono.isEmpty() ||
                email == null || email.isEmpty()) {

            request.setAttribute("error", "Por favor, complete todos los campos.");
            request.getRequestDispatcher("registro.jsp").forward(request, response);
            return;
        }

        // Crear el objeto Usuario y registrar en la base de datos
        Usuario usuario = new Usuario(tipoDocumento, documento, nombre, contrasena, ficha, telefono, email);
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        boolean registrado = usuarioDAO.registrarUsuario(usuario);

        if (registrado) {
            response.sendRedirect("exito.jsp");
        } else {
            request.setAttribute("error", "Hubo un error al registrar el usuario.");
            request.getRequestDispatcher("registro.jsp").forward(request, response);
        }
    }
}
