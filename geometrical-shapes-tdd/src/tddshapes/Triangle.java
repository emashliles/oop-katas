package tddshapes;

public class Triangle implements HasArea{

    private final int height;
    private final int width;

    public Triangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public double calculateArea() {

        return height*width/2;

    }
}
