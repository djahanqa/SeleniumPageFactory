package homepage;

import base.ScriptBase;
import controller.HomePage;
import controller.LoginPage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomePageTest extends ScriptBase {
    HomePage homePage;

    @BeforeTest
    public void beforetest() {
        init();
    }

    @Test
    public void verifyHomePage() {
        homePage = new HomePage(driver);
        homePage.verifyContactUS("T-SHIRTS");
    }

    @Test
    public void searchSleeveQuantity(){
    homePage =new HomePage(driver);
    homePage.seachspProducts("SLEEVE",driver,"4");

    }

    @Test
    public void searchHatQuantity(){
        homePage =new HomePage(driver);
        homePage.seachspProducts("Hat",driver,"7");

    }

    @Test
    public void searchDressesQuantity(){
        homePage =new HomePage(driver);
        homePage.seachspProducts("dress",driver,"7");

    }

    @Test
    public void searchBlouseQuantity() {
        homePage = new HomePage(driver);
        homePage.seachspProducts("Blouse", driver, "1");
    }


    @Test
    public void searchwomenQuantity() {
        homePage = new HomePage(driver);
        homePage.catagory(driver,"Women");
    }

    @Test
    public void searchTshirtsQuantity() {
        homePage = new HomePage(driver);
        homePage.catagory(driver, "T-shirts");

    }
    @Test
    public void searchpopular() {
        homePage = new HomePage(driver);
        homePage.searchByDemand(driver, "homefeatured");

    }
    @Test
    public void searchbestSeller() {
        homePage = new HomePage(driver);
        homePage.searchByDemand(driver, "blockbestsellers");
    }
    @Test
    public void information1() {
        homePage = new HomePage(driver);
        homePage.informationTree(driver, "Specials");
    }
    @Test
    public void information2() {
        homePage = new HomePage(driver);
        homePage.informationTree(driver, "New products");

       }
    @Test
    public void information3() {
        homePage = new HomePage(driver);
        homePage.informationTree(driver, "Best sellers");

    }
    @Test
    public void information4() {
        homePage = new HomePage(driver);
        homePage.informationTree(driver, "Our stores");

    }
    @Test
    public void information5() {
        homePage = new HomePage(driver);
        homePage.informationTree(driver, "Contact us");

    }
    @Test
    public void information6() {
        homePage = new HomePage(driver);
        homePage.informationTree(driver, "Terms and conditions of use");
    }
    @Test
    public void information7() {
        homePage = new HomePage(driver);
        homePage.informationTree(driver, "About us");
    }
    @Test
    public void information8() {
        homePage = new HomePage(driver);
        homePage.informationTree(driver, "Sitemap");

    }


    @Test
    public void myAccount1() {
        homePage = new HomePage(driver);
        homePage.myaccount(driver, "My orders");

    }
    @Test
    public void myAccount2() {
        homePage = new HomePage(driver);
        homePage.myaccount(driver, "My credit slips");
    }

    @Test
    public void myAccount3() {
        homePage = new HomePage(driver);
        homePage.myaccount(driver, "My addresses");
    }
    @Test
    public void myAccount4() {
        homePage = new HomePage(driver);
        homePage.myaccount(driver, "Manage my personal information");
    }
    @Test
    public void verifycontactus1(){
        homePage = new HomePage(driver);
        homePage.customerService();
    }
    @AfterTest
        public void closebrowser(){
            driver.quit();

    }


}
