package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utils.Global_Vars;

import java.time.Duration;

public class chrome_po extends Base_PO{


    public chrome_po(){
    }


    @FindBy(xpath = "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")
    public WebElement search_field;

    @FindBy(xpath = "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[2]")
    public WebElement lucky;


    @FindBy(xpath = "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")
    public WebElement Search;

    @FindBy(xpath = "//*[@id=\"ca-viewsource\"]/a")
    public WebElement NewSearch;

    @FindBy(xpath = "//*[@id=\"firstHeading\"]/span")
    public WebElement txt;

    public void search_field(String str){
        sendKeys(search_field, str);
    }

    public void Search_Button(){
        /*WebElement s = acc.Search;*/
        waitForWebElementAndClick(lucky);
    }

    public void lucky(){
        waitForWebElementAndClick(lucky);
    }

    public void google_text(){

        String s = txt.getText();
        Assert.assertEquals(s, "Batmanaa");

    }

    public void  NewSearch(){
        waitForWebElementAndClick(NewSearch);
        System.out.println("clicked");
    }
}
