package training.ideas.java.characterOperations;

/**
 * Created by idnsha on 16-08-2014.
 */
public class CharacterOperationFirstQuestion {

    public static char[] charOrp(char[] firstArray, char[] secondArray) {
        char [] finalCharArray = new char[firstArray.length+secondArray.length];
        for(int counter=0;counter<=firstArray.length-1;counter++){
            finalCharArray[counter] = firstArray[counter];
        }
        for(int counter1=0;counter1<=secondArray.length-1; counter1++){
            finalCharArray[firstArray.length+counter1] = secondArray[counter1];
        }

        return finalCharArray;
    }

    public static char[] charOrpOtherMethod(char[] firstArray, char[] secondArray) {
        int count = firstArray.length+secondArray.length;
        int counterForSecondArr=0;
        char [] finalCharArray = new char[count];
        for(int counter=0;counter<=count-1;counter++){
            if (counter<=firstArray.length-1) {
                finalCharArray[counter] = firstArray[counter];
            }
            else {
                finalCharArray[counter] = secondArray[counterForSecondArr++];
            }
        }
        return finalCharArray;
    }

    public static char[] charOrpDoWhile(char[] firstArray, char[] secondArray) {
        int count = firstArray.length+secondArray.length;
        int counterForSecondArr=0;
        int counter =0;
        char [] finalCharArray = new char[count];
        do {
            if (counter<=firstArray.length-1) {
                finalCharArray[counter] = firstArray[counter];
            }
            else {
                finalCharArray[counter] = secondArray[counterForSecondArr];
                counterForSecondArr=counterForSecondArr+1;
            }
            counter++;
        }while(counter!=count);
        return finalCharArray;
    }


}
