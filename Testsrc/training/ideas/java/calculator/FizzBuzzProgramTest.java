package training.ideas.java.calculator;

import org.junit.Assert;

import org.junit.Test;

/**
 * Created by idnsha on 12-08-2014.
 */
public class FizzBuzzProgramTest {
    @Test
    public void testFizzBuzzProgram(){
        int inputNumber = 10;
        String ExpectedSortedNumbers = "1,2,Fizz,4,Buzz,Fizz,7,8,Fizz,Buzz";
        String actualSortedNumbers = FizzBuzzProgram.FizzBuzz(inputNumber);
            Assert.assertEquals(ExpectedSortedNumbers,actualSortedNumbers);
    }

    @Test
    public void testFizzBuzzProgramWithSwitch(){
        int inputNumber = 10;
        String ExpectedSortedNumbers = "1,2,Fizz,4,Buzz,Fizz,7,8,Fizz,Buzz";
        String actualSortedNumbers = FizzBuzzProgram.FizzBuzzWithSwitch(inputNumber);
        Assert.assertEquals(ExpectedSortedNumbers,actualSortedNumbers);
    }

    @Test
    public void testFizzBuzzProgramWith3If(){
        int inputNumber = 10;
        String [] ExpectedString = {"1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz"};
        String [] actualString = FizzBuzzProgram.FizzBuzzWith3if(inputNumber);
        Assert.assertArrayEquals(ExpectedString,actualString);
    }
}
