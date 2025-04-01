package ru.ls.qa.school.addressbook.autotest.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ContactData {
    private String firstName;
    private String middleName;
    private String lastName;
    private String address;
    private String homePhone;
    private String mobilePhone;
}