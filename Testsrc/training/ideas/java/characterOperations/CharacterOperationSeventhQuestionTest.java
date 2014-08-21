package training.ideas.java.characterOperations;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by idnsha on 18-08-2014.
 */
public class CharacterOperationSeventhQuestionTest {
    /*Seventh Question - Start - Given  2 character Array, and index, find the first occurrence of second character array from given index.
{a,b,c,a,b,c,d}
{c,d}
Index: 3

Find occurrence of the {c,d} array in above array – occurrence is 5.

 */
    @Test
    public void testCharacterOperationSeventhQuestionAllChar(){
        char [] CharArray1 = {'A','B','C','D','E','F','G'};
        char [] CharArray2 = {'C','D'};
        int startIndex = 1;
        int ExpectedCharArrayIndex = 2;
        int ActualCharArrayIndex = CharacterOperationSeventhQuestion.charOrpSeventhQuestion(CharArray1, CharArray2, startIndex);
        Assert.assertEquals(ExpectedCharArrayIndex, ActualCharArrayIndex);
    }
    @Test
    public void testCharacterOperationSeventhQuestionSingleChar(){
        char [] CharArray1 = {'A','B','C','D','E','F','G'};
        char [] CharArray2 = {'H','D'};
        int startIndex = 6;
        int ExpectedCharArrayIndex = -1;
        int ActualCharArrayIndex = CharacterOperationSeventhQuestion.charOrpSeventhQuestion(CharArray1, CharArray2, startIndex);
        Assert.assertEquals(ExpectedCharArrayIndex, ActualCharArrayIndex);
    }
    @Test
    public void testCharacterOperationSeventhQuestionBlankArray(){
        char [] CharArray1 = {'A','B','C','D','C','D','C'};
        char [] CharArray2 = {};
        int startIndex = 6;
        int ExpectedCharArrayIndex = -1;
        int ActualCharArrayIndex = CharacterOperationSeventhQuestion.charOrpSeventhQuestion(CharArray1, CharArray2, startIndex);
        Assert.assertEquals(ExpectedCharArrayIndex, ActualCharArrayIndex);
    }
    @Test
    public void testCharacterOperationSixthQuestionMultiInstanceArray(){
        char [] CharArray1 = {'A','B','C','D','C','D','C'};
        char [] CharArray2 = {'C','D'};
        int startIndex = 1;
        int ExpectedCharArrayIndex = 2;
        int ActualCharArrayIndex = CharacterOperationSeventhQuestion.charOrpSeventhQuestion(CharArray1, CharArray2, startIndex);
        Assert.assertEquals(ExpectedCharArrayIndex, ActualCharArrayIndex);
    }
            /*Seven Question - End*/

}
