package ru.ls.qa.school.addressbook.autotest.app;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class NavigationHelper extends BaseHelper {

    public void goToAddNewContact() {
        SelenideElement addNewLink = $(byLinkText("add new"));
        click(addNewLink);
    }

    public void navigateToGroups() {
        SelenideElement groupsLink = $(byLinkText("groups"));
        click(groupsLink);
    }
}