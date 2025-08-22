import java.util.ArrayList;
import java.util.Scanner;
public class Entrenador extends Usuario {
    public int aniosExperiencia;
    public int calificacion;
    public String areaEspecializacion;
    public Boolean matriculaProfesional;
    public ArrayList<Cliente> listaClientes;
    public Rutina Rutina;

    //----------Constructor----------

    public Entrenador(int id, String nombreUsuario, int DNI, String correo, int contrasena, String tipo, int aniosExperiencia, int calificacion, String areaEspecializacion, Boolean matriculaProfesional, ArrayList<Cliente> listaClientes, Rutina Rutina) {
        super(id, nombreUsuario, DNI, correo, contrasena, tipo);
        this.aniosExperiencia = aniosExperiencia;
        this.calificacion = calificacion;
        this.areaEspecializacion = areaEspecializacion;
        this.matriculaProfesional = matriculaProfesional;
        this.listaClientes = listaClientes;
        this.Rutina = Rutina;
    }

    //----------Getters y Setters----------

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public String getAreaEspecializacion() {
        return areaEspecializacion;
    }

    public void setAreaEspecializacion(String areaEspecializacion) {
        this.areaEspecializacion = areaEspecializacion;
    }

    public Boolean getMatriculaProfesional() {
        return matriculaProfesional;
    }

    public void setMatriculaProfesional(Boolean matriculaProfesional) {
        this.matriculaProfesional = matriculaProfesional;
    }

    public ArrayList<Cliente> getListClientes() {
        return listaClientes;
    }

    public void setListClientes(ArrayList<Cliente> listClientes) {
        this.listaClientes = listClientes;
    }

    public Rutina getRutina() {
        return Rutina;
    }

    public void setRutina(Rutina Rutina) {
        this.Rutina = Rutina;
    }

    //----------Metodos----------

    @Override
    public void crearUsuario() {
        System.out.println("Creando usuario entrenador");
        System.out.println("Ingresa nombre de usuario:");
        String nombreUsuario = new Scanner(System.in).nextLine();
        System.out.println("Ingresa una contraseña:");
        int contrasena = new Scanner(System.in).nextInt();
        System.out.println("Ingresa DNI:");
        DNI = new Scanner(System.in).nextInt();
        //Validación DNI
        while (DNI > 99999999 || DNI < 10000000) {
            System.out.println("ERROR, El DNI debe tener 8 digitos");
            DNI = new Scanner(System.in).nextInt();
        }
        System.out.println("Ingresa correo:");
        String correo = new Scanner(System.in).nextLine();
        System.out.println("Ingresa anios de experiencia:");
        int aniosExperiencia = new Scanner(System.in).nextInt();
        System.out.println("Ingresa area de especializacion:");
        String areaEspecializacion = new Scanner(System.in).nextLine();
        System.out.println("Ingresa matricula profesional:");
        Boolean matriculaProfesional = new Scanner(System.in).nextBoolean();
        System.out.println("Ingresa rutina:");
        String Rutina = new Scanner(System.in).nextLine();
    }

    public String indicarTipo() {
        return "Es un cliente";

    }

    private Rutina crearRutina() {
        return Rutina;
    }

    private void procesarSolicitud() {
    }
}
