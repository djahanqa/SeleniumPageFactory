package controller;

import base.ScriptBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;



public class HomePage extends ScriptBase {

    @FindBy(css = "#header > div.nav > div > div > nav > span")
    WebElement CallUs;
    @FindBy(css = "#header > div.nav > div > div > nav > span > strong")
    WebElement PhoneNumber;
    @FindBy(css = "#contact-link > a")
    WebElement ContactUs;
    @FindBy(xpath = "//a[@title='Log in to your customer account']")
    WebElement signin;
    @FindBy(name = "search_query")
    WebElement TshirtQueary;
    @FindBy(css = "#searchbox > button")
    WebElement ClickSearch;
    @FindBy(xpath = "//*[@class='heading-counter']")
    WebElement OneResultFound;

    @FindBy (id="search_query_top")
    WebElement Search;
    @FindBy(xpath = "//*[@id='searchbox']/button[@type='submit']")
    WebElement clickButton;


    @FindBy(css = "#header_logo > a > img")WebElement homepageNavigation;

    @FindBy(css = "#contact-link > a")
    WebElement ContactUs1;
    @FindBy(css = "#center_column > h1")
    WebElement customerService;

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void verifyContactUS(String Shirt) {
        CallUs.click();
        PhoneNumber.click();
        ContactUs.click();
        signin.click();
        TshirtQueary.sendKeys(Shirt);
        ClickSearch.click();
        Assert.assertEquals(OneResultFound, OneResultFound);

    }

    public void seachspProducts(String products, WebDriver driver,String quantity){
        Search.clear();
        Search.sendKeys(products);
        clickButton.click();
        driver.findElement(By.xpath("//*[@id='center_column']/h1/span[contains(text(),'"+quantity+" results have been found.')]")).isDisplayed();

    }
    public void catagory(WebDriver driver,String Selectcatagory){

        driver.findElement(By.xpath("//*[@id='block_top_menu']//li[1]/a[@title='"+Selectcatagory+"']")).isDisplayed();

    }

    public void searchByDemand(WebDriver driver,String demand) {
        homepageNavigation.click();
        driver.findElement(By.xpath("//*[@id='home-page-tabs']/li/a[@class='" + demand + "']")).isDisplayed();


    }

    public void informationTree(WebDriver driver,String info){

        driver.findElement(By.xpath("//*[@id='block_various_links_footer']/ul/li/a[@title='"+info+"']")).isDisplayed();


    }

    public void myaccount (WebDriver driver,String information) {

        driver.findElement(By.xpath("//*[@id='footer']/div/section[5]/div/ul/li/a[@title='" + information + "']")).isDisplayed();

    }

    public void customerService() {
        ContactUs1.click();
        Assert.assertEquals(customerService,customerService);
    }

}




