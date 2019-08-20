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
    @FindBy (xpath = "//*[@id='homefeatured']//div[2]//a[@title='Faded Short Sleeve T-shirts']")
    WebElement tshirt;
    @FindBy (css = "#add_to_cart > button > span")
    WebElement addToCard;

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


    public void itemAddedToShoppingCart( WebDriver driver) {
    tshirt.click();
    addToCard.click();


    }
}
