package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pages.*;
import utilities.Driver;
import utilities.SeleniumUtils;

import java.util.Collections;


public class LogInTest extends TestBase {

    @Test
    public void verifyLogInButton() {

     logger.info("Verifying LogIn Button by clicking and checking info");
        new LogInPage().logInButtonClick();
        String expected = "Log In To Delta";
        String pageSource = Driver.getDriver().getPageSource();
     Assert.assertTrue(pageSource.contains(expected));
     logger.pass("Test passed");
    }

    @Test(groups={"smokeTest"})
    public void incorrectLoginInfo(){

        logger.info("Verifying that incorrect LogInfo will not be allow");
        new LogInPage().logInButtonClick();
        new LogInPage().incorrectUserAndPasswordInfo();
        String expected ="please correct the 2 items indicated.";
        String actual= new LogInPage().errorMessage.getText();
        Assert.assertEquals(actual,expected);
        logger.pass("Test passed");

    }

    @Test
    public void checkbox(){

       logger.info("Verifying that checkbox works");
       new LogInPage().logInButtonClick();
       logger.info("Click on checkbox");
       new LogInPage().checkbox.click();
       WebElement element = new LogInPage().checkboxChecked;
       Assert.assertTrue(element.isSelected());
       logger.pass("Test passed");
    }

    @Test
    public void questionMarkOpen(){

        new LogInPage().logInButtonClick();
        new LogInPage().questionMark.click();
        String expected ="Keep Me Logged In";
        String pageSource = Driver.getDriver().getPageSource();
        Assert.assertTrue(pageSource.contains(expected));
        new LogInPage().closeQuestionMark.click();

    }

     @Test
    public void skyMilesButton(){

        new LogInPage().logInButtonClick();
        SeleniumUtils.scroll(0,700);
        SeleniumUtils.jsClick(new LogInPage().joinSkyMiles);
        String expected ="Join SkyMiles";
        String pageSource = Driver.getDriver().getPageSource();
        Assert.assertTrue(pageSource.contains(expected));

    }

    @Test
    public void forgotLoginButton(){

        new LogInPage().logInButtonClick();
        SeleniumUtils.scroll(0,700);
        new LogInPage().forgotLogin.click();
        String expected =" Forgot Login";
        String pageSource = Driver.getDriver().getPageSource();
        Assert.assertTrue(pageSource.contains(expected));
    }

    @Test(groups={"smokeTest"})
    public void forgotPasswordButton(){

        new LogInPage().logInButtonClick();
        SeleniumUtils.scroll(0,700);
        new LogInPage().forgotPassword.click();
        String expected ="Reset Password ";
        String pageSource = Driver.getDriver().getPageSource();
        Assert.assertTrue(pageSource.contains(expected));
    }

}
