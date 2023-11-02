package dominio;

import java.util.ArrayList;

/**
 *
 * @author Pedro Chialanza (302782)
 * @author Leandro Meneses (305998)
 */
public class JobPosition extends Verifiers{
    private String positionName;
    private String positionType;
    private ArrayList<String> requiredAreaExpertise;

    public String getPositionName() {
        return this.positionName;
    }

    public boolean setPositionName(String givenPositionName) {
        this.positionName = givenPositionName;
        
        return !containsNumbers(givenPositionName) && containsCharacters(givenPositionName);
    }

    public String getPositionType() {
        return this.positionType;
    }

    public boolean setPositionType(String givenPositionType) {
        this.positionType = givenPositionType;
        
        return !containsNumbers(givenPositionType) && containsCharacters(givenPositionType);
    }

    //ponele
    public String getRequiredAreaExpertise(int index) {
        return this.requiredAreaExpertise.get(index);
    }

    public void addRequiredAreaExpertise(String givenRequiredAreaExpertise) {
        this.requiredAreaExpertise.add(givenRequiredAreaExpertise);
    }
    
    public JobPosition(String aPositionName, String aPositionType){
        this.setPositionName(aPositionName);
        this.setPositionType(aPositionType);
    }
}
