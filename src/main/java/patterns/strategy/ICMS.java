package patterns.strategy;

public class ICMS implements Tax {

    private double value;

    public ICMS(double value) {
        this.value = value;
    }

    public double calculate() {
        return this.value * 0.1;
    }
}
