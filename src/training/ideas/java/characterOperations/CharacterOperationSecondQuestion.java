package training.ideas.java.characterOperations;

/**
 * Created by idnsha on 16-08-2014.
 */
public class CharacterOperationSecondQuestion {
    public static int charOrpSecondQuestion(char[] charArray, char findChar) {
        int indexOfChar=-1;
        for(int counter=0;counter<=charArray.length-1;counter++){
            if (charArray[counter]==findChar) {
                return counter;
            }
        }
        return indexOfChar;
    }

}
