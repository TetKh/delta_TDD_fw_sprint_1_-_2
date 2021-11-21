package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LogInInfoPage;
import utilities.ConfigReader;
import utilities.Driver;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LoginInfoTest extends TestBase {

    //String pageSource = Driver.getDriver().getPageSource();

    @Test
    public void enterValidCredentials() throws InterruptedException {

        new SignUpButtonTest().SingUpButtonTest();
        new LogInInfoPage().scrollWindow();
        new LogInInfoPage().correctInformation();
        String pageSource = Driver.getDriver().getPageSource();
        String markOne = new LogInInfoPage().checkmarks1.getText();
        //String markTwo = new LogInInfoPage().checkmarks2.getText();
        //List<String> elements = new ArrayList<>(Arrays.asList(markOne,markTwo));
        //for (String element : elements)
            Assert.assertTrue(pageSource.contains(markOne));
 }

    @Test
    public void enterExistingCredentials() {

        new SignUpButtonTest().SingUpButtonTest();
        new LogInInfoPage().scrollWindow();
        new LogInInfoPage().ExistingInformation();
        String onTheWeb =  new LogInInfoPage().warning.getText();
        String pageSource = Driver.getDriver().getPageSource();
        Assert.assertTrue(pageSource.contains(onTheWeb));
    }

    @Test
    public void enterInvalidCredentials() {

        new SignUpButtonTest().SingUpButtonTest();
        new LogInInfoPage().scrollWindow();
        new LogInInfoPage().incorrectInformation();
        String pageSource = Driver.getDriver().getPageSource();
        String inValidMessage = new LogInInfoPage().invalidLogInfoMessage.getText();
        Assert.assertTrue(pageSource.contains(inValidMessage));
    }
    @Test(groups={"regressionTest"})
    public void enterInvalidConfirmPassword(){

        new SignUpButtonTest().SingUpButtonTest();
        new LogInInfoPage().scrollWindow();
        new LogInInfoPage().invalidConfirmPassword();
        String pageSource = Driver.getDriver().getPageSource();
        String inValidConPassMessage = new LogInInfoPage().invalidConfirmPasswordMessage.getText();
        Assert.assertTrue(pageSource.contains(inValidConPassMessage));
    }

    @Test(groups={"regressionTest"})
    public void verifyFirstQuestionDropDown(){

        new SignUpButtonTest().SingUpButtonTest();
        new LogInInfoPage().scrollWindow();
        new LogInInfoPage().question1.click();
        new LogInInfoPage().question1.sendKeys(Keys.DOWN,Keys.DOWN,Keys.ENTER);

        String selectQuestionOne =  new LogInInfoPage().questionOneSelection.getText();
        String pageSource = Driver.getDriver().getPageSource();
        Assert.assertTrue(pageSource.contains(selectQuestionOne));
        //System.out.println(selectQuestionOne);


        new LogInInfoPage().answer1.sendKeys(ConfigReader.getProperty("answer#1"));
    }
    @Test(groups={"regressionTest"})
    public void verifySecondQuestionDropDown() {

        new SignUpButtonTest().SingUpButtonTest();
        new LogInInfoPage().scrollWindow();
        new LogInInfoPage().question2.sendKeys(Keys.DOWN,Keys.DOWN,Keys.DOWN,Keys.DOWN,Keys.ENTER);

        String selectQuestionTwo =  new LogInInfoPage().questionSecondSelection.getText();
        String pageSource = Driver.getDriver().getPageSource();
        Assert.assertTrue(pageSource.contains(selectQuestionTwo));
        //System.out.println(selectQuestionTwo);
        new LogInInfoPage().answer2.sendKeys(ConfigReader.getProperty("answer#2"));
    }

    @Test(groups={"regressionTest"})
    public void checkQuestionMarkUser() {
        new SignUpButtonTest().SingUpButtonTest();
        new LogInInfoPage().scrollWindow();
        new LogInInfoPage().questionMarkUser.click();
        String pageSource = Driver.getDriver().getPageSource();
        List<String> elements = new ArrayList<>(Arrays.asList("Must contain","At least 6 characters","At least 1 letter",
        "Cannot contain","Username already in use","Email address","Special characters"));
        for(String element : elements)
        Assert.assertTrue(pageSource.contains(element));
    }

}
