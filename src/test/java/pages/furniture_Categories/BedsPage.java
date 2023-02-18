package pages.furniture_Categories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.SearchPage;

public class BedsPage  extends SearchPage {
    @FindBy(xpath = "//h1[text()='Beds']")
    private WebElement bedsList;

    public BedsPage(WebDriver driver) {
        super(driver);
    }

    public String getTextMessage() {
        String textBeds = bedsList.getText();
        return textBeds;
    }
}

