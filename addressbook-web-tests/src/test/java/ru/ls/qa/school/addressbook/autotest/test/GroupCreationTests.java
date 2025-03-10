package ru.ls.qa.school.addressbook.autotest.test;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.ls.qa.school.addressbook.autotest.model.GroupData;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selectors.byXpath;

public class GroupCreationTests {

    @BeforeEach
    public void setUp() {
        Configuration.browser = "chrome";
    }

    @Test
    public void testUntitledTestCase() {
        open("http://localhost/addressbook/");
        login("admin", "secret");
        navigateToGroups();
        createGroup(new GroupData("test3", "test3", "test3"));
        logout();
    }

    private void login(String username, String password) {
        $(byName("user")).setValue(username);
        $(byName("pass")).setValue(password);
        $(byXpath("//input[@value='Login']")).click();
    }

    private void navigateToGroups() {
        $(byLinkText("groups")).click();
    }

    private void createGroup(GroupData groupData) {
        $(byXpath("//div[@id='content']/form/input[4]")).click();
        $(byName("group_name")).setValue(groupData.getGroupName());
        $(byName("group_header")).setValue(groupData.getGroupHeader());
        $(byName("group_footer")).setValue(groupData.getGroupFooter());
        $(byName("submit")).click();
    }

    private void logout() {
        $(byLinkText("groups")).click();
        $(byLinkText("Logout")).click();
    }

    @AfterEach
    public void tearDown() {
        closeWebDriver();
    }
}