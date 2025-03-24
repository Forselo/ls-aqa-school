package ru.ls.qa.school.addressbook.autotest;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public abstract class TestBase {

    @BeforeEach
    public void setUp() {
        Configuration.browser = "chrome";
        open("http://localhost/addressbook/");
    }

    @AfterEach
    public void tearDown() {
        closeWebDriver();
    }

    protected void login(String username, String password) {
        $(byName("user")).setValue(username);
        $(byName("pass")).setValue(password);
        $(byXpath("//input[@value='Login']")).click();
    }


    protected void logout() {
        $(byLinkText("Logout")).click();
    }
}
