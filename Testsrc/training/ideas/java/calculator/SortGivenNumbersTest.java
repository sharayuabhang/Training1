package training.ideas.java.calculator;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by idnsha on 28-07-2014.
 */
public class SortGivenNumbersTest {
    @Test
    public void sortNumbers(){
        int[] arrayOfNumbers={2,4,6,8,10};
        Assert.assertEquals("2,4,6,8,10", SortGivenNumbers.sortNumber(arrayOfNumbers));
    }
}
