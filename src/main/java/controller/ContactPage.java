package controller;

import base.ScriptBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.support.ui.Select;

public class ContactPage extends ScriptBase {


import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class ContactPage extends ScriptBase {

    @FindBy(css = "#contact-link > a")
    WebElement contactUs1;
    @FindBy(css = "#center_column > h1")
    WebElement costomerService;

    @FindBy(css = "#id_contact")
    WebElement subjectheading;
    @FindBy(id="email")
    WebElement emailinput;
    @FindBy(id="id_order")
    WebElement orderReference;
    @FindBy(id="message")
    WebElement message;


    public ContactPage(WebDriver driver) {

        PageFactory.initElements(driver,this);
    }

public void messagesent(String email,String reference,String messages){
        contactUs1.click();
        costomerService.isDisplayed();
        dropdown(subjectheading,"Webmaster");
        emailinput.sendKeys(email);
        orderReference.sendKeys(reference);
        message.sendKeys(messages);

    }
public void dropdown(WebElement element,String value){
        element=subjectheading;
        Select select=new Select(element);
        select.selectByVisibleText(value);
}

}


    @FindBy(id ="email")
    WebElement emailinput;
    @FindBy (id = "#id_order")
    WebElement oderReference;
    @FindBy(id="message")
    WebElement message;
    @FindBy (css = "submitMessage")
    WebElement clickSend;
    @FindBy(css = "#center_column > div > p")
    WebElement oneErrorfound;

    public ContactPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void customerService() {
        contactUs1.click();
        Assert.assertEquals(costomerService, costomerService);

    }
    public void sendmessage(String email,String reference,String messages) {
            contactUs1.click();
            emailinput.sendKeys(email);
            oderReference.sendKeys(reference);
            message.sendKeys(messages);
            clickSend.click();
            Assert.assertEquals(oneErrorfound,oneErrorfound);


        }

}

