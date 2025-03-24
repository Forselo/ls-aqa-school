package ru.ls.qa.school.addressbook.autotest.app;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selectors.*;

public class BaseHelper {
    protected void clickByName(String name) {
        $(byName(name)).click();
    }

    protected void setValueByName(String name, String value) {
        $(byName(name)).setValue(value);
    }

    protected void clickByLinkText(String linkText) {
        $(byLinkText(linkText)).click();
    }

    protected void clickByXpath(String xpath) {
        $(byXpath(xpath)).click();
    }
}
