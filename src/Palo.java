/**
 * Enumeración que representa los posibles palos de una carta en una baraja española.
 * Cada valor de la enumeración tiene asociado un carácter que representa su inicial.
 */
public enum Palo {
    /** Espadas */
    ESPADAS('E'),
    /** Copas */
    COPAS('C'),
    /** Bastos */
    BASTOS('B'),
    /** Oros */
    OROS('O');

    /** Inicial del palo de la carta (E, C, B, O). */
    public final char inicial;

    /**
     * Constructor privado que inicializa la inicial del palo.
     *
     * @param inicial La inicial del palo.
     */
    Palo(char inicial) {
        this.inicial = inicial;
    }
}
