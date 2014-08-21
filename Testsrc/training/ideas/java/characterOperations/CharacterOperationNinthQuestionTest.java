package training.ideas.java.characterOperations;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by idnsha on 19-08-2014.
 */
public class CharacterOperationNinthQuestionTest {
    /*Ninth Question - Start - Given an array with start index and end index, give me the sub array.
                {a,b,c,d,e,f,g,h}
                Start index : 2
                End index :5
                Ouput: {c,d,e,f}
*/
    @Test
    public void testCharacterOperationNinthQuestionFrom2Till5(){
        char [] CharInputArray = {'A','B','C','D','E','F','G'};
        int startIndex =2;
        int endIndex = 5;
        char [] ExpectedCharArray = {'C','D','E','F'};
        char [] ActualCharArray = CharacterOperationNinthQuestion.charOrpNinthQuestion(CharInputArray, startIndex, endIndex);
        Assert.assertArrayEquals(ExpectedCharArray, ActualCharArray);
    }
    @Test
    public void testCharacterOperationNinthQuestionInvalidEndIndex(){
        char [] CharInputArray = {'A','B','C','D','E','F','G'};
        int startIndex =2;
        int endIndex = 100;
        char [] ExpectedCharArray = {'C','D','E','F','G'};
        char [] ActualCharArray = CharacterOperationNinthQuestion.charOrpNinthQuestion(CharInputArray, startIndex, endIndex);
        Assert.assertArrayEquals(ExpectedCharArray, ActualCharArray);
    }
    @Test
    public void testCharacterOperationNinthQuestionInvalidStartIndex(){
        char [] CharInputArray = {'A','B','C','D','E','F','G'};
        int startIndex =-2;
        int endIndex = 4;
        char [] ExpectedCharArray = {'A','B','C','D','E'};
        char [] ActualCharArray = CharacterOperationNinthQuestion.charOrpNinthQuestion(CharInputArray, startIndex, endIndex);
        Assert.assertArrayEquals(ExpectedCharArray, ActualCharArray);
    }
    @Test
    public void testCharacterOperationNinthQuestionInvalidStartEndIndex(){
        char [] CharInputArray = {'A','B','C','D','E','F','G'};
        int startIndex =-2;
        int endIndex = 100;
        char [] ExpectedCharArray =  {'A','B','C','D','E','F','G'};
        char [] ActualCharArray = CharacterOperationNinthQuestion.charOrpNinthQuestion(CharInputArray, startIndex, endIndex);
        Assert.assertArrayEquals(ExpectedCharArray, ActualCharArray);
    }
    @Test
    public void testCharacterOperationNinthQuestionInvalidEndGTStartIndex(){
        char [] CharInputArray = {'A','B','C','D','E','F','G'};
        int startIndex =5;
        int endIndex = 2;
        char [] ExpectedCharArray = {};
        char [] ActualCharArray = CharacterOperationNinthQuestion.charOrpNinthQuestion(CharInputArray, startIndex, endIndex);
        Assert.assertArrayEquals(ExpectedCharArray, ActualCharArray);
    }

}
