package Pages;

/**
 * Created by jagarzone on 16/12/15.
 */

import com.vaadin.testbench.TestBenchTestCase;
import com.vaadin.testbench.elements.ButtonElement;
import com.vaadin.testbench.elements.ImageElement;
import com.vaadin.testbench.elements.PasswordFieldElement;
import com.vaadin.testbench.elements.TextFieldElement;
import org.openqa.selenium.WebDriver;

public class InitGoogle extends TestBenchTestCase {
    static String ID_TXT_INPUT = "q";
    static String ID_BUSCAR_BUTTON = "btnK";

    TextFieldElement txtInput;
    ButtonElement searchButton;
    PasswordFieldElement passwordInput;
    ImageElement imageBanner;

    public InitGoogle(WebDriver webDriver){setDriver(webDriver);}

    public void searchText(String txt){
    txtInput =  $(TextFieldElement.class).id(ID_TXT_INPUT);

    }
    public void clickBuscar(String txt){
        searchButton =  $(ButtonElement.class).id(ID_BUSCAR_BUTTON);

    }
}
