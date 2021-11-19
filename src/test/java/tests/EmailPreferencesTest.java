package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.EmailPreferencesPage;
import utilities.SeleniumUtils;

public class EmailPreferencesTest extends TestBase{

    SignUpButtonTest signUpButtonTest;

    @Test
    public void verifyEmailPreferenceSelectButton(){

      new SignUpButtonTest().SingUpButtonTest();
      new EmailPreferencesPage().emailPreferenceSelectButton.click();
        SeleniumUtils.waitFor(10);

      //  Assert.assertTrue(  new EmailPreferencesPage().emailPreferenceSelectButton.isSelected());
    }
}
