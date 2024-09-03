package Servlet;

public class Usuario {
    private String tipoDocumento;
    private String documento;
    private String nombre;
    private String contrasena;
    private String ficha;
    private String telefono;
    private String email;

    // Constructor, getters y setters

    public Usuario(String tipoDocumento, String documento, String nombre, String contrasena, String ficha, String telefono, String email) {
        this.tipoDocumento = tipoDocumento;
        this.documento = documento;
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.ficha = ficha;
        this.telefono = telefono;
        this.email = email;
    }

    public String getTipoDocumento() { return tipoDocumento; }
    public void setTipoDocumento(String tipoDocumento) { this.tipoDocumento = tipoDocumento; }
    public String getDocumento() { return documento; }
    public void setDocumento(String documento) { this.documento = documento; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getContrasena() { return contrasena; }
    public void setContrasena(String contrasena) { this.contrasena = contrasena; }
    public String getFicha() { return ficha; }
    public void setFicha(String ficha) { this.ficha = ficha; }
    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}
