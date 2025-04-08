package ru.ls.qa.school.addressbook.autotest.pages.group;

import ru.ls.qa.school.addressbook.autotest.app.ApplicationManager;
import ru.ls.qa.school.addressbook.autotest.model.GroupData;
import ru.ls.qa.school.addressbook.autotest.pages.BasePage;

public class GroupPage extends BasePage {

    public GroupPage(ApplicationManager app) {
        super(app);
    }

    public GroupPage createGroup(GroupData groupData) {
        app.getGroupHelper().createGroup(groupData);
        return this;
    }
}
