package cart;

import base.ScriptBase;
import controller.CartPage;
import controller.ContactPage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CartPageTest extends ScriptBase {

        CartPage cartPage;

        @BeforeTest
        public void beforetest() {
            init();
        }

        @Test
        public void verifycartpage(){
            cartPage=new CartPage(driver);
            cartPage.shoppingcart();

        }
    @Test
    public void verifycartsummary() {
        cartPage = new CartPage(driver);
        cartPage.shoppincartsummary(driver," Summary");

        }
        @AfterTest
        public void closebrowser() {
            driver.close();
            driver.quit();
        }
    }

