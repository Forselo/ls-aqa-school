package ru.ls.qa.school.addressbook.autotest.test;

import org.junit.jupiter.api.Test;
import ru.ls.qa.school.addressbook.autotest.TestBase;
import ru.ls.qa.school.addressbook.autotest.model.ContactData;


public class AddressBookTest extends TestBase {


    @Test
    public void testAddNewContact() {
        app.getAuthHelper().login("admin", "secret");
        app.getNavigationHelper().goToAddNewContact();
        ContactData contact = ContactData.builder()
                .firstName("Семен")
                .middleName( "Семенович")
                .lastName( "Семос")
                .address( "Sit")
                .homePhone("7956847949")
                .mobilePhone("7979543684797")
                .build();

        app.getPageManager().getContactPage()
                .fillContactForm(contact)
                .submit();

        app.getAuthHelper().logout();
    }

}