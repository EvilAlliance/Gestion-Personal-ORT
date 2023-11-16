package Model;

/**
 *
 * @author Pedro Chialanza (302782)
 * @author Leandro Meneses (305998)
 */
public class JobPosition {

    private String positionName;
    private String positionType;
    private Topic[] requiredAreaExpertise;

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
    public void setRequiredAreaExpertise(Topic[] givenTopics) {
        this.requiredAreaExpertise = givenTopics;
    }

    public Topic[] getRequiredAreaExpertise() {
        return this.requiredAreaExpertise;
    }

    public JobPosition(String aPositionName, String aPositionType, Topic[] topic) {
        this.setPositionName(aPositionName);
        this.setPositionType(aPositionType);
        this.setRequiredAreaExpertise(topic);
    }

    @Override
    public String toString() {
        return "Puesto: " + this.getPositionName() + "\nTipo de Puesto: " + this.getPositionType();
    }
}
