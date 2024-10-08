
import java.io.IOException;
import java.util.Scanner;

import controlador.Suministrador;
import modelo.Jugador;

public class App {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);

        Suministrador suministrador = new Suministrador();
        System.out.println(suministrador.siguienteDNI());

        Jugador jugador = new Jugador("Daniel", 10);
        System.out.println(suministrador.codificarJugador(jugador));
        teclado.close();
    }
}
