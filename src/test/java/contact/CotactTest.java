package contact;

import base.ScriptBase;
import controller.ContactPage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CotactTest extends ScriptBase {
    ContactPage contactPage;

        @BeforeTest
        public void beforetest() {
            init();
        }

        @Test
        public void varifyMessageSent(){
            contactPage=new ContactPage(driver);
            contactPage.messagesent("djahan@gmail.com","1234","hello there");
        }

        @AfterTest
        public void closebrowser() {
            driver.close();
            driver.quit();
        }
}