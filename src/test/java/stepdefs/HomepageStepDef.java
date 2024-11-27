package stepdefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.SearchPage;
import support.BasePage;
import support.PageObject;

public class HomepageStepDef extends BasePage {

    HomePage homePage;
    SearchPage searchPage;

    public HomepageStepDef(PageObject pom) {
        homePage = pom.getHomePage();
        searchPage = pom.getSearchPage();
    }

    @When("user clicks the Search icon")
    public void clickSearchIcon() throws Exception {
        homePage.clickSearch();
    }
    @Then("verify that {string} text is displayed")
    public void verifyTextIsDisplayed(String text) throws Exception {
        searchPage.verifyTextIsDisplayed(text);
    }
    @When("user clicks {string} link")
    public void clickLink(String linkText) throws Exception {
        homePage.clickLink(linkText);
    }
    @Then("verify ABN Lookup homepage is loaded")
    public void verifyHomePageIsLoaded() {
        homePage.verifyHomePageIsLoaded();
    }
    @When("user type {string} in search bar")
    public void typeInSearchBar(String searchText) throws Exception {
        homePage.typeInSearchBar(searchText);
    }
    @Then("matching results for {string} is displayed on the result table")
    public void matchingResultsIsDisplayed(String searchText) throws Exception {
        homePage.matchingResultsIsDisplayed(searchText);
    }

    @Then("verify that {string} page is displayed")
    public void verifyThatPageIsDisplayed(String pageName) throws Exception {
        homePage.verifyThatPageIsDisplayed(pageName);
    }

    @When("user clicks {string} in header")
    public void clickLinkInHeader(String linkText) throws Exception {
        homePage.clickLink(linkText);
    }

    @When("user clicks {string} in footer")
    public void clickLinkInFooter(String linkText) throws Exception {
        homePage.clickLink(linkText);
    }

    @Then("verify that {string} image is displayed")
    public void verifyImageIsDisplayed(String imageName) throws Exception {
        homePage.verifyImageIsDisplayed(imageName);
    }

    @Then("verify {string} is displayed in banner message")
    public void verifyBannerMessage(String bannerMessage) throws Exception {
        homePage.verifyBannerMessage(bannerMessage);
    }

    @Then("verify content introduction element is displayed")
    public void verifyContentIntro() throws Exception {
        homePage.verifyContentIntro();
    }
    @Then("verify {string} tips is displayed")
    public void verifyTipsSection(String tips) throws Exception {
        homePage.verifyTipsSection(tips);
    }

}
