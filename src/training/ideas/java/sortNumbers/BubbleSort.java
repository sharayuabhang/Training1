package training.ideas.java.sortNumbers;

/**
 * Created by idnsha on 29-07-2014.
 */
public class BubbleSort {
    public static int[] asc(int[] inputNumbers) {
        int firstPass = 0;
        int SecondPass = 0;
        for (SecondPass = 0; SecondPass < inputNumbers.length - 1; SecondPass++){
            for (firstPass = 0; firstPass < inputNumbers.length - 1; firstPass++) {
                if (inputNumbers[firstPass] > inputNumbers[firstPass + 1]) {
                    int tempValue = inputNumbers[firstPass];
                    inputNumbers[firstPass] = inputNumbers[firstPass + 1];
                    inputNumbers[firstPass + 1] = tempValue;
                }

            }
        }
        return inputNumbers;
        }



    public static int[] desc(int[] inputNumbers) {
        int firstPass=0;
        int SecondPass = 0;
        for (SecondPass = 0; SecondPass < inputNumbers.length - 1; SecondPass++){
            for(firstPass=0;firstPass<inputNumbers.length-1;firstPass++){
                if (inputNumbers[firstPass]<inputNumbers[firstPass+1])
                {
                    int tempValue = inputNumbers[firstPass];
                    inputNumbers[firstPass]=inputNumbers[firstPass+1];
                    inputNumbers[firstPass+1]=tempValue;
                }

            }
        }
        return inputNumbers;
    }
}
