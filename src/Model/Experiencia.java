package Model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author chial
 */
public class Experiencia {

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
    public boolean equals(Object x){
        boolean equal = false;
        
        if (x instanceof Experiencia){
            equal = this.getTema().equals(((Experiencia) x).getTema());
        }
        
        return equal;
    }
}
