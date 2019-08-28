package controller;

import base.ScriptBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MultipleItemAddedPage extends ScriptBase {

    @FindBy(xpath = "//*[@id='homefeatured']/li[1]//h5[@itemprop='name']")
    WebElement fadedTshirt;
    @FindBy(xpath = "//*/button[@name='Submit']")
    WebElement addtocart;

    @FindBy (xpath = "//*[@id='layer_cart']//span[@title='Continue shopping']")
    WebElement continueshopping;
    @FindBy (xpath = "//div/a[@title='View my shopping cart']")
    WebElement cartPageView;
    @FindBy (xpath = "//*[@id='header_logo']/a/img[@class='logo img-responsive']")
    WebElement homepage;
    @FindBy(xpath = "//*[@id='homefeatured']//a/img[@title='Blouse']")
    WebElement blouse;
    @FindBy(xpath = "//*[@id='homefeatured']/li[2]//a[@title='Add to cart']")
    WebElement addToCart;
    @FindBy (css = "#button_order_cart > span")
    WebElement checkout;



public MultipleItemAddedPage (WebDriver driver) {

        PageFactory.initElements(driver, this);
    }

    public void itemAdded (WebDriver driver) throws InterruptedException {
    mouseOver(fadedTshirt,driver);
    fadedTshirt.click();
    addtocart.click();
    Thread.sleep(5000);
    continueshopping.click();
    mouseOver(cartPageView,driver);
    Thread.sleep(5000);
    checkout.click();
    homepage.click();
    mouseOver(blouse,driver);
    addToCart.click();
    Thread.sleep(5000);


    //mouseOver(blouse,driver);
    //blouse.click();
    //addToCart.click();
    //Thread.sleep(5000);

    }


    public void mouseOver(WebElement element, WebDriver driver) {
        Actions action = new Actions(driver);
        element = element;
        action.moveToElement(element).perform();

    }
}