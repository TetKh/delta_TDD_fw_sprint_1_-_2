package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HelpCenterPage;
import utilities.Driver;

public class HelpService_Tests extends TestBase{



    @Test(groups={"smokeTest"})
    public void verifyNeedHelpButton(){
        new HelpCenterPage().needHelpLink.click();
        Assert.assertTrue(new HelpCenterPage().needHelpLink.isDisplayed());

    }
//
//    @Test
//    public void verifyHelpCenterPage(){
//        verifyNeedHelpButton();
//
//        new HelpCenterPage().helpCenter.click();
//
//        String title = Driver.getDriver().getTitle();
//
//        System.out.println(title);
//        String expected = "Help Center";
//        Assert.assertTrue(title.contains(expected));
//
//       // logger.pass("Test passed");




   // }

    public void RefundFlight(){

    }


}
