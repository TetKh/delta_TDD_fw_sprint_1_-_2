package tests;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.ShopHotelsPage;
import pages.VacationDealPage;
import utilities.CSVReader;
import utilities.Driver;
import utilities.SeleniumUtils;

public class VacationDealsTest extends TestBase{




    @Test (groups={"smokeTest"})

    public void verifyVacationDealsButton() {

        new VacationDealPage().vacationDealsButtonClick();
        Assert.assertTrue(new VacationDealPage().vacationDealsButton.isDisplayed());
        System.out.println(new VacationDealPage().vacationDealsButton.getText());
        SeleniumUtils.switchToWindow("Delta - Deals & Discounts for Hotel Reservations from Luxury Hotels to Budget Accommodations");

    }

    @Test (groups={"smokeTest"})
    public void verifyJoinSkyMilesLink() {

        new VacationDealPage().vacationDealsButtonClick();
        Assert.assertTrue(new VacationDealPage().joinSkyMiles_forfree.isDisplayed());
        System.out.println(new VacationDealPage().joinSkyMiles_forfree.getText());

    }





//    @Test (dataProvider = "getData")
//    public void validDestination(String hotelDestination){
//       verifyShopHotelsButton();
//       new ShopHotelsPage().destination.sendKeys(hotelDestination);
//        String pageSource = Driver.getDriver().getPageSource();
//        String destination = new ShopHotelsPage().destination.getText();
//        Assert.assertTrue(pageSource.contains(destination));
//
//    }
//
//    @DataProvider
//    public Object[][] getData(){
//
//        return CSVReader.readFromCSV("destination.csv");
//    }
//
//    @Test
//    public void invalidDestination(){
//       verifyShopHotelsButton();
//        new ShopHotelsPage().destination.clear();
//        new ShopHotelsPage().searchButtonClick();
//        String pageSource = Driver.getDriver().getPageSource();
//        String destination = new ShopHotelsPage().errorMsg.getText();
//
//        Assert.assertTrue(pageSource.contains(destination));
//
//
//    }
//
//    @Test
//    public void selectCheckInDate()  {
//        new VacationDealsTest().verifyShopHotelsButton();
//        new ShopHotelsPage().check_in.click();
//        new ShopHotelsPage().check_in_date.click();
//
//
//    }
//
//    @Test
//    public void selectCheckOutDate() {
//        new VacationDealsTest().verifyShopHotelsButton();
//        new ShopHotelsPage().check_out.click();
//        new ShopHotelsPage().check_out_date.click();
//
//
//
//    }
//    @Test
//    public void verifyNumOfNights(){
//        new VacationDealsTest().verifyShopHotelsButton();
//        new ShopHotelsPage().num_nights.getText();
//        String pageSource = Driver.getDriver().getPageSource();
//        String numOfNights = new ShopHotelsPage().num_nights.getText();
//        Assert.assertTrue(pageSource.contains(numOfNights));
//
//    }
//@Test
//    public void selectRooms() {
//    new VacationDealsTest().verifyShopHotelsButton();
//    new ShopHotelsPage().rooms.sendKeys(Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.ENTER);
//    String pageSource = Driver.getDriver().getPageSource();
//    String roomChoice = new ShopHotelsPage().rooms.getText();
//    Assert.assertTrue(pageSource.contains(roomChoice));
//
//    //System.out.println(pageSource);
//    System.out.println(new ShopHotelsPage().rooms.getText());
//}
//
//
//
//@Test
//public void selectNumOfAdultsRoom1()  {
//    new VacationDealsTest().selectRooms();
//    new ShopHotelsPage().adultInRoom.sendKeys(Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.ENTER);
//    String numOfAdults = new ShopHotelsPage().adultInRoom.getText();
//    String pageSource = Driver.getDriver().getPageSource();
//
//    Assert.assertEquals(pageSource,numOfAdults);
//
//
//
//}
//
//    @Test
//    public void selectNumOfAdultsRoom2(){
//        new VacationDealsTest().selectRooms();
//        new ShopHotelsPage().adultInRoom.sendKeys("89");
//        String numOfAdults = new ShopHotelsPage().adultInRoom.getText();
//        String pageSource = Driver.getDriver().getPageSource();
//        System.out.println(numOfAdults);
//        Assert.assertTrue(pageSource.contains(numOfAdults));
//
//        //Magda
//        // Assert.assertFalse(pageSource.contains(numOfAdults));
//
//    }
//    @Test
//    public void selectNumOfChildrenRoom1() {
//
//        new VacationDealsTest().selectRooms();
//
//        new ShopHotelsPage().adultInRoom.sendKeys("50");
//        String numOfAdults = new ShopHotelsPage().adultInRoom.getText();
//        String pageSource = Driver.getDriver().getPageSource();
//
//        //Assert.assertTrue(pageSource.contains(numOfAdults));
//
//        //Magda
//        //Assert.assertFalse(pageSource.contains(numOfAdults));
//    }
//    @Test
//    public void selectNumOfChildrenRoom2(){
//
//        new VacationDealsTest().selectRooms();
//        //new ShopHotelsPage().adultInRoom.sendKeys(Keys.DOWN,Keys.DOWN,Keys.ENTER);
////        String numOfAdults = new ShopHotelsPage().adultInRoom.getText();
//        String pageSource = Driver.getDriver().getPageSource();
////        System.out.println(numOfAdults);
//
//      //  Assert.assertTrue(pageSource.contains(numOfAdults));
//
//
//        //Magda
//        new ShopHotelsPage().childrenInRoom.sendKeys(Keys.DOWN,Keys.DOWN,Keys.ENTER);
//        String numOfAChildren = new ShopHotelsPage().numChildrenInRoom.getText();
//        System.out.println(numOfAChildren);
//        Assert.assertTrue(pageSource.contains(numOfAChildren));
//    }
//
//    @Test
//    public void verifySearchButton(){
//        new VacationDealsTest().verifyShopHotelsButton();
//        new ShopHotelsPage().searchButtonClick();
//        Assert.assertTrue(new ShopHotelsPage().searchButton.isEnabled());
//
//}
//


}
