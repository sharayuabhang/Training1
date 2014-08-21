package training.ideas.java.characterOperations;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by idnsha on 16-08-2014.
 */
public class CharacterOperationFifthQuestionTest {
    /*Fifth Question - Start - Given a character Array return all lower case array.
 */
    @Test
    public void testCharacterOperationFifthQuestionAllChar(){
        char [] InputCharArray = {'A','B','C','D','E','F','G'};
        char [] ExpectedCharArray = {'a','b','c','d','e','f','g'};
        char [] ActualCharArray = CharacterOperationFifthQuestion.charOrpFifthQuestion(InputCharArray);
        Assert.assertArrayEquals(ExpectedCharArray, ActualCharArray);
    }
    @Test
    public void testCharacterOperationFifthQuestionSingleChar(){
        char [] InputCharArray =  {'A'};
        char [] ExpectedCharArray ={'a'};
        char [] ActualCharArray = CharacterOperationFifthQuestion.charOrpFifthQuestion(InputCharArray);
        Assert.assertArrayEquals(ExpectedCharArray, ActualCharArray);
    }
    @Test
    public void testCharacterOperationFifthQuestionBlankArray(){
        char [] InputCharArray = {};
        char [] ExpectedCharArray = {};
        char [] ActualCharArray = CharacterOperationFifthQuestion.charOrpFifthQuestion(InputCharArray);
        Assert.assertArrayEquals(ExpectedCharArray, ActualCharArray);
    }
            /*Fifth Question - End*/


}
