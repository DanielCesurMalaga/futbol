package modelo;

public class Equipo {
    private static int sigCodEquipo = 0;

    private static final int MAX_JUGADORES = 20;
    private final int COD_EQUIPO;
    private String nombre;
    private int numJugadores;

    private Jugador[] jugadores;
    // se inserta jugador en el primer hueco vacío (null)
    // cuando se elimina jugador se desplazan los jugadores a su derecha
    // un hueco a la izquierda.
    private Entrenador entrenador;

    public Equipo(String nombre) {
        this.nombre = nombre;
        COD_EQUIPO = sigCodEquipo;
        sigCodEquipo++;
        jugadores = new Jugador[MAX_JUGADORES];
        numJugadores = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCOD_EQUIPO() {
        return COD_EQUIPO;
    }

    public static int getSigCodEquipo() {
        return sigCodEquipo;
    }

    public Jugador[] getJugadores() {
        return jugadores;
    }

    public Entrenador getEntrenador() {
        return entrenador;
    }

    public boolean contratarEntrenador(Entrenador entrenador) {
        if (this.entrenador != null) {
            return false;
        }
        this.entrenador = entrenador;
        return true;
    }

    public boolean despedirEntrenador(Entrenador entrenador) {
        if (this.entrenador != null) {
            this.entrenador = null;
            return true;

        }
        return false;

    }

    public boolean contratarJugador(Jugador jugador) {
        if (numJugadores >= MAX_JUGADORES) {
            return false;
        } else {
            numJugadores++;
            jugadores[numJugadores - 1] = jugador;
            return true;
        }
    }

    public boolean despedirJugador(Jugador jugador) {

        if (numJugadores == 0) {
            return false;
        }
        int posicionJugador = buscarJugador(jugador);
        if (posicionJugador < 0) {
            return false;
        }

        jugadores[posicionJugador] = null;

        for (int i = posicionJugador + 1; i < numJugadores; i++) {

            jugadores[i - 1] = jugadores[i];
        }

        jugadores[numJugadores - 1] = null;
        numJugadores--;
        return true;
    }

    public int buscarJugador(Jugador jugador) {

        /*
         * INEFICIENTE
         * int posicion = -1;
         * for (int i = 0; i < numJugadores; i++) {
         * if (jugadores[i].getDNI() == jugador.getDNI()) {
         * posicion = i;
         * }
         * }
         * return posicion;
         */
        if (numJugadores == 0) {
            return -1;
        }
        int contador = 0;
        while ((contador < numJugadores) && (jugadores[contador].getDNI() != jugador.getDNI())) {
            contador++;
        }
        if (contador >= numJugadores) {
            return -1;
        } else {
            return contador;
        }

    }

}
