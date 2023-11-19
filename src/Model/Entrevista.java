 package Model;

import java.io.Serializable;

/**
 *
 * @author Pedro Chialanza (302782)
 * @author Leandro Meneses (305998)
 */
public class Entrevista implements Serializable {

    private Entrevistador entrevistador;
    private String puntaje;
    private String comentario;
    private static int interviewNumber = 0;

    public Entrevistador getEntrevistador() {
        return this.entrevistador;
    }

    public void setEntrevistador(Entrevistador givenInterviewer) {
        this.entrevistador = givenInterviewer;
    }

    public String getPuntaje() {
        return this.puntaje;
    }

    public void setPuntaje(String givenInterviewScore) {
        this.puntaje = givenInterviewScore;
    }

    public String getComentario() {
        return this.comentario;
    }

    public void setComentario(String givenInterviewCommentaries) {
        this.comentario = givenInterviewCommentaries;
    }

    public static int getInterviewNumber() {
        return interviewNumber;
    }

    public Entrevista(Entrevistador anInterviewer, String anInterviewScore, String interviewCommentaries) {
        this.setEntrevistador(anInterviewer);
        this.setPuntaje(anInterviewScore);
        this.setComentario(interviewCommentaries);
        interviewNumber++;
    }

    @Override
    public String toString() {
        return "Entrevistador: " + this.getEntrevistador().getNombre() + "\nPuntaje: " + this.getPuntaje() + "\nComentarios: " + this.getComentario();
    }
}
