package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tests.TestBase;
import utilities.Driver;

public class ContactInfoPage extends TestBase {

    public ContactInfoPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "countryCode-1-button")
    public WebElement countryRegion;

    @FindBy(id = "aType-1-button")
    public WebElement addressType;

    @FindBy(id = "addr1-1")
    public WebElement addressLine1;

    @FindBy (id = "addr2-1")
    public WebElement addressLine2;

    @FindBy (name= "customerDo.addresses[0].addressLine4")
    public WebElement city;

    @FindBy(id = "stateProv-1-button")
    public WebElement stateProvince;

    @FindBy(id = "postal-1")
    public WebElement postalCode;

    @FindBy(xpath = "phoneCountryCode-button")
    public WebElement countryRegionCode;

    @FindBy(id = "phoneAreaCode")
    public WebElement areaCode;

    @FindBy(id = "requiredPhoneNumber")
    public WebElement phoneNo;

    @FindBy(id = "basicInfoEmailAddress")
    public WebElement email;

    @FindBy(id = "requiredEmail2")
    public WebElement confirmEmail;

    @FindBy(id = "basicInfoTravelerNo")
    public WebElement travelNo;


}
