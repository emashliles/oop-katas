import org.junit.Test;
import tddshapes.Circle;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CircleTest {
    @Test
    public void returnsTheAreaOfCircle() {
        //given
        Circle circle = new Circle(5);
        //when
        double testCircle = circle.calculateArea();
        //then
        assertThat(testCircle, is(Math.PI * 5 * 5));
    }
}
