package laborator6;
//ex 2
public abstract class ACalculator {
    protected Object state;

    public Object result() {
        return state;
    }

    public ACalculator clear() {
        state = null;
        return this;
    }

    public abstract ACalculator init();
}
