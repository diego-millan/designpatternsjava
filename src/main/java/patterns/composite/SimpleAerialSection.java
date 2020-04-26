package patterns.composite;

import lombok.Getter;

public class SimpleAerialSection implements AerialSection {
    private String origin;
    private String destiny;
    private double price;

    public SimpleAerialSection (String origin, String destiny, double price) {
        this.origin = origin;
        this.destiny = destiny;
        this.price = price;
    }

    @Override
    public String getOrigin() {
        return this.origin;
    }

    @Override
    public String getDestiny() {
        return this.destiny;
    }

    @Override
    public double getPrice() {
        return this.price;
    }
}
