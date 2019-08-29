package multipleItemAdded;

import base.ScriptBase;

import controller.MultipleItemAddedPage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MultipleItemAddedTest extends ScriptBase {
    MultipleItemAddedPage multipleItemAddedPage;


    @BeforeTest
    public void beforetest() { init();
    }


    @Test
    public void verifycartpage()throws InterruptedException{
        multipleItemAddedPage = new MultipleItemAddedPage(driver);
        multipleItemAddedPage.itemAdded(driver);

    }

    @Test

    public void verifyQuanity(){
        multipleItemAddedPage =new MultipleItemAddedPage(driver);
        multipleItemAddedPage.changeQuantity(driver);
    }

    @Test

    public void verifyChangeSize(){
        multipleItemAddedPage =new MultipleItemAddedPage(driver);
        multipleItemAddedPage.changeSize(driver);

    }

    @Test

    public void verifyfadedTshirt()throws InterruptedException {
        multipleItemAddedPage = new MultipleItemAddedPage(driver);
        multipleItemAddedPage.multipleItemAdded("Faded Short Sleeve T-shirts", driver);
    }

    @Test

    public void verifyBlouse()throws InterruptedException {
            multipleItemAddedPage = new MultipleItemAddedPage(driver);
            multipleItemAddedPage.multipleItemAdded("Blouse", driver);
    }

    @Test

    public void verifyPrintedDressOne()throws InterruptedException{

        multipleItemAddedPage =new MultipleItemAddedPage(driver);
        multipleItemAddedPage.multipleItemAdded("Printed Dress",driver);

    }

    @Test

    public void verifyPrintedDressTwo()throws InterruptedException{

        multipleItemAddedPage =new MultipleItemAddedPage(driver);
        multipleItemAddedPage.multipleItemAdded("Printed Dress",driver);

    }

    @AfterTest
    public void closebrowser(){
//        driver.close();
//        driver.quit();

    }

    }

