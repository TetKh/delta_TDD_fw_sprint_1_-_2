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
import utilities.ConfigReader;
import utilities.SeleniumUtils;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class BasicInfoTest extends TestBase{


    @Test
    public void verifyPrefixDropDown(){
        new SignUpButtonTest().SingUpButtonTest();
       new BasicInfoPage().prefix.sendKeys("Mrs");

       // assert?

    }
@Test
    public void validFullNameCredentials(){
       new SignUpButtonTest().SingUpButtonTest();
       new BasicInfoPage().firstName.sendKeys(ConfigReader.getProperty("firstName"),Keys.TAB,
               ConfigReader.getProperty("middleName"),Keys.TAB,
               ConfigReader.getProperty("lastName"));

    }
@Test
    public void invalidFullNameCredentials(){
       new SignUpButtonTest().SingUpButtonTest();

    new BasicInfoPage().firstName.sendKeys(ConfigReader.getProperty("invalidFirstName"),Keys.TAB,
            ConfigReader.getProperty("invalidMiddleName"),Keys.TAB,
            ConfigReader.getProperty(""));

   // Assert.assertEquals(faker.address().fullAddress(), new BasicInfoPage().firstName);
   // Assert.assertEquals(faker.phoneNumber().extension(), new BasicInfoPage().middleName);
   // Assert.assertEquals(faker.slackEmoji().celebration(), new BasicInfoPage().lastName);

    }

    @Test
    public void verifySuffixDropDown(){
      new SignUpButtonTest().SingUpButtonTest();
     new BasicInfoPage().suffix.sendKeys("Jr");


        // assert?

    }

    @Test
    public void verifyGenderDropDown(){
     new SignUpButtonTest().SingUpButtonTest();
     new BasicInfoPage().gender.sendKeys(Keys.DOWN, Keys.DOWN,Keys.ENTER);


        // assert
        }





    @Test
    public void validDOBinfo() {
        new SignUpButtonTest().SingUpButtonTest();

        new BasicInfoPage().monthOB.sendKeys(Keys.DOWN, Keys.DOWN, Keys.DOWN,Keys.ENTER);
        new BasicInfoPage().dateOB.sendKeys(Keys.DOWN, Keys.DOWN,Keys.ENTER);
        new BasicInfoPage().yearOB.sendKeys("2000");
    }

    @Test
    public void invalidDOBinfo() {
        new SignUpButtonTest().SingUpButtonTest();

        new BasicInfoPage().monthOB.sendKeys(Keys.ENTER);
        new BasicInfoPage().dateOB.sendKeys(Keys.ENTER);
        new BasicInfoPage().yearOB.sendKeys(Keys.ENTER);
    }




    @Test
    public void validKnownTravelerNumber(){
       new SignUpButtonTest().SingUpButtonTest();
     new BasicInfoPage().travelNo.sendKeys(ConfigReader.getProperty("KnownTravelerNumber"));


        // assert?

    }

    @Test
    public void invalidKnownTravelerNumber(){
        new SignUpButtonTest().SingUpButtonTest();
      new BasicInfoPage().travelNo.sendKeys(ConfigReader.getProperty("invalidKnownTravelerNumber"));

        // assert?

    }
    @Test
    public void validRedRessNumber(){
    new SignUpButtonTest().SingUpButtonTest();
    new BasicInfoPage().redressNo.sendKeys(ConfigReader.getProperty("RedRessNumber"));

        // assert?

    }
    @Test
    public void invalidRedRessNumber(){
        new SignUpButtonTest().SingUpButtonTest();
        new BasicInfoPage().redressNo.sendKeys(ConfigReader.getProperty("invalidRedRessNumber"));

        // assert?

    }

    //@Test
   // public void LegalGuardianChkBox(){
    //  new SignUpButtonTest().SingUpButtonTest();
     //  new BasicInfoPage().legalGuardian.click();

        // assert?

   // }
    @Test
    public void verifyBusinessOwnerChkBox(){
     new SignUpButtonTest().SingUpButtonTest();
       new BasicInfoPage().businessOwnerCheckButton.click();

        Assert.assertTrue(new BasicInfoPage().businessOwnerCheckButton.isSelected());


    }







}
