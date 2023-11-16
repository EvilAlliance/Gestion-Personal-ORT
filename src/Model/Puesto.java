package Model;

/**
 *
 * @author Pedro Chialanza (302782)
 * @author Leandro Meneses (305998)
 */
public class Puesto {

    private String nombre;
    private String tipo;
    private Tema[] temasRequeridos;

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String givenPositionName) {
        this.nombre = givenPositionName;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String givenPositionType) {
        this.tipo = givenPositionType;
    }

    //ponele
    public void setTemasRequeridos(Tema[] givenTopics) {
        this.temasRequeridos = givenTopics;
    }

    public Tema[] getTemasRequeridos() {
        return this.temasRequeridos;
    }

    public Puesto(String aPositionName, String aPositionType, Tema[] topic) {
        this.setNombre(aPositionName);
        this.setTipo(aPositionType);
        this.setTemasRequeridos(topic);
    }

    @Override
    public String toString() {
        return "Puesto: " + this.getNombre() + "\nTipo de Puesto: " + this.getTipo();
    }
}
