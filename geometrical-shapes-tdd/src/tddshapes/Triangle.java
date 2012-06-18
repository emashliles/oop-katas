package tddshapes;
import tddshapes.Rectangle;

public class Triangle implements Shapes {
    private final int width;
    private final int height;

    public Triangle(int width, int height) {

        this.width = width;
        this.height = height;
    }

    public double calculateArea() {
        return width * height/2;
    }

    public Rectangle findBoundingRectangle() {
        return new Rectangle(width, height);
    }
}
