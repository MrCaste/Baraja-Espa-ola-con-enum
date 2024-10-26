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
     * Devuelve una representación en cadena de la carta.
     *
     * @return Una cadena que contiene el número y el palo de la carta.
     */
    @Override
    public String toString() {
        return "" + NUMERO.inicial + PALO.inicial;
    }
}
