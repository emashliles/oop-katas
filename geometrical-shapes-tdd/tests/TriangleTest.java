import org.junit.Test;
import tddshapes.Triangle;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {
    @Test

    public void returnsTriangleArea(){

       //given
        Triangle triangle = new Triangle(3, 4);
       //when
        double testTriangle = triangle.calculateArea();
       //then
        assertThat(testTriangle, is(6.0));
    }
}
