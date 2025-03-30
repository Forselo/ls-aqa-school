package ru.ls.qa.school.addressbook.autotest.app;

import com.codeborne.selenide.SelenideElement;
import ru.ls.qa.school.addressbook.autotest.model.GroupData;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;


public class GroupHelper extends BaseHelper {

    public void createGroup(GroupData groupData) {
        SelenideElement submitButton = $(byXpath("//div[@id='content']/form/input[4]"));
        click(submitButton);

        setValue($(byName("group_name")), groupData.getGroupName());
        setValue($(byName("group_header")), groupData.getGroupHeader());
        setValue($(byName("group_footer")), groupData.getGroupFooter());

        SelenideElement submit = $(byName("submit"));
        click(submit);
    }
}