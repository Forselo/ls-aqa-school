package ru.ls.qa.school.addressbook.autotest.test;

import org.junit.jupiter.api.Test;
import ru.ls.qa.school.addressbook.autotest.TestBase;
import ru.ls.qa.school.addressbook.autotest.model.GroupData;

public class GroupCreationTests extends TestBase {

    @Test
    public void testCreateGroup() {
        app.getAuthHelper().login("admin", "secret");
        app.getNavigationHelper().navigateToGroups();
        app.getGroupHelper().createGroup(new GroupData("test3", "test3", "test3"));
        app.getAuthHelper().logout();
    }
}