import org.junit.Test;
import tddshapes.Rectangle;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class RectangleTest {
    @Test
    public void returnsTheAreaOfTheRectangle() {
        //Given
        Rectangle rectangle = new Rectangle(10, 5);

        //When something happens
        double area = rectangle.calculateArea();

        //Then something happens
        assertThat(area, is(50d));
    }

    @Test
    public void returnPerimeter() {
        //Given
        Rectangle rectangle = new Rectangle(2, 4);
        //When
        double perimeter = rectangle.calculatePerimeter();
        //Then
        assertThat(perimeter, is(12d));
    }
}
