package pages.furniture_Categories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.SearchPage;

public class OutdoorPatioPage extends SearchPage {

    @FindBy(xpath = "//h1[text()='Outdoor & patio furniture']")
    private WebElement outdoorPatioList;

    public OutdoorPatioPage(WebDriver driver) {
        super(driver);
    }
    public String getTextMessage() {
        String textOutdoorPatio = outdoorPatioList.getText();
        return textOutdoorPatio;
    }
}
