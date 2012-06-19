import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class SquareTest {

    @Test
    public void squareTest(){
        //Given
        Square testSquare = new Square(5);
        //When
        int areaOfSquare = testSquare.calculateArea();
        //Then
        assertThat(areaOfSquare, is (25));
    }
}
                                                        1