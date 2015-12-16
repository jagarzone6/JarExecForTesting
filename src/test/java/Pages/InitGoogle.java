package Pages;

/**
 * Created by jagarzone on 16/12/15.
 */


import com.vaadin.testbench.TestBenchTestCase;
import com.vaadin.testbench.elements.ButtonElement;
import com.vaadin.testbench.elements.ImageElement;
import com.vaadin.testbench.elements.PasswordFieldElement;
import com.vaadin.testbench.elements.TextFieldElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InitGoogle extends TestBenchTestCase {
    static String ID_TXT_INPUT = "lst-ib";
    static String ID_BUSCAR_BUTTON = "btnG";

    TextFieldElement txtInput;
    ButtonElement searchButton;
    PasswordFieldElement passwordInput;
    ImageElement imageBanner;

    public InitGoogle(WebDriver webDriver){setDriver(webDriver);}

    public void searchText(String txt){
    //txtInput =  $(TextFieldElement.class).id(ID_TXT_INPUT);
    //txtInput.sendKeys(txt);
        driver.findElement(By.id(ID_TXT_INPUT)).clear();
        driver.findElement(By.id(ID_TXT_INPUT)).sendKeys(txt);
    }
    public void clickBuscar() throws InterruptedException {
        driver.findElement(By.name(ID_BUSCAR_BUTTON)).click();
        //Thread.sleep(2000);
    }
}
