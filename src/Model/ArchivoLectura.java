package dominio;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 *
 * @author Pedro Chialanza (302782)
 * @author Leandro Meneses (305998)
 */
public class ArchivoLectura {

    private Scanner in = new Scanner(System.in);
    private String lineaActual;

    public ArchivoLectura(String unNombre) {
        try {
            Scanner searchFile = new Scanner(Paths.get(unNombre));
        } catch (IOException e) {
            System.err.println("segmentation fault: core dump");
            System.exit(1);
        }
    }

    public boolean hayMasLineas() {
        boolean hay = false;
        lineaActual = null;

        if (in.hasNext()) {
            lineaActual = in.nextLine();
            hay = true;
        }

        return hay;
    }

    public String ultimaLineaLeida() {
        return this.lineaActual;
    }

    public void shutDown() {
        in.close();
    }

    //listar archivo
    public void listar(String nombre, int n) {
        ArchivoLectura myFile = new ArchivoLectura(nombre);

        while (myFile.hayMasLineas()) {
            for (int i = 0; i < n; i++) {
                System.out.print(myFile.ultimaLineaLeida() + " ");
            }

            System.out.println("");
        }

        myFile.shutDown();
    }

    public int cantLineas() {
        int i = 0;

        while (hayMasLineas()) {
            i++;
        }

        return i;
    }
}
