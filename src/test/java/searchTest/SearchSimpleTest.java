package searchTest;

import org.junit.Test;
import parentTest.ParentTest;

public class SearchSimpleTest extends ParentTest {
    String textOfSearching = "Test";


    @Test
    public void searchSimpleTest() {

        mainPage.openMainPage();
        mainPage.enterSearchTextIntoSearchInput(textOfSearching);
        mainPage.submitInputText();

        checkExpectedResult("Page of Searching was not found", searchPage.isElementOfSearchFound(), true);
    }

}
