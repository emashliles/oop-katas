package extended;

public class Payslip {
    private final String firstName;
    private final String surname;
    private final String paymentType;
    private final double salary;

    public Payslip(String firstName, String surname, String paymentType, double salary) {
        this.firstName = firstName;
        this.surname = surname;
        this.paymentType = paymentType;
        this.salary = salary;
    }

    public String printPayslip() {
        return String.format("Name: %s; Surname: %s; Paytype: %s; Salary: %.2f;", firstName, surname, paymentType, salary);  //To change body of created methods use File | Settings | File Templates.
    }
}
