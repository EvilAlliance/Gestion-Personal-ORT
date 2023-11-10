package Model;

/**
 *
 * @author Pedro Chialanza (302782)
 * @author Leandro Meneses (305998)
 */
public class Verifiers {

    public static final String[] characterList = new String[27];
    public static final String[] specialCharacterList = new String[30];
    public static final String[] emailDomains = {"@gmail.com", "@hotmail.com", "@yahoo.com", "@adinet.net"};
    public static final String[] errorTypedMessages = {"Incluye numeros", "Incluye caracteres", "Incluye caracteres especiales", "Dominio de E-Mail inexistente", "Linkedin inexistente"};
    public static final String[] errorLengthMessages = {"Esta vacio", "Es muy corto", "Es muy largo"};

    private static int indexErrorTypeMessage;
    private static final int indexErrorDomain = 3;
    private static int indexErrorLengthMessage;
    

    protected static String[] setCharList() {
        int i = 97;

        while (i <= 122) {
            characterList[i] = ((char) i) + "";
            i++;
        }

        return characterList;
    }

    protected static String[] setSpecialCharList() {
        int i = 33;

        while (i <= 126) {

            if (((i >= 48 && i <= 57) || (i >= 65 && i <= 90) || (i >= 97 && i <= 122))) {
                continue;
            } else {
                specialCharacterList[i] = ((char) i) + "";
            }

            i++;
        }

        return specialCharacterList;
    }

    public static boolean containsNumbers(String aStr) {
        boolean containsNumber = false;

        for (int i = 0; i < aStr.length() && !containsNumber; i++) {
            char aStr2Char = aStr.charAt(i);

            if (Character.isDigit(aStr2Char)) {
                containsNumber = true;
            }
        }

        return containsNumber;
    }

    public static boolean containsCharacters(String aStr) {
        boolean containsCharacters = false;

        for (int i = 0; i < 27 && !containsCharacters; i++) {
            if (aStr.contains(characterList[i])) {
                containsCharacters = true;
            }
        }

        return containsCharacters;
    }

    public static boolean containsSpecialCharacters(String aStr) {
        boolean containsSpecialCharacters = false;

        for (int i = 0; i < 30 && !containsSpecialCharacters; i++) {
            if (aStr.contains(specialCharacterList[i])) {
                containsSpecialCharacters = true;
            }
        }

        return containsSpecialCharacters;
    }

    public static String errorType(String aStr, boolean wantsNumbers, boolean wantsCharacters) {
        String errorMessage = "Formato valido";
        
        if (containsNumbers(aStr) && wantsNumbers) {
            indexErrorTypeMessage = 0;
            errorMessage = errorTypedMessages[indexErrorTypeMessage] + ", ";
        }
        
        if (containsCharacters(aStr) && wantsCharacters){
            indexErrorTypeMessage = 1;
            errorMessage += errorTypedMessages[indexErrorTypeMessage] + ", ";
        }
        
        if (containsSpecialCharacters(aStr)) {
            indexErrorTypeMessage = 2;
            errorMessage += errorTypedMessages[indexErrorTypeMessage];
        }

        return errorMessage;

    }
    
    public static String errorLength2Strings(String aStr, int specifiedLength){
        String errorMessage = "Formato valido";
        
        if (aStr.length() == 0) {
            indexErrorLengthMessage = 0;
            errorMessage = errorLengthMessages[indexErrorLengthMessage];
        } else if (aStr.length() < specifiedLength) {
            indexErrorLengthMessage = 1;
            errorMessage = errorLengthMessages[indexErrorLengthMessage];
        } else if (aStr.length() > specifiedLength){
            indexErrorLengthMessage = 2;
            errorMessage = errorLengthMessages[indexErrorLengthMessage];
        }
        
        return errorMessage;
    }
    
    public static String errorLength2Arrays(String[] aStr, int specifiedLength){
        String errorMessage = "Formato valido";
        
        if (aStr.length == 0) {
            indexErrorLengthMessage = 0;
            errorMessage = errorLengthMessages[indexErrorLengthMessage];
        } else if (aStr.length < specifiedLength) {
            indexErrorLengthMessage = 1;
            errorMessage = errorLengthMessages[indexErrorLengthMessage];
        } else {
            indexErrorLengthMessage = 2;
            errorMessage = errorLengthMessages[indexErrorLengthMessage];
        }
        
        return errorMessage;
    }
    
    public static String errorDomain(String aStr){
        boolean containsValidDomain = false;
        
        for (int i = 0; i < emailDomains.length; i++){
            containsValidDomain = aStr.contains(emailDomains[i]);
            
            if (containsValidDomain){
                i = emailDomains.length;
            }
        }
        
        return containsValidDomain ? "Formato valido" : errorTypedMessages[indexErrorDomain];
    }
    
    public static String errorLinkedin(String aStr){
        return aStr.startsWith("www.linkedin.com/in/" + aStr.toLowerCase().split(" ")[0] + "-" + aStr.toLowerCase().split(" ")[1]) ? "Formato valido" : Verifiers.errorTypedMessages[4];
    }
}
