package training.ideas.java.characterOperations;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by idnsha on 16-08-2014.
 */
public class CharacterOperationSecondQuestionTest {

    /*Second Question - Start - Given a character array and given a character , find the character,
    if character found, return index of the character, if not found then return -1.
     */
    @Test
    public void testCharacterOperationSecondQuestionFirstChar(){
        char [] charArray = {'A','B','C','D','E','F','G'};
        char findChar = 'A';
        int expectedCharIndex = 0;
        int charActualIndex= CharacterOperationSecondQuestion.charOrpSecondQuestion(charArray, findChar);
        Assert.assertEquals(expectedCharIndex, charActualIndex);
    }
    @Test
    public void testCharacterOperationSecondQuestionLastChar(){
        char [] charArray = {'A','B','C','D','E','F','G'};
        char findChar = 'G';
        int expectedCharIndex = 6;
        int charActualIndex= CharacterOperationSecondQuestion.charOrpSecondQuestion(charArray, findChar);
        Assert.assertEquals(expectedCharIndex,charActualIndex);
    }
    @Test
    public void testCharacterOperationSecondQuestionNthChar(){
        char [] charArray = {'A','B','C','D','E','F','G'};
        char findChar = 'E';
        int expectedCharIndex = 4;
        int charActualIndex= CharacterOperationSecondQuestion.charOrpSecondQuestion(charArray, findChar);
        Assert.assertEquals(expectedCharIndex,charActualIndex);
    }
    @Test
    public void testCharacterOperationSecondQuestionMinus1(){
        char [] charArray = {'A','B','C','D','E','F','G'};
        char findChar = 'P';
        int expectedCharIndex = -1;
        int charActualIndex= CharacterOperationSecondQuestion.charOrpSecondQuestion(charArray, findChar);
        Assert.assertEquals(expectedCharIndex,charActualIndex);
    }
    @Test
    public void testCharacterOperationSecondQuestionMinus1WithBlankArray(){
        char [] charArray = {};
        char findChar = 'A';
        int expectedCharIndex = -1;
        int charActualIndex= CharacterOperationSecondQuestion.charOrpSecondQuestion(charArray, findChar);
        Assert.assertEquals(expectedCharIndex,charActualIndex);
    }
    @Test
    public void testCharacterOperationSecondQuestionBothBlank(){
        char [] charArray = {};
        char findChar = ' ';
        int expectedCharIndex = -1;
        int charActualIndex= CharacterOperationSecondQuestion.charOrpSecondQuestion(charArray, findChar);
        Assert.assertEquals(expectedCharIndex,charActualIndex);
    }
    @Test
    public void testCharacterOperationSecondQuestionSpecialChar(){
        char [] charArray = {'a','1','B','c','>','<','d','2'};
        char findChar = '<';
        int expectedCharIndex = 5;
        int charActualIndex= CharacterOperationSecondQuestion.charOrpSecondQuestion(charArray, findChar);
        Assert.assertEquals(expectedCharIndex,charActualIndex);
    }
        /*Second Question - End*/

}
