package stepdefs;

import io.cucumber.core.internal.com.fasterxml.jackson.databind.ser.Serializers;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.asserts.SoftAssert;
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
}