package tests;

import com.github.javafaker.Faker;
import jdk.nashorn.internal.runtime.regexp.joni.Config;
import org.checkerframework.checker.units.qual.A;
import org.checkerframework.checker.units.qual.Current;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.BasicInfoPage;
import utilities.ConfigReader;
import utilities.SeleniumUtils;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class BasicInfoTest extends TestBase{

SignUpButtonTest signUpButtonTest;
    BasicInfoPage basicInfoPage;
    Faker faker;

    @Test
    public void verifyPrefixDropDown(){
    signUpButtonTest.SingUpButtonTest();
       basicInfoPage.prefix.click();

       // assert?

    }
@Test
    public void enterFullNameValidCredentials(){
       new SignUpButtonTest().SingUpButtonTest();
      new BasicInfoPage().firstName.sendKeys(faker.name().firstName());
      new BasicInfoPage().middleName.sendKeys(faker.name().nameWithMiddle());
      new BasicInfoPage().lastName.sendKeys(faker.name().lastName());
    Assert.assertEquals(faker.name().firstName(), new BasicInfoPage().firstName.getText());
    Assert.assertEquals(faker.name().nameWithMiddle(), new BasicInfoPage().middleName.getText());
    Assert.assertEquals(faker.name().lastName(), new BasicInfoPage().lastName.getText());
    }
@Test
    public void enterFullNameInValidCredentials(){
       new SignUpButtonTest().SingUpButtonTest();
    new BasicInfoPage().firstName.sendKeys(faker.address().fullAddress());
    new BasicInfoPage().middleName.sendKeys(faker.phoneNumber().extension());
    new BasicInfoPage().lastName.sendKeys(faker.slackEmoji().celebration());
    Assert.assertEquals(faker.address().fullAddress(), new BasicInfoPage().firstName);
    Assert.assertEquals(faker.phoneNumber().extension(), new BasicInfoPage().middleName);
    Assert.assertEquals(faker.slackEmoji().celebration(), new BasicInfoPage().lastName);

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
    public void verifyDOBdropDownMenu() {
        new SignUpButtonTest().SingUpButtonTest();

        new BasicInfoPage().monthOB.click();
        new BasicInfoPage().dateOB.click();
        new BasicInfoPage().yearOB.click();
    }




    @Test
    public void ValidKnownTravelerNumber(){
       new SignUpButtonTest().SingUpButtonTest();
     new BasicInfoPage().travelNo.sendKeys(ConfigReader.getProperty("KnownTravelerNumber"));
     Assert.assertEquals(ConfigReader.getProperty("KnownTravelerNumber"),new BasicInfoPage().travelNo);

        // assert?

    }

    @Test
    public void InValidKnownTravelerNumber(){
        new SignUpButtonTest().SingUpButtonTest();
      new BasicInfoPage().travelNo.sendKeys(ConfigReader.getProperty("invalidKnownTravelerNumber"));

        // assert?

    }
    @Test
    public void ValidRedRessNumber(){
    new SignUpButtonTest().SingUpButtonTest();
    new BasicInfoPage().redressNo.sendKeys(ConfigReader.getProperty("validRedRessNumber"));

        // assert?

    }
    @Test
    public void InValidRedRessNumber(){
        new SignUpButtonTest().SingUpButtonTest();
        basicInfoPage=new BasicInfoPage();
        new BasicInfoPage().redressNo.sendKeys(ConfigReader.getProperty("invalidRedRessNumber"));

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


    }







}
