
package training.ideas.java.characterOperations;
import java.lang.*;

/**
 * Created by idnsha on 16-08-2014.
 */
public class CharacterOperationFourthQuestion {
    public static char[] charOrpFourthQuestion(char[] inputCharArray) {
        char [] OutputCharArray = new char[inputCharArray.length];
        for(int count=0;count<inputCharArray.length;count++){
            OutputCharArray[count]=Character.toUpperCase(inputCharArray[count]);
        }
        return OutputCharArray;
    }
}
