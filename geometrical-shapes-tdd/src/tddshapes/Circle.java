package tddshapes;

public class Circle implements Shapes{

    private double radius;

    public Circle(double radius) {

        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return radius *radius * Math.PI;
    }


    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    public Rectangle findBoundingRectangle() {
        return new Rectangle(radius*2, radius * 2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        if (Double.compare(circle.radius, radius) != 0) return false;

        return true;
    }

    @Override
    public int hashCode() {
        long temp = radius != +0.0d ? Double.doubleToLongBits(radius) : 0L;
        return (int) (temp ^ (temp >>> 32));
    }
}
