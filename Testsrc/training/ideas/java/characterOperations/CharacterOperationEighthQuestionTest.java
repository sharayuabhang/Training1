package training.ideas.java.characterOperations;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by idnsha on 19-08-2014.
 */
public class CharacterOperationEighthQuestionTest {
    /*Eighth Question - Start - ] Given an array and given n index, give me an array till n index.

{a,b,c,d}
2
Output: {a,b,c}


 */
    @Test
    public void testCharacterOperationEightQuestionTillChar2(){
        char [] CharInputArray = {'A','B','C','D','E','F','G'};
        int EndIndex = 2;
        char [] ExpectedCharArray = {'A','B','C'};
        char [] ActualCharArray = CharacterOperationEighthQuestion.charOrpEighthQuestion(CharInputArray, EndIndex);
        Assert.assertArrayEquals(ExpectedCharArray, ActualCharArray);
    }
    @Test
    public void testCharacterOperationEightQuestionTillChar6(){
        char [] CharInputArray = {'A','B','C','D','E','F','G'};
        int EndIndex = 6;
        char [] ExpectedCharArray = {'A','B','C','D','E','F','G'};
        char [] ActualCharArray = CharacterOperationEighthQuestion.charOrpEighthQuestion(CharInputArray, EndIndex);
        Assert.assertArrayEquals(ExpectedCharArray, ActualCharArray);
    }
    @Test
    public void testCharacterOperationEightQuestionTillChar0(){
        char [] CharInputArray = {'A','B','C','D','E','F','G'};
        int EndIndex = 0;
        char [] ExpectedCharArray = {'A'};
        char [] ActualCharArray = CharacterOperationEighthQuestion.charOrpEighthQuestion(CharInputArray, EndIndex);
        Assert.assertArrayEquals(ExpectedCharArray, ActualCharArray);
    }
    @Test
    public void testCharacterOperationEightQuestionTillChar8(){
        char [] CharInputArray = {'A','B','C','D','E','F','G'};
        int EndIndex = 8;
        char [] ExpectedCharArray = null;
        char [] ActualCharArray = CharacterOperationEighthQuestion.charOrpEighthQuestion(CharInputArray, EndIndex);
        Assert.assertArrayEquals(ExpectedCharArray, ActualCharArray);
    }
    @Test
    public void testCharacterOperationEightQuestionTillChar8All(){
        char [] CharInputArray = {'A','B','C','D','E','F','G'};
        int EndIndex = 8;
        char [] ExpectedCharArray =  {'A','B','C','D','E','F','G'};
        char [] ActualCharArray = CharacterOperationEighthQuestion.charOrpEighthQuestion(CharInputArray, EndIndex);
        Assert.assertArrayEquals(ExpectedCharArray, ActualCharArray);
    }

            /*Eighth Question - End*/

}
