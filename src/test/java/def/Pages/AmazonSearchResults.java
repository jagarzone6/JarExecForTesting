package def.Pages;

/**
 * Created by jagarzone on 19/04/16.
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonSearchResults {

    WebDriver webDriver_;

    public AmazonSearchResults(WebDriver webDriver){webDriver_=webDriver;}

    static String ID_IMAGE_LINK_AMAZONCHOISE = "s-amazons-choice-product-overlay";
    static String TITLE_LINK_AMAZONCHOISE = "Panasonic ErgoFit In-Ear Earbud Headphones RP-HJE120-K (Black) Dynamic Crystal Clear Sound, Ergonomic Comfort-Fit";

    WebElement Imagelinkcont;
    WebElement TitleLink;

    public WebElement getImagelinkcont(){

        Imagelinkcont = webDriver_.findElement(By.id(ID_IMAGE_LINK_AMAZONCHOISE));
        return Imagelinkcont;
    }
    public WebElement getTitleLink(){

        TitleLink = webDriver_.findElement(By.linkText(TITLE_LINK_AMAZONCHOISE));
        return TitleLink;
    }
    public void clickAtImage(){
        Imagelinkcont.click();
    }

}
