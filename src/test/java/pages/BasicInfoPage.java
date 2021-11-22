package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;

public class BasicInfoPage {

    public BasicInfoPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "basicInfoTitle-button")
    public WebElement prefix;

    @FindBy (xpath = "//li[@class='ui-menu-item']")
    public List<WebElement> prefixSelection;

    @FindBy(id = "basicInfoFirstName")
    public WebElement firstName;

    @FindBy(xpath = "//label[contains(text(),'*FIRST NAME')]")
    public WebElement invalidName;

    @FindBy (id = "basicInfoMiddleName")
    public WebElement middleName;

    @FindBy (id= "basicInfoLastName")
    public WebElement lastName;

    @FindBy(id = "basicInfoSuffix-button")
    public WebElement suffix;

    @FindBy(id = "basicInfoGender-button")
    public WebElement gender;

    @FindBy(xpath = "//div[@class='ui-selectmenu-menu ui-front ui-selectmenu-open']")
    public WebElement listOfGenders;

    @FindBy(id = "basicInfoMob-button")
    public WebElement monthOB;

    @FindBy(id = "basicInfoDob-button")
    public WebElement dateOB;

    @FindBy(id = "basicInfoYob-button")
    public WebElement yearOB;

    @FindBy (xpath = "//legend[@class='errIcon']")
    public WebElement BirthDayWarning;

    @FindBy(id = "basicInfoTravelerNo")
    public WebElement travelNo;
    @FindBy(xpath = "//label[@class='knownTrvlNo errIcon']")
    public WebElement invalidTravelNo;

    @FindBy(id = "basicInfoRedress")
    public WebElement redressNo;

    @FindBy(xpath = "//label[contains(text(),'REDRESS NUMBER')]")
    public WebElement invalidRedressNo;

    @FindBy(id ="childEnrollChkBox")
    public  WebElement legalGuardian;

    @FindBy(id = "bOwnerChkBox-1")
    public WebElement businessOwnerCheckButton;

    public  void validCredentials(){
        firstName.sendKeys(ConfigReader.getProperty("firstName"));
        middleName.sendKeys(ConfigReader.getProperty("middleName"));
        lastName.sendKeys(ConfigReader.getProperty("lastName"));

    }
    public  void invalidCredentials(){
        firstName.sendKeys(ConfigReader.getProperty("invalidFirstName"));
        middleName.sendKeys(ConfigReader.getProperty("invalidMiddleName"));
        lastName.sendKeys(ConfigReader.getProperty(""));


    }

    public void validDOB(){
    monthOB.sendKeys(Keys.DOWN, Keys.DOWN, Keys.DOWN,Keys.ENTER);
     dateOB.sendKeys(Keys.DOWN, Keys.DOWN,Keys.ENTER);
      yearOB.sendKeys(ConfigReader.getProperty("yearOB"));
    }
    public void invalidDOB(){
        monthOB.sendKeys(Keys.ENTER);
       dateOB.sendKeys(Keys.ENTER);
       yearOB.sendKeys(Keys.ENTER);
    }








}
