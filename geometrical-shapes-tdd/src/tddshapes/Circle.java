package tddshapes;

public class Circle implements HasArea{

    private final double radius;

    public Circle(double radius) {
        this.radius = radius;

    }

    public double calculateArea() {

        return Math.PI*radius*radius;
    }
}
