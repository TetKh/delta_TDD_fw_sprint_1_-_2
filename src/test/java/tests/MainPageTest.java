package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CookiesHandlingPage;
import pages.MainPage;
import utilities.Driver;

public class MainPageTest extends TestBase {


    @Test(groups={"smokeTest"})
    public void mainPage() {

    //  new MainPage();
        Assert.assertEquals(driver.getTitle(),"Airline Tickets & Flights: Book Direct with Delta Air Lines - Official Site");
        new CookiesHandlingPage().cookiesRejectButton.click();
    }


}
