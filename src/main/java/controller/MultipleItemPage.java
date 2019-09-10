package controller;

import base.ScriptBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class MultipleItemPage extends ScriptBase {
    @FindBy(xpath = "//*[@id='header_logo']/a/img[@class='logo img-responsive']")
    WebElement homepage;
    @FindBy(id = "group_1")
    WebElement size;
    @FindBy(xpath = "//*[@id='header_logo']/a/img[@class='logo img-responsive']")
    WebElement home;
    @FindBy(css = "#//*[@id='quantity_wanted_p']//span/i[@class='icon-plus']")
    WebElement cartQuantity;
    @FindBy(xpath = "//*/a[@class='btn btn-default button-plus product_quantity_up']")
    WebElement addingItems;


    public MultipleItemPage(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }

    public void multipleItemAdded(String products, WebDriver driver) throws InterruptedException {
        homepage.click();
        mouseOver(driver.findElement(By.xpath("//*[@id='homefeatured']//h5/a[@title='" + products + "']")), driver);
        Thread.sleep(5000);

       driver.findElement(By.xpath("//*[@id='homefeatured']//h5/a[@title='" + products + "']")).click();

    }

    public void mouseOver(WebElement element, WebDriver driver) {
        Actions action = new Actions(driver);
        element = element;
        action.moveToElement(element).perform();

    }

    public void dropdown(WebElement element, String value) {
        element = size;
        Select select = new Select(element);
        select.selectByVisibleText(value);
    }
    public void changeQuantity(WebDriver driver,String products, int quantity) throws InterruptedException {
        homepage.click();
        Thread.sleep(5000);
//        addcartproduct(driver,addProduct);
//        Thread.sleep(5000);

        multipleItemAdded(products, driver);
        Thread.sleep(5000);
       productQuantity(addingItems,quantity);



//
//    public  void addcartproduct( WebDriver driver,String Product){
//        driver.findElement(By.xpath("//*[@id='homefeatured']/li//h5/a[@title='"+Product+"']")).click();

    }

    private void productQuantity(WebElement element, int quantity) {
        for(int i=0; i<quantity; i++) {
            element.click();
        }
        //driver.findElement(By.xpath("//*[@id='quantity_wanted'][@id='"+quantity+"']")).click();
        //driver.findElement(By.xpath("//*[@id='quantity_wanted_p']//span/i[@class='"+quantity+"']")).sendKeys();}

}}


//    public void productQuantity (WebElement element, int quantity){
//        for(int i=0; i<quantity; i++) element.sendKeys();
//            driver.findElement(By.xpath("//*[@id='quantity_wanted'][@id='"+quantity+"']")).sendKeys();
//            //driver.findElement(By.xpath("//*[@id='quantity_wanted_p']//span/i[@class='"+quantity+"']")).click();
