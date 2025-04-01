package ru.ls.qa.school.addressbook.autotest;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import ru.ls.qa.school.addressbook.autotest.app.ApplicationManager;

import static com.codeborne.selenide.Selenide.*;

public abstract class TestBase {

    protected ApplicationManager app;

    @BeforeEach
    public void setUp() {
        Configuration.browser = "chrome";
        open("http://localhost/addressbook/");
        app = new ApplicationManager();
        app.init();
    }

    @AfterEach
    public void tearDown() {
        closeWebDriver();
    }

}
