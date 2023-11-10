package Model;

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
    private String expertiseLevel;
    private String areaExpertise;

    public String getLevelExpertise() {
        return this.expertiseLevel;
    }

    public void setExpertiseLevel(String givenExpertiseLevel) {
        this.expertiseLevel = givenExpertiseLevel;
        //formato nvl experiencia (1, ..., 10)
    }

    public String getAreaExpertise() {
        return this.areaExpertise;
    }

    public void setAreaExpertise(String givenAreaExpertise) {
        this.areaExpertise = givenAreaExpertise;
        //formato area experiencia (AREA EXPERIENCIA)
    }

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

    public void setLinkedin(String givenLink) {
        this.linkedin = givenLink;
    }

    public void setPhone(String givenPhone) {
        this.phone = givenPhone;
    }

    public String getPhone() {
        return this.phone;
    }

    //empiezan los verifiers
    public static String verifyName(String name){
        String errorMessage = "";
        
        errorMessage += Verifiers.errorType(name, true, false) + " " + Verifiers.errorLength2Arrays(name.split(" "), 2);
 
        return errorMessage;
    }
    
    public static String verifyDni(String dni){
        String errorMessage = "";
        
        errorMessage += Verifiers.errorType(dni, false, true) + " " + Verifiers.errorLength2Strings(dni, 8);
 
        return errorMessage;
    }
    
    public static String verifyPhone(String phone){
        String errorMessage = "";
        
        errorMessage += Verifiers.errorType(phone, false, true) + " " + Verifiers.errorLength2Strings(phone, 9);
 
        return errorMessage;
    }
    
    public static String verifyHomeDirection(String homeDirection, int specifiedLength){
        String errorMessage = "";
        
        errorMessage += Verifiers.errorType(homeDirection, true, true) + " " + Verifiers.errorLength2Arrays(homeDirection.split(" "), specifiedLength);
 
        return errorMessage;
    }
    
    public static String verifyMail(String mail){
        String errorMessage = "";
        
        errorMessage += Verifiers.errorType(mail, false, false) + " " + Verifiers.errorDomain(mail);
 
        return errorMessage;
    }
    
    
    public static String verifyLinkedin(String link){
        String errorMessage = "";
        
        errorMessage += Verifiers.errorType(link, true, false) + " " + Verifiers.errorLinkedin(link);
 
        return errorMessage;
    }
   
    
    public static String verifyExpertiseLevel(String expertiseLevel){
        String errorMessage = "";
        
        errorMessage += Verifiers.errorType(expertiseLevel, false, true) + " " + Verifiers.errorLength2Strings(expertiseLevel, 1);
 
        return errorMessage;
    }
    
    public static String verifyAreaExpertise(String areaExpertise){
        String errorMessage = "";
        
        errorMessage += Verifiers.errorType(areaExpertise, true, false);
 
        return errorMessage;
    }
    //terminan los verifiers
    
    public Interviewee(String aName, String aDni, String aHomeDirection, String aPhone, String anEmail, String aLink) {
        this.setDni(aDni);
        this.setEmail(anEmail);
        this.setHomeDirection(aHomeDirection);
        this.setLinkedin(aLink);
        this.setName(aName);
        this.setPhone(aPhone);
    }

    @Override
    public String toString() {
        return this.getName() + " (" + this.getDni() + ")";
    }
}
