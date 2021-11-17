package tests;

import org.testng.annotations.Test;
import pages.BasicInfoPage;

public class BasicInfoTest extends TestBase{

SignUpButtonTest signUpButtonTest;
    BasicInfoPage basicInfoPage;

    @Test
    public void verifyPrefixDropDown(){
        new SignUpButtonTest().SingUpButtonTest();
       new BasicInfoPage().prefix.click();


    }





}
