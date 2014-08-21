package training.ideas.java.fibonacciSeries;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by idnsha on 05-08-2014.
 */
public class FibonacciSeriesTest {

    @Test
    public void testFibonacciSeries(){
        int n = 5;
        int [] ExpectedSortedNumbers = {0,1,1,2,3};
        int [] actualSortedNumbers = FibonacciSeries.fibonacci(n);
        Assert.assertEquals(ExpectedSortedNumbers.length, actualSortedNumbers.length);
        int counter=0;
        for (counter=0;counter<ExpectedSortedNumbers.length;counter++){
            Assert.assertEquals(ExpectedSortedNumbers[counter],actualSortedNumbers[counter]);
        }
    }
    @Test
    public void testFibonacciSeriesFor2Numbers(){
        int n = 2;
        int [] ExpectedSortedNumbers = {0,1};
        int [] actualSortedNumbers = FibonacciSeries.fibonacci(n);
        Assert.assertEquals(ExpectedSortedNumbers.length, actualSortedNumbers.length);
        int counter=0;
        for (counter=0;counter<ExpectedSortedNumbers.length;counter++){
            Assert.assertEquals(ExpectedSortedNumbers[counter],actualSortedNumbers[counter]);
        }
    }
    @Test
    public void testFibonacciSeriesWithRecursion(){
        int n = 5;
        int [] ExpectedSortedNumbers = {0,1,1,2,3};
        int [] actualSortedNumbers = FibonacciSeries.fibonacciRecursion(n);
        Assert.assertEquals(ExpectedSortedNumbers.length, actualSortedNumbers.length);
        int counter=0;
        for (counter=0;counter<ExpectedSortedNumbers.length;counter++){
            Assert.assertEquals(ExpectedSortedNumbers[counter],actualSortedNumbers[counter]);
        }
    }
    @Test
    public void testFibonacciSeriesWithRecursionFor2Numbers(){
        int n = 2;
        int [] ExpectedSortedNumbers = {0,1};
        int [] actualSortedNumbers = FibonacciSeries.fibonacciRecursion(n);
        Assert.assertEquals(ExpectedSortedNumbers.length, actualSortedNumbers.length);
        int counter=0;
        for (counter=0;counter<ExpectedSortedNumbers.length;counter++){
            Assert.assertEquals(ExpectedSortedNumbers[counter],actualSortedNumbers[counter]);
        }
    }
    @Test
    public void testFibonacciSeriesWithRecursionWithOtherMethod(){
        int n = 2;
        int [] ExpectedSortedNumbers = {0,1};
        int [] actualSortedNumbers = FibonacciSeries.fibonacciRecursionWithOtherMethod(n);
        Assert.assertEquals(ExpectedSortedNumbers.length, actualSortedNumbers.length);
        int counter=0;
        for (counter=0;counter<ExpectedSortedNumbers.length;counter++){
            Assert.assertEquals(ExpectedSortedNumbers[counter],actualSortedNumbers[counter]);
        }
    }
}
