package ru.ls.qa.school.addressbook.autotest.model;

public class ContactData {
    private String firstName;
    private String middleName;
    private String lastName;
    private String address;
    private String homePhone;
    private String mobilePhone;

    public ContactData(String firstName, String middleName, String lastName, String address, String homePhone, String mobilePhone) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.address = address;
        this.homePhone = homePhone;
        this.mobilePhone = mobilePhone;
    }


    public String getFirstName() { return firstName; }
    public String getMiddleName() { return middleName; }
    public String getLastName() { return lastName; }
    public String getAddress() { return address; }
    public String getHomePhone() { return homePhone; }
    public String getMobilePhone() { return mobilePhone; }
}
