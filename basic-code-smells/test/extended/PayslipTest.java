package extended;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class PayslipTest {

    @Test
    public void printPaySlip() {

        Salary salary = new Salary(500.20, 2, 2);
        double pay = salary.calculateSalary();
        Payslip payslip = new Payslip("Emma-Ashley", "Liles", "Commission", pay);
        String slip = payslip.printPayslip();
        assertThat(slip, is("Name: Emma-Ashley; Surname: Liles; Paytype: Commission; Salary: 3001.20;"));

    }
}
