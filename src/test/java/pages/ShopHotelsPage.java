package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import utilities.CSVReader;
import utilities.ConfigReader;
import utilities.Driver;

public class ShopHotelsPage {
    public ShopHotelsPage() {PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(linkText = "SHOP HOTELS")
    public WebElement shopHotelButton;

   @FindBy(name = "q-destination")
   public WebElement destination;

   @FindBy (xpath = "//div[@class='form-error']")
   //(xpath = "//span[.='Please tell us the destination, hotel or landmark you’re looking for']")
public WebElement errorMsg;


   @FindBy(id ="widget-query-label-1")
   public WebElement check_in;

   @FindBy (xpath = "//td[@class='widget-datepicker-weekend']")
   public WebElement check_in_date;

    @FindBy(id ="widget-query-label-3")
    public WebElement check_out;

    @FindBy (xpath = "//td[@class='widget-datepicker-weekend']")
    public WebElement check_out_date;

    @FindBy(xpath = "//span[@class='widget-query-num-nights']")
    public WebElement num_nights;

    @FindBy (xpath = "//select[@id='qf-0q-compact-occupancy']")
    public WebElement roomsOption;

    @FindBy(xpath = "//select[@name='q-rooms']")
    public WebElement rooms;

    @FindBy (xpath = "//button[@class='cta cta-strong']")
    public WebElement searchButton;

    @FindBy (xpath = "//select[@name='q-room-0-adults']")
    public WebElement adultInRoom;


    @FindBy (xpath = "//select[@name='q-room-0-children']")
    public WebElement childrenInRoom;




    public void shopHotelButtonClick(){
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click()", shopHotelButton);

    }

    public void searchButtonClick(){
        new ShopHotelsPage().searchButton.click();
    }






}
