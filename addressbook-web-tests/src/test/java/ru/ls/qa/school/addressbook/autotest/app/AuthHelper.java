package ru.ls.qa.school.addressbook.autotest.app;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selectors.byName;


public class AuthHelper extends BaseHelper {

    private static final String USERNAME_INPUT_NAME = "user";
    private static final String PASSWORD_INPUT_NAME = "pass";
    private static final String SUBMIT_BUTTON = "input[type='submit']";
    private static final String LOGOUT_LINK_TEXT = "Logout";

    public void login(String username, String password) {
        setValue($(byName(USERNAME_INPUT_NAME)), username);
        setValue($(byName(PASSWORD_INPUT_NAME)), password);
        click($(byCssSelector(SUBMIT_BUTTON)));
    }

    public void logout() {
        click($(byLinkText(LOGOUT_LINK_TEXT)));
    }
}
