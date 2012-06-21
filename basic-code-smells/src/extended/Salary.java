package extended;

public class Salary {
    private final double baseRate;
    private final double currencyRate;
    private final double commisionRate;

    public Salary(double baseRate, double currencyRate, double commisionRate) {
        this.baseRate = baseRate;
        this.currencyRate = currencyRate;
        this.commisionRate = commisionRate;
    }

    public double calculateSalary() {
        return baseRate*(1+commisionRate) * currencyRate;

    }
}
