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
            cartPage.shoppincartsummary("Summary",driver);
        }
    @Test
    public void verifycartSiginBar() {
        cartPage = new CartPage(driver);
        cartPage.shoppincartsummary(" Sign in",driver);
        }

    @Test
    public void verifycartAddressBar() {
        cartPage = new CartPage(driver);
        cartPage.shoppincartsummary(" Address",driver);

    }

    @Test
    public void verifycartShoppingBar() {
        cartPage = new CartPage(driver);
        cartPage.shoppincartsummary("Shipping", driver);
    }


    @Test
    public void verifycartPaymentBar() {
        cartPage = new CartPage(driver);
        cartPage.shoppincartsummary("Payment", driver);

        }

        @Test
    public void verifyfadedTshirt() throws InterruptedException {
        cartPage = new CartPage(driver);
        cartPage.itemAddedToShoppingCart(driver);


        }

@AfterTest
public void closebrowser(){
            driver.close();
            driver.quit();

        }
}