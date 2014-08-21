package training.ideas.java.characterOperations;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by idnsha on 19-08-2014.
 */
public class CharacterOperationTenthQuestionTest {
    /*Tenth Question - Start -     Given a character array, and given an character, find the number of occurrences of the character.
*/
    @Test
    public void testCharacterOperationTenthQuestionNumberOfOcc(){
        char [] CharInputArray = {'A','B','C','D','E','C','G'};
        int findChar ='C';
        int ExpectedCharOccurance = 2;
        int ActualCharOccurance = CharacterOperationTenthQuestion.charOrpTenthQuestion(CharInputArray, findChar);
        Assert.assertEquals(ExpectedCharOccurance, ActualCharOccurance);
    }
    @Test
    public void testCharacterOperationTenthQuestionZeroOcc(){
        char [] CharInputArray = {'A','B','C','D','E','C','G'};
        int findChar ='S';
        int ExpectedCharOccurance = 0;
        int ActualCharOccurance = CharacterOperationTenthQuestion.charOrpTenthQuestion(CharInputArray, findChar);
        Assert.assertEquals(ExpectedCharOccurance, ActualCharOccurance);
    }
    @Test
    public void testCharacterOperationTenthQuestion1Occ(){
        char [] CharInputArray = {'A','B','C','D','E','C','G'};
        int findChar ='B';
        int ExpectedCharOccurance = 1;
        int ActualCharOccurance = CharacterOperationTenthQuestion.charOrpTenthQuestion(CharInputArray, findChar);
        Assert.assertEquals(ExpectedCharOccurance, ActualCharOccurance);
    }
    @Test
    public void testCharacterOperationTenthQuestionAllOcc(){
        char [] CharInputArray = {'A','A','A','A','A','A','A'};
        int findChar ='A';
        int ExpectedCharOccurance = 7;
        int ActualCharOccurance = CharacterOperationTenthQuestion.charOrpTenthQuestion(CharInputArray, findChar);
        Assert.assertEquals(ExpectedCharOccurance, ActualCharOccurance);
    }

}
