package support;

import pages.HomePage;
import pages.SearchPage;

public class PageObject extends BasePage {
    private HomePage homePage;
    private SearchPage searchPage;

    public HomePage getHomePage() {
        return (homePage == null) ? new HomePage(driver) : homePage;
    }
    public SearchPage getSearchPage() {
        return (searchPage == null) ? new SearchPage(driver) : searchPage;
    }
}
