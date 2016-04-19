package com.Pages;

/**
 * Created by jagarzone on 16/12/15.
 */


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InitGoogle  {
    static String ID_TXT_INPUT = "lst-ib";
    static String ID_BUSCAR_BUTTON = "btnG";


    WebDriver webDriver_;

    public InitGoogle(WebDriver webDriver){webDriver_=webDriver;}

    public void searchText(String txt){
    //txtInput =  $(TextFieldElement.class).id(ID_TXT_INPUT);
    //txtInput.sendKeys(txt);
       WebElement txtinput = webDriver_.findElement(By.id(ID_TXT_INPUT));
        txtinput.clear();
        txtinput.sendKeys(txt);
    }
    public void clickBuscar() throws InterruptedException {
        WebElement button = webDriver_.findElement(By.name(ID_BUSCAR_BUTTON));
        button.click();
        Thread.sleep(5000);
    }
}
