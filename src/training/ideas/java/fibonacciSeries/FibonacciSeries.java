package training.ideas.java.fibonacciSeries;

/**
 * Created by idnsha on 07-08-2014.
 */
public class FibonacciSeries {

    public static int[] fibonacci(int n) {
        int fibonacciArray[] = new int[n];
        fibonacciArray[0]=0;
        fibonacciArray[1]=1;
        for(int counter=2;counter<n;counter++){
            fibonacciArray[counter]=fibonacciArray[counter-1]+fibonacciArray[counter-2];
        }
        return fibonacciArray;
    }

    public static int[] fibonacciRecursion(int n) {
        int []fibonacciArr =new int[n];

        for(int counter=0;counter<n;counter++){

            fibonacciArr[counter]=fibonacciRec(counter);
        }
        return fibonacciArr;
    }

    private static int fibonacciRec(int n) {
        if(n==0) {
            return 0;
        }
        else if (n==1)
            return 1;
        else return fibonacciRec(n-1)+fibonacciRec(n-2);
    }

    public static int[] fibonacciRecursionWithOtherMethod(int n) {
        int index = 0;
        int endPoint = n;
        int a=0;
        int b=1;
        while(endPoint==n)
        fibonacciROtherMethod(a,b);
        return new int[0];
    }

    private static void fibonacciROtherMethod(int a, int b) {
        fibonacciROtherMethod(a,a+b);

    }
}
