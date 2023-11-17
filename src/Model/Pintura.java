/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.*;

public class Pintura {

    public int contador = 0;
    public ArrayList<String> cosas = new ArrayList<>();
    public String comentario;
    public String buscador;

    public Pintura(String strBusqueda, String comentario) {
        this.comentario = comentario;
        this.buscador = strBusqueda;
    }

    public char peek() {
        return comentario.charAt(0);
    }

    public void consume() {
        this.comentario = comentario.substring(1);

    }

    public ArrayList<String> searchBusqueda() {
        this.cosas.add("");
        boolean etapa = false;

        while (comentario.length() != 0) {

            char x = this.peek();
            if (x == this.buscador.charAt(contador)) {
                if (!etapa) {
                    this.cosas.add(x + "");
                    etapa = true;
                } else {
                    int lastIndex = this.cosas.size() - 1;
                    this.cosas.set(lastIndex, this.cosas.get(lastIndex) + x);
                }
                etapa = true;
            } else {
                if (etapa) {
                    this.cosas.add(x + "");
                    etapa = false;
                } else {
                    int lastIndex = this.cosas.size() - 1;
                    this.cosas.set(lastIndex, this.cosas.get(lastIndex) + x);
                }
            }
            this.consume();
        }

        return this.cosas;
    }

}
