package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;


public class MainPage extends ParentPage {

    public MainPage(WebDriver webDriver) {
        super(webDriver);
        wait5 = new WebDriverWait(webDriver, 5);
        wait10 = new WebDriverWait(webDriver, 10);
    }

    WebDriverWait wait5, wait10;


    @FindBy(name = "q")
    private WebElement inputOfSearchExpression;


    public void openMainPage() {

        try {
            webDriver.get("http://www.google.com.ua/");
            logger.info("  MainPage page was opened");
        } catch (Exception e) {
            logger.error("  Can not MainPage");
            Assert.fail("   Can not open MainPage");
        }
    }


    public void enterSearchTextIntoSearchInput(String text) {
        actionsWithOurElements.enterTextIntoElement(inputOfSearchExpression, text);
    }

    public void submitInputText() {
        actionsWithOurElements.submitInput(inputOfSearchExpression);
    }


}
