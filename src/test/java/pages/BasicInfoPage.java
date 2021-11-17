package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BasicInfoPage {

    public BasicInfoPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "basicInfoTitle-button")
    public WebElement prefix;

    @FindBy(id = "basicInfoFirstName")
    public WebElement firstName;

    @FindBy (id = "basicInfoMiddleName")
    public WebElement middleName;

    @FindBy (id= "basicInfoLastName")
    public WebElement lastName;

    @FindBy(id = "basicInfoSuffix-button")
    public WebElement suffix;

    @FindBy(id = "basicInfoGender-button")
    public WebElement gender;

    @FindBy(id = "basicInfoMob-button")
    public WebElement MonthOB;

    @FindBy(id = "basicInfoDob-button")
    public WebElement DateOB;

    @FindBy(id = "basicInfoYob-button")
    public WebElement YearOB;

    @FindBy(id = "basicInfoTravelerNo")
    public WebElement TravelNo;

    @FindBy(id = "basicInfoRedress")
    public WebElement RedressNo;

    @FindBy(id = "bOwnerChkBox-1")
    public WebElement BusinessOwnerCheckButton;








}
