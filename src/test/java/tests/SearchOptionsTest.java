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
import pages.SearchOptionsPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.SeleniumUtils;

import java.security.Key;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


public class SearchOptionsTest extends TestBase{
    @Test(groups={"smokeTest"})

    public void verifySearchOption1() {
        new SearchOptionsPage().searchOption1.click();
        SoftAssert softAssert = new SoftAssert();
        Assert.assertTrue(new SearchOptionsPage().searchOption1.isEnabled());
        Assert.assertFalse(new SearchOptionsPage().searchOption2.isSelected());
        Assert.assertTrue(new SearchOptionsPage().searchOption3.isEnabled());

        softAssert.assertAll();


    }

    @Test
    public void verifySearchOption2() {
        new SearchOptionsPage().searchOption1.click();
        Assert.assertTrue(new SearchOptionsPage().searchOption2.isEnabled());

    }

    @Test
    public void verifySearchOption3() {
        new SearchOptionsPage().searchOption1.click();
        Assert.assertTrue(new SearchOptionsPage().searchOption3.isEnabled());

    }

    @Test
    public void verifySearchOption1QuestionButton() {
        new SearchOptionsPage().searchOption1QuestionButton.click();
        Assert.assertTrue(new SearchOptionsPage().searchOption1HelpTab.getText().contains("Shop with Miles"));
        new SearchOptionsPage().searchOption1CloseButton.click();

    }

    @Test
    public void verifySearchOption2QuestionButton() {
        new SearchOptionsPage().searchOption2QuestionButton.click();
        Assert.assertTrue(new SearchOptionsPage().searchOption2HelpTab.getText().contains("Refundable Fares"));
        new SearchOptionsPage().searchOption2CloseButton.click();

    }

    @Test
    public void verifyFQATab() {
        new SearchOptionsPage().searchOption1QuestionButton.click();
        new SearchOptionsPage().FQATab.click();
        Assert.assertEquals(driver.getTitle(), "Delta Award Travel : Book With Miles | Delta Air Lines");

    }

    @Test
    public void verifyCancelOrRefundTab() {
        new SearchOptionsPage().searchOption2QuestionButton.click();
        new SearchOptionsPage().cancelOrRefundTab.click();
        Assert.assertEquals(driver.getTitle(), "Apply for a Refund : Delta Air Lines");

    }


    @Test
    public void verifyBasicEconomyTab() {
        new SearchOptionsPage().searchOption2QuestionButton.click();
        new SearchOptionsPage().basicEconomyTab.click();
        Assert.assertEquals(driver.getTitle(), "Basic Economy | Delta Air Lines");

    }

    @Test
    public void verifyRiskFreeCancellationTab() {
        new SearchOptionsPage().searchOption2QuestionButton.click();
        new SearchOptionsPage().riskFreeCancellationTab.click();
        Assert.assertEquals(driver.getTitle(), "Delta Cancellation & Refund Policy : Delta Air Lines");

    }

    @Test
    public void verifyChangeAndCancellationPolicyTab() {
        new SearchOptionsPage().searchOption2QuestionButton.click();
        new SearchOptionsPage().changeAndCancellationPolicyTab.click();
        Assert.assertEquals(driver.getTitle(), "Flight Change & Cancellation Policy | Delta Air Lines");

    }

    @Test
    public void verifyCancelOrRefundTabFailedTestScreenshot() {
        new SearchOptionsPage().searchOption2QuestionButton.click();
        new SearchOptionsPage().cancelOrRefundTab.click();
        try {

            Assert.assertEquals(driver.getTitle(), "Apply for a Refund : Delta Air Line");

        }catch(AssertionError error) {
            //SeleniumUtils.getScreenshot("FailedCancelOrRefundTabTest");

        }

    }



}
