package modelo;
import java.util.ArrayList;

public class Liga {
    private String nombre;
    private static int sigCodLiga=0;
    private final int COD_LIGA;
    private ArrayList<Equipo> equipos;
    private final int NUM_EQUIPOS;

    public Liga(String nombre,int numEquipos){
        this.nombre = nombre;
        COD_LIGA = sigCodLiga;
        sigCodLiga++;
        equipos = new ArrayList<Equipo>();
        NUM_EQUIPOS=numEquipos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static int getSigCodLiga() {
        return sigCodLiga;
    }

    public int getCOD_LIGA() {
        return COD_LIGA;
    }

    public ArrayList<Equipo> getEquipos() {
        return equipos;
    }

    public boolean insertarEquipo(Equipo equipo) {
        this.equipos.add(equipo);
        return true;
    }
    
    // Permite comparar objetos de tipo Liga
    public boolean equals(Liga liga) {
        return (this.COD_LIGA == liga.COD_LIGA && this.nombre.equals(liga.nombre));
    }
}
