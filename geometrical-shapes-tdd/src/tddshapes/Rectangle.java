package tddshapes;

public class Rectangle implements Shapes {
    private final double height;
    private final double width;

    public Rectangle(double height, double width) {
        this.height = height;

        this.width = width;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rectangle rectangle = (Rectangle) o;

        if (Double.compare(rectangle.height, height) != 0) return false;
        if (Double.compare(rectangle.width, width) != 0) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = height != +0.0d ? Double.doubleToLongBits(height) : 0L;
        result = (int) (temp ^ (temp >>> 32));
        temp = width != +0.0d ? Double.doubleToLongBits(width) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    public double calculatePerimeter() {
        return width * 2 + height * 2;
    }
}
