package stepdefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import support.BasePage;

public class HomepageStepDef extends BasePage {



    @When("user clicks {string} in header")
    public void user_clicks_in_header(String string) {

    }

    @When("user clicks {string} in footer")
    public void user_clicks_in_footer(String string) {

    }

    @Then("{string} page is displayed")
    public void page_is_displayed(String string) {

    }
}
