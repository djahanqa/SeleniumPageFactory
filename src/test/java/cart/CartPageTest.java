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
            cartPage.shoppingcart("Summary",driver);

        }
    @Test
    public void verifycartSiginBar() {
        cartPage = new CartPage(driver);
        cartPage.shoppingcart(" Sign in",driver);
        }

    @Test
    public void verifycartAddressBar() {
        cartPage = new CartPage(driver);
        cartPage.shoppingcart(" Address",driver);

    }

    @Test
    public void verifycartShippingBar() {
        cartPage = new CartPage(driver);
        cartPage.shoppingcart("Shipping", driver);
    }


    @Test
    public void verifycartPaymentBar() {
        cartPage = new CartPage(driver);
        cartPage.shoppingcart("Payment", driver);
    }
        @AfterTest
        public void closebrowser() {
//            driver.close();
//            driver.quit();
        }
    }


