package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LanguagePreferencePage {

    public LanguagePreferencePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(id="language-button")
    public WebElement selectLanguage;


    public void scrollWindow(){

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,1000)", "");
    }




}
