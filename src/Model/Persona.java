/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author chial
 */
public class Persona {

    private String nombre;
    private String cedula;
    private String direccion;

    public Persona(String nombre, String cedula, String direccion) {
        this.setNombre(nombre);
        this.setCedula(cedula);
        this.setDireccion(direccion);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public static String verifyNombre(String name) {
        String errorType = Verifiers.errorType(name, true, false);

        return name.equals("") ? "Esta vacio" : errorType;
    }

    public static String verifyCedula(String dni) {
        boolean errorType = Verifiers.isNumber(dni) || dni.equals("");
        String errorLength = Verifiers.errorLength2Strings(dni, 8);

        return errorType ? errorLength : "Incluye caracteres que no son numeros";
    }

    public static String verifyDireccion(String homeDirection) {
        String[] homeDirectionP = homeDirection.split(" ");
        boolean minLength = homeDirectionP.length > 1 && homeDirectionP[homeDirectionP.length - 1].length() <= 4 && Verifiers.isNumber(homeDirectionP[homeDirectionP.length - 1]) && homeDirectionP[0].length() > 0;
        return minLength ? "" : "Formato: <Nombre> <Numero>";
    }
    
    @Override
    public String toString() {
        return this.getNombre() + " (" + this.getCedula() + ")";
    }
}
