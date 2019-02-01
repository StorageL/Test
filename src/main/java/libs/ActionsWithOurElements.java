package libs;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.*;

public class ActionsWithOurElements {

    Logger logger = Logger.getLogger(getClass());
    WebDriver webDriver;

    public void submitInput(WebElement element) {
        try {
            element.submit();
        } catch (Exception e) {
            logger.error("  Cannot work with element" + e);
            Assert.fail("  Cannot work with element" + e);
        }
    }

    public void enterTextIntoElement(WebElement element, String text) {
        try {
            element.clear();
            element.sendKeys(text);
            logger.info(text + "  was inputted into element");
        } catch (Exception e) {
            logger.error("  Cannot work with element" + e);
            Assert.fail("  Cannot work with element" + e);
        }
    }

    public boolean isElementDisplayed(WebElement element) {

        try {
            return element.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

}