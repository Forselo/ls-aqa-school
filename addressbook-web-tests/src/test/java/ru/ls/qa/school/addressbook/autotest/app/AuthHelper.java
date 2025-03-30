package ru.ls.qa.school.addressbook.autotest.app;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selectors.byName;


public class AuthHelper extends BaseHelper {

    public void login(String username, String password) {
        setValue($(byName("user")), username);
        setValue($(byName("pass")), password);
        click($(byCssSelector("input[type='submit']")));
    }

    public void logout() {
        click($(byLinkText("Logout")));
    }
}
