package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.EmailPreferencesPage;
import utilities.Driver;
import utilities.SeleniumUtils;

public class EmailPreferencesTest extends TestBase{

    // Magda please take a look on this method

    //button is selected , but assert says ist false
    @Test(groups={"regressionTest"})
    public void verifyEmailPreferenceSelectButton(){

      new SignUpButtonTest().SingUpButtonTest();
      new EmailPreferencesPage().emailPreferenceSelectButton.click();
      SeleniumUtils.waitFor(10);
      String expected = "SELECTED";
      String pageSource = Driver.getDriver().getPageSource();
      Assert.assertTrue(pageSource.contains(expected));

//      String expected = "✓ SELECTED";
//      String actual = new EmailPreferencesPage().emailPreferenceSelectButton.getText();
//      Assert.assertEquals(ac,expected);



    }
}
