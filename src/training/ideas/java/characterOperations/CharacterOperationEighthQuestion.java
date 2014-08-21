package training.ideas.java.characterOperations;

/**
 * Created by idnsha on 19-08-2014.
 */
public class CharacterOperationEighthQuestion {
    public static char[] charOrpEighthQuestion(char[] charInputArray, int endIndex) {
        char[] charOutputArray = new char[endIndex + 1];
        if (endIndex<charInputArray.length){
            for (int count = 0; count <= endIndex; count++) {
                charOutputArray[count] = charInputArray[count];
            }
        return charOutputArray;
        }
        else{
            return null;
        }
    }

}