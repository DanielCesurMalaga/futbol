package modelo;

public class Jugador extends Persona {

    private int juego;

    public Jugador(String nombre, int juego) {
        super(nombre);
        this.juego = juego;
    }

    public int getJuego() {
        return juego;
    }

    public void setJuego(int juego) {
        this.juego = juego;
    }

}