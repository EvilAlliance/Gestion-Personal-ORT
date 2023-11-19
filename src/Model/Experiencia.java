package Model;

import java.io.Serializable;

/**
 *
 * @author Pedro Chialanza (302782)
 * @author Leandro Meneses (305998)
 */
public class Experiencia implements Serializable {

    private int nivel;
    private Tema topic;

    public Experiencia(int nivel, Tema topic) {
        this.setNivel(nivel);
        this.setTema(topic);
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public Tema getTema() {
        return topic;
    }

    public void setTema(Tema topic) {
        this.topic = topic;
    }

    @Override
    public String toString() {
        return this.getTema() + " (" + this.getNivel() + ")";
    }

    @Override
    public boolean equals(Object x) {
        boolean equal = false;

        if (x instanceof Experiencia) {
            equal = this.getTema().equals(((Experiencia) x).getTema());
        }

        return equal;
    }
}
