package training.ideas.java.calculator;
import junit.framework.Assert;
import org.junit.Test;

import static training.ideas.java.calculator.Addition.*;

/**
 * Created by idnsha on 21-07-2014.
 */
public class AdditionTest {
    @Test
    public void addTwoIntegers () {
        // Addition number  = new Addition(2,3);
        Assert.assertEquals(5.0, Addition.perform(2, 3));
        Assert.assertEquals(10.0,  Addition.perform(2, 8));
    }

    @Test
    public void addTwoDoubleNumbers(){
       Assert.assertEquals(2.2 + 3.3,Addition.perform(2.2, 3.3));
        Assert.assertEquals(4.2 + 4.3,Addition.perform(4.2,4.3));

    }


    @Test
    public void addVariableDoubleNumbers(){
      Assert.assertEquals(1.1+2.2+3.3+4.4,perform(1.1+2.2+3.3+4.4));
    }

    @Test
    public void addVariableIntAndDoubleNumber(){
        Assert.assertEquals((1+1.1+2+2.2),perform(1+1.1+2+2.2));

    }

/*    @Test
    public void addTwoDoubleNumbers1() {

        Addition number = new Addition(2.2,3.3);
            Assert.assertEquals(5.5,number.add());
        }
*/
}

