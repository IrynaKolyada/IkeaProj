package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RoningeBarTable extends SearchPage {

    @FindBy(xpath = "//span [text()='RÖNNINGE ']")
    private WebElement barRoninge;

    public RoningeBarTable(WebDriver driver) {
        super(driver);
    }

    public String getTextMessage() {
        String textBarRoninge = barRoninge.getText();
        return textBarRoninge;
    }

}
