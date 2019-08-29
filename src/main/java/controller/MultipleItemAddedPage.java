package controller;

import base.ScriptBase;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import javax.xml.xpath.XPath;

public class MultipleItemAddedPage extends ScriptBase {

    @FindBy(xpath = "//*[@id='homefeatured']/li[1]//h5[@itemprop='name']")
    WebElement fadedTshirt;
    @FindBy(xpath = "//*/button[@name='Submit']")
    WebElement addtocart;

    @FindBy(xpath = "//*[@id='layer_cart']//span[@title='Continue shopping']")
    WebElement continueshopping;
    @FindBy(xpath = "//div/a[@title='View my shopping cart']")
    WebElement cartPageView;

    @FindBy(xpath = "//*[@id='header_logo']/a/img[@class='logo img-responsive']")
    WebElement homepage;

    @FindBy(xpath = "//*[@id='homefeatured']//a/img[@title='Blouse']")
    WebElement blouse;
    @FindBy(xpath = "//*[@id='homefeatured']/li[2]//a[@title='Add to cart']")
    WebElement addToCart;
    @FindBy(css = "#button_order_cart > span")
    WebElement checkout;
    @FindBy(xpath = "//*[@id='layer_cart']//a[@title='Proceed to checkout']")
    WebElement proceedToCheckout;

    @FindBy(xpath = "//*[@id='homefeatured']/li[3]/div/div[2]//a[@title='Printed Dress']")
    WebElement printedDress;

    @FindBy(css = "#quantity_wanted_p > a.btn.btn-default.button-plus.product_quantity_up > span")
    WebElement quantity;

    @FindBy(id = "group_1")
    WebElement size;


    public MultipleItemAddedPage(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }

    public void itemAdded(WebDriver driver) throws InterruptedException {
        mouseOver(fadedTshirt, driver);
        fadedTshirt.click();
        addtocart.click();
        Thread.sleep(5000);
        continueshopping.click();
        mouseOver(cartPageView, driver);
        Thread.sleep(5000);
        checkout.click();
        homepage.click();
        mouseOver(blouse, driver);
        addToCart.click();
        Thread.sleep(5000);
        proceedToCheckout.click();



    }
    public void changeQuantity(WebDriver driver) {
        mouseOver(printedDress, driver);
        printedDress.click();
        quantity.click();

    }

    public void changeSize(WebDriver driver) {
        mouseOver(printedDress, driver);
        printedDress.click();
        dropdown(size, "M");
    }

    public void multipleItemAdded(String products, WebDriver driver)throws InterruptedException {

        mouseOver(driver.findElement(By.xpath("//*[@id='homefeatured']//h5/a[@title='" + products + "']")), driver);
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id='homefeatured']//h5/a[@title='" + products + "']")).click();
        Thread.sleep(5000);
        homepage.click();

        }

    public void dropdown(WebElement element,String value){
        element=size;
        Select select=new Select(element);
        select.selectByVisibleText(value);
}
        public void mouseOver(WebElement element, WebDriver driver) {
        Actions action = new Actions(driver);
        element = element;
        action.moveToElement(element).perform();


    }
}