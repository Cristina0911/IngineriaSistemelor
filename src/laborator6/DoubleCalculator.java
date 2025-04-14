package laborator6;

public class DoubleCalculator extends ACalculator {

    public DoubleCalculator(double a) {
        state = a;
    }

    public DoubleCalculator add(double a) {
        state = (Double) state + a;
        return this;
    }

    public DoubleCalculator subtract(double a) {
        state = (Double) state - a;
        return this;
    }

    public DoubleCalculator multiply(double a) {
        state = (Double) state * a;
        return this;
    }

    public DoubleCalculator divide(double a) {
        if (a == 0.0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        state = (Double) state / a;
        return this;
    }


    @Override
    public DoubleCalculator init() {
        state = 0.0;
        return this;
    }

    @Override
    public NewIntCalculator state(int i) {
        return null;
    }

}
