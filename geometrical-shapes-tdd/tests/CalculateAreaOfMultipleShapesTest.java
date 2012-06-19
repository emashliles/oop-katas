import org.junit.Test;
import tddshapes.Circle;
import tddshapes.HasArea;
import tddshapes.MultipleShapes;
import tddshapes.Triangle;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculateAreaOfMultipleShapesTest {

    @Test

    public void calculateCumulativeArea() {
        //Given
        List<HasArea> contains = Arrays.asList((HasArea) new Triangle(5, 4));

        //When
        MultipleShapes testMultipleShapes = new MultipleShapes(contains);

        //Then
        double totalArea = testMultipleShapes.calculateTotalArea();
        assertThat(totalArea, is(10.0));
    }
         @Test
    public void listHavingTwoElements() {
        List<HasArea> contains = Arrays.asList(new Triangle(3, 5), new Circle(5));
        MultipleShapes testMultipleShapes = new MultipleShapes(contains);
        double total_area = testMultipleShapes.calculateTotalArea();
        assertThat(total_area, is(85.53981633974483));
    }

    @Test
    public void listHavingNoElements(){
        List <HasArea> contains = Arrays.asList();
        MultipleShapes testMultipleShapes = new MultipleShapes(contains);
        double total_area = testMultipleShapes .calculateTotalArea();
        assertThat(total_area ,is(0.0));
    }

    @Test
    public void listContainsNullElements(){
        List<HasArea> contains = Arrays.asList(null);
        MultipleShapes testMultipleShapes = new MultipleShapes(contains);
        double total_area = testMultipleShapes.calculateTotalArea();
        assertThat(total_area, is(0.0));

    }
}
