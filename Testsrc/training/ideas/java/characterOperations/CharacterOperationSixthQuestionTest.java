package training.ideas.java.characterOperations;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by idnsha on 16-08-2014.
 */
public class CharacterOperationSixthQuestionTest {
    /*Sixth Question - Start - ] Given  2 character Array, find the first occurrence of second character array.
        {a,b,c,a,b,c,d}
        {c,d}
        Find occurrence of the {c,d} array in above array – occurrence is 5. Array start with 0 index.
 */
    @Test
    public void testCharacterOperationSixthQuestionAllChar(){
        char [] CharArray1 = {'A','B','C','D','E','F','G'};
        char [] CharArray2 = {'C','D'};
        int ExpectedCharArrayIndex = 2;
        int ActualCharArrayIndex = CharacterOperationSixthQuestion.charOrpSixthQuestion(CharArray1, CharArray2);
        Assert.assertEquals(ExpectedCharArrayIndex, ActualCharArrayIndex);
    }
    @Test
    public void testCharacterOperationSixthQuestionSingleChar(){
        char [] CharArray1 = {'A','B','C','D','E','F','G'};
        char [] CharArray2 = {'H','D'};
        int ExpectedCharArrayIndex = -1;
        int ActualCharArrayIndex = CharacterOperationSixthQuestion.charOrpSixthQuestion(CharArray1, CharArray2);
        Assert.assertEquals(ExpectedCharArrayIndex, ActualCharArrayIndex);
    }
    @Test
    public void testCharacterOperationSixthQuestionBlankArray(){
        char [] CharArray1 = {'A','B','C','D','C','D','C'};
        char [] CharArray2 = {};
        int ExpectedCharArrayIndex = -1;
        int ActualCharArrayIndex = CharacterOperationSixthQuestion.charOrpSixthQuestion(CharArray1, CharArray2);
        Assert.assertEquals(ExpectedCharArrayIndex, ActualCharArrayIndex);
    }
    @Test
    public void testCharacterOperationSixthQuestionMultiInstanceArray(){
        char [] CharArray1 = {'A','B','C','D','C','D','C'};
        char [] CharArray2 = {'C','D'};
        int ExpectedCharArrayIndex = 2;
        int ActualCharArrayIndex = CharacterOperationSixthQuestion.charOrpSixthQuestion(CharArray1, CharArray2);
        Assert.assertEquals(ExpectedCharArrayIndex, ActualCharArrayIndex);
    }
            /*Sixth Question - End*/


}
