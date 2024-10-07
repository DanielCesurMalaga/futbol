package modelo;

public abstract class Persona {

    private static int sigDNI = 0;
    private final int DNI;
    private String nombre;

    public Persona(String nombre) {
        this.DNI = sigDNI;
        sigDNI++;
        this.nombre = nombre;
    }

    public static int getSigDNI() {
        return sigDNI;
    }

    public int getDNI() {
        return DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Permite comparar objetos de tipo Persona
    public boolean equals(Persona persona) {
        return (this.DNI == persona.DNI) && this.nombre.equals(persona.nombre);
    }

}
