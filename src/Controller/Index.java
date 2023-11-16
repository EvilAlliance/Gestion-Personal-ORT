package Controller;

import Model.*;

/**
 *
 * @author chial
 */
public class Index {

    public static void main(String[] args) {
        Controller.initDevMode();
        Controller.init();

        Postulante x;
        x = new Postulante("Pedro Chialanza", "123456789", "algun - lugar123", "1123413451345", "adsgagasgasd", "linkedin", null, null);

        Entrevistador y;
        y = new Entrevistador("Leandro Meneses", "123456789", "algun - lugar123", "1990");

        Entrevista z;
        z = new Entrevista(y, x, "3", "pasa raspando");

        Puesto w;
        w = new Puesto("Jefe Tecnico de Mantenimiento", "Supervisacion", null);

        Tema v;
        v = new Tema("NO C ME OCURRE NINGUN NOMBRE", "D:");

        System.out.println(x.verifyNombre(x.getNombre()));
        System.out.println(y.toString());
        System.out.println(z.toString());
        System.out.println(w.toString());
        System.out.println(v.toString());
    }
}
