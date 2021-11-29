package tests;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.*;
import utilities.CSVReader;
import utilities.Driver;
import utilities.SeleniumUtils;


public class ShopHotelsTest extends TestBase{

    Actions actions = new Actions(Driver.getDriver());
    ShopHotelsPage shopHotelsPage;




    @Test (groups={"smokeTest"})

    public void verifyShopHotelsButton() {
        logger.info("Verifying that Shop Hotels Button is available.");
        new ShopHotelsPage().shopHotelButtonClick();
        Assert.assertTrue(new ShopHotelsPage().shopHotelButton.isDisplayed());
       SeleniumUtils.switchToWindow("Delta - Deals & Discounts for Hotel Reservations from Luxury Hotels to Budget Accommodations");
        logger.info("Test Passed");
    }


    @Test (dataProvider = "getData")
    public void validDestination(String hotelDestination){
       verifyShopHotelsButton();
       new ShopHotelsPage().destination.sendKeys(hotelDestination);
        String pageSource = Driver.getDriver().getPageSource();
        String destination = new ShopHotelsPage().destination.getText();
        Assert.assertTrue(pageSource.contains(destination));

    }

    @DataProvider
    public Object[][] getData(){

        return CSVReader.readFromCSV("destination.csv");
    }

    @Test
    public void invalidDestination(){
       verifyShopHotelsButton();
        shopHotelsPage=new ShopHotelsPage();
        shopHotelsPage.destination.clear();
        shopHotelsPage.searchButtonClick();
        String pageSource = Driver.getDriver().getPageSource();
        String emptyDestination = new ShopHotelsPage().errorMsg.getText();

        Assert.assertTrue(pageSource.contains(emptyDestination));

    }

//    @Test
//    public void selectCheckInDate() throws InterruptedException {
//        new ShopHotelsTest().verifyShopHotelsButton();
//        shopHotelsPage=new ShopHotelsPage();
//        shopHotelsPage.check_in.click();
//        actions.click(new ShopHotelsPage().check_in_date).sendKeys(Keys.RIGHT,Keys.ARROW_DOWN).perform();
//
//        Thread.sleep(5000);
//


//        new ShopHotelsPage().check_in.click();
//        new ShopHotelsPage().check_in_date.click();
  //  }

//    @Test
//    public void selectCheckOutDate() throws InterruptedException {
//        new ShopHotelsTest().verifyShopHotelsButton();
//       new ShopHotelsPage().check_out.click();
//        actions.click(new ShopHotelsPage().check_out_date).sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.RIGHT,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.RIGHT).perform();
//        Thread.sleep(5000);


      //  new ShopHotelsPage().check_out.click();
      //  new ShopHotelsPage().check_out_date.click();



  //  }
//    @Test
//    public void verifyNumOfNights() throws InterruptedException {
//       verifyShopHotelsButton();
//       selectCheckInDate();
//       selectCheckOutDate();
//  ;
//        String pageSource = Driver.getDriver().getPageSource();
//        String numOfNights = new ShopHotelsPage().num_nights.getText();
//        System.out.println(numOfNights);
//       // Assert.assertTrue(pageSource.contains(numOfNights));
//
//    }
@Test
    public void roomOptions() {
    verifyShopHotelsButton();
    Select roomOption1 = new Select(new ShopHotelsPage().roomsOption);
    roomOption1.selectByIndex(2);
    String pageSource = Driver.getDriver().getPageSource();
    String roomChoice = new ShopHotelsPage().roomsOption.getText();
    Assert.assertTrue(pageSource.contains(roomChoice));

}



@Test
public void selectNumOfAdultsInRoom()  {
    roomOptions();
    shopHotelsPage=new ShopHotelsPage();

    Select adults = new Select(shopHotelsPage.adultInRoom);
   String numOfAdults= adults.getFirstSelectedOption().getText().trim();

    Assert.assertEquals("2",numOfAdults);


}


    @Test
    public void selectNumOfChildrenRoom() throws InterruptedException {

        new ShopHotelsTest().roomOptions();
        shopHotelsPage=new ShopHotelsPage();
        Select children = new Select(shopHotelsPage.childrenInRoom);
        String numOfchildren = children.getFirstSelectedOption().getText().trim();
         Assert.assertEquals("0",numOfchildren);

    }


        @Test
        public void verifySearchButton(){
            new ShopHotelsTest().verifyShopHotelsButton();
            new ShopHotelsPage().searchButtonClick();
            Assert.assertTrue(new ShopHotelsPage().searchButton.isEnabled());

        }

    }
