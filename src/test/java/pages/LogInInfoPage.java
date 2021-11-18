package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LogInInfoPage {
    public LogInInfoPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }



    @FindBy(id = "basicInfoUserName")
    public WebElement userName;

    @FindBy(id = "basicInfoPassword")
    public WebElement password;

    @FindBy(id = "requiredEqualTo")
    public WebElement confirmPassword;

    @FindBy(id = "basicInfoQuestionId1-button")
    public WebElement question1;

    @FindBy(id = "basicInfoAnswer1")
    public WebElement answer1;

    @FindBy(id = "basicInfoQuestionId2-button")
    public WebElement question2;

    @FindBy(id = "basicInfoAnswer2")
    public WebElement answer2;

}
