package com.Pages;

/**
 * Created by jagarzone on 17/12/15.
 */
import com.vaadin.testbench.TestBenchTestCase;
import com.vaadin.testbench.elements.ButtonElement;
import com.vaadin.testbench.elements.ImageElement;
import com.vaadin.testbench.elements.PasswordFieldElement;
import com.vaadin.testbench.elements.TextFieldElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InitAmazon extends TestBenchTestCase {
    static String ID_TXT_INPUT = "twotabsearchtextbox";
    static String ID_SEARCH_BUTTON = "nav-search-submit-text";

    TextFieldElement txtInput;
    ButtonElement searchButton;
    PasswordFieldElement passwordInput;
    ImageElement imageBanner;
    public InitAmazon(WebDriver webDriver){setDriver(webDriver);}

    public void searchText(String txt){
        //txtInput =  $(TextFieldElement.class).id(ID_TXT_INPUT);
        //txtInput.sendKeys(txt);
        driver.findElement(By.id(ID_TXT_INPUT)).clear();
        driver.findElement(By.id(ID_TXT_INPUT)).sendKeys(txt);
    }
    public void clickBuscar() throws InterruptedException {
        //searchButton = $(ButtonElement.class).id(ID_SEARCH_BUTTON);
        driver.findElement(By.id(ID_SEARCH_BUTTON)).click();
        //driver.findElement(By.cssSelector("input.nav-input")).click();
        Thread.sleep(5000);
    }
}
