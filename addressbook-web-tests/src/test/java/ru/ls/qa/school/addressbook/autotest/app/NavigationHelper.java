package ru.ls.qa.school.addressbook.autotest.app;

public class NavigationHelper extends BaseHelper {

    public void goToAddNewContact() {
        clickByLinkText("add new");
    }

    public void navigateToGroups() {
        clickByLinkText("groups");
    }
}
