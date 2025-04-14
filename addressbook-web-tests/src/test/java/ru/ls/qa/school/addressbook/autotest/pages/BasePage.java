package ru.ls.qa.school.addressbook.autotest.pages;

import ru.ls.qa.school.addressbook.autotest.app.ApplicationManager;

public abstract class BasePage {
    protected ApplicationManager app;

    public BasePage(ApplicationManager app) {
        this.app = app;
    }
}
