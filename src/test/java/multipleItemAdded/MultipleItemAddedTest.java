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
    public void verifycartpage(){
        multipleItemAddedPage = new MultipleItemAddedPage(driver);
        multipleItemAddedPage.itemAdded(driver);

    }
    @AfterTest
    public void closebrowser(){
        driver.close();
        driver.quit();

    }

    }

