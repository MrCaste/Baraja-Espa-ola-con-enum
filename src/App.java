/**
 * Esta clase representa la aplicación principal que demuestra el uso de la clase Carta 
 * para crear e inicializar una baraja de cartas española.
 * <p>
 * La aplicación permite imprimir toda la baraja y buscar una carta específica por su número y palo.
 */
public class App {

    /**
     * Método principal para ejecutar la aplicación.
     * <p>
     * Inicializa una baraja de cartas, imprime toda la baraja y busca una carta específica.
     *
     * @param args Argumentos de línea de comandos (no utilizados en este caso).
     * @throws Exception Si ocurre un error durante la búsqueda de la carta.
     */
    public static void main(String[] args) throws Exception {
        // Inicializa la baraja completa
        System.out.println("Cartas: " + Carta.inicializarBaraja());

        // Busca una carta específica (en este caso, el Rey de Copas)
        System.out.print("Carta: ");
        try {
            // 'R' representa el Rey y 'C' representa las Copas
            System.out.println(Carta.getCarta('R', 'C'));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
