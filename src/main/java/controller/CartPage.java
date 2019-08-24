package controller;


import base.ScriptBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CartPage extends ScriptBase {
    @FindBy(css = "#header > div:nth-child(3) > div > div > div:nth-child(3) > div > a > b")
    WebElement cart;
    @FindBy(id = "cart_title")
    WebElement cartTitle;
    @FindBy(css = "#center_column > p")
    WebElement cartMessage;
    @FindBy(css = "#add_to_cart > button > span")
    WebElement addToCard;
    @FindBy(css = "#layer_cart > div.clearfix > div.layer_cart_product.col-xs-12.col-md-6 > h2 > i")
    WebElement oneItemAdded;
   @FindBy (xpath = "//*//span[@title='Continue shopping']")
    WebElement continueshopping;
    @FindBy (css = "#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > a > span > i")
    WebElement checkout;
    @FindBy (xpath = "//*[@id='homefeatured']//h5[@itemprop='name']/a[@title='Faded Short Sleeve T-shirts']")
    WebElement sleevTsirt;
    @FindBy (xpath = "//div/a[@title='View my shopping cart']")
    WebElement cartPageView;


    public CartPage(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }

    public void shoppingcart(String summary, WebDriver driver) {
        cart.click();
        Assert.assertEquals(cartTitle, cartTitle);
        shoppincartsummary(driver, summary);

    }

    public void shoppincartsummary(WebDriver driver, String summary) {
        driver.findElement(By.xpath("//span[contains(text(),'" + summary + "')]")).isDisplayed();
        cartMessage.isDisplayed();
    }

    public void itemAddedToShoppingCart(WebDriver driver) throws InterruptedException {
        mouseOver(sleevTsirt, driver);
        sleevTsirt.click();
        addToCard.click();
        Thread.sleep(5000);
        continueshopping.click();
        mouseOver(cartPageView,driver);
        checkout.isDisplayed();

    }

    public void mouseOver(WebElement element, WebDriver driver) {
        Actions action = new Actions(driver);
        element = element;
        action.moveToElement(element).perform();


    }
}