package tests;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.BasicInfoPage;
import utilities.SeleniumUtils;

import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class BasicInfoTest extends TestBase{

SignUpButtonTest signUpButtonTest;
    BasicInfoPage basicInfoPage;
    Random random;
    Faker faker;
    @Test
    public void verifyPrefixDropDown(){
        new SignUpButtonTest().SingUpButtonTest();
       new BasicInfoPage().prefix.click();

       // assert?

    }
@Test
    public void verifyFullNameValidCredentials(){
        new SignUpButtonTest().SingUpButtonTest();
        Faker faker = new Faker();
        new BasicInfoPage().firstName.sendKeys(faker.name().firstName());
        new BasicInfoPage().middleName.sendKeys(faker.name().nameWithMiddle());
        new BasicInfoPage().lastName.sendKeys(faker.name().lastName());


    }
@Test
    public void verifyFullNameInValidCredentials(){
        new SignUpButtonTest().SingUpButtonTest();
        Faker faker = new Faker();
        new BasicInfoPage().firstName.sendKeys(faker.address().fullAddress());
        new BasicInfoPage().middleName.sendKeys(faker.phoneNumber().extension());
        new BasicInfoPage().lastName.sendKeys(faker.slackEmoji().celebration());
        //assert
    }

    @Test
    public void verifySuffixDropDown(){
        new SignUpButtonTest().SingUpButtonTest();
        new BasicInfoPage().suffix.click();

        // assert?

    }

    @Test
    public void verifyGenderDropDown(){
        new SignUpButtonTest().SingUpButtonTest();

            new BasicInfoPage().gender.click();


        // assert
        }





    @Test
    public void verifyDOBValidCredentials(){
        new SignUpButtonTest().SingUpButtonTest();

        new BasicInfoPage().monthOB.click();
        new BasicInfoPage().dateOB.click();
        new BasicInfoPage().yearOB.click();


    }
    @Test
    public void verifyDOBInValidCredentials(){
        new SignUpButtonTest().SingUpButtonTest();

        new BasicInfoPage().firstName.sendKeys(faker.address().fullAddress());
        new BasicInfoPage().middleName.sendKeys(faker.phoneNumber().extension());
        new BasicInfoPage().lastName.sendKeys(faker.slackEmoji().celebration());
        //assert
    }

    @Test
    public void ValidKnownTravelerNumber(){
        new SignUpButtonTest().SingUpButtonTest();
        new BasicInfoPage().travelNo.sendKeys();

        // assert?

    }

    @Test
    public void InValidKnownTravelerNumber(){
        new SignUpButtonTest().SingUpButtonTest();
        new BasicInfoPage().travelNo.sendKeys();

        // assert?

    }
    @Test
    public void ValidRedRessNumber(){
        new SignUpButtonTest().SingUpButtonTest();
        new BasicInfoPage().redressNo.sendKeys();

        // assert?

    }
    @Test
    public void InValidRedRessNumber(){
        new SignUpButtonTest().SingUpButtonTest();
        new BasicInfoPage().redressNo.sendKeys();

        // assert?

    }

    @Test
    public void LegalGuardianChkBox(){
        new SignUpButtonTest().SingUpButtonTest();
        new BasicInfoPage().legalGuardian.click();

        // assert?

    }
    @Test
    public void BusinessOwnerChkBox(){
        new SignUpButtonTest().SingUpButtonTest();
        new BasicInfoPage().businessOwnerCheckButton.click();

        Assert.assertTrue(new BasicInfoPage().businessOwnerCheckButton.isSelected());

        // assert?

    }







}
