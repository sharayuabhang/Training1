package training.ideas.java.characterOperations;

/**
 * Created by idnsha on 19-08-2014.
 */
public class CharacterOperationNinthQuestion {

    public static char[] charOrpNinthQuestion(char[] charInputArray, int startIndex, int endIndex) {
        int charLength=0;
        if (startIndex<0){
            startIndex=0;
        }
        if (endIndex>charInputArray.length) {
            endIndex=charInputArray.length-1;
        }
        if(startIndex>endIndex) {
            charLength=0;
        }
        else {
            charLength = endIndex - startIndex + 1;
        }

            char[] outputCharArray = new char[charLength];
            if (startIndex < endIndex) {

                int count1=0;
                for (int count = startIndex; count <= endIndex; count++) {
                    outputCharArray[count1] = charInputArray[count];
                    count1++;
                }
            }
            return outputCharArray;
    }
}
