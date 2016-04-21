package def.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

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
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\jorge\\Downloads\\chromedriver.exe");
        //driver = new ChromeDriver();
        ProfilesIni profile = new ProfilesIni();
        FirefoxProfile myprofile = profile.getProfile("C:\\Users\\jorge\\Appdata\\Roaming\\Mozilla\\Firefox\\Profiles\\8zk3r37j.beta");
        driver = new FirefoxDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
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
