<<<<<<< HEAD
/*test2*/

package shapes;

public class Circle {
    private double radius;
    private double diameter = radius * 2;
    private double[] widthAndHeight;
    private double height;
    private double width;

    public Circle(double radius) {
=======
package shapes;

public class Circle implements Shapes {
    private double radius;

    public Circle(double radius) {

>>>>>>> tosin/master
        this.radius = radius;
    }

    public double calculateArea() {
        return radius * radius * Math.PI;
<<<<<<< HEAD

    }

    public double[] boundingRectangle() {
        widthAndHeight[0] = diameter;
        widthAndHeight[1] = diameter;
        return widthAndHeight;

    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void calculateBoundingRectangle() {
        height = diameter;
        width = diameter;
    }
}
=======
    }

    public double calculateAreaOfSquare() {
        return 4 * radius * radius;
    }

}


>>>>>>> tosin/master
