package laborator6;

public class NewIntCalculator extends ACalculator {

    public NewIntCalculator(int a) {
        state = a;
    }

    public NewIntCalculator add(int a) {
        state = (Integer) state + a;
        return this;
    }

    public NewIntCalculator subtract(int a) {
        state = (Integer) state - a;
        return this;
    }

    public NewIntCalculator multiply(int a) {
        state = (Integer) state * a;
        return this;
    }

    @Override
    public NewIntCalculator init() {
        state = 0;
        return this;
    }
}
