package pages.furniture_Categories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.SearchPage;

public class BarPage extends SearchPage {

    @FindBy(xpath = "//h1[text()='Bar furniture']")
    private WebElement barList;

    public BarPage(WebDriver driver) {
        super(driver);
    }

    public String getTextMessage() {
        String textBar = barList.getText();
        return textBar;
    }
}
