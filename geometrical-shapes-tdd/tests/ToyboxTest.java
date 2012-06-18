import org.junit.Test;
import tddshapes.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ToyboxTest {

    @Test
    public void calculateTotalArea(){
        //Given
        List<Shapes> contents = Arrays.asList(new Rectangle(2, 1), new Triangle(-2, 1), new Triangle(2, 1));
        Toybox toybox = new Toybox(contents);

        // When
        double areas = toybox.calculateArea();
        //Then
        assertThat(areas, is(2d));
    }
}
