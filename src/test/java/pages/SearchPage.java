package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import support.BasePage;

public class SearchPage extends BasePage {
    /*
     * All elements in SearchPage should be added here
     */

    @FindBy(id = "content")
    WebElement eleSearchResult;

    public SearchPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    /**
     * Verify that a given String is found within the page
     * @param text String
     */
    public void verifyTextIsDisplayed(String text) throws InterruptedException {
        waitUntilClickable(eleSearchResult);
        verifyTrue(eleSearchResult.getText().contains(text), text + " is displayed");
    }
}
