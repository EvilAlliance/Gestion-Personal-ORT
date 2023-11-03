package Model;

/**
 *
 * @author Pedro Chialanza (302782)
 * @author Leandro Meneses (305998)
 */
public class Verifiers {
    String[] characterList = new String[27];
    
    protected String[] setCharList() {
        int i = 97;

        while (i <= 122) {
            this.characterList[i] = ((char) i) + "";
            i++;
        }

        return this.characterList;
    }
    
    //esto puede tener un error
    public boolean containsNumbers(String aStr) {
        boolean containsNumber = false;

        for (int i = 0; i < aStr.length() && !containsNumber; i++) {
            char aStr2Char = aStr.charAt(i);

            if (Character.isDigit(aStr2Char)) {
                containsNumber = true;
            }
        }

        return containsNumber;
    }
    //esto puede tener un error
    public boolean containsCharacters(String aStr) {
        boolean containsCharacters = false;

        for (int i = 0; i < this.characterList.length && !containsCharacters; i++) {
            if (aStr.contains(this.characterList[i])) {
                containsCharacters = true;
            }
        }

        return containsCharacters;
    }
}
