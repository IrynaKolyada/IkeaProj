package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MalmBedPage extends SearchPage {

    @FindBy(xpath = "//span [text()='High bed frame/2 storage boxes, black-brown/Luröy, ']")
    private WebElement bedMalm;

    public MalmBedPage(WebDriver driver) {
        super(driver);
    }
    public String getTextMessage() {
        String textBedMalm = bedMalm.getText();
        return textBedMalm;
    }
}
