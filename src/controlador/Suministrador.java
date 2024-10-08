package controlador;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

import modelo.Jugador;

public class Suministrador {

    private int siguienteDNI;

    // se almacenan personas (jugadores y entrenadores en el mismo archivo)
    // el archivo tiene al entrar lo primero el número de personas.
    // cada persona se almacena totalmente como un String (persona=linea)

    public Suministrador() {
        // comprobar q los archivos existen y si no es así los creamos.
        // personas.dat equipos.dat ligas.dat
        // los archivos se encuentran en la carpeta \\modelo\\almacen
        // 1- la carpeta está creada?
        // 2- los archivos están creados (si no crearlos)
        File almacen = new File(".\\src\\modelo\\almacen");

        if (almacen.exists()) {
            // comprobamos los archivos
            System.out.println("el directorio ya existe");
            try {
                File personas = new File(".\\src\\modelo\\almacen\\personas.dat");
                if (!personas.exists()) {
                    personas.createNewFile();
                    DataOutputStream escritor = null;
                    try {
                    escritor = new DataOutputStream(new FileOutputStream(personas));
                    escritor.writeInt(0);
                    siguienteDNI = 0;
                    } catch (FileNotFoundException e){
                    } finally {
                        if (escritor != null) escritor.close();
                    }
                    
                } else {
                    DataInputStream lector = null;

                    try {
                        lector = new DataInputStream(new FileInputStream(".\\src\\modelo\\almacen\\personas.dat"));
                        siguienteDNI = lector.readInt();
                    } catch (FileNotFoundException e) {

                    } finally {
                        if (lector != null)
                            lector.close();

                    }
                }
                File equipos = new File(".\\src\\modelo\\almacen\\equipos.dat");
                if (!equipos.exists()) {
                    equipos.createNewFile();
                }
                File ligas = new File(".\\src\\modelo\\almacen\\ligas.dat");
                if (!ligas.exists()) {
                    ligas.createNewFile();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }

        } else {
            // si no está creado se crea
            almacen.mkdir();
            System.out.println("Hemos creado el directorio");
        }
    }

    public int siguienteDNI() {
        return siguienteDNI;
    }

    public boolean insertarJugador(Jugador jugador) throws IOException {
        // confío en q esté bien creado.
        RandomAccessFile escritor = null;
        try {
            escritor = new RandomAccessFile(".\\src\\modelo\\almacen\\personas.dat","rw");
            siguienteDNI++;
            escritor.write(siguienteDNI);
            
        } catch (FileNotFoundException e) {
        } finally {
            if (escritor != null) escritor.close();
        }
        return true;
    }

    private String codificarJugador(Jugador jugador){
        String codificado = null;
        codificado = jugador.getDNI() + "/";
        codificado = codificado + jugador.getNombre() +"/";
        codificado = codificado + jugador.getJuego();
        return codificado;
    }
}
