package ru.ls.qa.school.addressbook.autotest.app;

import com.codeborne.selenide.Configuration;
import ru.ls.qa.school.addressbook.autotest.pages.PageManager;

import static com.codeborne.selenide.Selenide.open;


public class ApplicationManager {

    private NavigationHelper navigationHelper;
    private GroupHelper groupHelper;
    private ContactHelper contactHelper;
    private AuthHelper authHelper;
    private PageManager pageManager;

    public void init() {
        Configuration.browser = "chrome";
        open("http://localhost/addressbook/");
        navigationHelper = new NavigationHelper();
        groupHelper = new GroupHelper();
        contactHelper = new ContactHelper();
        authHelper = new AuthHelper();
        pageManager = new PageManager(this);
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

    public PageManager getPageManager() {
        return pageManager;
    }

}