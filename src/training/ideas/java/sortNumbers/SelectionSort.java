package training.ideas.java.sortNumbers;

/**
 * Created by idnsha on 05-08-2014.
 */
public class SelectionSort {

    public static int[] asc(int[] inputNumbers) {

        int outerLoop, innerLoop, pointer, tempValue;
        for ( outerLoop = inputNumbers.length-1; outerLoop > 0; outerLoop--){
            pointer = 0;
            for(innerLoop = 1; innerLoop <= outerLoop; innerLoop ++)
            {
                if( inputNumbers[innerLoop] > inputNumbers[ pointer ] )
                    pointer = innerLoop;
            }
            tempValue = inputNumbers[pointer];
            inputNumbers[pointer] = inputNumbers[ outerLoop ];
            inputNumbers[ outerLoop ] = tempValue;
        }
        return inputNumbers;
    }

    public static int[] desc(int[] inputNumbers) {
        int outerLoop, innerLoop, pointer, tempValue;
        for ( outerLoop = inputNumbers.length-1; outerLoop > 0; outerLoop--){
            pointer = 0;
            for(innerLoop = 1; innerLoop <= outerLoop; innerLoop ++)
            {
                if( inputNumbers[innerLoop] < inputNumbers[ pointer ] )
                    pointer = innerLoop;
            }
            tempValue = inputNumbers[pointer];
            inputNumbers[pointer] = inputNumbers[ outerLoop ];
            inputNumbers[ outerLoop ] = tempValue;
        }
        return inputNumbers;
    }
}
