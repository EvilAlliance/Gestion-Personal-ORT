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
    private Topic topic;

    public Experiencia(int nivel, Topic topic) {
        this.setNivel(nivel);
        this.setTopic(topic);
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    @Override
    public String toString() {
        return this.getTopic() + " (" + this.getNivel() + ")";
    }

    @Override  
    public boolean equals(Object x){
        boolean equal = false;
        
        if (x instanceof Experiencia){
            equal = this.getTopic().equals(((Experiencia) x).getTopic());
        }
        
        return equal;
    }
}
