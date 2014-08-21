package training.ideas.java.sortNumbers;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by idnsha on 05-08-2014.
 */
public class SortSelectionTest {
    @Test
    public void testSelectionSort(){
        int [] inputNumbers = {4,10,5,6,-10};
        int [] ExpectedSortedNumbers = {-10,4,5,6,10};
        int [] actualSortedNumbers = SelectionSort.asc(inputNumbers);
        Assert.assertEquals(ExpectedSortedNumbers.length, actualSortedNumbers.length);
        int counter=0;
        for (counter=0;counter<ExpectedSortedNumbers.length;counter++){
            Assert.assertEquals(ExpectedSortedNumbers[counter],actualSortedNumbers[counter]);
        }
    }
    @Test
    public void testSelectionSortDescending(){
        int [] inputNumbers = {4,10,5,6,-10};
        int [] ExpectedSortedNumbers = {10,6,5,4,-10};
        int [] actualSortedNumbers = SelectionSort.desc(inputNumbers);
        Assert.assertEquals(ExpectedSortedNumbers.length, actualSortedNumbers.length);
        int counter=0;
        for (counter=0;counter<ExpectedSortedNumbers.length;counter++){
            Assert.assertEquals(ExpectedSortedNumbers[counter],actualSortedNumbers[counter]);
        }
    }
}
