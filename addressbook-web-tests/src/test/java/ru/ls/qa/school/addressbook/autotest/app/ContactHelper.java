package ru.ls.qa.school.addressbook.autotest.app;

import com.codeborne.selenide.SelenideElement;
import ru.ls.qa.school.addressbook.autotest.model.ContactData;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;


public class ContactHelper extends BaseHelper {

    private static final String FIRST_NAME_INPUT_NAME = "firstname";
    private static final String MIDDLE_NAME_INPUT_NAME = "middlename";
    private static final String LAST_NAME_INPUT_NAME = "lastname";
    private static final String ADDRESS_INPUT_NAME = "address";
    private static final String HOME_PHONE_INPUT_NAME = "home";
    private static final String MOBILE_PHONE_INPUT_NAME = "mobile";
    private static final String SUBMIT_BUTTON_NAME = "submit";

    private SelenideElement getFirstNameInput() {
        return $(byName(FIRST_NAME_INPUT_NAME));
    }

    private SelenideElement getMiddleNameInput() {
        return $(byName(MIDDLE_NAME_INPUT_NAME));
    }

    private SelenideElement getLastNameInput() {
        return $(byName(LAST_NAME_INPUT_NAME));
    }

    private SelenideElement getAddressInput() {
        return $(byName(ADDRESS_INPUT_NAME));
    }

    private SelenideElement getHomePhoneInput() {
        return $(byName(HOME_PHONE_INPUT_NAME));
    }

    private SelenideElement getMobilePhoneInput() {
        return $(byName(MOBILE_PHONE_INPUT_NAME));
    }

    private SelenideElement getSubmitButton() {
        return $(byName(SUBMIT_BUTTON_NAME));
    }

    public void fillContactForm(ContactData contact) {
        setValue(getFirstNameInput(), contact.getFirstName());
        setValue(getMiddleNameInput(), contact.getMiddleName());
        setValue(getLastNameInput(), contact.getLastName());
        setValue(getAddressInput(), contact.getAddress());
        setValue(getHomePhoneInput(), contact.getHomePhone());
        setValue(getMobilePhoneInput(), contact.getMobilePhone());
    }

    public void submitContactForm() {
        click(getSubmitButton());
    }
}

