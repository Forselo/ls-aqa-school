package ru.ls.qa.school.addressbook.autotest.test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.ls.qa.school.addressbook.autotest.app.ApplicationManager;
import ru.ls.qa.school.addressbook.autotest.model.ContactData;

import static com.codeborne.selenide.Selenide.closeWebDriver;

public class AddressBookTest {

    private ApplicationManager app;

    @BeforeEach
    public void setUp() {
        app = new ApplicationManager();
        app.init();
    }

    @Test
    public void testAddNewContact() {
        app.login("admin", "secret");
        app.getNavigationHelper().goToAddNewContact();

        ContactData contact = new ContactData(
                "Семен",
                "Семенович",
                "Семос",
                "Sit",
                "7956847949",
                "7979543684797"
        );

        app.getContactHelper().fillContactForm(contact);
        app.getContactHelper().submitContactForm();
        app.logout();
    }

    @AfterEach
    public void tearDown() {
        closeWebDriver();
    }
}