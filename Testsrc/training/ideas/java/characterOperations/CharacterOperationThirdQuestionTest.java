package training.ideas.java.characterOperations;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by idnsha on 16-08-2014.
 */
public class CharacterOperationThirdQuestionTest {
    /*Third Question - Start -  Given a character array and given an index, find the occurrence of the character starting of the index..
   */
    @Test
    public void testCharacterOperationThirdQuestionFirstChar(){
        char [] charArray = {'A','B','C','D','E','F','G'};
        char findChar = 'A';
        int findIndexFrom = 0;
        int expectedCharIndex = 0;
        int charActualIndex= CharacterOperationThirdQuestion.charOrpThirdQuestion(charArray, findChar, findIndexFrom);
        Assert.assertEquals(expectedCharIndex, charActualIndex);
    }
    @Test
    public void testCharacterOperationThirdQuestionFindFromIndex3(){
        char [] charArray = {'A','B','C','D','E','F','G'};
        char findChar = 'F';
        int findIndexFrom = 3;
        int expectedCharIndex = 5;
        int charActualIndex= CharacterOperationThirdQuestion.charOrpThirdQuestion(charArray, findChar, findIndexFrom);
        Assert.assertEquals(expectedCharIndex, charActualIndex);
    }
    @Test
    public void testCharacterOperationThirdQuestionFindFromIndexAfterChar(){
        char [] charArray = {'A','B','C','D','E','F','G'};
        char findChar = 'E';
        int findIndexFrom = 5;
        int expectedCharIndex = -1;
        int charActualIndex= CharacterOperationThirdQuestion.charOrpThirdQuestion(charArray, findChar, findIndexFrom);
        Assert.assertEquals(expectedCharIndex, charActualIndex);
    }
    @Test
    public void testCharacterOperationThirdQuestionFindFromIndex(){
        char [] charArray = {'A','B','C','D','E','F','G'};
        char findChar = 'F';
        int findIndexFrom = 7;
        int expectedCharIndex = -1;
        int charActualIndex= CharacterOperationThirdQuestion.charOrpThirdQuestion(charArray, findChar, findIndexFrom);
        Assert.assertEquals(expectedCharIndex, charActualIndex);
    }
        /*Third Question - End*/

}
