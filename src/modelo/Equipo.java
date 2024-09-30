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

    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

    // Permite comparar dos objetos de tipo Equipo
    public boolean equals(Equipo equipo) {
        return (this.nombre.equals(equipo.nombre) && this.COD_EQUIPO == equipo.COD_EQUIPO);
    }

}
