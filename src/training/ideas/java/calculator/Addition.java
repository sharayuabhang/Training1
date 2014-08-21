package training.ideas.java.calculator;

/**
 * Created by idnsha on 21-07-2014.
 */
public class Addition {
/*    private int first=0;
    private int second=0;

    private double firstNumber=0.0;
    private double secondNumber=0.0;
*/
/*    public Addition(int first, int second) {

        this.first = first;
        this.second = second;
    }

    public Addition(double firstNumber, double secondNumber) {
                this.firstNumber=firstNumber;
                this.secondNumber=secondNumber;

    }
*/
/*
    public static int add(int first, int second) {
        return first+second;
    }
    public static double add(double first, double second) {
        return first+second;
    }
*/
public static double perform(double ...doubleNumbers){
    double sum=0;
    for(double individualElement: doubleNumbers){
        sum+=individualElement;

    }
    return sum;
}

}
