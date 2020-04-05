package patterns.bridge;

import org.junit.Assert;
import org.junit.Test;
import patterns.bridge.color.Blue;
import patterns.bridge.color.Red;
import patterns.bridge.shape.Shape;
import patterns.bridge.shape.Square;
import patterns.bridge.shape.Triangle;

import static org.junit.Assert.assertEquals;

public class ShapeTest {

    @Test
    public void whenBridgePatternInvokedForSquare_thenConfigSuccess() {
        //a square with red color
        Shape square = new Square(new Red());

        Assert.assertEquals(square.draw(), "Square drawn. Color is Red");
    }

    @Test
    public void whenBridgePatternInvokedForTriangle_thenConfigSuccess() {
        //a square with red color
        Shape square = new Triangle(new Blue());

        assertEquals(square.draw(), "Triangle drawn. Color is Blue");
    }
}
