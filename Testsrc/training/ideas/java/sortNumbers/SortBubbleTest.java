package training.ideas.java.sortNumbers;

import junit.framework.Assert;
import org.junit.Test;
/**
 * Created by idnsha on 29-07-2014.
 */
public class SortBubbleTest {
    @Test
    public void testBubbleSort(){
        int [] inputNumbers = {4,10,5,6,-10};
        int [] ExpectedSortedNumbers = {-10,4,5,6,10};
        int [] actualSortedNumbers = BubbleSort.asc(inputNumbers);
        Assert.assertEquals(ExpectedSortedNumbers.length,actualSortedNumbers.length);
        int counter=0;
        for (counter=0;counter<ExpectedSortedNumbers.length;counter++){
            Assert.assertEquals(ExpectedSortedNumbers[counter],actualSortedNumbers[counter]);
        }
    }
    @Test
        public void testBubbleSortDescending(){
        int [] inputNumbers = {4,10,5,6,-10};
        int [] ExpectedSortedNumbers = {10,6,5,4,-10};
        int [] actualSortedNumbers = BubbleSort.desc(inputNumbers);
        Assert.assertEquals(ExpectedSortedNumbers.length,actualSortedNumbers.length);
        int counter=0;
        for (counter=0;counter<ExpectedSortedNumbers.length;counter++){
            Assert.assertEquals(ExpectedSortedNumbers[counter],actualSortedNumbers[counter]);
        }
    }

}
