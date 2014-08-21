package training.ideas.java.decision;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by idnsha on 28-07-2014.
 */
public class MinLOSCalculatorTest {

    @Test
    public void given_fpLos_NNNNNNN_MinLOS_Is_X(){
        String FPLOSPattern = "NNNNNNN";
        Assert.assertEquals(0,MinLOSCalculator.generateMinLOS(FPLOSPattern));
    }

    @Test
    public void given_fpLos_YYYYYYY_MinLOS_Is_1(){
        String FPLOSPattern = "YYYYYYY";
        Assert.assertEquals(1, MinLOSCalculator.generateMinLOS(FPLOSPattern));
    }
    @Test
    public void given_fpLos_NYYYYYY_MinLOS_Is_2(){
        String FPLOSPattern = "NYYYYYY";
        Assert.assertEquals(2, MinLOSCalculator.generateMinLOS(FPLOSPattern));
    }
    @Test
    public void given_fpLos_YYYYYYN_MinLOS_Is_1(){
        String FPLOSPattern = "YYYYYYN";
        Assert.assertEquals(1, MinLOSCalculator.generateMinLOS(FPLOSPattern));
    }
    @Test
    public void given_fpLos_NNNNNNY_MinLOS_Is_7(){
        String FPLOSPattern = "NNNNNNY";
        Assert.assertEquals(7, MinLOSCalculator.generateMinLOS(FPLOSPattern));
    }
}
