package extended;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SalaryTest {

    @Test
    public void calculateSalary() {
        Salary salary = new Salary(100, 0.5, 2);
        double finalsalary = salary.calculateSalary();
        assertThat(finalsalary, is(1500d));
    }
}
