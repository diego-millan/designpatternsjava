package patterns.strategy;

public class TaxesCalculator {
    public double calculate(Tax tax) {
        return tax.calculate();
    }
}
