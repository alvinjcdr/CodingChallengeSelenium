package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import support.BasePage;

import java.util.List;

public class HomePage extends BasePage {
    /*
     * All elements in HomePage should be added here
     */

    @FindBy(id = "HyperlinkHomeTop")
    WebElement linkHomeHeader;
    @FindBy(xpath = "(//a[contains(text(), 'Search')])[1]")
    WebElement linkSearchHeader;
    @FindBy(xpath = "//a[contains(text(), 'Tools & resources')]")
    WebElement linkToolsAndResourcesHeader;
    @FindBy(xpath = "//a[contains(text(), 'Help')]")
    WebElement linkHelpHeader;
    @FindBy(id = "MainSearchButton")
    WebElement iconSearch;
    @FindBy(id = "SearchText")
    WebElement textSearch;
    @FindBy(className = "banner-message")
    WebElement eleBannerMessage;
    @FindBy(className = "content-intro")
    WebElement eleContentIntro;



    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    /**
     * Click Search icon
     * @throws Exception exception
     */
    public void clickSearch() throws Exception {
        waitUntilClickable(iconSearch);
        iconSearch.click();
    }
    /**
     * click any link with given linkText
     * @param linkText String
     * @throws Exception exception
     */
    public void clickLink(String linkText) throws Exception {
        waitForPresenceOfTheElementLocatedBy(By.linkText(linkText));
        WebElement ele = driver.findElement(By.linkText(linkText));
        waitUntilClickable(ele);
        ele.click();
    }
    /**
     * verify home page is loaded successfully
     */
    public void verifyHomePageIsLoaded() {
        String title = driver.getTitle();
        verifyTrue(title.contains("ABN Lookup"), "ABN Lookup homepage is displayed");
    }
    /**
     * Type in text in the search bar
     * @param searchText String
     * @throws Exception exception
     */
    public void typeInSearchBar(String searchText) throws Exception {
        waitUntilClickable(textSearch);
        textSearch.click();
        textSearch.sendKeys(searchText);
    }
    /**
     * Verify that all matching results is displayed
     * @param searchText String
     */
    public void matchingResultsIsDisplayed(String searchText) {
        List<WebElement> results = driver.findElements(By.xpath("//*[@id='content-matching']//descendant::tr"));
        for(WebElement result : results) {
            verifyTrue(result.getText().toLowerCase().contains(searchText), "ABN Lookup homepage is displayed");
        }
    }
    /**
     * Verify the correct page was loaded
     * @param pageName String
     * @throws Exception exception
     */
    public void verifyThatPageIsDisplayed(String pageName) throws Exception {
        String title = driver.getTitle();
        verifyTrue(title.toLowerCase().contains(pageName), pageName + " is displayed");
        waitTillElementsLoadsByMilliSec(3000);
    }
    /**
     * Verify image is displayed
     * @param imageName String
     */
    public void verifyImageIsDisplayed(String imageName) {
        WebElement ele = driver.findElement(By.xpath("//*[@alt='" + imageName + "']"));
        verifyTrue(ele.isDisplayed(), imageName + " is displayed");
    }
    /**
     * Verify that banner message is displayed
     * @param bannerMessage String
     */
    public void verifyBannerMessage(String bannerMessage) {
        waitForElementToBeDisplayed(eleBannerMessage,10);
        verifyTrue(eleBannerMessage.getText().toLowerCase().contains(bannerMessage), bannerMessage + " is displayed");
    }
    /**
     * Verify that content intro is displayed
     */
    public void verifyContentIntro() {
        waitForElementToBeDisplayed(eleContentIntro,10);
        verifyTrue(eleContentIntro.isDisplayed(), eleContentIntro + " is displayed");
    }
    /**
     * Verify the correct page was loaded
     */
    public void verifyTipsSection(String tips) {
        WebElement ele = driver.findElement(By.xpath("//div/h2[contains(text(),'" + tips + "')]"));
        verifyTrue(ele.isDisplayed(), tips + " is displayed");
    }
    /**
     * method to go to sub menu
     * @param mainMenu String
     * @param subMenu String
     * @throws Exception exception
     */
    public void goToSubMenu(String mainMenu, String subMenu) throws Exception {
        waitTillElementsLoadsByMilliSec(2000);
        WebElement main = driver.findElement(By.xpath("//a[contains(text(), '"+mainMenu+"')]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(main);
        WebElement sub = driver.findElement(By.xpath("//a[contains(text(), '"+subMenu+"')]"));
        actions.moveToElement(sub);
        actions.click().build().perform();
    }
}
