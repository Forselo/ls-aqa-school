package ru.ls.qa.school.addressbook.autotest.app;

import com.codeborne.selenide.SelenideElement;
import ru.ls.qa.school.addressbook.autotest.model.ContactData;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;


public class ContactHelper extends BaseHelper {

    private SelenideElement firstNameInput = $(byName("firstname"));
    private SelenideElement middleNameInput = $(byName("middlename"));
    private SelenideElement lastNameInput = $(byName("lastname"));
    private SelenideElement addressInput = $(byName("address"));
    private SelenideElement homePhoneInput = $(byName("home"));
    private SelenideElement mobilePhoneInput = $(byName("mobile"));
    private SelenideElement submitButton = $(byName("submit"));

    public void fillContactForm(ContactData contact) {
        setValue(firstNameInput, contact.getFirstName());
        setValue(middleNameInput, contact.getMiddleName());
        setValue(lastNameInput, contact.getLastName());
        setValue(addressInput, contact.getAddress());
        setValue(homePhoneInput, contact.getHomePhone());
        setValue(mobilePhoneInput, contact.getMobilePhone());
    }

    public void submitContactForm() {
        click(submitButton);
    }
}

