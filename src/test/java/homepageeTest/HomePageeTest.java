package homepageeTest;

import base.ScriptBase;
import controller.Homepagee;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomePageeTest extends ScriptBase {


        Homepagee homepagee;

        @BeforeTest
        public void beforetest() {
            init();
        }

        @Test
        public void verifyHomePage() {
            homepagee = new Homepagee(driver);
            homepagee.verifyContactUS("T-SHIRTS");
        }

        @Test
        public void searchSleeveQuantity() {
            homepagee = new Homepagee(driver);
            homepagee.seachspProducts("SLEEVE", driver, "4");

        }

        @Test
        public void searchHatQuantity() {
            homepagee = new Homepagee(driver);
            homepagee.seachspProducts("HAT", driver, "7");

        }

        @Test
        public void searchDressesQuantity() {
            homepagee = new Homepagee(driver);
            homepagee.seachspProducts("DRESS", driver, "7");

        }


        @Test
        public void searchwomenQuantity() {
            homepagee = new Homepagee(driver);
            homepagee.catagory(driver, "Women");
        }

        @Test
        public void searchTshirtsQuantity() {
            homepagee = new Homepagee(driver);
            homepagee.catagory(driver, "T-shirts");

        }

        @Test
        public void searchpopular() {
            homepagee = new Homepagee(driver);
            homepagee.searchByDemand(driver, "homefeatured");

        }

        @Test
        public void searchbestSeller() {
            homepagee = new Homepagee(driver);
            homepagee.searchByDemand(driver, "blockbestsellers");
        }

        @Test
        public void information1() {
            homepagee = new Homepagee(driver);
            homepagee.informationTree(driver, "Specials");
        }

        @Test
        public void information2() {
            homepagee = new Homepagee(driver);
            homepagee.informationTree(driver, "New products");

        }

        @Test
        public void information3() {
            homepagee = new Homepagee(driver);
            homepagee.informationTree(driver, "Best sellers");

        }

        @Test
        public void information4() {
            homepagee = new Homepagee(driver);
            homepagee.informationTree(driver, "Our stores");

        }

        @Test
        public void information5() {
            homepagee = new Homepagee(driver);
            homepagee.informationTree(driver, "Contact us");

        }

        @Test
        public void information6() {
            homepagee = new Homepagee(driver);
            homepagee.informationTree(driver, "Terms and conditions of use");
        }

        @Test
        public void information7() {
            homepagee = new Homepagee(driver);
            homepagee.informationTree(driver, "About us");
        }

        @Test
        public void information8() {
            homepagee = new Homepagee(driver);
            homepagee.informationTree(driver, "Sitemap");

        }


        @Test
        public void myAccount1() {
            homepagee = new Homepagee(driver);
            homepagee.myaccount(driver, "My orders");

        }

        @Test
        public void myAccount2() {
            homepagee = new Homepagee(driver);
            homepagee.myaccount(driver, "My credit slips");
        }

        @Test
        public void myAccount3() {
            homepagee = new Homepagee(driver);
            homepagee.myaccount(driver, "My addresses");
        }

        @Test
        public void myAccount4() {
            homepagee = new Homepagee(driver);
            homepagee.myaccount(driver, "Manage my personal information");
        }

        @Test
        public void verifycontactus1() {
            homepagee = new Homepagee(driver);
            homepagee.customerService();
        }

        @AfterTest
        public void closebrowser() {

            driver.close();
            driver.quit();


        }

    }


