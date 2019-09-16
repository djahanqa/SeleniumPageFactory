package controller;

import base.ScriptBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class LoginPage extends ScriptBase {
    public static final Logger log=Logger.getLogger(LoginPage .class.getName());
    @FindBy(xpath ="//a[@class='login']") WebElement signinButton;
    @FindBy(id = "email") WebElement emailSendKey;
    @FindBy(id = "passwd") WebElement passwordSendKey;
    @FindBy(css = "#SubmitLogin > span") WebElement submitButton;
    @FindBy(css = "#center_column > div.alert.alert-danger > ol > li")WebElement signInMessageFailed;
    @FindBy(linkText = "Zaman Dewan")WebElement signInSuccessful;

    @FindBy(xpath = "//*[@id='header']//a[@title='Log me out']")WebElement signOut;

    @FindBy(id = "email_create")WebElement emailCreateInput;
    @FindBy(css = "#SubmitCreate > span")WebElement submitCreateAccountButton;
    @FindBy(xpath= "//*[@id='create_account_error']")WebElement inValidEmailErrorMessage;
    @FindBy(css= "#id_gender1")WebElement titleMrButton;
    @FindBy(id= "customer_firstname")WebElement firstNameSendKey;
    @FindBy(id= "customer_lastname")WebElement lastNameSendKey;
    @FindBy(id = "email")WebElement signupEmail;
    @FindBy(id = "passwd")WebElement signupPassword;
    @FindBy(css = "#submitAccount > span")WebElement submitRegisterButton;
    @FindBy(xpath = "//*[@id=\"center_column\"]/div")WebElement invalidSignpErrorMessage;



    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void invalidSignin(String email, String password){
        signinButton.click();
        log.info(" Sign in Button Clicked");
        emailSendKey.sendKeys(email);
        log.info(" email Address input");
        passwordSendKey.sendKeys(password);
        log.info(" password input");
        submitButton.click();
        log.info(" submit button clicked");
        Assert.assertEquals(signInMessageFailed,signInMessageFailed);
        log.info(" expected and actual result Sign in Massage failed displays");
    }

    public void validSignin(String email, String password){
        signinButton.click();
        log.info(" Sign in Button Clicked");
        emailSendKey.sendKeys(email);
        log.info(" email Address input");
        passwordSendKey.sendKeys(password);
        log.info(" password input");
        submitButton.click();
        log.info(" submit button clicked");
        Assert.assertEquals(signInSuccessful,signInSuccessful);
        log.info(" expected and actual result sign In Successfully Massage failed displays");
}

    public void validSigninWithLogOut(){
        signOut.click();
    }

    public void invalidCreateAccount(String email){
        signinButton.click();
        log.info(" Sign in Button Clicked");
        emailCreateInput.sendKeys(email);
        log.info(" email Address input");
        submitCreateAccountButton.click();
        Assert.assertEquals(inValidEmailErrorMessage,inValidEmailErrorMessage);


    }


    public void invalidSignup(String email, WebDriver driver, String firstname, String lastname, String signupemail, String signuppassword){
        signinButton.click();
        log.info(" Sign in Button Clicked");
        emailCreateInput.sendKeys(email);
        log.info(" email Address input");
        submitCreateAccountButton.click();
        log.info(" Create account Button clicked");
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        titleMrButton.click();
        log.info(" clicked on Mr, Button");
        firstNameSendKey.sendKeys(firstname);
        log.info(" First name input");
        lastNameSendKey.sendKeys(lastname);
        log.info(" last name input");
        signupEmail.sendKeys(signupemail);
        log.info(" email address inout");
        signupPassword.sendKeys(signuppassword);
        log.info(" password input");
        submitRegisterButton.click();
        log.info(" submit button clickedt");
        Assert.assertEquals(invalidSignpErrorMessage,invalidSignpErrorMessage);
        //email: test420@gmail.com
        //password: admin1234

    }
}

