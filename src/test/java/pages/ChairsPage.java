package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChairsPage extends SearchPage {

    @FindBy(xpath = "//h1[text()='Chairs']")
    private WebElement chairsList;

    public ChairsPage(WebDriver driver) {
        super(driver);
    }

    public String getTextMessage() {
        String textChairs = chairsList.getText();
        return textChairs;
    }
}
