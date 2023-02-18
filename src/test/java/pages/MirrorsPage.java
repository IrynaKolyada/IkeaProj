package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MirrorsPage extends SearchPage {

    @FindBy(xpath = "//h1[text()='Mirrors']")
    private WebElement mirrorsList;

    public MirrorsPage(WebDriver driver) {
        super(driver);
    }
    public String getTextMessage (){
        String textMirrors = mirrorsList.getText();
        return textMirrors;
    }
}
