package ru.ls.qa.school.addressbook.autotest.pages;

import ru.ls.qa.school.addressbook.autotest.app.ApplicationManager;
import ru.ls.qa.school.addressbook.autotest.pages.contact.ContactPage;
import ru.ls.qa.school.addressbook.autotest.pages.group.GroupPage;

public class PageManager {
    private ApplicationManager app;
    private ContactPage contactPage;
    private GroupPage groupPage;

    public PageManager(ApplicationManager app) {
        this.app = app;
    }

    public ContactPage getContactPage() {
        if (contactPage == null) {
            contactPage = new ContactPage(app);
        }
        return contactPage;
    }

    public GroupPage getGroupPage() {
        if (groupPage == null) {
            groupPage = new GroupPage(app);
        }
        return groupPage;
    }
}