package initial;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class AddressTest {
    @Test
    public void testPrintsAddress() {
        Employee employee = new Employee("Felicity", "Brooks", "5", "", "Lemon Road", "Cantebury", "W5 C56");

        assertThat(employee.printAddress(), is("5; ; Lemon Road; Cantebury; W5 C56"));
    }

    @Test
    public void testEmptyFields() {
        // Given
        Employee employee = new Employee("Jack", "Red", "2A", " ", " ", "Cambridge", " ");
        // When


        assertThat(employee.printAddress(), is("The address is not valid"));
    }
}
