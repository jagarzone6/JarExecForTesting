package def.Pages;

/**
 * Created by jagarzone on 16/12/15.
 */


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InitGoogle  {
    static String ID_TXT_INPUT = "lst-ib";
    static String ID_SEARCH_BUTTON = "btnG";
    static String ID_SEARCH_BOX = "gs_lc0";

    WebDriver webDriver_;
    WebElement txtinput;
    WebElement button;
    WebElement searchBox;

    public InitGoogle(WebDriver webDriver){webDriver_=webDriver;}

    public void loadPage(){
        webDriver_.get("http://www.google.com");

    }

    public String getTitle(){

        String title = webDriver_.getTitle();
        return title;
    }

    public WebElement getsearchBox(){

        searchBox = webDriver_.findElement(By.id("gs_lc0"));
        return searchBox;
    }

    public void searchText(String txt){
       txtinput = webDriver_.findElement(By.id(ID_TXT_INPUT));
        txtinput.clear();
        txtinput.sendKeys(txt);
    }
    public void clickBuscar() throws InterruptedException {
        button = webDriver_.findElement(By.name(ID_SEARCH_BUTTON));
        button.click();
        //Thread.sleep(5000);
    }
}
