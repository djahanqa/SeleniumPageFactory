package controller;


import base.ScriptBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CartPage extends ScriptBase {
    @FindBy (css = "#header > div:nth-child(3) > div > div > div:nth-child(3) > div > a > b")
    WebElement cart;
    @FindBy (id="cart_title")
    WebElement cartTitle;

    public CartPage(WebDriver driver) {

        PageFactory.initElements(driver,this);
    }

    public void shoppingcart() {
        cart.click();
        Assert.assertEquals(cartTitle, cartTitle);


    }
    public void shoppincartsummary(WebDriver driver,String summary){
        driver.findElement(By.xpath("//*[@id=\"order_step\"]/li/span[contains(text(),'" + summary + "')]")).isDisplayed();

    }


public class CartPage {

}
