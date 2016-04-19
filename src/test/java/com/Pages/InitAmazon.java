package com.Pages;

/**
 * Created by jagarzone on 17/12/15.
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InitAmazon {
    static String ID_TXT_INPUT = "twotabsearchtextbox";
    static String ID_SEARCH_BUTTON = "nav-search-submit-text";
    WebDriver webDriver_;

    public InitAmazon(WebDriver webDriver){webDriver_=webDriver;}

    public void searchText(String txt){
        //txtInput =  $(TextFieldElement.class).id(ID_TXT_INPUT);
        //txtInput.sendKeys(txt);
       WebElement textinput = webDriver_.findElement(By.id(ID_TXT_INPUT));
        textinput.clear();
        textinput.sendKeys(txt);
    }
    public void clickBuscar() throws InterruptedException {
        //searchButton = $(ButtonElement.class).id(ID_SEARCH_BUTTON);
        WebElement searchbutton = webDriver_.findElement(By.id(ID_SEARCH_BUTTON));
        searchbutton.click();
        //driver.findElement(By.cssSelector("input.nav-input")).click();
        Thread.sleep(5000);
    }
}
