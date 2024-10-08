package vista;

import java.util.Scanner;

import modelo.Liga;

public class Inicio {

    public int menuAccion(Scanner teclado) {

        int opcion;

        do {
            System.out.println("***   Qué quieres hacer?   ***");
            System.out.println();
            System.out.println("[1] Crear");
            System.out.println("[2] Modificar");
            System.out.println("[3] Eliminar");
            System.out.println("[4] SALIR");
            opcion = teclado.nextInt();

        } while ((opcion < 1) || (opcion > 4));
        return opcion;

    }

    public int menuElemento(Scanner teclado, int accion) {
        int opcion;
        String nombreAccion = null;

        switch (accion) {
            case 1:
                nombreAccion = "CREAR";
                break;
            case 2:
                nombreAccion = "MODIFICAR";
                break;
            case 3:
                nombreAccion = "ELIMINAR";
                break;
            default:
                break;
        }

        do {
            System.out.println("***   Sobre que elemento quieres realizar la acción: " + nombreAccion + "?   ***");
            System.out.println();
            System.out.println("[1] Jugador");
            System.out.println("[2] Entrenador");
            System.out.println("[3] Equipo");
            System.out.println("[4] Liga");
            System.out.println("[5] SALIR");
            opcion = teclado.nextInt();

        } while ((opcion < 1) || (opcion > 5));

        return opcion;

    }

    public boolean realizarAccion(int accion, int elemento) {
        switch (accion) {
            case 1: // crear
                crear(elemento);
                break;
            case 2: // modificar
                modificar(elemento);
                break;
            case 3: // eliminar
                eliminar(elemento);
                break;
            default:
                break;
        }

        return true;
    }

    public boolean crear(int elemento) {
        switch (elemento) {
            case 1: // jugador
                System.out.println();
                break;
            case 2: // entrenador

                break;
            case 3: // equipo

                break;
            case 4: // liga

                break;

            default:
                break;
        }

        return true;
    }
}
