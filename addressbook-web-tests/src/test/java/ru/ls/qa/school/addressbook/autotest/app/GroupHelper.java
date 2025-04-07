package ru.ls.qa.school.addressbook.autotest.app;

import com.codeborne.selenide.SelenideElement;
import ru.ls.qa.school.addressbook.autotest.model.GroupData;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;


public class GroupHelper extends BaseHelper {

    private static final String GROUP_NAME_INPUT_NAME = "group_name";
    private static final String GROUP_HEADER_INPUT_NAME = "group_header";
    private static final String GROUP_FOOTER_INPUT_NAME = "group_footer";
    private static final String SUBMIT_BUTTON_XPATH = "//div[@id='content']/form/input[4]";
    private static final String SUBMIT_INPUT_NAME = "submit";


    private SelenideElement getGroupNameInput() {
        return $(byName(GROUP_NAME_INPUT_NAME));
    }

    private SelenideElement getGroupHeaderInput() {
        return $(byName(GROUP_HEADER_INPUT_NAME));
    }

    private SelenideElement getGroupFooterInput() {
        return $(byName(GROUP_FOOTER_INPUT_NAME));
    }

    private SelenideElement getFirstSubmitButton() {
        return $(byXpath(SUBMIT_BUTTON_XPATH));
    }

    private SelenideElement getSubmitButton() {
        return $(byName(SUBMIT_INPUT_NAME));
    }

    public void createGroup(GroupData groupData) {
        click(getFirstSubmitButton());
        setValue(getGroupNameInput(), groupData.getGroupName());
        setValue(getGroupHeaderInput(), groupData.getGroupHeader());
        setValue(getGroupFooterInput(), groupData.getGroupFooter());
        click(getSubmitButton());
    }
}