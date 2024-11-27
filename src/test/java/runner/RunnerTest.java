package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.testng.annotations.AfterMethod;

import static support.BasePage.softAssert;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = "src/test/java/feature/",
        glue = {"stepdefs"},
        tags = "@HomePageButtonsAndLinks"
//        plugin = {"pretty",
//                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "json:src/main/java/support/cucumber.json"}
)

public class RunnerTest {
    @AfterMethod(alwaysRun = true)
    public void assertAll(){
        softAssert.assertAll();
    }
}
