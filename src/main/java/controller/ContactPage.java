package controller;

import base.ScriptBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class ContactPage extends ScriptBase {
    @FindBy(css = "#contact-link > a")
    WebElement contactUs;
    @FindBy(css = "#center_column > h1")
    WebElement costomerService;
    @FindBy(css = "#contact-link > a")
    WebElement contactUsclick;
    @FindBy(id="id_contact")
    WebElement subjectheadselect;

    @FindBy(id ="email")
    WebElement emailinput;
    @FindBy (id="id_contact")
    WebElement oderReference;
    @FindBy(id="message")
    WebElement message;
    @FindBy (css = "#submitMessage > span")
    WebElement clickSend;
    @FindBy(css = "#center_column > div > p")
    WebElement oneErrorfound;

    public ContactPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void customerService() {
        contactUs.click();
        Assert.assertEquals(costomerService, costomerService);

    }
    public void sendmessage(String email,String reference,String messages,String value) {
        contactUsclick.click();
        subjectheadselect.isSelected();
        emailinput.sendKeys(email);
        oderReference.sendKeys(reference);
        message.sendKeys(messages);
        clickSend.click();
        Assert.assertEquals(oneErrorfound,oneErrorfound);
    }


    public void dropdown(WebElement element,String value){
        element= subjectheadselect;
        Select select=new Select(element);
        select.selectByVisibleText(value);

    }
}
