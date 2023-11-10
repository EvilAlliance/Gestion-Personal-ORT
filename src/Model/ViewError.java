package Model;

/**
 *
 * @author Pedro Chialanza (302782)
 * @author Leandro Meneses (305998)
 */
public class ViewError {
    public Object enumErrors;
    public String message;
    
    public ViewError(Object anEnum, String aMessage){
        this.enumErrors = anEnum;
        this.message = aMessage;
    }
}
