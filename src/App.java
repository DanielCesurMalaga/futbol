import java.util.Scanner;
import vista.Inicio;

public class App {    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        Inicio inicio = new Inicio();
        int opcionAccion=inicio.menuAccion(teclado);
        int opcionElemento = inicio.menuElemento(teclado, opcionAccion);
        System.out.println("Accion: "+opcionAccion+", Elemento: "+opcionElemento);
        
        teclado.close();
    }
}
