package Model;

/**
 *
 * @author Pedro Chialanza (302782)
 * @author Leandro Meneses (305998)
 */
public class Topic {

    private String topic;
    private String description;

    public String getTopic() {
        return this.topic;
    }

    public void setTopic(String givenTopic) {
        this.topic = givenTopic;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String givenDescription) {
        this.description = givenDescription;
    }

    public Topic(String aTopic, String aDescription) {
        this.setDescription(aDescription);
        this.setTopic(aTopic);
    }

    @Override
    public String toString() {
        return this.getTopic();
    }

    @Override
    public boolean equals(Object x) {
        boolean equal = false;

        if (x instanceof Topic) {
            equal = this.getTopic().equals(((Topic) x).getTopic());
        }

        return equal;
    }
}
