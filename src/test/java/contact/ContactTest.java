package contact;

import base.ScriptBase;
import controller.ContactPage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ContactTest extends ScriptBase {

    ContactPage contactPage = new ContactPage(driver);
    @BeforeTest
    public void beforetest() {
        init();

    }
    @Test
    public void verifycontactus1() {
       contactPage= new ContactPage(driver);
       contactPage.customerService();
    }
    @Test
    public void varifySendAMessage(){
        contactPage=new ContactPage(driver);
        contactPage.sendmessage("djahan@yahoo.com","123456","please take a look at my order");

    }
    @AfterTest
    public void closebrowser(){
            driver.close();
            driver.quit();
    }

}
