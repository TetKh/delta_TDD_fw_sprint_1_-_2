package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

public class SearchOptionsPage {

    public SearchOptionsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//label[text()= 'Shop with Miles']" )
    public WebElement searchOption1;

    @FindBy(xpath = "//label[text()= 'Refundable Fares']" )
    public WebElement searchOption2;

    @FindBy(xpath = "//label[text()= 'My dates are flexible']" )
    public WebElement searchOption3;

    @FindBy(xpath = "//a[@class = 'icon-help booking-help circle-outline searchOptionHelpIcon order-2']" )
    public WebElement searchOption1QuestionButton;

    @FindBy(xpath = "//a[@class= 'icon-help booking-help circle-outline searchOptionHelpIcon order-2 ng-star-inserted']" )
    public WebElement searchOption2QuestionButton;

    @FindBy(id = "modal-title" )
    public WebElement searchOption1HelpTab;

    @FindBy(id = "modal-title" )
    public WebElement searchOption2HelpTab;

    @FindBy(xpath = "//button[@type='button']")
    public WebElement searchOption1CloseButton;

    @FindBy(xpath = "//button[@type='button']")
    public WebElement searchOption2CloseButton;


    @FindBy(xpath = "//a[text() = 'FAQs']" )
    public WebElement FQATab;

    @FindBy(xpath = "//a[text() = 'cancel or refund flights']" )
    public WebElement cancelOrRefundTab;

    @FindBy(xpath = "//a[text() = 'Basic Economy fares']" )
    public WebElement basicEconomyTab;

    @FindBy(xpath = "//a[text() = 'Risk-Free Cancellation']" )
    public WebElement riskFreeCancellationTab;

    @FindBy(xpath = "//b[text() = 'change and cancellation policy here']" )
    public WebElement changeAndCancellationPolicyTab;


}
