import java.util.Scanner;

public class Cliente extends Usuario {
    public String nombre;
    private String email;
    private String medioDePago;

    //----------Constructor----------

    public Cliente(int idUsuario, String nombreUsuario, int DNI, String email, int contrasena, String tipo, String nombre) {
        super(idUsuario, nombreUsuario, DNI, email, contrasena, tipo);
        this.nombre = nombre;
        this.email = email;
        this.medioDePago = medioDePago;
    }

    //----------Getters y Setters----------

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getMedioDePago() {
        return medioDePago;
    }
    public void setMedioDePago(String medioDePago) {
        this.medioDePago = medioDePago;
    }

    //----------Metodos----------

    @Override
    public void crearUsuario() {
    }

    @Override
    public String indicarTipo() {
        return "Es un entrenador";

    }

    private void pagar() {

    }

    private int calificarEntrenador() {
        return 0;
    }

    private void enviarSolicitudClase() {

    }

    private void recibirSolicitudClase() {

    }
}
