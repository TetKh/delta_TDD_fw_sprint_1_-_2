package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CookiesHandlingPage;
import pages.SingUpButtonPage;
import utilities.Driver;


public class SignUpButtonTest extends TestBase{


    @Test (groups={"smokeTest"})
    public void SingUpButtonTest() {
     new SingUpButtonPage().signButtonClick();
    Assert.assertEquals(Driver.getDriver().getTitle(), "Join SkyMiles® Loyalty Program : Delta Air Lines");
    new CookiesHandlingPage().cookiesRejectButton.click();

    }
}
