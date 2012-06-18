import org.junit.Test;
import tddshapes.Rectangle;
import tddshapes.Triangle;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class    TriangleTest {

    @Test
    public void returnAreaOfTriangle()    {
        //Given
        Triangle triangle = new Triangle(6, 5);
        //When
        double area = triangle.calculateArea();

        //Then
        assertThat(area, is(15d));
    }

    @Test
    public  void returnBoundingRectangle() {
        //Given
        Triangle triangle = new Triangle(3, 2);
        //When
        Rectangle rectangle = triangle.findBoundingRectangle();
        //Then
        assertTrue(rectangle.equals(new Rectangle(3,2)));
    }

}

