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

    @FindBy(xpath = "//div[@class='ui-selectmenu-menu ui-front ui-selectmenu-open']")
    public WebElement listOfGenders;

    @FindBy(id = "basicInfoMob-button")
    public WebElement monthOB;

    @FindBy(id = "basicInfoDob-button")
    public WebElement dateOB;

    @FindBy(id = "basicInfoYob-button")
    public WebElement yearOB;

    @FindBy(id = "basicInfoTravelerNo")
    public WebElement travelNo;

    @FindBy(id = "basicInfoRedress")
    public WebElement redressNo;

    @FindBy(id ="childEnrollChkBox")
    public  WebElement legalGuardian;

    @FindBy(id = "bOwnerChkBox-1")
    public WebElement businessOwnerCheckButton;








}
