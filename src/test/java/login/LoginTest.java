package login;

import base.ScriptBase;
import controller.LoginPage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest extends ScriptBase {
    LoginPage loginPage;

    @BeforeTest
    public void beforetest(){
        init();

    }
    @Test
    public void invalidLoginVerify(){
        log.info("** Verify Invalid Login ** Test Starts");
        loginPage=new LoginPage(driver);
        loginPage.invalidSignin("test@gmail.com","gmail1234");
        log.info("** Verify Invalid Login ** Test Ends");
    }

    @Test

    public void validLoginVerify(){
        log.info("** Verify Valid Log In ** Test Starts");
        loginPage=new LoginPage(driver);
        loginPage.validSignin("futureitgroup@gmail.com","admin123");
        log.info("** Verify Invalid Login ** Test Ends");
    }

    @Test
    public void validLoginWithLogOutVerify(){
        log.info("** Verify Invalid Login ** Test Starts");
        loginPage=new LoginPage(driver);
        loginPage.validSigninWithLogOut();
        log.info("** Verify Invalid Login ** Test Ends");
    }

    @Test
    public void invalidCreateAccountVerify(){
        log.info("** Verify Create Invalid ** Test Starts");
        loginPage=new LoginPage(driver);
        loginPage.invalidCreateAccount("hahahehe@yahoo.");
        log.info("** Verify Invalid Login ** Test Ends");
    }

    @Test
    public void invalidSignUpAccountVerify(){
        log.info("** Verify Invalid Account Sign up ** Test Starts");
        loginPage=new LoginPage(driver);
        loginPage.invalidSignup("test420@gmail.com",driver,"katlyn","Jenner","test420@gmail.com","admin1234");
        log.info("** Verify Invalid Account Sign up  ** Test Ends");
    }
    @AfterTest
    public void closebrowser(){
        //driver.close();
        //driver.quit();
    }


}
