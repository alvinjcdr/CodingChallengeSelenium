package stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import support.BasePage;

public class BaseStepDef extends BasePage {

    @Given("user navigate to ABN Lookup Website")
    public void user_navigate_to_abn_lookup_website() {
        loadProperties();
        getBrowser();
        openUrl();
    }

    @Then("close browser")
    public void close_browser() {
        browserQuit();
    }

    @When("user clicks back in browser")
    public void clickBackInBrowser() throws Exception {
        clickNavigateBack(3000);
    }
}