public abstract class Usuario {
    private int idUsuario;
    public String nombreUsuario;
    //ELegi esta visibilidad así podía ser accedido desde cualquier clase que la necesite
    protected int DNI;
    private String email;
    private int contrasena;
    private String tipo;

    //----------Constructor----------

    public Usuario(int idUsuario, String nombreUsuario, int DNI, String email, int contrasena, String tipo) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.DNI = DNI;
        this.email = email;
        this.contrasena = contrasena;
        this.tipo = tipo;
    }

    //----------Getters y Setters----------

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getContrasena() {
        return contrasena;
    }

    public void setContrasena(int contrasena) {
        this.contrasena = contrasena;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    //----------Métodos abstractos----------
    public abstract void crearUsuario();

    public abstract String indicarTipo();
}
