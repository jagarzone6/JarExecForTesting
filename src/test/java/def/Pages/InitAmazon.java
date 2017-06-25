package def.Pages;

/**
 * Created by jagarzone on 17/12/15.
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InitAmazon {
    static String ID_TXT_INPUT = "twotabsearchtextbox";
    static String ID_SEARCH_BUTTON = "nav-input";
    WebDriver webDriver_;

    public InitAmazon(WebDriver webDriver){webDriver_=webDriver;}

    public void loadPage(){
        webDriver_.get("http://www.amazon.com");

    }
    public String getTitle(){

        String title = webDriver_.getTitle();
        return title;
    }

    public void searchText(String txt){

       WebElement textinput = webDriver_.findElement(By.id(ID_TXT_INPUT));
        textinput.clear();
        textinput.sendKeys(txt);
    }
    public void clickBuscar() throws InterruptedException {

        WebElement searchbutton = webDriver_.findElement(By.className(ID_SEARCH_BUTTON));
        searchbutton.click();

        //Thread.sleep(5000);
    }
}
