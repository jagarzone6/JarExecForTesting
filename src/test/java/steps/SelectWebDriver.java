package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;

import static org.junit.Assert.fail;

/**
 * Created by jagarzone on 18/02/16.
 */
public class SelectWebDriver {

    static WebDriver driver;


    public static WebDriver getNewDriver(){

        driver = new FirefoxDriver();
        return driver;
    }

    public static void deleteInstanceBrowser() throws Exception {
        driver.quit();

    }
}
