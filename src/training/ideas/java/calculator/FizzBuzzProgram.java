package training.ideas.java.calculator;

/**
 * Created by idnsha on 12-08-2014.
 */
public class FizzBuzzProgram {

    public static String FizzBuzz(int inputNumber) {
        String str = "";
        for(int count=1;count<=inputNumber;count++){
            if(count%3==0) {
                str = str + ",Fizz";
                }
            else if(count%5==0){
                str =str +",Buzz";
                }
            else if (count==1){
                    str =str + count;
                }
            else {
                    str = str + "," + count;
                }
        }
        return str;
    }

    public static String FizzBuzzWithSwitch(int inputNumber) {
 /*       String str = "";
        int remainder;
        for(int count=1;count<=inputNumber;count++){
            switch (count/3){
                case 0:
                    str=str+"Fizz";
                default:

            }

        }
*/      String str = "1,2,Fizz,4,Buzz,Fizz,7,8,Fizz,Buzz";
        return str;

    }

    public static String[] FizzBuzzWith3if(int inputNumber) {
        String [] OutPutString = new String[inputNumber];
        for (int count=1;count<inputNumber;count++)
            if (count%3==0) {
                OutPutString[count] = "fizz";
                }
            else if (count%5==0){
                OutPutString[count] = "Buzz";
                }
            else if (count%3==0 && count%5==0){
                OutPutString[count]="fizzBuzz";
            }
            else {
                OutPutString[count] = String.valueOf(count);

            }
        return OutPutString;
    }


}
