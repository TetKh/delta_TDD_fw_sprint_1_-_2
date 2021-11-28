package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class NeepCenterPage {

    public NeepCenterPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "headSectab3")
    public WebElement needHelpLink;

    @FindBy(xpath = "//a [@href=\"/us/en/need-help/overview']" )
    public WebElement helpCenter;



}
