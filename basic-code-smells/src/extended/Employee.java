package extended;

public class Employee {
    private String city;
    private int houseNumber;
    private String houseName;
    private String firstName;
    private String sureName;
    private String postCode;
    private String streetName;
    private String paymentType;
    private String paymentCurrency;
    private double baseRate;
    private double dollarRate;
    private double gbpRate;
    private double rupeeRate;
    private double commissionRate;

    public Employee(String firstName, String sureName, int houseNumber, String houseName, String streetName, String city, String postCode) {
        this.firstName = firstName;
        this.sureName = sureName;

        this.houseNumber = houseNumber;
        this.houseName = houseName;
        this.streetName = streetName;
        this.city = city;
        this.postCode = postCode;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getCityName() {
        return city;
    }

    public String getPostCode() {
        return postCode;
    }

    public String getHouseName() {
        return houseName;
    }



    public String getFirstName() {
        return firstName;
    }

    public String getSureName() {
        return sureName;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public String getPaymentCurrency() {
        return paymentCurrency;
    }
}
