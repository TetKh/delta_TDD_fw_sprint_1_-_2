package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

public class LogInPage {
    public LogInPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[@class='login-btn btn btn-danger']")
    public WebElement logInButton;

    @FindBy(id = "userId")
    public WebElement userRow;

    @FindBy(id = "password")
    public WebElement passwordRow;

    @FindBy(xpath = "//button[@type=\"submit\"]")
    public WebElement redLogInButton;

    @FindBy(xpath = "//a [@class=\"continue-link\"]")
    public WebElement errorMessage;


    @FindBy(xpath = "//label[@for='persistentLogin_CheckBox']")
    public WebElement checkbox;

    @FindBy(xpath = "//input[@type='checkbox']")
    public WebElement checkboxChecked;




    @FindBy(xpath = "//a[@class='persistent-login-help icon-help circle-outline']")
    public WebElement questionMark;

    @FindBy(xpath = "//button[@class='btn btn-danger persistent-login-cta-btn']")
    public WebElement closeQuestionMark;

//    @FindBy(xpath = "//p[.='Use this option only on your own personal device to keep your account secure.']")
//            //"h2[.='Keep Me Logged In']")
//    public WebElement textFromQuestionMark;
//
     @FindBy(xpath = "//a [@href='/profile/enrolllanding.action']")
     public WebElement joinSkyMiles;

    @FindBy(xpath = "//a[@ href='/user-login/forgotLogin']")
    public WebElement forgotLogin;

    @FindBy(xpath = "//div[@class = 'd-flex flex-row forgotDiv']//a[@href='javascript:void(0);']")
    public WebElement forgotPassword;


    public void logInButtonClick() {
        new LogInPage().logInButton.click();


    }

    public void incorrectUserAndPasswordInfo() {

        Actions actions = new Actions(Driver.getDriver());

        actions.click(userRow).sendKeys(ConfigReader.getProperty("invalidUsername")).sendKeys(Keys.ARROW_DOWN).perform();
        actions.click(passwordRow).sendKeys(ConfigReader.getProperty("invalidPassword")).sendKeys(Keys.ENTER).perform();

    }
//    public void scrollWindow(){
//
//        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
//        js.executeScript("window.scrollBy(0,700)", "");
    //}

    public void joinSkyMilesButton() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click()", new LogInPage().joinSkyMiles);
    }
}
