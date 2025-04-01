package ru.ls.qa.school.addressbook.autotest.app;

import com.codeborne.selenide.Configuration;

import static com.codeborne.selenide.Selenide.open;


public class ApplicationManager {

    private NavigationHelper navigationHelper;
    private GroupHelper groupHelper;
    private ContactHelper contactHelper;
    private AuthHelper authHelper;

    public void init() {
        Configuration.browser = "chrome";
        open("http://localhost/addressbook/");
        navigationHelper = new NavigationHelper();
        groupHelper = new GroupHelper();
        contactHelper = new ContactHelper();
        authHelper = new AuthHelper();
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

    public AuthHelper getAuthHelper() {
        return authHelper;
    }

}