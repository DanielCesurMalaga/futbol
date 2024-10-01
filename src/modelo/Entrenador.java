package modelo;

public class Entrenador extends Persona {

    private int tactica;

    public Entrenador(String nombre, int tactica) {
        super(nombre);
        this.tactica = tactica;
    }

    public int getTactica() {
        return tactica;
    }

    public void setTactica(int tactica) {
        this.tactica = tactica;
    }
}
