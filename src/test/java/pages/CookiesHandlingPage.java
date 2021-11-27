package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CookiesHandlingPage {

    public CookiesHandlingPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[@class='cookie-close-icon float-right circle-outline']")

    public WebElement cookiesRejectButton;

    public void click() {
        cookiesRejectButton.click();

    }
}
