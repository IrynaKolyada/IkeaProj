package pages.furniture_Categories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;
import pages.SearchPage;

public class UtilityStorageCartsPage extends SearchPage {

    @FindBy(xpath = "//h1[text()='Utility & storage carts']")
    private WebElement utilityStorageList;

    public UtilityStorageCartsPage(WebDriver driver) {
        super(driver);
    }
    public String getTextMessage() {
        String textUtilityStorage = utilityStorageList.getText();
        return textUtilityStorage;
    }
}
