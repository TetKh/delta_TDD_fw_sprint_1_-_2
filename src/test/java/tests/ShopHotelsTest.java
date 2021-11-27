package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import utilities.Driver;
import utilities.SeleniumUtils;

public class ShopHotelsTest extends TestBase{




    @Test(groups={"smokeTest"})

    public void verifyShopHotelsButton() {
       // new MainPageTest().mainPage();
        new ShopHotelsPage().shopHotelButtonClick();
        Assert.assertTrue(new ShopHotelsPage().shopHotelButton.isDisplayed());

       SeleniumUtils.switchToWindow("Delta - Deals & Discounts for Hotel Reservations from Luxury Hotels to Budget Accommodations");

    }
    @Test
    public void validDestination(){
        new ShopHotelsTest().verifyShopHotelsButton();
       new ShopHotelsPage().destination.sendKeys("Tokyo");
        String pageSource = Driver.getDriver().getPageSource();
        String destination = new ShopHotelsPage().destination.getText();
        Assert.assertTrue(pageSource.contains(destination));

    }
    @Test
    public void invalidDestination(){
        new ShopHotelsTest().verifyShopHotelsButton();
        new ShopHotelsPage().destination.sendKeys("89$%Україна");
        String pageSource = Driver.getDriver().getPageSource();
        String destination = new ShopHotelsPage().destination.getText();
        Assert.assertTrue(pageSource.contains(destination));


    }

    @Test
    public void selectCheckInDate()  {
        new ShopHotelsTest().verifyShopHotelsButton();
        new ShopHotelsPage().check_in.click();
        new ShopHotelsPage().check_in_date.click();


    }

    @Test
    public void selectCheckOutDate() {
        new ShopHotelsTest().verifyShopHotelsButton();
        new ShopHotelsPage().check_out.click();
        new ShopHotelsPage().check_out_date.click();



    }
    @Test
    public void verifyNumOfNights(){
        new ShopHotelsTest().verifyShopHotelsButton();
        new ShopHotelsPage().num_nights.getText();
        String pageSource = Driver.getDriver().getPageSource();
        String numOfNights = new ShopHotelsPage().num_nights.getText();
        Assert.assertTrue(pageSource.contains(numOfNights));

    }
@Test
    public void selectRooms() {
    new ShopHotelsTest().verifyShopHotelsButton();
    new ShopHotelsPage().rooms.sendKeys(Keys.DOWN,Keys.DOWN,Keys.DOWN, Keys.ENTER);
    String pageSource = Driver.getDriver().getPageSource();
    String roomChoice = new ShopHotelsPage().rooms.getText();
    Assert.assertTrue(pageSource.contains(roomChoice));
  //  SeleniumUtils.getScreenshot("screenshots/failed" + System.currentTimeMillis() + ".png");
}



@Test
public void selectNumOfAdultsRoom1()  {
   //new ShopHotelsTest().verifyShopHotelsButton();
    new ShopHotelsTest().selectRooms();
   // new ShopHotelsPage().shopHotelButtonClick();
    new ShopHotelsPage().adultInRoom.sendKeys("5");
    String numOfAdults = new ShopHotelsPage().adultInRoom.getText();
    String pageSource = Driver.getDriver().getPageSource();

    //Assert.assertTrue(pageSource.contains(numOfAdults));

}

    @Test
    public void selectNumOfAdultsRoom2(){
        new ShopHotelsTest().selectRooms();
        new ShopHotelsPage().adultInRoom.sendKeys("89");
        String numOfAdults = new ShopHotelsPage().adultInRoom.getText();
        String pageSource = Driver.getDriver().getPageSource();

        //Assert.assertTrue(pageSource.contains(numOfAdults));

    }
    @Test
    public void selectNumOfChildrenRoom1() {

        new ShopHotelsTest().selectRooms();

        new ShopHotelsPage().adultInRoom.sendKeys("50");
        String numOfAdults = new ShopHotelsPage().adultInRoom.getText();
        String pageSource = Driver.getDriver().getPageSource();

        //Assert.assertTrue(pageSource.contains(numOfAdults));

    }
    @Test
    public void selectNumOfChildrenRoom2(){

        new ShopHotelsTest().selectRooms();
        new ShopHotelsPage().adultInRoom.sendKeys("09");
        String numOfAdults = new ShopHotelsPage().adultInRoom.getText();
        String pageSource = Driver.getDriver().getPageSource();

        //Assert.assertTrue(pageSource.contains(numOfAdults));

    }

@Test
public void verifySearchButton(){
        new ShopHotelsTest().verifyShopHotelsButton();
        new ShopHotelsPage().searchButtonClick();
    Assert.assertTrue(new ShopHotelsPage().searchButton.isEnabled());
}



}
