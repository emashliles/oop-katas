import org.junit.Test;
import tddshapes.Rectangle;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ExampleRectangleTest {
    @Test
    public void testName() throws Exception {

    }

    @Test
    public void returnsTheAreaOfTheRectangle() {
          //Given
        Rectangle rectangle = new Rectangle(10, 5);

        // When
        double calculator = rectangle.calculator();

        // Then
        assertThat(calculator, is(50d));
    }
}
