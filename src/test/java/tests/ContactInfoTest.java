package tests;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.BasicInfoPage;
import pages.ContactInfoPage;
import pages.LogInInfoPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.SeleniumUtils;

import java.security.Key;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


public class ContactInfoTest extends TestBase{

    ContactInfoPage contactInfoPage;
    Faker faker;

    @Test
    public void verifyCountryRegionDropDown() {
        new SignUpButtonTest().SingUpButtonTest();
        new ContactInfoPage().countryRegion.sendKeys(Keys.DOWN,Keys.ENTER);
       String answer = new ContactInfoPage().countryRegion.getText();
       String pageSource = Driver.getDriver().getPageSource();
       Assert.assertTrue(pageSource.contains(answer));

    }
    @Test
        public void verifyAddressTypeDropDown() {
            new SignUpButtonTest().SingUpButtonTest();
            new ContactInfoPage().addressType.sendKeys(Keys.DOWN,Keys.ENTER);
            String answer = new ContactInfoPage().addressType.getText();
            String pageSource = Driver.getDriver().getPageSource();
            Assert.assertTrue(pageSource.contains(answer));

        }

    @Test
    public void validAddressCredentials(){
        new SignUpButtonTest().SingUpButtonTest();
        new ContactInfoPage().scrollWindow();
        new ContactInfoPage().validAddressInfo();

        String answer = new ContactInfoPage().postalCode.getText();
        String pageSource = Driver.getDriver().getPageSource();
        Assert.assertTrue(pageSource.contains(answer));



    }

    @Test
    public void invalidAddressCredentials(){
        new SignUpButtonTest().SingUpButtonTest();
       new ContactInfoPage().scrollWindow();
       new ContactInfoPage().invalidAddressInfo();
        String answer = new ContactInfoPage().warning.getText();
        String pageSource = Driver.getDriver().getPageSource();
        Assert.assertTrue(pageSource.contains(answer));



    }


    @Test
    public void verifyCountryRegionCodeDropDown(){
        new SignUpButtonTest().SingUpButtonTest();
        new ContactInfoPage().countryRegionCode.sendKeys(Keys.ENTER);
        String answer = new ContactInfoPage().countryRegion.getText();
        String pageSource = Driver.getDriver().getPageSource();
        Assert.assertTrue(pageSource.contains(answer));


    }


}
