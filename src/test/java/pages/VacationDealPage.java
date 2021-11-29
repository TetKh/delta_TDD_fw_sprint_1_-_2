package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class VacationDealPage {
    public VacationDealPage() {PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(linkText = "VACATION DEALS")
    public WebElement vacationDealsButton;

    @FindBy(linkText = "Join for free today.")
    public WebElement joinSkyMiles_forfree;






    @FindBy (xpath = "//button[@class='cta cta-strong']")
    public WebElement searchButton;





    public void vacationDealsButtonClick(){
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click()", vacationDealsButton);

    }

    public void searchButtonClick(){
        new VacationDealPage().searchButton.click();
    }




}
