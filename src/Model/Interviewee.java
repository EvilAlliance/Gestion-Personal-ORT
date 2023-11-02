package dominio;

/**
 *
 * @author Pedro Chialanza (302782)
 * @author Leandro Meneses (305998)
 */
public class Interviewee extends Verifiers{

    private String name;
    private String dni;
    private String homeDirection;
    private String phone;
    private String email;
    private String linkedin;
    private String expertiseLevel;
    private String areaExpertise;
    String[] emailDomains = {"@gmail.com", "@hotmail.com", "@yahoo.com", "@adinet.net"};

    //las unicas 2 funciones privadas son pa q solo c ingresen desde la ventana
    public String getLevelExpertise() {
        return this.expertiseLevel;
    }

    private boolean setExpertiseLevel(String givenExpertiseLevel) {
        this.expertiseLevel = givenExpertiseLevel;
        //formato nvl experiencia (1, ..., 10)
        return !containsNumbers(givenExpertiseLevel) && (givenExpertiseLevel.length() != 1) && !containsCharacters(givenExpertiseLevel);
    }

    public String getAreaExpertise() {
        return this.areaExpertise;
    }

    private boolean setAreaExpertise(String givenAreaExpertise) {
        this.areaExpertise = givenAreaExpertise;
        //formato area experiencia (AREA EXPERIENCIA)
        return !containsNumbers(givenAreaExpertise);
    }

    public String getName() {
        return this.name;
    }

    public boolean setName(String givenName) {
        this.name = givenName;
        //formato nombre (Nombre Apellido)
        return containsNumbers(givenName) && !containsCharacters(givenName);
    }

    public String getDni() {
        return this.dni;
    }

    public boolean setDni(String givenDni) {
        this.dni = givenDni;
        //formato dni (X.XXX.XXX-X)
        return !containsNumbers(givenDni) && containsCharacters(givenDni) && givenDni.contains(".") && givenDni.contains("-");
    }

    public String getHomeDirection() {
        return this.homeDirection;
    }

    public boolean setHomeDirection(String givenHomeDirection) {
        this.homeDirection = givenHomeDirection;
        //formato direccion (NOMBRE CALLE - NUMERO CASA - NUMERO APARTAMENTO (OPCIONAL))
        return (givenHomeDirection.split("-").length != 3 || givenHomeDirection.split("-").length != 2) && !containsNumbers(givenHomeDirection.split("-")[1]) || !containsNumbers(givenHomeDirection.split("-")[2]);
        //esto puede tener un error
    }

    public String getEmail() {
        return this.email;
    }

    public boolean setEmail(String givenEmail) {
        this.email = givenEmail;
        //formato email (yourExample@yourDomain.com || yourExample@yourDomain.net)
        return givenEmail.contains(emailDomains[0]) || givenEmail.contains(emailDomains[1]) || givenEmail.contains(emailDomains[2]) || givenEmail.contains(emailDomains[3]);
    }

    public String getLinkedin() {
        return this.linkedin;
    }

    public boolean setLinkedin(String givenLink) {
        this.linkedin = givenLink;

        return givenLink.contains("www.linkedin.com/in/" + this.getName().toLowerCase().split(" ")[0] + "-" + this.getName().toLowerCase().split(" ")[1]);
    }

    public void setPhone(String givenPhone) {
        this.phone = givenPhone;
    }

    public String getPhone() {
        return this.phone;
    }

    public Interviewee(String aName, String aDni, String aHomeDirection, String aPhone, String anEmail, String aLink) {
        this.setDni(aDni);
        this.setEmail(anEmail);
        this.setHomeDirection(aHomeDirection);
        this.setLinkedin(aLink);
        this.setName(aName);
        this.setPhone(aPhone);
        this.setCharList();
    }

    @Override
    public String toString() {
        return this.getName() + " (" + this.getDni() + ")";
    }
}
