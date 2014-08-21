package training.ideas.java.characterOperations;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by idnsha on 16-08-2014.
 */
public class CharacterOperationFirstQuestionTest {
    /*First Question - Start - Given 2 character arrays, return me concatenation of single array
        {a,b,c}
        {d,e,f}
        Output : {a,b,c,d,e,f}
        Single array with all elements included.
    */
    @Test
    public void testCharacterOperation(){
        char [] firstArray = {'a','b','c'};
        char [] secondArray = {'d','e','f'};
        char [] expectedArray = {'a','b','c','d','e','f'};
        char [] actualArray = CharacterOperationFirstQuestion.charOrp(firstArray, secondArray);
        Assert.assertEquals(expectedArray.length, actualArray.length);
        Assert.assertArrayEquals(expectedArray,actualArray);
        }

    @Test
    public void testCharacterOperationSingleArray(){
        char [] firstArray = {'a','b','c'};
        char [] secondArray = {'d'};
        char [] expectedArray = {'a','b','c','d'};
        char [] actualArray = CharacterOperationFirstQuestion.charOrp(firstArray, secondArray);
        Assert.assertEquals(expectedArray.length, actualArray.length);
        Assert.assertArrayEquals(expectedArray,actualArray);
    }
    @Test
    public void testCharacterOperationSecondBlank(){
        char [] firstArray = {'a','b','c'};
        char [] secondArray = {};
        char [] expectedArray = {'a','b','c'};
        char [] actualArray = CharacterOperationFirstQuestion.charOrp(firstArray, secondArray);
        Assert.assertEquals(expectedArray.length, actualArray.length);
        Assert.assertArrayEquals(expectedArray,actualArray);
    }

    @Test
    public void testCharacterOperationFirstBlank(){
        char [] firstArray = {};
        char [] secondArray = {'a','b','c'};
        char [] expectedArray = {'a','b','c'};
        char [] actualArray = CharacterOperationFirstQuestion.charOrp(firstArray, secondArray);
        Assert.assertEquals(expectedArray.length, actualArray.length);
        Assert.assertArrayEquals(expectedArray,actualArray);
    }
    @Test
    public void testCharacterOperationBothBlank(){
        char [] firstArray = {};
        char [] secondArray = {};
        char [] expectedArray = {};
        char [] actualArray = CharacterOperationFirstQuestion.charOrp(firstArray, secondArray);
        Assert.assertEquals(expectedArray.length, actualArray.length);
        Assert.assertArrayEquals(expectedArray,actualArray);
    }
    @Test
    public void testCharacterOperationBoth1(){
        char [] firstArray = {'A'};
        char [] secondArray = {'a'};
        char [] expectedArray = {'A','a'};
        char [] actualArray = CharacterOperationFirstQuestion.charOrp(firstArray, secondArray);
        Assert.assertEquals(expectedArray.length, actualArray.length);
        Assert.assertArrayEquals(expectedArray,actualArray);
    }
    @Test
    public void testCharacterOperationBoth(){
        char [] firstArray = {'A','B','C','D','E','F','G'};
        char [] secondArray = {'a','b'};
        char [] expectedArray = {'A','B','C','D','E','F','G','a','b'};
        char [] actualArray = CharacterOperationFirstQuestion.charOrp(firstArray, secondArray);
        Assert.assertEquals(expectedArray.length, actualArray.length);
        Assert.assertArrayEquals(expectedArray,actualArray);
    }
    @Test
    public void testCharacterOperationBothOther(){
        char [] firstArray = {'A','B','C','D','E','F','G'};
        char [] secondArray = {'a','b'};
        char [] expectedArray = {'A','B','C','D','E','F','G','a','b'};
        char [] actualArray = CharacterOperationFirstQuestion.charOrpOtherMethod(firstArray, secondArray);
        Assert.assertEquals(expectedArray.length, actualArray.length);
        Assert.assertArrayEquals(expectedArray,actualArray);
    }
    @Test
    public void testCharOperationDoWhile(){
        char [] firstArray = {'A','B','C','D','E','F','G'};
        char [] secondArray = {'a','b'};
        char [] expectedArray = {'A','B','C','D','E','F','G','a','b'};
        char [] actualArray = CharacterOperationFirstQuestion.charOrpDoWhile(firstArray, secondArray);
        Assert.assertEquals(expectedArray.length, actualArray.length);
        Assert.assertArrayEquals(expectedArray,actualArray);
    }
    @Test
    public void testCharacterOperationBothSpecialOrChar(){
        char [] firstArray = {'A','<','C','>','E','!','G'};
        char [] secondArray = {'a','*'};
        char [] expectedArray = {'A','<','C','>','E','!','G','a','*'};
        char [] actualArray = CharacterOperationFirstQuestion.charOrpOtherMethod(firstArray, secondArray);
        Assert.assertEquals(expectedArray.length, actualArray.length);
        Assert.assertArrayEquals(expectedArray,actualArray);
    }
    /*First Question - End*/

}
