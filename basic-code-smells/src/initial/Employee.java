package initial;

public class Employee {
    private String city;
    private String houseNumber;
    private String houseName;
    private String firstName;
    private String sureName;
    private String postCode;
    private String streetName;

    public Employee(String firstName, String sureName, String houseNumber, String houseName, String streetName, String city, String postCode) {
        this.firstName = firstName;
        this.sureName = sureName;

        this.houseNumber = houseNumber;
        this.houseName = houseName;
        this.streetName = streetName;
        this.city = city;
        this.postCode = postCode;
    }

    public String getHouseNumber() {
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

    public String printAddress() {

        if (postCode == " " && streetName == " ") {
            String message = "The address is not valid";
            return message;
        }
            else  {
            return this.getHouseNumber() + "; "
                    + this.getHouseName() + "; "
                    + this.getStreetName() + "; "
                    + this.getCityName()  + "; "
                    + this.getPostCode();
        }

    }
}
