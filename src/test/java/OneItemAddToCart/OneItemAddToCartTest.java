package OneItemAddToCart;

import base.ScriptBase;
import controller.OneItemAddedToCartPage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OneItemAddToCartTest extends ScriptBase {
    OneItemAddedToCartPage oneItemAddedtoCartPage;


    @BeforeTest
    public void beforetest() {
        init();
    }

@Test

public void verifyAddItemToCart()throws InterruptedException{
        oneItemAddedtoCartPage =new OneItemAddedToCartPage(driver);
        oneItemAddedtoCartPage.addItemToCart(driver,"futureitgroup@gmail.com","admin123");

}

@AfterTest
    public void closebrowser() {
//        driver.close();
//        driver.quit();
    }

}
