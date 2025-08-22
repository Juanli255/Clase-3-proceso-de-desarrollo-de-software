public class Main {
    public static void main(String[] args) {
        // Creo una instancia de Entrenador con valores por defecto
        // Los valores se reemplazan  por el metodo crearUsuario()
        Entrenador entrenador = new Entrenador(
            0, "", 0, "", 0, "entrenador", 
            0, 0, "", false, null, null
        );
        
        // Llamar al método crearUsuario() que está sobreescrito
        entrenador.crearUsuario();
    }
}
