package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class SearchPage extends ParentPage {

    @FindBy(xpath = ".//h3[contains(., 'Test')]")
    WebElement textOfSearch;

    public SearchPage(WebDriver webDriver) {
        super(webDriver);

    }

    public boolean isElementOfSearchFound() {
        actionsWithOurElements.isElementDisplayed(textOfSearch);
        return true;
    }

}
