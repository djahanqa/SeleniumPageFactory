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



public MultipleItemAddedPage (WebDriver driver) {

        PageFactory.initElements(driver, this);
    }

    public void itemAdded (WebDriver driver) {
    mouseOver(fadedTshirt,driver);
    fadedTshirt.click();





    }


    public void mouseOver(WebElement element, WebDriver driver) {
        Actions action = new Actions(driver);
        element = element;
        action.moveToElement(element).perform();

    }
}