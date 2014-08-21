package training.ideas.java.decision;

import com.sun.org.apache.bcel.internal.generic.RETURN;

/**
 * Created by idnsha on 24-07-2014.
 */
public class FPLOSCalculator {
    public static String generateFPLOSPattern(double rateValue,double[] lrvForSevenDays){
        String fplosPattern="";
        double  sumOfRateValue=0;
        double sumOfLRV=0.0;
        for(double lrvForIndividualLOS:lrvForSevenDays){
            sumOfRateValue+=rateValue;
            sumOfLRV+=lrvForIndividualLOS;
            if(sumOfRateValue>sumOfLRV) {
                fplosPattern += "Y";
            }
            else
            {
                fplosPattern += "N";
            }
        }
        return fplosPattern;
    }

    public static String[] generateFPLOSPatternForeachRate(double[] rateSpectrum, double[] lrvForSevenDays) {
        int counter=0;
        String []generateFPLOSforRate=new String[rateSpectrum.length];
        for(counter=0;counter<rateSpectrum.length;counter++) {
            generateFPLOSforRate[counter] = generateFPLOSPattern(rateSpectrum[counter], lrvForSevenDays);
        }
        return generateFPLOSforRate;
    }
}
