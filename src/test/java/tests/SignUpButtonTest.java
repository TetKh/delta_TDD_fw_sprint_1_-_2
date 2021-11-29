package tests;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.*;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.SeleniumUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class SignUpButtonTest extends TestBase {



    public void SingUpButtonTest() {

        new SingUpButtonPage().signButtonClick();
        Assert.assertEquals(Driver.getDriver().getTitle(), "Join SkyMiles® Loyalty Program : Delta Air Lines");
        //new CookiesHandlingPage().cookiesRejectButton.click();
    }

    // BASIC INFO TEST
    @Test
    public void verifyPrefixDropDown() {
        new SignUpButtonTest().SingUpButtonTest();
        new BasicInfoPage().prefix.sendKeys(Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.DOWN);

        String prefix = new BasicInfoPage().prefix.getText();
        String pageSource = Driver.getDriver().getPageSource();
        Assert.assertTrue(pageSource.contains(prefix));


    }

    @Test
    public void validFullNameCredentials() {
        new SignUpButtonTest().SingUpButtonTest();
        new BasicInfoPage().validCredentials();
        String lastName = new BasicInfoPage().lastName.getText();
        String pageSource = Driver.getDriver().getPageSource();
        Assert.assertTrue(pageSource.contains(lastName));


    }

    @Test
    public void invalidFullNameCredentials() {
        new SignUpButtonTest().SingUpButtonTest();
        new BasicInfoPage().invalidCredentials();
        String invalidName = new BasicInfoPage().invalidName.getText();
        String pageSource = Driver.getDriver().getPageSource();
        Assert.assertTrue(pageSource.contains(invalidName));

    }

    @Test
    public void verifySuffixDropDown() {
        new SignUpButtonTest().SingUpButtonTest();
        new BasicInfoPage().suffix.sendKeys(Keys.DOWN, Keys.DOWN, Keys.DOWN);
        String suffix = new BasicInfoPage().suffix.getText();
        String pageSource = Driver.getDriver().getPageSource();
        Assert.assertTrue(pageSource.contains(suffix));

    }

    @Test
    public void verifyGenderDropDown() {
        new SignUpButtonTest().SingUpButtonTest();
        new BasicInfoPage().gender.sendKeys(Keys.DOWN, Keys.DOWN, Keys.ENTER);
        String gender = new BasicInfoPage().gender.getText();
        String pageSource = Driver.getDriver().getPageSource();
        Assert.assertTrue(pageSource.contains(gender));
    }


    @Test
    public void validDOBinfo() {
        new SignUpButtonTest().SingUpButtonTest();
        new BasicInfoPage().validDOB();
        String dob = new BasicInfoPage().monthOB.getText();
        String pageSource = Driver.getDriver().getPageSource();
        Assert.assertTrue(pageSource.contains(dob));


    }

    @Test
    public void invalidDOBinfo() {
        new SignUpButtonTest().SingUpButtonTest();
        new BasicInfoPage().invalidDOB();
        String BirthDayWarning = new BasicInfoPage().monthOB.getText();
        String pageSource = Driver.getDriver().getPageSource();
        Assert.assertTrue(pageSource.contains(BirthDayWarning));

    }


    @Test
    public void validKnownTravelerNumber() {
        new SignUpButtonTest().SingUpButtonTest();
        new BasicInfoPage().travelNo.sendKeys(ConfigReader.getProperty("KnownTravelerNumber"));
        String travelerNumber = new BasicInfoPage().travelNo.getText();
        String pageSource = Driver.getDriver().getPageSource();
        Assert.assertTrue(pageSource.contains(travelerNumber));


    }

    //    @Test
//    public void invalidKnownTravelerNumber(){
//        new SignUpButtonTest().SingUpButtonTest();
//        new BasicInfoPage().travelNo.sendKeys(ConfigReader.getProperty("invalidKnownTravelerNumber"));
//        String travelNoText=  new BasicInfoPage().invalidTravelNo.getText();
//        String pageSource = Driver.getDriver().getPageSource();
//        Assert.assertFalse(pageSource.contains(travelNoText));
//    }
    @Test
    public void validRedRessNumber() {
        new SignUpButtonTest().SingUpButtonTest();
        new BasicInfoPage().redressNo.sendKeys(ConfigReader.getProperty("RedRessNumber"));
        String redRessNo = new BasicInfoPage().redressNo.getText();
        String pageSource = Driver.getDriver().getPageSource();
        Assert.assertTrue(pageSource.contains(redRessNo));

    }

    @Test
    public void invalidRedRessNumber() {
        new SignUpButtonTest().SingUpButtonTest();
        new BasicInfoPage().redressNo.sendKeys(ConfigReader.getProperty("invalidRedRessNumber"));
        String invalidRedRessNo = new BasicInfoPage().invalidRedressNo.getText();
        String pageSource = Driver.getDriver().getPageSource();
        Assert.assertTrue(pageSource.contains(invalidRedRessNo));


    }

    @Test
    public void verifyBusinessOwnerChkBox() {
        new SignUpButtonTest().SingUpButtonTest();
        new BasicInfoPage().businessOwnerCheckButton.click();
        Assert.assertTrue(new BasicInfoPage().businessOwnerCheckButton.isSelected());


    }

    // COMPLETE BUTTON TEST
    @Test
    public void completeButton() {
        new SignUpButtonTest().SingUpButtonTest();
        new CompleteButtonPage().completeButton.click();
        Assert.assertTrue(new CompleteButtonPage().completeButton.isEnabled());
    }


// CONTACT INFO TESTS

    @Test
    public void verifyCountryRegionDropDown() {
        new SignUpButtonTest().SingUpButtonTest();
        new ContactInfoPage().countryRegion.sendKeys(Keys.DOWN, Keys.ENTER);
        String answer = new ContactInfoPage().countryRegion.getText();
        String pageSource = driver.getPageSource();
        Assert.assertTrue(pageSource.contains(answer));

    }

    @Test
    public void verifyAddressTypeDropDown() {
        new SignUpButtonTest().SingUpButtonTest();
        new ContactInfoPage().addressType.sendKeys(Keys.DOWN, Keys.ENTER);
        String answer = new ContactInfoPage().addressType.getText();
        String pageSource = driver.getPageSource();
        Assert.assertTrue(pageSource.contains(answer));

    }

    @Test
    public void validAddressCredentials() {
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
    public void invalidAddressCredentials() {
        new SignUpButtonTest().SingUpButtonTest();
        new ContactInfoPage().scrollWindow();
        new ContactInfoPage().invalidAddressInfo();
        String answer = new ContactInfoPage().warning.getText();
        String pageSource = driver.getPageSource();
        Assert.assertTrue(pageSource.contains(answer));


    }


    @Test
    public void verifyCountryRegionCodeDropDown() {
        new SignUpButtonTest().SingUpButtonTest();
        new ContactInfoPage().countryRegionCode.sendKeys(Keys.ENTER);
        String answer = new ContactInfoPage().countryRegion.getText();
        String pageSource = driver.getPageSource();
        System.out.println(answer);
        Assert.assertTrue(pageSource.contains(answer));


    }

    // EMAIL PREFERENCE TEST

    @Test
    public void verifyEmailPreferenceSelectButton() {

        new SignUpButtonTest().SingUpButtonTest();
        new EmailPreferencesPage().emailPreferenceSelectButton.click();
        SeleniumUtils.waitFor(2);
        String expected = "SELECTED";
        String pageSource = Driver.getDriver().getPageSource();
        Assert.assertTrue(pageSource.contains(expected));

//      String expected = "✓ SELECTED";
//      String actual = new EmailPreferencesPage().emailPreferenceSelectButton.getText();
//      Assert.assertEquals(actual,expected);


    }

    // LANGUAGE PREFERANCE TEST
    @Test
    public void verifySelectLanguageDropDown() {
        new SignUpButtonTest().SingUpButtonTest();
        new LanguagePreferencePage().scrollWindow();
        new LanguagePreferencePage().selectLanguage.sendKeys(Keys.DOWN, Keys.ENTER);
        String language = new LanguagePreferencePage().selectLanguage.getText();
        String pageSource = Driver.getDriver().getPageSource();
        Assert.assertTrue(pageSource.contains(language));

    }
}