package tests;

import org.openqa.selenium.JavascriptExecutor;
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

        new LogInPage().logInButtonClick();
        String expected = "Log In To Delta";
        String pageSource = Driver.getDriver().getPageSource();
     Assert.assertTrue(pageSource.contains(expected));
    }

    @Test
    public void inccorectLogInfo(){
        new LogInPage().logInButtonClick();
        new LogInPage().incorrectUserAndPasswordInfo();
        String expected ="please correct the 2 items indicated.";
        String actual= new LogInPage().errorMessage.getText();
        Assert.assertEquals(actual,expected);

    }

    @Test
    public void checkBox(){

       new LogInPage().logInButtonClick();
       new LogInPage().checkbox.click();
      // Assert.assertFalse(new LogInPage().checkbox.isSelected());
       // SoftAssert softAssert = new SoftAssert();
        //Assert.assertTrue(new LogInPage().checkbox.isEnabled());
    }

    @Test
    public void questionMarkOpen(){

        new LogInPage().logInButtonClick();
        new LogInPage().questionMark.click();

       String expected ="Keep Me Logged In";
       // String actual= new LogInPage().textFromQuestionMark.getText();
        //System.out.println(actual);
        String pageSource = Driver.getDriver().getPageSource();
        Assert.assertTrue(pageSource.contains(expected));
       new LogInPage().closeQuestionMark.click();

    }

     @Test
    public void skyMilesButton(){

        new LogInPage().logInButtonClick();
        new LogInPage().scrollWindow();
        new LogInPage().joinSkyMiles.click();
        String expected ="Join SkyMiles";
        String pageSource = Driver.getDriver().getPageSource();
        Assert.assertTrue(pageSource.contains(expected));

    }

    @Test
    public void forgotLoginButton(){

        new LogInPage().logInButtonClick();
        new LogInPage().scrollWindow();
        new LogInPage().forgotLogin.click();
        String expected =" Forgot Login";
        String pageSource = Driver.getDriver().getPageSource();
        Assert.assertTrue(pageSource.contains(expected));
    }

    @Test
    public void forgotPasswordButton(){

        new LogInPage().logInButtonClick();
        new LogInPage().scrollWindow();
        new LogInPage().forgotPassword.click();
        String expected ="Reset Password ";
        String pageSource = Driver.getDriver().getPageSource();
        Assert.assertTrue(pageSource.contains(expected));
    }

}
