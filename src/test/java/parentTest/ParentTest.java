package parentTest;

import libs.ActionsWithOurElements;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.*;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class ParentTest {

    Logger logger = Logger.getLogger(getClass());
    WebDriver webDriver;
    String browser = System.getProperty("browser");
    protected ActionsWithOurElements actionsWithOurElements;
    protected MainPage mainPage;
    protected SearchPage searchPage;


    @Before
    public void setUp() {
        if ("chrome".equals(browser) || browser == null) {
            File file = new File("./src/drivers/chromedriver.exe");
            System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
            webDriver = new ChromeDriver();
        } else {
            Assert.fail("Wrong browser name");
        }

        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        actionsWithOurElements = new ActionsWithOurElements();
        mainPage = new MainPage(webDriver);
        searchPage = new SearchPage(webDriver);
    }

    @After
    public void tearDown() {
        webDriver.quit();
    }

    public void checkExpectedResult(String message, boolean expectedResult, boolean actualResult) {
        if (expectedResult != actualResult) {

        }
        Assert.assertEquals(message, expectedResult, actualResult);
    }


}


