package training.ideas.java.characterOperations;

/**
 * Created by idnsha on 16-08-2014.
 */
public class CharacterOperationFifthQuestion {

    public static char[] charOrpFifthQuestion(char[] inputCharArray) {
        char [] OutputCharArray = new char[inputCharArray.length];
        for(int count=0;count<inputCharArray.length;count++){
            OutputCharArray[count]=Character.toLowerCase(inputCharArray[count]);
        }
        return OutputCharArray;
    }
}
