package Model;

/**
 *
 * @author Pedro Chialanza (302782)
 * @author Leandro Meneses (305998)
 */
public class Interviewer extends Interviewee {

    private String entryYear;
    
    public String getEntryYear() {
        return this.entryYear;
    }

    public void setEntryYear(String givenEntryYear) {
        this.entryYear = givenEntryYear;
    }

    public Interviewer(String aName, String aDni, String aHomeDirection, String aPhone, String anEmail, String anEntryYear) {
        super(aName, aDni, aHomeDirection, aPhone, anEmail, null);
        this.setEntryYear(anEntryYear);
    }
    
    @Override
    public String toString(){
        return "" + this.getName() + " (" + this.getDni() + ") - " + this.getEntryYear();
    }
}
