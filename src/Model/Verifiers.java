package Model;

/**
 *
 * @author Pedro Chialanza (302782)
 * @author Leandro Meneses (305998)
 */
public class Verifiers {

    public static final String[] characterList = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "ñ"};
    public static final String[] specialCharacterList = {"!", "\"", "#", "$", "%", "&", "'", "(", ")", "*", "+", ",", "-", ".", "/", ":", ";", "<", "=", ">", "?", "@", "[", "\\", "]", "^", "_", "`", "{", "|", "}", "~"};
    public static final String[] emailDomains = {"gmail.com", "hotmail.com", "yahoo.com", "adinet.net"};
    public static final String[] errorTypedMessages = {"Incluye numeros", "Incluye caracteres", "Incluye caracteres especiales", "Dominio de E-Mail inexistente", "Linkedin inexistente", "No contiene @ o contiene más de 1", "Usuario del E-Mail invalido"};
    public static final String[] errorLengthMessages = {"Esta vacio", "Es muy corto", "Es muy largo"};

    private static int indexErrorTypeMessage;
    private static final int indexErrorDomain = 3;
    private static int indexErrorLengthMessage;

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

    public static boolean isNumber(String givenString) {
        boolean indeed = true;

        for (int i = 0; i < givenString.length() && indeed; i++) {
            char auxChar = givenString.charAt(i);

            if (!Character.isDigit(auxChar)) {
                indeed = false;
            }
        }

        return indeed && (givenString.length() > 0);
    }

    public static boolean containsCharacters(String aStr) {
        boolean containsCharacters = false;
        aStr = aStr.toLowerCase();
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

    public static String errorType(String aStr, boolean wantsNumbersChecked, boolean wantsCharactersChecked) {
        String errorMessage = "";

        if (containsNumbers(aStr) && wantsNumbersChecked) {
            indexErrorTypeMessage = 0;
            errorMessage = errorTypedMessages[indexErrorTypeMessage];
        } else if (containsCharacters(aStr) && wantsCharactersChecked) {
            indexErrorTypeMessage = 1;
            errorMessage += errorTypedMessages[indexErrorTypeMessage];
        } else if (containsSpecialCharacters(aStr)) {
            indexErrorTypeMessage = 2;
            errorMessage += errorTypedMessages[indexErrorTypeMessage];
        }

        return errorMessage;

    }

    public static String errorLength2Strings(String aStr, int specifiedLength) {
        String errorMessage = "";

        if (aStr.length() == 0) {
            indexErrorLengthMessage = 0;
            errorMessage = errorLengthMessages[indexErrorLengthMessage];
        } else if (aStr.length() < specifiedLength) {
            indexErrorLengthMessage = 1;
            errorMessage = errorLengthMessages[indexErrorLengthMessage];
        } else if (aStr.length() > specifiedLength) {
            indexErrorLengthMessage = 2;
            errorMessage = errorLengthMessages[indexErrorLengthMessage];
        }

        return errorMessage;
    }

    public static String errorLength2Arrays(String[] aStr, int specifiedLength) {
        String errorMessage = "";

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

    public static String errorDomain(String aStr) {
        boolean containsValidDomain = false;
        boolean containsValidUserName = false;
        String[] startDomain = aStr.split("@");
        int actualError = indexErrorDomain;
        if (startDomain.length == 2) {
            for (int i = 0; i < emailDomains.length; i++) {
                containsValidDomain = startDomain[startDomain.length - 1].startsWith(emailDomains[i]);

                if (containsValidDomain) {
                    i = emailDomains.length;
                }
            }
            containsValidUserName = startDomain[0].length() > 0;
            if(!containsValidUserName){
                actualError = 6;
            }
        }
        if (aStr.length() - 1 != aStr.replace("@", "").length()) {
            actualError = 5;
        }

        return containsValidDomain && actualError != 5  && containsValidUserName? "" : errorTypedMessages[actualError];
    }

    public static String errorLinkedin(String aStr) {
        return aStr.startsWith("https://www.linkedin.com") ? "" : Verifiers.errorTypedMessages[4];
    }
}
