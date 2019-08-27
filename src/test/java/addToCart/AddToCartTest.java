package addToCart;

import base.ScriptBase;
import controller.AddtoCartPage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AddToCartTest extends ScriptBase {
    AddtoCartPage addtoCartPage;


    @BeforeTest
    public void beforetest() {
        init();
    }

@Test

public void verifyAddItemToCart()throws InterruptedException{
        addtoCartPage=new AddtoCartPage(driver);
        addtoCartPage.addItemToCart(driver);
}

@AfterTest
    public void closebrowser() {
//        driver.close();
//        driver.quit();
    }

}
