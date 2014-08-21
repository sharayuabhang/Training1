package training.ideas.java.characterOperations;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by idnsha on 16-08-2014.
 */
public class CharacterOperationFourthQuestionTest {
    /*Fourth Question - Start - Given a character Array return all upper case array.
     */
    @Test
    public void testCharacterOperationFourthQuestionAllChar(){
        char [] InputCharArray = {'a','b','c','d','e','f','g'};
        char [] ExpectedCharArray = {'A','B','C','D','E','F','G'};
        char [] ActualCharArray = CharacterOperationFourthQuestion.charOrpFourthQuestion(InputCharArray);
        Assert.assertArrayEquals(ExpectedCharArray, ActualCharArray);
    }
    @Test
    public void testCharacterOperationFourthQuestionSingleChar(){
        char [] InputCharArray = {'a'};
        char [] ExpectedCharArray = {'A'};
        char [] ActualCharArray = CharacterOperationFourthQuestion.charOrpFourthQuestion(InputCharArray);
        Assert.assertArrayEquals(ExpectedCharArray, ActualCharArray);
    }
    @Test
    public void testCharacterOperationFourthQuestionBlankArray(){
        char [] InputCharArray = {};
        char [] ExpectedCharArray = {};
        char [] ActualCharArray = CharacterOperationFourthQuestion.charOrpFourthQuestion(InputCharArray);
        Assert.assertArrayEquals(ExpectedCharArray, ActualCharArray);
    }
            /*Fourth Question - End*/

}
