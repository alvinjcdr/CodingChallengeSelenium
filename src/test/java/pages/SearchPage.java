package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import support.BasePage;

public class SearchPage extends BasePage {
    /*
     * All elements in SearchPage should be added here
     */

    @FindBy(id = "content")
    WebElement eleSearchResult;
    @FindBy(name = "SubmitButton")
    WebElement btnSubmit;
    @FindBy(id = "SearchParameters_SearchText")
    WebElement textAdvanceSearch;

    public SearchPage(WebDriver driver) {PageFactory.initElements(driver, this);}

    /**
     * Verify that a given String is found within the page
     * @param text String
     */
    public void verifyTextIsDisplayed(String text) throws InterruptedException {
        waitUntilClickable(eleSearchResult);
        verifyTrue(eleSearchResult.getText().contains(text), text + " is displayed");
    }
    /**
     * Navigate to Advance Search Page
     * @throws Exception e
     */
    public void goToAdvanceSearchPage() throws Exception {
        waitTillElementsLoadsByMilliSec(2000);
        WebElement mainMenu = driver.findElement(By.xpath("(//a[contains(text(), 'Search')])[1]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(mainMenu);
        WebElement subMenu = driver.findElement(By.xpath("//a[contains(text(), 'Advanced search')]"));
        actions.moveToElement(subMenu);
        actions.click().build().perform();
    }
    /**
     * Navigate to Statistical Query Page
     * @throws Exception e
     */
    public void goToStatisticalQueryPage() throws Exception {
        waitTillElementsLoadsByMilliSec(2000);
        WebElement mainMenu = driver.findElement(By.xpath("(//a[contains(text(), 'Search')])[1]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(mainMenu);
        WebElement subMenu = driver.findElement(By.xpath("//a[contains(text(), 'Statistical query')]"));
        actions.moveToElement(subMenu);
        actions.click().build().perform();
    }
    /**
     * Click Search button
     * @throws Exception exception
     */
    public void clickSearchButton() throws Exception {
        waitUntilClickable(btnSubmit);
        btnSubmit.click();
    }
    /**
     * Type in text in the advance search bar
     * @param searchText String
     * @throws Exception exception
     */
    public void typeInAdvanceSearchBar(String searchText) throws Exception {
        waitTillElementsLoadsByMilliSec(2000);
        waitUntilClickable(textAdvanceSearch);
        textAdvanceSearch.click();
        textAdvanceSearch.sendKeys(searchText);
    }
}
