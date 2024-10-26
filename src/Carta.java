import java.util.ArrayList;
import java.util.List;

/**
 * Representa una carta de una baraja española.
 * Una carta tiene un número y un palo.
 */
public class Carta {

    /**
     * Número de la carta.
     */
    final Numero NUMERO;
    /**
     * Palo de la carta.
     */
    final Palo PALO;
    /**
     * Lista estática que contiene todas las cartas de la baraja.
     */
    final static List<Carta> LISTA = new ArrayList<>();

    /**
     * Constructor de una carta.
     *
     * @param numero El número de la carta.
     * @param palo El palo de la carta.
     */
    public Carta(Numero numero, Palo palo) {
        this.NUMERO = numero;
        this.PALO = palo;
    }

    /**
     * Inicializa una baraja completa de 40 cartas.
     *
     * @return Una lista con todas las cartas de la baraja.
     */
    public static List<Carta> inicializarBaraja() {
        for (Palo palo : Palo.values()) {
            for (Numero numero : Numero.values()) {
                LISTA.add(new Carta(numero, palo));
            }
        }
        return LISTA;
    }

    /**
     * Obtiene una carta de la baraja a partir de su número y palo.
     *
     * @param numero La inicial del número de la carta.
     * @param palo La inicial del palo de la carta.
     * @return La carta encontrada.
     * @throws Exception Si no se encuentra una carta con el número y palo especificados.
     */
    public static Carta getCarta(char numero, char palo) throws Exception {
        for (int i = 0; i < LISTA.size(); i++) {
            if (LISTA.get(i).NUMERO.inicial == numero && LISTA.get(i).PALO.inicial == palo) {
                return LISTA.get(i);
            }
        }
        throw new Exception("El número o palo no existe");
    }

    /**
     * Devuelve una representación en cadena de la carta.
     *
     * @return Una cadena que contiene el número y el palo de la carta.
     */
    @Override
    public String toString() {
        return "" + NUMERO.inicial + PALO.inicial;
    }
}
