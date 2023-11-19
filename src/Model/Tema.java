package Model;

import java.io.Serializable;

/**
 *
 * @author Pedro Chialanza (302782)
 * @author Leandro Meneses (305998)
 */
public class Tema implements Serializable {

    private String nombre;
    private String descripcion;

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String givenTopic) {
        this.nombre = givenTopic;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String givenDescription) {
        this.descripcion = givenDescription;
    }

    public Tema(String aTopic, String aDescription) {
        this.setDescripcion(aDescription);
        this.setNombre(aTopic);
    }

    @Override
    public String toString() {
        return this.getNombre();
    }

    @Override
    public boolean equals(Object x) {
        boolean equal = false;

        if (x instanceof Tema) {
            equal = this.getNombre().equals(((Tema) x).getNombre());
        }

        return equal;
    }
}
