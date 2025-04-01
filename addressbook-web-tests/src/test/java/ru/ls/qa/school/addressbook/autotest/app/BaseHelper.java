package ru.ls.qa.school.addressbook.autotest.app;

import com.codeborne.selenide.SelenideElement;


public class BaseHelper {
    protected void click(SelenideElement element) {
        element.click();
    }

    protected void setValue(SelenideElement element, String value) {
        element.setValue(value);
    }
}
