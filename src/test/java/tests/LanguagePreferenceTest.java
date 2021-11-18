package tests;

import org.testng.annotations.Test;
import pages.BasicInfoPage;
import pages.LanguagePreferencePage;

public class LanguagePreferenceTest extends TestBase{
    SignUpButtonTest signUpButtonTest;
    @Test
    public  void selectLanguage(){
        signUpButtonTest.SingUpButtonTest();
        new LanguagePreferencePage().selectLanguage.click();
    }

}
