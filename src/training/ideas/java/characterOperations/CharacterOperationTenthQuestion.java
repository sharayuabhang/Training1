package training.ideas.java.characterOperations;

/**
 * Created by idnsha on 19-08-2014.
 */
public class CharacterOperationTenthQuestion {

    public static int charOrpTenthQuestion(char[] charInputArray, int findChar) {
        int numberOfOccurance=0;
        for(int count=0;count<charInputArray.length;count++){
            if (charInputArray[count]==findChar){
                numberOfOccurance++;
            }
        }

        return numberOfOccurance;
    }
}
