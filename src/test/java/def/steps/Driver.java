package def.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;

import static org.junit.Assert.fail;

/**
 * Created by jagarzone on 16/12/15.
 */
public class Driver {

    static WebDriver driver;
    static DesiredCapabilities caps;

    static StringBuffer verificationErrors = new StringBuffer();

    public static WebDriver getNewDriver() throws MalformedURLException {

        // driver = new RemoteWebDriver(new URL("http://jgarzon%40easysol.net:ub8f17b60626af2b@hub.crossbrowsertesting.com:80/wd/hub"), Driver.getCaps());
        //System.out.println("Loading Url");
        // driver = new ChromeDriver();
        driver = new FirefoxDriver();
        //   driver = new InternetExplorerDriver();
        return driver;
    }

    public static void deleteInstanceBrowser() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }

    }
}
