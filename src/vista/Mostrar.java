package vista;

public class Mostrar {

    public static void preguntarMostrar() {

        int leido = 0;
        boolean salir = false;

        mostrarDescripcion();// muestra el menu

        do {
            leido = lector.nextInt();
            lector.nextLine();

        if (leido == 1) {
            mostrarLigas();
        }

        if (leido == 2) {
            mostrarLiga();
        }

        if (leido == 3) {
            mostrarEquipo();
        }

        if (leido == 4) {
            mostrarTodo();
        }

        if (leido == 5) {
            salir = true;
        }

    } while ((leido > 5 || leido < 1) && salir);

    }

    public static void mostrarDescripcion() {
        System.out.println("Menu para mostrar");
        System.out.println("Escriba [1] para mostar liga");
        System.out.println("Escriba [2] para mostrar equipo");
        System.out.println("Escriba [3] para mostrar jugador");
        System.out.println("Escriba [4] para mostrar entrenador");
        System.out.println("Escriba [5] para mostrar persona");
    }

}
