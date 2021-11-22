package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CompleteButtonPage;

public class CompleteButtonTest extends TestBase{

    @Test
    public void completeButton(){
        new SignUpButtonTest().SingUpButtonTest();
        new CompleteButtonPage().completeButton.click();
        Assert.assertTrue(new CompleteButtonPage().completeButton.isEnabled());
    }

}
