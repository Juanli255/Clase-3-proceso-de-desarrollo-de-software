public class Ejercicio {
    public String nombre;
    public String musculoQueTrabaja;
    public int repeticiones;
    public int series;
    public int tiempoDeDescanso;

    // Constructor
    public Ejercicio(String nombre, String musculoQueTrabaja, int repeticiones, int series, int tiempoDeDescanso) {
        this.nombre = nombre;
        this.musculoQueTrabaja = musculoQueTrabaja;
        this.repeticiones = repeticiones;
        this.series = series;
        this.tiempoDeDescanso = tiempoDeDescanso;
    }

    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMusculoQueTrabaja() {
        return musculoQueTrabaja;
    }

    public void setMusculoQueTrabaja(String musculoQueTrabaja) {
        this.musculoQueTrabaja = musculoQueTrabaja;
    }

    public int getRepeticiones() {
        return repeticiones;
    }

    public void setRepeticiones(int repeticiones) {
        this.repeticiones = repeticiones;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public int getTiempoDeDescanso() {
        return tiempoDeDescanso;
    }

    public void setTiempoDeDescanso(int tiempoDeDescanso) {
        this.tiempoDeDescanso = tiempoDeDescanso;
    }
}
