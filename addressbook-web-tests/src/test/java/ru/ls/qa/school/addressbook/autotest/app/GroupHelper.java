package ru.ls.qa.school.addressbook.autotest.app;

import ru.ls.qa.school.addressbook.autotest.model.GroupData;

public class GroupHelper extends BaseHelper {

    public void createGroup(GroupData groupData) {
        clickByXpath("//div[@id='content']/form/input[4]");
        setValueByName("group_name", groupData.getGroupName());
        setValueByName("group_header", groupData.getGroupHeader());
        setValueByName("group_footer", groupData.getGroupFooter());
        clickByName("submit");
    }
}
