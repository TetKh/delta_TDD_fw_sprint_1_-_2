package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

public class ContactInfoPage {

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

    @FindBy(id = "phoneCountryCode-button")
    public WebElement countryRegionCode;

    @FindBy(id = "requiredAreacode")
    public WebElement areaCode;

    @FindBy(id = "requiredPhoneNumber")
    public WebElement phoneNo;

    @FindBy(id = "basicInfoEmailAddress")
    public WebElement email;

    @FindBy(id = "requiredEmail2")
    public WebElement confirmEmail;

    @FindBy(id = "basicInfoTravelerNo")
    public WebElement travelNo;

    @FindBy (id="primaryAreaCode_label")
    public WebElement warning;

    public void scrollWindow(){

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,500)", "");
    }

    public void validAddressInfo(){

        Faker faker= new Faker();

        new ContactInfoPage().addressLine1.sendKeys(faker.address().streetAddress());
        new ContactInfoPage().addressLine2.sendKeys(faker.address().streetAddressNumber());
        new ContactInfoPage().city.sendKeys(faker.address().city());
        new ContactInfoPage().postalCode.sendKeys(faker.address().zipCode());
        new ContactInfoPage().countryRegionCode.sendKeys(Keys.ENTER);
        new ContactInfoPage().areaCode.sendKeys("917");
        new ContactInfoPage().phoneNo.sendKeys(faker.phoneNumber().phoneNumber());
        new ContactInfoPage().email.sendKeys(ConfigReader.getProperty("email"));
        new ContactInfoPage().confirmEmail.sendKeys(ConfigReader.getProperty("email"));
    }

    public void invalidAddressInfo(){
        Faker faker=new Faker();
        addressLine1.sendKeys(faker.phoneNumber().cellPhone());
        addressLine2.sendKeys(faker.address().firstName());
        city.sendKeys(faker.address().zipCode());
        postalCode.sendKeys(faker.phoneNumber().subscriberNumber(19));
        countryRegionCode.sendKeys("zoo");
        areaCode.sendKeys("ABC");
        phoneNo.sendKeys(faker.phoneNumber().subscriberNumber());
        email.sendKeys(ConfigReader.getProperty("fakeEmail"));
        confirmEmail.sendKeys(ConfigReader.getProperty("fakeEmail2"));
    }

}
