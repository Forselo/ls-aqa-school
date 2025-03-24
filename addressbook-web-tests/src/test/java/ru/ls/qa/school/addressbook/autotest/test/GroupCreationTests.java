package ru.ls.qa.school.addressbook.autotest.test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.ls.qa.school.addressbook.autotest.app.ApplicationManager;
import ru.ls.qa.school.addressbook.autotest.model.GroupData;

import static com.codeborne.selenide.Selenide.closeWebDriver;

public class GroupCreationTests {

    private ApplicationManager app;

    @BeforeEach
    public void setUp() {
        app = new ApplicationManager();
        app.init();
    }

    @Test
    public void testCreateGroup() {
        app.login("admin", "secret");
        app.getNavigationHelper().navigateToGroups();
        app.getGroupHelper().createGroup(new GroupData("test3", "test3", "test3"));
        app.logout();
    }

    @AfterEach
    public void tearDown() {
        closeWebDriver();
    }
}