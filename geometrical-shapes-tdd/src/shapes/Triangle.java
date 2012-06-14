package shapes;

public class Triangle {

    private final double width;
    private final double height;

    public Triangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double calculateArea(){
                return width * height/2;
    }

    public double[] smallestBoundingRectangle(){
        double widthandheight[] = {width,height};
        return widthandheight;
    }
}
