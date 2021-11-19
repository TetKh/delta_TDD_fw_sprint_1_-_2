package tests;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.BasicInfoPage;
import pages.ContactInfoPage;
import utilities.SeleniumUtils;

import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


public class ContactInfoTest extends TestBase{

    ContactInfoPage contactInfoPage;
    Faker faker;

    @Test
    public void verifyCountryRegionDropDown() {
        new SignUpButtonTest().SingUpButtonTest();
        new ContactInfoPage().countryRegion.click();

    }

        @Test
        public void verifyAddressTypeDropDown() {
            new SignUpButtonTest().SingUpButtonTest();
            new ContactInfoPage().addressType.click();

        }

    @Test
    public void verifyAddressCredentials(){

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

            @Test
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

    @Test
    public void verifyCountryRegionCodeDropDown(){
        new SignUpButtonTest().SingUpButtonTest();
        new ContactInfoPage().countryRegionCode.click();

        // assert?

    }


}
