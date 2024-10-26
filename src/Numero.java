/**
 * Enumeración que representa los posibles números de una carta en una baraja española.
 * Cada valor de la enumeración tiene asociado un carácter que representa su inicial.
 */
public enum Numero {
    /** As */
    AS('A'),
    /** Dos */
    DOS('2'),
    /** Tres */
    TRES('3'),
    /** Cuatro */
    CUATRO('4'),
    /** Cinco */
    CINCO('5'),
    /** Seis */
    SEIS('6'),
    /** Siete */
    SIETE('7'),
    /** Sota */
    SOTA('S'),
    /** Caballo */
    CABALLO('C'),
    /** Rey */
    REY('R');

    /** Inicial del número de la carta (A, 2, 3, ..., S, C, R). */
    public final char inicial;

    /**
     * Constructor privado que inicializa la inicial del número.
     *
     * @param inicial La inicial del número.
     */
    Numero(char inicial) {
        this.inicial = inicial;
    }
}
