package training.ideas.java.calculator;

/**
 * Created by idnsha on 22-07-2014.
 */
public class AdditionDouble {
    private final double first;
    private final double second;


    public AdditionDouble(double first, double second) {
        this.first =first;
        this.second=second;
    }

    public double addDouble() {
        return first + second;
    }
}
