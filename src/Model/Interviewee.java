package Model;

import java.util.ArrayList;

/**
 *
 * @author Pedro Chialanza (302782)
 * @author Leandro Meneses (305998)
 */
public class Interviewee {

    private String name;
    private String dni;
    private String homeDirection;
    private String phone;
    private String email;
    private String linkedin;
    private String formato;
    private Experiencia[] experiencia;
    private static ArrayList<Interview> interviewList = new ArrayList<>();

    public String getName() {
        return this.name;
    }

    public void setName(String givenName) {
        this.name = givenName;
        //formato nombre (Nombre Apellido)
    }

    public String getDni() {
        return this.dni;
    }

    public void setDni(String givenDni) {
        this.dni = givenDni;
        //formato dni (X.XXX.XXX-X), largo: 8
    }

    public String getHomeDirection() {
        return this.homeDirection;
    }

    public void setHomeDirection(String givenHomeDirection) {
        this.homeDirection = givenHomeDirection;
        //formato direccion (NOMBRE CALLE - NUMERO CASA - NUMERO APARTAMENTO (OPCIONAL))
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String givenEmail) {
        this.email = givenEmail;
        //formato email (yourExample@yourDomain.com || yourExample@yourDomain.net)
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

    public void setPhone(String givenPhone) {
        this.phone = givenPhone;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setExperiencia(Experiencia[] experiencia) {
        this.experiencia = experiencia;
    }

    public Experiencia[] getExperiencia() {
        return this.experiencia;
    }

    //empiezan los verifiers
    public static String verifyName(String name) {
        String errorType = Verifiers.errorType(name, true, false);

        return name.equals("") ? "Esta vacio" : errorType;
    }

    public static String verifyDni(String dni) {
        boolean errorType = Verifiers.isNumber(dni) || dni.equals("");
        String errorLength = Verifiers.errorLength2Strings(dni, 8);

        return errorType ? errorLength : "Incluye caracteres que no son numeros";
    }

    public static String verifyPhone(String phone) {
        boolean errorType = Verifiers.isNumber(phone)  || phone.equals("");
        String errorLength = Verifiers.errorLength2Strings(phone, 9);

        return errorType ? errorLength : "Incluye caracteres que no son numeros";
    }

    public static String verifyHomeDirection(String homeDirection) {
        String[] homeDirectionP = homeDirection.split(" ");
        boolean minLength = homeDirectionP.length > 1 && homeDirectionP[homeDirectionP.length - 1].length() <= 4 && Verifiers.isNumber(homeDirectionP[homeDirectionP.length - 1]) && homeDirectionP[0].length() > 0;
        return minLength ? "" : "Formato: <Nombre> <Numero>";
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

    public Interviewee(String aName, String aDni, String aHomeDirection, String aPhone, String anEmail, String aLink, String aFormato, Experiencia[] experiencia) {
        this.setDni(aDni);
        this.setEmail(anEmail);
        this.setHomeDirection(aHomeDirection);
        this.setLinkedin(aLink);
        this.setName(aName);
        this.setPhone(aPhone);
        this.setFormato(aFormato);
        this.setExperiencia(experiencia);
    }

    @Override
    public String toString() {
        return this.getName() + " (" + this.getDni() + ")";
    }
}
