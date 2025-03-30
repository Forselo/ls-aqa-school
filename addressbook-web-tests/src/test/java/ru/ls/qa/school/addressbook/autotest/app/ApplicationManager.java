package ru.ls.qa.school.addressbook.autotest.app;

import com.codeborne.selenide.Configuration;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selectors.*;

public class ApplicationManager {

    private NavigationHelper navigationHelper;
    private GroupHelper groupHelper;
    private ContactHelper contactHelper;

    public void init() {
        Configuration.browser = "chrome";
        open("http://localhost/addressbook/");
        navigationHelper = new NavigationHelper();
        groupHelper = new GroupHelper();
        contactHelper = new ContactHelper();
    }


    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }

    public GroupHelper getGroupHelper() {
        return groupHelper;
    }

    public ContactHelper getContactHelper() {
        return contactHelper;
    }

    public void login(String username, String password) {
        $(byName("user")).setValue(username);
        $(byName("pass")).setValue(password);
        $(byCssSelector("input[type='submit']")).click();
    }

    public void logout() {
        $(byLinkText("Logout")).click();
    }
}