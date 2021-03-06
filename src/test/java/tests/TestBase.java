package tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.SeleniumUtils;

import java.lang.reflect.Method;
import java.time.Duration;

public class TestBase {

    protected WebDriver driver;
    protected static ExtentReports report; // manages the entire report generation and teardown
    protected static ExtentSparkReporter htmlReporter;  // generating the html report
    protected static ExtentTest logger; // logging the test steps
    protected static int count = 1; //


    @BeforeSuite (alwaysRun = true)
    public void setupSuite(){
        report = new ExtentReports();
        String path = System.getProperty("user.dir") + "/target/extentReports/index.html";
        htmlReporter = new ExtentSparkReporter(path);
        report.attachReporter(htmlReporter);

    }

    @AfterSuite (alwaysRun = true)
    public void afterSuite(){
        report.flush(); // writes the report into a file
    }



    @BeforeMethod (alwaysRun = true)
    public void setupMethod(Method method){


        driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(ConfigReader.getProperty("url"));

        logger = report.createTest(method.getName());

//        logger = report.createTest("TESTCASE " + count);
//        count++;
    }


    @AfterMethod (alwaysRun = true)
    public void tearDownMethod(ITestResult testResult){

        if(testResult.getStatus()==ITestResult.SUCCESS){
            logger.pass("Test Passed");
        }else if(testResult.getStatus()==ITestResult.SKIP){
            logger.skip("Test Skipped");
        }else if(testResult.getStatus()==ITestResult.FAILURE){
            logger.fail("Test Failed");
            logger.fail(testResult.getThrowable());
            logger.addScreenCaptureFromPath(SeleniumUtils.getScreenshot());
        }

        Driver.quitDriver();
    }


}