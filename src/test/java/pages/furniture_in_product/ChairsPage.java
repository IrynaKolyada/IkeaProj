package pages.furniture_in_product;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.SearchPage;

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
