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

public class LoginInfoTest extends TestBase {


    @Test
    public void enterValidCredentials() throws InterruptedException {

        new SignUpButtonTest().SingUpButtonTest();
        new LogInInfoPage().scrollWindow();
        new LogInInfoPage().correctInformation();
//        Thread.sleep(1000);
//        String pageSource = Driver.getDriver().getCurrentUrl();
//        Assert.assertTrue(pageSource.contains(new LogInInfoPage().checkmarks1.getText()));
//        Assert.assertTrue(pageSource.contains(new LogInInfoPage().checkmarks2.getText()));
 }

    @Test
    public void enterExistingCredentials() {

        new SignUpButtonTest().SingUpButtonTest();
        new LogInInfoPage().scrollWindow();
        new LogInInfoPage().ExistingInformation();
        String pageSource = Driver.getDriver().getCurrentUrl();
        String expected = "Whoops! A unique username is required for each account.";
        //System.out.println(new LogInInfoPage().warning.getText());
        Assert.assertTrue(pageSource.contains(new LogInInfoPage().warning.getText()));
        //Assert.assertEquals(new LogInInfoPage().warning.getText(),expected);

    }

    @Test
    public void enterInvalidCredentials() {

        new SignUpButtonTest().SingUpButtonTest();
        new LogInInfoPage().scrollWindow();
        new LogInInfoPage().incorrectInformation();

    }

    @Test
    public void verifyFirstQuestionDropDown(){

        new SignUpButtonTest().SingUpButtonTest();
        new LogInInfoPage().scrollWindow();
        new LogInInfoPage().question1.click();

  //String str = new LogInInfoPage().chooseFirstQuestion.getText();
//    Select select = new Select(new LogInInfoPage().question1);
//    select.selectByVisibleText(str);
  //System.out.println(str);

//    Actions actions = new Actions(Driver.getDriver());
//    actions.sendKeys(new LogInInfoPage().chooseFirstQuestion, Keys.ENTER).build().perform();

        new LogInInfoPage().answer1.sendKeys("Brown");
    }
    @Test
    public void verifySecondQuestionDropDown() {

        new SignUpButtonTest().SingUpButtonTest();
        new LogInInfoPage().scrollWindow();
        new LogInInfoPage().question2.click();

        //still need to select question
        new LogInInfoPage().answer2.sendKeys("depend on the question");

    }

    @Test
    public void checkQuestionMark() {
        new SignUpButtonTest().SingUpButtonTest();
        new LogInInfoPage().scrollWindow();
        new LogInInfoPage().questionMark.click();
    }

}
