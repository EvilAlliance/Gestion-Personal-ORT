package Model;

import java.io.Serializable;

/**
 *
 * @author Pedro Chialanza (302782)
 * @author Leandro Meneses (305998)
 */
public class Entrevistador extends Persona implements Serializable {

    private String anoEntrada;

    public String getAnoEntrada() {
        return this.anoEntrada;
    }

    public void setAnoEntrada(String givenEntryYear) {
        this.anoEntrada = givenEntryYear;
    }

    public static String verifyAno(String entryYear) {
        String errorMessage = "";

        if (!Verifiers.isNumber(entryYear)) {
            errorMessage = "Incluye caracteres que no son numeros";
        } else if (entryYear.length() < 4 || entryYear.length() > 4) {
            errorMessage = "Es pertinente que el año sea de 4 digitos";
        } else if (Integer.parseInt(entryYear) >= 2023) {
            errorMessage = "No puede ingresar un evaluador en el año actual";
        } else if (Integer.parseInt(entryYear) < 1940) {
            errorMessage = "No aceptamos dinosaurios";
        }

        return errorMessage;
    }

    public Entrevistador(String aName, String aDni, String aHomeDirection, String anEntryYear) {
        super(aName, aDni, aHomeDirection);
        this.setAnoEntrada(anEntryYear);
    }
}
