package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LogInPage;
import pages.NeepCenterPage;
import utilities.Driver;

public class HelpService_Tests extends TestBase{

    @Test
    public void verifyHelpCenterPage(){

        new NeepCenterPage().helpCenter.click();
        String title = Driver.getDriver().getTitle();

        System.out.println(title);
//        String expected = "Help Center";
//        Assert.assertTrue(pageSource.contains(expected));

       // logger.pass("Test passed");




    }

    public void RefundFlight(){

    }


}
