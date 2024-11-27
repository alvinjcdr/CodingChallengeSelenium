package support;

import managers.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

public class BasePage extends WebDriverManager {

    public static WebDriver driver;

    public static SoftAssert softAssert = new SoftAssert();

//    public static SoftAssert softAssert = new SoftAssert();

}
