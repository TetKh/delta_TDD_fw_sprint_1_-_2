package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class EmailPreferencesPage {
    public EmailPreferencesPage(){PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy (id = "newsOffersUpdate")
    public WebElement emailPreferenceSelectButton;

}
