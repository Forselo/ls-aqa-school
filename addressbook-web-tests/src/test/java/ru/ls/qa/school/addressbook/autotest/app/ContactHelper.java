package ru.ls.qa.school.addressbook.autotest.app;

import ru.ls.qa.school.addressbook.autotest.model.ContactData;

public class ContactHelper extends BaseHelper {

    public void fillContactForm(ContactData contact) {
        setValueByName("firstname", contact.getFirstName());
        setValueByName("middlename", contact.getMiddleName());
        setValueByName("lastname", contact.getLastName());
        setValueByName("address", contact.getAddress());
        setValueByName("home", contact.getHomePhone());
        setValueByName("mobile", contact.getMobilePhone());
    }

    public void submitContactForm() {
        clickByName("submit");
    }
}


