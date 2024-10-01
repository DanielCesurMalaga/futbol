package vista;

import modelo.Entrenador;
import modelo.Jugador;
import modelo.Liga;
import modelo.Equipo;

public class Pedir {
    
    public static Liga pedirLiga() {
        String nombre;
        int numEquipos;

        System.out.println("Introduce el nombre de la liga");
        nombre = lector.nextLine();

        System.out.println("Introduce el maximo numero de equipos");
        numEquipos = lector.nextInt();
        lector.nextLine();

        return new Liga(nombre, numEquipos);
    }

    public static Equipo pedirEquipo() {
        String nombre;

        System.out.println("Introduce el nombre del equipo");
        nombre = lector.nextLine();

        return new Equipo(nombre);
    }

    public static Jugador pedirJugador() {
        String nombre;
        int juego;

        System.out.println("Introduce el nombre del jugador");
        nombre = lector.nextLine();

        System.out.println("Introduce el nivel de juego");
        juego = lector.nextInt();
        lector.nextLine();

        return new Jugador(nombre, juego);
    }

    public static Entrenador pedirEntrenador() {
        String nombre;
        int tactica;

        System.out.println("Introduce el nombre del jugador");
        nombre = lector.nextLine();

        System.out.println("Introduce el nivel de tactica");
        tactica = lector.nextInt();
        lector.nextLine();

        return new Entrenador(nombre, tactica);
    }
}
