package patterns.composite;

public class CompositeAerialSection implements AerialSection {

    private AerialSection firstSection;
    private AerialSection secondSection;

    private double connectionTax;

    public CompositeAerialSection (AerialSection firstSection, AerialSection secondSection, double connectionTax) {
        this.firstSection = firstSection;
        this.secondSection = secondSection;
        this.connectionTax = connectionTax;

        if (firstSection.getDestiny() != secondSection.getOrigin()) {
            throw new RuntimeException("Sections are not connected");
        }
    }

    @Override
    public String getOrigin() {
        return firstSection.getOrigin();
    }

    @Override
    public String getDestiny() {
        return secondSection.getDestiny();
    }

    @Override
    public double getPrice() {
        return firstSection.getPrice() + secondSection.getPrice() + connectionTax;
    }
}
