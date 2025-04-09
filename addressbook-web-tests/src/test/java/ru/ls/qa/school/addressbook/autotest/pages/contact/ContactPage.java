package ru.ls.qa.school.addressbook.autotest.pages.contact;

import ru.ls.qa.school.addressbook.autotest.app.ApplicationManager;
import ru.ls.qa.school.addressbook.autotest.model.ContactData;
import ru.ls.qa.school.addressbook.autotest.pages.BasePage;

public class ContactPage extends BasePage {

    public ContactPage(ApplicationManager app) {
        super(app);
    }

    public ContactPage fillContactForm(ContactData contact) {
        app.getContactHelper().fillContactForm(contact);
        return this;
    }

    public ContactPage submit() {
        app.getContactHelper().submitContactForm();
        return this;
    }
}