package Model;

import java.util.ArrayList;

/**
 *
 * @author Pedro Chialanza (302782)
 * @author Leandro Meneses (305998)
 */
public class Postulante extends Persona{
    
    private String telefono;
    private String mail;
    private String linkedin;
    private String formato;
    private Experiencia[] experiencia;
    private ArrayList<Entrevista> entrevistas = new ArrayList<>();

    public String getMail() {
        return this.mail;
    }

    public void setMail(String givenEmail) {
        this.mail = givenEmail;
        //formato mail (yourExample@yourDomain.com || yourExample@yourDomain.net)
    }

    public String getLinkedin() {
        return this.linkedin;
    }

    public void setLinkedin(String givenLinkedin) {
        this.linkedin = givenLinkedin;
    }

    public String getFormato() {
        return this.formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public void setTelefono(String givenPhone) {
        this.telefono = givenPhone;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setExperiencia(Experiencia[] experiencia) {
        this.experiencia = experiencia;
    }

    public Experiencia[] getExperiencia() {
        return this.experiencia;
    }

    public void setEntrevistas(ArrayList<Entrevista> entrevistas){
        this.entrevistas = entrevistas;
    }
    
    public ArrayList<Entrevista> getEntrevistas(){
        return this.entrevistas;
    }
    
    //empiezan los verifiers

    public static String verifyTelefono(String phone) {
        boolean errorType = Verifiers.isNumber(phone)  || phone.equals("");
        String errorLength = Verifiers.errorLength2Strings(phone, 9);

        return errorType ? errorLength : "Incluye caracteres que no son numeros";
    }

    public static String verifyMail(String mail) {
        String errorMessage = "";

        errorMessage = Verifiers.errorDomain(mail);

        return errorMessage;
    }

    public static String verifyLinkedin(String link) {
        return Verifiers.errorLinkedin(link);
    }

    //terminan los verifiers

    public Postulante(String aName, String aDni, String aHomeDirection, String aPhone, String anEmail, String aLink, String aFormato, Experiencia[] experiencia) {
        super(aName, aDni, aHomeDirection);
        this.setMail(anEmail);
        this.setLinkedin(aLink);
        this.setTelefono(aPhone);
        this.setFormato(aFormato);
        this.setExperiencia(experiencia);
    }

    
}
