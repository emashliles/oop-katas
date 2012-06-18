package shapes;

public class Circle implements Shapes {
    private double radius;

    public Circle(double radius) {

        this.radius = radius;
    }

    public double calculateArea() {
        return radius * radius * Math.PI;
    }

    public double calculateAreaOfSquare() {
        return 4 * radius * radius;
    }

}


