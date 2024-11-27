package stepdefs;

import io.cucumber.java.en.When;
import pages.SearchPage;
import support.BasePage;
import support.PageObject;

public class SearchpageStepDef extends BasePage {

    SearchPage searchPage;

    public SearchpageStepDef(PageObject pom) {
        searchPage = pom.getSearchPage();
    }

    @When("user hovers to search and go to Advance Search page")
    public void goToAdvanceSearchPage() throws Exception {
        searchPage.goToAdvanceSearchPage();
    }
    @When("user hovers to search and go to Statistical query page")
    public void goToStatisticalQueryPage() throws Exception {
        searchPage.goToStatisticalQueryPage();
    }
    @When("user clicks the Search button")
    public void clickSearchButton() throws Exception {
        searchPage.clickSearchButton();
    }
    @When("user type {string} in the advance search")
    public void typeInAdvanceSearchBar(String searchText) throws Exception {
        searchPage.typeInAdvanceSearchBar(searchText);
    }
}
