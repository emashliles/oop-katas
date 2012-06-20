import org.junit.Test;
import tddshapes.Circle;
import tddshapes.Rectangle;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class CircleTest {
    @Test
    public void calculateArea() {
        //Given

        Circle circle = new Circle(1);
        //When
        double area = circle.calculateArea();
        //Then
        assertThat(area, is(Math.PI));
    }

    @Test
    public void returnBoundingRectangle(){
        //Given
        Circle circle = new Circle(1);
        //When
        Rectangle rectangle = circle.findBoundingRectangle();
        //Then
        assertTrue(rectangle.equals(new Rectangle(2,3)));
    }

    @Test
    public void returnPerimeter(){
        //Given
        Circle circle = new Circle(1);
        //When
        double perimeter = circle.calculatePerimeter();
        //Then
        assertThat(perimeter, is(2*Math.PI*1));
    }
}
