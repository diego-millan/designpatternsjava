package patterns.strategy;

public class IPI implements Tax {

    private double value;

    public IPI(double value) {
        this.value = value;
    }

    public double calculate() {
        return this.value * 0.2;
    }
}
