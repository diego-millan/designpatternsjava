package patterns.composite;

import org.junit.Assert;
import org.junit.Test;

public class AerialSectionTest {

    @Test
    public void whenAddThreeSectionsThenTheyMustSumFlightPrices() {
        SimpleAerialSection section1 = new SimpleAerialSection("São Paulo", "Brasília", 500d);
        SimpleAerialSection section2 = new SimpleAerialSection("Brasília", "Recife",
                300d);
        SimpleAerialSection section3 = new SimpleAerialSection("Recife", "Natal",
                350d);
        CompositeAerialSection composite1 = new CompositeAerialSection(section2, section3,30d);
        CompositeAerialSection composite2 = new CompositeAerialSection(section1, composite1,30d);

        Assert.assertEquals(composite2.getPrice(), (500+300+350+30+30), 0.0001);

    }
}
