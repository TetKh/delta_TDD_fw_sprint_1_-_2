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
import utilities.Driver;
import utilities.SeleniumUtils;

import java.security.Key;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


public class ContactInfoTest extends TestBase{

    ContactInfoPage contactInfoPage;
    Faker faker;

    @Test(groups={"regressionTest"})
    public void verifyCountryRegionDropDown() {
        new SignUpButtonTest().SingUpButtonTest();
        new ContactInfoPage().countryRegion.click();
        new ContactInfoPage().countryRegion.sendKeys(Keys.DOWN,Keys.ENTER);
       String answer = "United States";
       String pageSource = Driver.getDriver().getPageSource();
       Assert.assertTrue(pageSource.contains(answer));

    }
    @Test(groups={"regressionTest"})
        public void verifyAddressTypeDropDown() {
            new SignUpButtonTest().SingUpButtonTest();
            new ContactInfoPage().addressType.click();
            new ContactInfoPage().addressType.sendKeys(Keys.DOWN,Keys.ENTER);
            String answer = "Home";
            String pageSource = Driver.getDriver().getPageSource();
            Assert.assertTrue(pageSource.contains(answer));

        }

    @Test(groups={"regressionTest"})
    public void verifyAddressCredentials(){
        new SignUpButtonTest().SingUpButtonTest();
        new ContactInfoPage().scrollWindow();
        new ContactInfoPage().countryRegion.sendKeys("United States", Keys.TAB);
        new ContactInfoPage().addressType.sendKeys(Keys.DOWN,Keys.ENTER, Keys.TAB);

        Faker faker = new Faker();
        new ContactInfoPage().addressLine1.sendKeys(faker.address().streetAddress());
        new ContactInfoPage().addressLine2.sendKeys(faker.address().streetAddressNumber());
        new ContactInfoPage().city.sendKeys(faker.address().city());
        // STATE/PROVINCE missing
        new ContactInfoPage().postalCode.sendKeys(faker.address().zipCode());
        new ContactInfoPage().areaCode.sendKeys(faker.phoneNumber().phoneNumber());
        new ContactInfoPage().phoneNo.sendKeys(faker.phoneNumber().phoneNumber());
        new ContactInfoPage().email.sendKeys(faker.funnyName().name());
        new ContactInfoPage().confirmEmail.sendKeys(faker.funnyName().name());

    }
    @Test(groups={"regressionTest"})
            public void verifyStateProvinceDropDown() {
                new SignUpButtonTest().SingUpButtonTest();
                new ContactInfoPage().stateProvince.click();
            }

//    @Test
//    public void verifyFullNameInValidCredentials(){
//        new SignUpButtonTest().SingUpButtonTest();
//        Faker faker = new Faker();
//        new ContactInfoPage().addressLine1.sendKeys(faker.chuckNorris().fact());
//        new ContactInfoPage().addressLine2.sendKeys(faker.phoneNumber().extension());
//        new ContactInfoPage().city.sendKeys(faker.slackEmoji().celebration());
//        //assert
//    }

    @Test(groups={"regressionTest"})
    public void verifyCountryRegionCodeDropDown(){
        new SignUpButtonTest().SingUpButtonTest();
        new ContactInfoPage().countryRegionCode.sendKeys(Keys.ENTER);

        // assert?

    }


}
