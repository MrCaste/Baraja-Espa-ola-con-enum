/**
 * Esta clase representa una aplicación de ejemplo que demuestra la creación e 
 * inicialización de una baraja de cartas.
 */
public class App {
    /**
     * Método principal para ejecutar la inicialización de la baraja.
     *
     * @param args Argumentos de línea de comandos (no utilizados en este caso).
     * @throws Exception Se lanza si ocurre un error durante la inicialización de la baraja.
     */
    public static void main(String[] args) throws Exception {
        System.out.print("Cartas: ");
        System.out.println(Carta.inicializarBaraja());
    }
}
