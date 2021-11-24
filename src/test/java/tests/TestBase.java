package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utilities.ConfigReader;
import utilities.Driver;


import java.time.Duration;

public class TestBase {

    protected WebDriver driver;


    @BeforeMethod (alwaysRun = true)
    public void setupMethod(){
        driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get(ConfigReader.getProperty("url"));
        driver.manage().deleteAllCookies();

    }


    @AfterMethod (alwaysRun = true)
    public void tearDownMethod(){
        driver.manage().deleteAllCookies();
        Driver.quitDriver();

    }
}

