package training.ideas.java.decision;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by idnsha on 24-07-2014.
 */
public class FPLOSCalculatorTest {
    @Test
    public void given_rate_is_0_and_lrv_is_greater_than_0_for_all_7_los_then_fplos_NNNNNNN(){
        double  rateValue=0.0;
        double[] lrvForSevenDays= {1.0,1.0,1.0,1.0,1.0,1.0,1.0};
        Assert.assertEquals("NNNNNNN",FPLOSCalculator.generateFPLOSPattern(rateValue,lrvForSevenDays));
    }
    @Test
    public void given_rate_is_0_and_lrv_is_greater_than_0_for_all_7_los_then_fplos_YYYYYYY(){
        double  rateValue=1.0;
        double[] lrvForSevenDays= {0.0,0.0,0.0,0.0,0.0,0.0,0.0};
        Assert.assertEquals("YYYYYYY",FPLOSCalculator.generateFPLOSPattern(rateValue,lrvForSevenDays));
    }
    public void given_rate_is_0_and_lrv_is_greater_than_0_for_all_7_los_then_fplos_NYYYYYY(){
        double  rateValue=75.0;
        double[] lrvForSevenDays= {75.0,100.0,0.0,50.0,70.0,80.0,120.0};
        Assert.assertEquals("NYYYYYY",FPLOSCalculator.generateFPLOSPattern(rateValue,lrvForSevenDays));
    }
    public void testRateSpectrum(){
        double []rateSpectrum={0,1,75.5,100};
        double []lrvForSevenDays= {75.0,100.0,0.0,50.0,70.0,80.0,120.0};
        int counter = 0;
        String []ExpectedFPLOSPattern = {"NNNNNNN","YYYYYYY","XXXXXX","YYYYYYY"};
        String []ActualFPLOSPattern = FPLOSCalculator.generateFPLOSPatternForeachRate(rateSpectrum,lrvForSevenDays);
        for (counter=0;counter<rateSpectrum.length;counter++) {
            Assert.assertEquals(ExpectedFPLOSPattern[counter], ActualFPLOSPattern[counter]);
        }
    }
}
