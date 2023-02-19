package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.security.cert.X509Certificate;

public class BestaTvUnit extends SearchPage {

    @FindBy(xpath = "//span [text()='BESTÅ ']")
    private WebElement bestaTV;

    public BestaTvUnit(WebDriver driver) {
        super(driver);
    }
    public String getTextMessage(){
        String textBestaTV = bestaTV.getText();
        return textBestaTV;
    }
}
