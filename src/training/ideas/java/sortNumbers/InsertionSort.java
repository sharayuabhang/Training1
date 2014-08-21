package training.ideas.java.sortNumbers;

/**
 * Created by idnsha on 05-08-2014.
 */
public class InsertionSort {

    public static int[] asc(int[] inputNumbers) {
        int outerLoop;
        int insertItem;
        int innerLoop;

        for (outerLoop = 1; outerLoop < inputNumbers.length; outerLoop++){
            insertItem = inputNumbers[outerLoop];
            for(innerLoop = outerLoop - 1; (innerLoop >= 0) && (inputNumbers[innerLoop] > insertItem); innerLoop--){
                inputNumbers[innerLoop+1] = inputNumbers[innerLoop];
            }
            inputNumbers[innerLoop+1] = insertItem;
        }
        return inputNumbers;
    }

    public static int[] desc(int[] inputNumbers) {
        int outerLoop;
        int insertItem;
        int innerLoop;

        for (outerLoop = 1; outerLoop < inputNumbers.length; outerLoop++){
            insertItem = inputNumbers[ outerLoop ];
            for(innerLoop = outerLoop - 1; (innerLoop >= 0) && (inputNumbers[innerLoop] < insertItem); innerLoop--){
                inputNumbers[ innerLoop+1 ] = inputNumbers[innerLoop];
            }
            inputNumbers[ innerLoop+1 ] = insertItem;
        }

        return inputNumbers;
    }
}
