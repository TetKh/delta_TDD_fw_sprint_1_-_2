package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SingUpButtonPage {
    public SingUpButtonPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = " //a[@class='sign-up btn btn-link']")
    public WebElement SignUpButton;

    public void signButtonClick(){
    SignUpButton.click();
    }
}