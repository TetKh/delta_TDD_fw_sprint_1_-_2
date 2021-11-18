package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CompleteButtonPage {
    public CompleteButtonPage(){ PageFactory.initElements(Driver.getDriver(), this); }
@FindBy (id = "next")
    public WebElement completeButton;

}
