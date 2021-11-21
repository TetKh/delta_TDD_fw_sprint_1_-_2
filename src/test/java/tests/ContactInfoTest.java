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
import utilities.SeleniumUtils;

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
        //I still need to figure out
        //how to grab the text, so we can write the assert test - Magda

    }
    @Test(groups={"regressionTest"})
        public void verifyAddressTypeDropDown() {
            new SignUpButtonTest().SingUpButtonTest();
            new ContactInfoPage().addressType.click();
            new ContactInfoPage().addressType.sendKeys(Keys.DOWN,Keys.ENTER);//Magda

        }

    @Test(groups={"regressionTest"})
    public void verifyAddressCredentials(){

        new ContactInfoPage().scrollWindow(); // I added the js.executeScript, so the window can move down
        String email = faker.funnyName().name();
        new SignUpButtonTest().SingUpButtonTest();
        Faker faker = new Faker();
        new ContactInfoPage().addressLine1.sendKeys(faker.address().streetAddress());
        new ContactInfoPage().addressLine2.sendKeys(faker.address().streetAddressNumber());
        new ContactInfoPage().city.sendKeys(faker.address().city());
        new ContactInfoPage().postalCode.sendKeys(faker.address().zipCode());
        new ContactInfoPage().areaCode.sendKeys(faker.phoneNumber().phoneNumber());
        new ContactInfoPage().phoneNo.sendKeys(faker.phoneNumber().phoneNumber());
        new ContactInfoPage().email.sendKeys(email);
        new ContactInfoPage().confirmEmail.sendKeys(email);


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
