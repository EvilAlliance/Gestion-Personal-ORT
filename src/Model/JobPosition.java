package Model;

import java.util.ArrayList;

/**
 *
 * @author Pedro Chialanza (302782)
 * @author Leandro Meneses (305998)
 */
public class JobPosition {
    private String positionName;
    private String positionType;
    private ArrayList<String> requiredAreaExpertise;

    public String getPositionName() {
        return this.positionName;
    }

    public void setPositionName(String givenPositionName) {
        this.positionName = givenPositionName;
    }

    public String getPositionType() {
        return this.positionType;
    }

    public void setPositionType(String givenPositionType) {
        this.positionType = givenPositionType;
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
    
    @Override
    public String toString(){
        return "Puesto: " + this.getPositionName() + "\nTipo de Puesto: " + this.getPositionType();
    }
}
