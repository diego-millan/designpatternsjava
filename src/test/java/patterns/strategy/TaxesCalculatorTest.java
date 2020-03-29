package patterns.strategy;


import org.junit.Assert;
import org.junit.Test;

public class TaxesCalculatorTest {

    @Test
    public void testTaxesWithSuccess() {
        TaxesCalculator calculator = new TaxesCalculator();
        ICMS icms = new ICMS(100.0);
        IPI ipi = new IPI(100.0);

        int result = Double.compare(calculator.calculate(icms), 10.0);

        Assert.assertTrue(result == 0 );
    }
}
