import java.util.ArrayList;

public class Rutina {
    public String nombre;
    public ArrayList<Ejercicio> ejercicios;

    //----------Constructor----------

    public Rutina(String nombre, ArrayList<Ejercicio> ejercicios) {
        this.nombre = nombre;
        this.ejercicios = ejercicios;
    }

    //----------Getters y Setters----------

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Ejercicio> getEjercicios() {
        return ejercicios;
    }

    public void setEjercicios(ArrayList<Ejercicio> ejercicios) {
        this.ejercicios = ejercicios;
    }

    //----------Metodos----------

    public void agregarEjercicio(Ejercicio ejercicio) {
        ejercicios.add(ejercicio);
    }

    public void eliminarEjercicio(Ejercicio ejercicio) {
        ejercicios.remove(ejercicio);
    }

    public void mostrarRutina() {
        System.out.println("Rutina: " + nombre);
        for (Ejercicio ejercicio : ejercicios) {
            System.out.println("Ejercicio: " + ejercicio.getNombre());
            System.out.println("Musculo que trabaja: " + ejercicio.getMusculoQueTrabaja());
            System.out.println("Repeticiones: " + ejercicio.getRepeticiones());
            System.out.println("Series: " + ejercicio.getSeries());
            System.out.println("Tiempo de descanso: " + ejercicio.getTiempoDeDescanso() + " minutos");
            System.out.println("------------------------------------------------------");
        }
    }

    public void modificarEjercicio(Ejercicio ejercicio, String nombre, String musculoQueTrabaja, int repeticiones, int series, int tiempoDeDescanso) {
        ejercicio.setNombre(nombre);
        ejercicio.setMusculoQueTrabaja(musculoQueTrabaja);
        ejercicio.setRepeticiones(repeticiones);
        ejercicio.setSeries(series);
        ejercicio.setTiempoDeDescanso(tiempoDeDescanso);
    }
}
