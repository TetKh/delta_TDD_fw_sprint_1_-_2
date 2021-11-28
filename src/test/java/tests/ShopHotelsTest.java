package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.*;
import utilities.CSVReader;
import utilities.Driver;
import utilities.SeleniumUtils;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class ShopHotelsTest extends TestBase{




    @Test (groups={"smokeTest"})

    public void verifyShopHotelsButton() {
       // new MainPageTest().mainPage();
        new ShopHotelsPage().shopHotelButtonClick();
        Assert.assertTrue(new ShopHotelsPage().shopHotelButton.isDisplayed());

       SeleniumUtils.switchToWindow("Delta - Deals & Discounts for Hotel Reservations from Luxury Hotels to Budget Accommodations");

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
        new ShopHotelsPage().destination.clear();
        new ShopHotelsPage().searchButtonClick();
        String pageSource = Driver.getDriver().getPageSource();
        String destination = new ShopHotelsPage().errorMsg.getText();

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
    new ShopHotelsPage().rooms.sendKeys(Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.ENTER);
    String pageSource = Driver.getDriver().getPageSource();
    String roomChoice = new ShopHotelsPage().rooms.getText();
    Assert.assertTrue(pageSource.contains(roomChoice));

    //System.out.println(pageSource);
    System.out.println(new ShopHotelsPage().rooms.getText());
}



@Test
public void selectNumOfAdultsRoom1()  {
    new ShopHotelsTest().selectRooms();
    new ShopHotelsPage().adultInRoom.sendKeys(Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.ENTER);
    String numOfAdults = new ShopHotelsPage().adultInRoom.getText();
    String pageSource = Driver.getDriver().getPageSource();

    Assert.assertEquals(pageSource,numOfAdults);



}

    @Test
    public void selectNumOfAdultsRoom2(){
        new ShopHotelsTest().selectRooms();
        new ShopHotelsPage().adultInRoom.sendKeys("89");
        String numOfAdults = new ShopHotelsPage().adultInRoom.getText();
        String pageSource = Driver.getDriver().getPageSource();
        System.out.println(numOfAdults);
        Assert.assertTrue(pageSource.contains(numOfAdults));

        //Magda
        // Assert.assertFalse(pageSource.contains(numOfAdults));

    }
    @Test
    public void selectNumOfChildrenRoom1() {

        new ShopHotelsTest().selectRooms();

        new ShopHotelsPage().adultInRoom.sendKeys("50");
        String numOfAdults = new ShopHotelsPage().adultInRoom.getText();
        String pageSource = Driver.getDriver().getPageSource();

        //Assert.assertTrue(pageSource.contains(numOfAdults));

        //Magda
        //Assert.assertFalse(pageSource.contains(numOfAdults));
    }
    @Test
    public void selectNumOfChildrenRoom2(){

        new ShopHotelsTest().selectRooms();
        //new ShopHotelsPage().adultInRoom.sendKeys(Keys.DOWN,Keys.DOWN,Keys.ENTER);
//        String numOfAdults = new ShopHotelsPage().adultInRoom.getText();
        String pageSource = Driver.getDriver().getPageSource();
//        System.out.println(numOfAdults);

      //  Assert.assertTrue(pageSource.contains(numOfAdults));


        //Magda
        new ShopHotelsPage().childrenInRoom.sendKeys(Keys.DOWN,Keys.DOWN,Keys.ENTER);
        String numOfAChildren = new ShopHotelsPage().numChildrenInRoom.getText();
        System.out.println(numOfAChildren);
        Assert.assertTrue(pageSource.contains(numOfAChildren));
    }

    @Test
    public void verifySearchButton(){
        new ShopHotelsTest().verifyShopHotelsButton();
        new ShopHotelsPage().searchButtonClick();
        Assert.assertTrue(new ShopHotelsPage().searchButton.isEnabled());

}



}
