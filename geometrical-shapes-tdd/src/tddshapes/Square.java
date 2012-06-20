package tddshapes;

public class Square implements Shapes {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public double calculatePerimeter() {
        return side * 4;
    }
}
