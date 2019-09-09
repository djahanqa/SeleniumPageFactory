package multipleItem;

import base.ScriptBase;
import controller.MultipleItemAddedPage;
import controller.MultipleItemPage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MultipleItemTest extends ScriptBase {
        MultipleItemPage multipleItemPage;


        @BeforeTest
        public void beforetest() {
                init();
        }

        @Test

        public void verifyfadedTshirt() throws InterruptedException {
                multipleItemPage = new MultipleItemPage(driver);
                multipleItemPage.multipleItemAdded("Faded Short Sleeve T-shirts", "M", driver);
        }

        @Test

        public void verifyBlouse() throws InterruptedException {
                multipleItemPage = new MultipleItemPage(driver);
                multipleItemPage.multipleItemAdded("Blouse", "S", driver);
        }

        @Test

        public void verifyPrintedDressOne() throws InterruptedException {

                multipleItemPage = new MultipleItemPage(driver);
                multipleItemPage.multipleItemAdded("Printed Dress", "L", driver);

        }

        @Test

        public void verifyPrintedSummerDress() throws InterruptedException {

                multipleItemPage = new MultipleItemPage(driver);
                multipleItemPage.multipleItemAdded("Printed Summer Dress", "L", driver);
        }


        @Test

        public void verifyPrintedChiffon() throws InterruptedException {

                multipleItemPage = new MultipleItemPage(driver);
                multipleItemPage.multipleItemAdded("Printed Chiffon Dress", "S", driver);

        }


        @Test
        public void verifyQuanity()throws InterruptedException{
                multipleItemPage =new MultipleItemPage(driver);
                multipleItemPage.changeQuantity(driver,"Faded Short Sleeve T-shirts",6);
        }
@AfterTest
public void closebrowser(){
//        driver.close();
//        driver.quit();

        }

        }

