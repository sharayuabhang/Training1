package training.ideas.java.characterOperations;

/**
 * Created by idnsha on 16-08-2014.
 */
public class CharacterOperationThirdQuestion {
    public static int charOrpThirdQuestion(char[] charArray, char findChar, int findIndexFrom) {
        int indexOfChar=-1;
        for(int count=findIndexFrom;count<charArray.length;count++){
            if(charArray[count]==findChar){
                return count;
            }
        }
        return indexOfChar;
    }
}

