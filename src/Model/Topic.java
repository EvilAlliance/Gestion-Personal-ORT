package Model;

/**
 *
 * @author Pedro Chialanza (302782)
 * @author Leandro Meneses (305998)
 */
public class Topic extends Verifiers{
    private String topic;
    private String description;

    public String getTopic() {
        return this.topic;
    }

    public boolean setTopic(String givenTopic) {
        this.topic = givenTopic;
        
        return !containsNumbers(givenTopic) && containsCharacters(givenTopic);
    }

    public String getDescription() {
        return this.description;
    }

    public boolean setDescription(String givenDescription) {
        this.description = givenDescription;
        
        return !containsNumbers(givenDescription) && containsCharacters(givenDescription);
    }
    
    public Topic(String aTopic, String aDescription){
        this.setDescription(aDescription);
        this.setTopic(aTopic);
    }
    
}
