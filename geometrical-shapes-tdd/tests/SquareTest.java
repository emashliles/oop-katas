import org.junit.Test;
import tddshapes.Square;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SquareTest {

    @Test
    public void calculateArea() {
        //Given
        Square square = new Square(2);
        //When
        double area = square.calculateArea();
        //Then
        assertThat(area, is(4d));
    }

    @Test
    public void calculatePerimeter() {
        //Given
        Square square = new Square(3);
        //When
        double perimeter = square.calculatePerimeter();
        //Then
        assertThat(perimeter, is(12d));

    }
}
