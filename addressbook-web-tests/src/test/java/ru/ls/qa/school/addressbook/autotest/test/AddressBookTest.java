package ru.ls.qa.school.addressbook.autotest.test;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.ls.qa.school.addressbook.autotest.model.ContactData;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selectors.*;

public class AddressBookTest {

    @BeforeEach
    public void setUp() {
        Configuration.browser = "chrome";
    }

    @Test
    public void testAddNewContact() {
        open("http://localhost/addressbook/");
        login("admin", "secret");
        goToAddNewContact();

        ContactData contact = new ContactData(
                "Семен",
                "Семенович",
                "Семос",
                "Sit",
                "7956847949",
                "7979543684797"
        );

        fillContactForm(contact);
        submitContactForm();
        logout();
    }

    private void login(String username, String password) {
        $(byName("user")).setValue(username);
        $(byName("pass")).setValue(password);
        $(byCssSelector("input[type='submit']")).click();
    }

    private void goToAddNewContact() {
        $(byLinkText("add new")).click();
    }

    private void fillContactForm(ContactData contact) {
        $(byName("firstname")).setValue(contact.getFirstName());
        $(byName("middlename")).setValue(contact.getMiddleName());
        $(byName("lastname")).setValue(contact.getLastName());
        $(byName("address")).setValue(contact.getAddress());
        $(byName("home")).setValue(contact.getHomePhone());
        $(byName("mobile")).setValue(contact.getMobilePhone());
    }

    private void submitContactForm() {
        $(byCssSelector("input[type='submit']")).click();
    }

    private void logout() {
        $(byLinkText("Logout")).click();
    }

    @AfterEach
    public void tearDown() {
        closeWebDriver();
    }
}