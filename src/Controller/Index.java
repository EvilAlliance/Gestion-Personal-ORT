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

        Interviewee x;
        x = new Interviewee("Pedro Chialanza", "123456789", "algun - lugar123", "1123413451345", "adsgagasgasd", "linkedin", null, null);

        Interviewer y;
        y = new Interviewer("Leandro Meneses", "123456789", "algun - lugar123", "1123413451345", "adsgagasgasd", "1990");

        Interview z;
        z = new Interview(y, x, "3", "pasa raspando");

        JobPosition w;
        w = new JobPosition("Jefe Tecnico de Mantenimiento", "Supervisacion", null);

        Topic v;
        v = new Topic("NO C ME OCURRE NINGUN NOMBRE", "D:");

        System.out.println(x.verifyName(x.getName()));
        System.out.println(y.toString());
        System.out.println(z.toString());
        System.out.println(w.toString());
        System.out.println(v.toString());
    }
}
