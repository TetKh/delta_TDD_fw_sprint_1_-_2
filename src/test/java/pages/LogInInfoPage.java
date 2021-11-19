package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class LogInInfoPage {
    public LogInInfoPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }



    @FindBy(id = "basicInfoUserName")
    public WebElement userName;

    @FindBy(id = "basicInfoPassword")
    public WebElement password;

    @FindBy(id = "requiredEqualTo")
    public WebElement confirmPassword;

    @FindBy(id = "basicInfoQuestionId1-button")
    public WebElement question1;

    @FindBy(id = "basicInfoAnswer1")
    public WebElement answer1;

    @FindBy(id = "basicInfoQuestionId2-button")
    public WebElement question2;

    @FindBy(id = "basicInfoAnswer2")
    public WebElement answer2;

    @FindBy(xpath = "//span[@class='ui-selectmenu-button ui-widget ui-state-default ui-corner-all'][.='What is the name of the first school you attended?']")
    public WebElement chooseFirstQuestion;

    @FindBy(xpath = "//div[@class='succsssPwdImg hideInitially'][1]")
    public WebElement checkmarks1;

    @FindBy(xpath = "//div[@class='succsssPwdImg hideInitially'][2]")
    public WebElement checkmarks2;

    @FindBy(id= "divErr1073")
    public WebElement warning;

    @FindBy(xpath= "//a[@id='pwdToolTip']")
    public WebElement questionMark;

@Test
    public void correctInformation(){
        userName.sendKeys(ConfigReader.getProperty("username"));
        password.sendKeys(ConfigReader.getProperty("password"));
        confirmPassword.sendKeys(ConfigReader.getProperty("password"));
    }
    @Test
    public void ExistingInformation(){
        userName.sendKeys(ConfigReader.getProperty("username1"));
        password.sendKeys(ConfigReader.getProperty("password"));
        confirmPassword.sendKeys(ConfigReader.getProperty("password"));
    }
   @Test
    public void incorrectInformation(){
        userName.sendKeys(ConfigReader.getProperty("invalidPassword"));
        password.sendKeys(ConfigReader.getProperty("invalidUsername"));
        confirmPassword.sendKeys(ConfigReader.getProperty("invalidUsername"));
    }

public void scrollWindow(){

    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
    js.executeScript("window.scrollBy(0,700)", "");
}

}
