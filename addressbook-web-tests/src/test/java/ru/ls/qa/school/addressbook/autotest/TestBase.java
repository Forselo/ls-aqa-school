package ru.ls.qa.school.addressbook.autotest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import ru.ls.qa.school.addressbook.autotest.app.ApplicationManager;
import ru.ls.qa.school.addressbook.autotest.pages.PageManager;

public abstract class TestBase {
    protected ApplicationManager app;
    protected PageManager pages;

    @BeforeEach
    public void setUp() {
        app = new ApplicationManager();
        app.init();
        pages = new PageManager(app);
    }

    @AfterEach
    public void tearDown() {
        app.close();
    }
}
