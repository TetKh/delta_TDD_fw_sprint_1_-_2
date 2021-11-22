package tests;

import com.github.javafaker.Faker;
import jdk.nashorn.internal.runtime.regexp.joni.Config;
import org.checkerframework.checker.units.qual.A;
import org.checkerframework.checker.units.qual.Current;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.BasicInfoPage;
import pages.CookiesHandlingPage;
import pages.LogInInfoPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.SeleniumUtils;

import java.time.LocalDate;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class BasicInfoTest extends TestBase{



    @Test
    public void verifyPrefixDropDown(){
        new SignUpButtonTest().SingUpButtonTest();
        new BasicInfoPage().prefix.sendKeys(Keys.DOWN,Keys.DOWN,Keys.DOWN,Keys.DOWN);
        String prefix =  new BasicInfoPage().prefix.getText();
        String pageSource = Driver.getDriver().getPageSource();
        Assert.assertTrue(pageSource.contains(prefix));



    }
    @Test
    public void validFullNameCredentials(){
       new SignUpButtonTest().SingUpButtonTest();
       new BasicInfoPage().validCredentials();
       String lastName =  new BasicInfoPage().lastName.getText();
       String pageSource = Driver.getDriver().getPageSource();
       Assert.assertTrue(pageSource.contains(lastName));


    }
    @Test
    public void invalidFullNameCredentials(){
       new SignUpButtonTest().SingUpButtonTest();
       new BasicInfoPage().invalidCredentials();
       String invalidName = new BasicInfoPage().invalidName.getText();
       String pageSource = Driver.getDriver().getPageSource();
       Assert.assertTrue(pageSource.contains(invalidName));

    }

    @Test
    public void verifySuffixDropDown(){
       new SignUpButtonTest().SingUpButtonTest();
       new BasicInfoPage().suffix.sendKeys(Keys.DOWN,Keys.DOWN,Keys.DOWN);
       String suffix =  new BasicInfoPage().suffix.getText();
       String pageSource = Driver.getDriver().getPageSource();
       Assert.assertTrue(pageSource.contains(suffix));

    }
    @Test
    public void verifyGenderDropDown(){
       new SignUpButtonTest().SingUpButtonTest();
       new BasicInfoPage().gender.sendKeys(Keys.DOWN, Keys.DOWN,Keys.ENTER);
       String gender =  new BasicInfoPage().gender.getText();
       String pageSource = Driver.getDriver().getPageSource();
       Assert.assertTrue(pageSource.contains(gender));
        }


    @Test
    public void validDOBinfo() {
        new SignUpButtonTest().SingUpButtonTest();
        new BasicInfoPage().validDOB();
        String dob =  new BasicInfoPage().monthOB.getText();
        String pageSource = Driver.getDriver().getPageSource();
        Assert.assertTrue(pageSource.contains(dob));



    }
    @Test
    public void invalidDOBinfo() {
        new SignUpButtonTest().SingUpButtonTest();
        new BasicInfoPage().invalidDOB();
        String BirthDayWarning =  new BasicInfoPage().monthOB.getText();
        String pageSource = Driver.getDriver().getPageSource();
        Assert.assertTrue(pageSource.contains(BirthDayWarning));

    }


    @Test
    public void validKnownTravelerNumber(){
       new SignUpButtonTest().SingUpButtonTest();
       new BasicInfoPage().travelNo.sendKeys(ConfigReader.getProperty("KnownTravelerNumber"));
       String travelerNumber=  new BasicInfoPage().travelNo.getText();
       String pageSource = Driver.getDriver().getPageSource();
       Assert.assertTrue(pageSource.contains(travelerNumber));


    }
    @Test
    public void invalidKnownTravelerNumber(){
        new SignUpButtonTest().SingUpButtonTest();
        new BasicInfoPage().travelNo.sendKeys(ConfigReader.getProperty("invalidKnownTravelerNumber"));
        String invalidTravelNo=  new BasicInfoPage().invalidTravelNo.getText();
        String pageSource = Driver.getDriver().getPageSource();
        Assert.assertTrue(pageSource.contains(invalidTravelNo));
    }
    @Test
    public void validRedRessNumber(){
        new SignUpButtonTest().SingUpButtonTest();
        new BasicInfoPage().redressNo.sendKeys(ConfigReader.getProperty("RedRessNumber"));
        String redRessNo=  new BasicInfoPage().redressNo.getText();
        String pageSource = Driver.getDriver().getPageSource();
        Assert.assertTrue(pageSource.contains(redRessNo));

    }
    @Test
    public void invalidRedRessNumber(){
        new SignUpButtonTest().SingUpButtonTest();
        new BasicInfoPage().redressNo.sendKeys(ConfigReader.getProperty("invalidRedRessNumber"));
        String invalidRedRessNo=  new BasicInfoPage().invalidRedressNo.getText();
        String pageSource = Driver.getDriver().getPageSource();
        Assert.assertTrue(pageSource.contains(invalidRedRessNo));


    }

    @Test
    public void verifyBusinessOwnerChkBox(){
       new SignUpButtonTest().SingUpButtonTest();
       new BasicInfoPage().businessOwnerCheckButton.click();
       Assert.assertTrue(new BasicInfoPage().businessOwnerCheckButton.isSelected());


    }







}
