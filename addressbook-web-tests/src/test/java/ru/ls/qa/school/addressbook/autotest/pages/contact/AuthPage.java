package ru.ls.qa.school.addressbook.autotest.pages.contact;

import ru.ls.qa.school.addressbook.autotest.app.ApplicationManager;
import ru.ls.qa.school.addressbook.autotest.pages.BasePage;

public class AuthPage extends BasePage {

    public AuthPage(ApplicationManager app) {
        super(app);
    }

    public AuthPage login(String username, String password) {
        app.getAuthHelper().login(username, password);
        return this;
    }

    public AuthPage logout() {
        app.getAuthHelper().logout();
        return this;
    }
}