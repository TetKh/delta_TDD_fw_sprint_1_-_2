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
    public void verifyAddressCredentials(){
        new SignUpButtonTest().SingUpButtonTest();
        new ContactInfoPage().scrollWindow();
        new ContactInfoPage().addressLine1.sendKeys(faker.address().streetAddress());
        new ContactInfoPage().addressLine2.sendKeys(faker.address().streetAddressNumber());
        new ContactInfoPage().city.sendKeys(faker.address().city());
        new ContactInfoPage().postalCode.sendKeys(faker.address().zipCode());
        new ContactInfoPage().countryRegionCode.sendKeys(Keys.ENTER);
        new ContactInfoPage().areaCode.sendKeys("917");
        new ContactInfoPage().phoneNo.sendKeys(faker.phoneNumber().phoneNumber());
        new ContactInfoPage().email.sendKeys(ConfigReader.getProperty("email"));
        new ContactInfoPage().confirmEmail.sendKeys(ConfigReader.getProperty("email"));
        String answer = new ContactInfoPage().addressLine1.getText();
        String pageSource = Driver.getDriver().getPageSource();
        Assert.assertTrue(pageSource.contains(answer));



    }

    @Test
    public void invalidAddressCredentials(){
        new SignUpButtonTest().SingUpButtonTest();
        new ContactInfoPage().scrollWindow();

       // new ContactInfoPage().countryRegion.click();
       // new ContactInfoPage().addressType.sendKeys(Keys.DOWN,Keys.ENTER);
        new ContactInfoPage().addressLine1.sendKeys(faker.address().cityPrefix());
        new ContactInfoPage().addressLine2.sendKeys(faker.address().firstName());
        new ContactInfoPage().city.sendKeys(faker.address().zipCode());
        new ContactInfoPage().postalCode.sendKeys(faker.address().city());
        new ContactInfoPage().countryRegionCode.click();
        new ContactInfoPage().areaCode.sendKeys("ABC");
        new ContactInfoPage().phoneNo.sendKeys(faker.phoneNumber().subscriberNumber());
        new ContactInfoPage().email.sendKeys(ConfigReader.getProperty("fakeEmail"));
        new ContactInfoPage().confirmEmail.sendKeys(ConfigReader.getProperty("fakeEmail"));
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
