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
       String pageSource = driver.getPageSource();
       Assert.assertTrue(pageSource.contains(answer));

    }
    @Test
        public void verifyAddressTypeDropDown() {
            new SignUpButtonTest().SingUpButtonTest();
            new ContactInfoPage().addressType.sendKeys(Keys.DOWN,Keys.ENTER);
            String answer = new ContactInfoPage().addressType.getText();
            String pageSource = driver.getPageSource();
            Assert.assertTrue(pageSource.contains(answer));

        }

    @Test
    public void validAddressCredentials(){
        new SignUpButtonTest().SingUpButtonTest();
        new ContactInfoPage().scrollWindow();
        SoftAssert assert1 = new SoftAssert();
        new ContactInfoPage().validAddressInfo();

        String answer = new ContactInfoPage().addressLine1.getText();
        String answer1 = new ContactInfoPage().addressLine2.getText();
        String answer2 = new ContactInfoPage().city.getText();
        String answer3 = new ContactInfoPage().postalCode.getText();
        String answer4 = new ContactInfoPage().countryRegionCode.getText();
        String answer5 = new ContactInfoPage().areaCode.getText();
        String answer6 = new ContactInfoPage().phoneNo.getText();
        String answer7 = new ContactInfoPage().email.getText();
        String answer8 = new ContactInfoPage().confirmEmail.getText();

        String pageSource = driver.getPageSource();
        Assert.assertTrue(pageSource.contains(answer));
        Assert.assertTrue(pageSource.contains(answer1));
        Assert.assertTrue(pageSource.contains(answer2));
        Assert.assertTrue(pageSource.contains(answer3));
        Assert.assertTrue(pageSource.contains(answer4));
        Assert.assertTrue(pageSource.contains(answer5));
        Assert.assertTrue(pageSource.contains(answer6));
        Assert.assertTrue(pageSource.contains(answer7));
        Assert.assertTrue(pageSource.contains(answer8));


        assert1.assertAll();



    }

    @Test
    public void invalidAddressCredentials(){
        new SignUpButtonTest().SingUpButtonTest();
       new ContactInfoPage().scrollWindow();
       new ContactInfoPage().invalidAddressInfo();
        String answer = new ContactInfoPage().warning.getText();
        String pageSource = driver.getPageSource();
        Assert.assertTrue(pageSource.contains(answer));



    }


    @Test
    public void verifyCountryRegionCodeDropDown(){
        new SignUpButtonTest().SingUpButtonTest();
        new ContactInfoPage().countryRegionCode.sendKeys(Keys.ENTER);
        String answer = new ContactInfoPage().countryRegion.getText();
        String pageSource = driver.getPageSource();
        Assert.assertTrue(pageSource.contains(answer));


    }


}
