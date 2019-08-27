package controller;

import base.ScriptBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class AddtoCartPage extends ScriptBase {
    @FindBy(xpath = "//*[@id='homefeatured']//a/img[@title='Blouse']")
    WebElement blouse;
    @FindBy(xpath = "//*[@id='homefeatured']/li[2]//a[@title='Add to cart']")
    WebElement addToCart;
    @FindBy(xpath = "//*//span[@title='Continue shopping']")
    WebElement continueShopping;
    @FindBy (xpath = "//*[@id='header']//a[@title='View my shopping cart']")
    WebElement cart;
    @FindBy (css = "#button_order_cart > span")
    WebElement checkout;
    @FindBy (xpath = "//*[@id='center_column']//a[@title='Proceed to checkout']")
    WebElement proceedToCheckout;
    @FindBy (xpath = "//*[@id='columns']//span[@class='navigation_page']")
    WebElement authentication;

    public AddtoCartPage(WebDriver driver) {

        PageFactory.initElements(driver, this);


    }

    public void addItemToCart(WebDriver driver)throws InterruptedException {
        mouseOver(blouse,driver);
        addToCart.click();
        Thread.sleep(5000);
        continueShopping.click();
        mouseOver(cart,driver);
        Thread.sleep(5000);
        checkout.click();
        proceedToCheckout.click();
        Assert.assertEquals(authentication,authentication);
    }


    public void mouseOver(WebElement element, WebDriver driver) {
        Actions action = new Actions(driver);
        element = element;
        action.moveToElement(element).perform();

    }
}