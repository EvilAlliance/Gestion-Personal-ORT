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
    
    public static String verifyEntryYear(String entryYear){
        String errorMessage = "";
        
        errorMessage += Verifiers.errorType(entryYear, false, true) + " " + Verifiers.errorLength2Strings(entryYear, 1);
        
        return errorMessage;
    }

    public Interviewer(String aName, String aDni, String aHomeDirection, String aPhone, String anEmail, String anEntryYear) {
        super(aName, aDni, aHomeDirection, aPhone, anEmail, null, null, null);
        this.setEntryYear(anEntryYear);
    }
    
    @Override
    public String toString(){
        return "" + this.getName() + " (" + this.getDni() + ") - " + this.getEntryYear();
    }
}
