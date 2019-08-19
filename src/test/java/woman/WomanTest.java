package woman;

import base.ScriptBase;
import controller.Woman;
import controller.WomanCatalog;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WomanTest extends ScriptBase {

    Woman woman;

    @BeforeTest
    public void beforetest() {
        init();
    }

    @Test
    public void verifyTshirt() {
        woman = new Woman(driver);
        woman.topssearch(driver,"T-shirts");

    }

    @Test
    public void verifyblouse() {
        woman= new Woman(driver);
        woman.topssearch(driver,"Blouses");
    }

    @Test
    public void verifybCasual() {
        woman= new Woman(driver);
        woman.dressSearch(driver,"Casual Dresses");
    }

    @Test
    public void verifyEvening() {
        woman= new Woman(driver);
        woman.dressSearch(driver,"Evening Dresses");
    }

    @Test
    public void verifySummer() {
        woman= new Woman(driver);
        woman.dressSearch(driver,"Summer Dresses");

    }


    @AfterTest
    void closebrowser() {


        driver.close();
        driver.quit();
    }


}


