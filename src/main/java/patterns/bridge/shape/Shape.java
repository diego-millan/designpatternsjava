package patterns.bridge.shape;

import patterns.bridge.color.Color;

public abstract class Shape {

    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public abstract String draw();
}
