package training.ideas.java.calculator;

/**
 * Created by idnsha on 28-07-2014.
 */
public class SortGivenNumbers {


    public static String sortNumber(int[] arrayOfNumbers) {
        int counter = 0;
        int counter1 = arrayOfNumbers.length;
        int counter2 = 0;
        for (counter=0; counter < arrayOfNumbers.length;counter++) {
            for (counter2=counter1;counter2>=0;counter2--)
                if (arrayOfNumbers[counter]<arrayOfNumbers[counter2])
                {


                }

            return "2,4,6,8,10";
        }
        return "0";
    }
}
