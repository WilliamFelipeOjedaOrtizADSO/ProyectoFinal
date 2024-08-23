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

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, ServletException, IOException {
        try {
            // Procesa la solicitud
            String tipoDocumento = request.getParameter("TipoDocumento");
            String documento = request.getParameter("nuevoDocumento");
            String nombre = request.getParameter("nombre");
            String contrasena = request.getParameter("nuevaContrasena");
            String ficha = request.getParameter("ficha");
            String telefono = request.getParameter("telefono");
            String email = request.getParameter("email");

            // Validaciones y lógica del negocio
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

            // Lógica de inserción en la base de datos...
            UsuarioDAO usuarioDAO = new UsuarioDAO();
            Usuario usuario = new Usuario(tipoDocumento, documento, nombre, contrasena, ficha, telefono, email);
            boolean registrado = usuarioDAO.registrarUsuario(usuario);

            if (registrado) {
                response.sendRedirect("exito.jsp");
            } else {
                request.setAttribute("error", "Hubo un error al registrar el usuario.");
                request.getRequestDispatcher("registro.jsp").forward(request, response);
            }
        } catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("error", "Hubo un problema al procesar la solicitud.");
            request.getRequestDispatcher("registro.jsp").forward(request, response);
        }
    }
}
