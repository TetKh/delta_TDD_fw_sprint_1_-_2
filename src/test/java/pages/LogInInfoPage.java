package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

import java.security.Key;

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

    @FindBy(xpath= "//a[@id='usrNmtooltip']")
    public WebElement questionMarkUser;


    @FindBy(xpath= "//div[@id='aToolTip']//div[@class='tooltipContent']")
    public WebElement questionMarkTest;


    @FindBy(xpath = "//div[@class='passwordRules passwordRulesLeft']")
    public WebElement question;

    @FindBy(xpath = "//label[@class='floLeft errIcon']")
    public WebElement invalidLogInfoMessage;

    @FindBy(xpath = "//label[@id='requiredEqualTo-error']")
    public WebElement invalidConfirmPasswordMessage;
    //span[@id='basicInfoQuestionId1-button'][.='What is the name of your first pet?']

    @FindBy(xpath = "//span[@id='basicInfoQuestionId1-button'][.='What is the name of your first pet?']")
    public WebElement questionOneSelection;

    @FindBy(xpath = "//span[@id='basicInfoQuestionId2-button']")
    public WebElement questionSecondSelection;


    public void correctInformation(){
        userName.sendKeys(ConfigReader.getProperty("username"));
        password.sendKeys(ConfigReader.getProperty("password"));
        //confirmPassword.sendKeys(ConfigReader.getProperty("password"), Keys.TAB);
        confirmPassword.sendKeys(ConfigReader.getProperty("password"),Keys.TAB);
    }

    public void ExistingInformation(){
        userName.sendKeys(ConfigReader.getProperty("username1"));
        password.sendKeys(ConfigReader.getProperty("password"));
        confirmPassword.sendKeys(ConfigReader.getProperty("password"));
    }

    public void incorrectInformation(){
        userName.sendKeys(ConfigReader.getProperty("invalidUsername"));
        password.sendKeys(ConfigReader.getProperty("invalidPassword"));
        confirmPassword.sendKeys(ConfigReader.getProperty("invalidPassword"));
    }

    public void invalidConfirmPassword(){
        userName.sendKeys(ConfigReader.getProperty("username"));
        password.sendKeys(ConfigReader.getProperty("password"));
        confirmPassword.sendKeys(ConfigReader.getProperty("invalidPassword"),Keys.ENTER);

    }
     public void scrollWindow(){

    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
    js.executeScript("window.scrollBy(0,700)", "");
}

}
