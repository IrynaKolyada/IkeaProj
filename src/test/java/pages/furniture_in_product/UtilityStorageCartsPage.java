package pages.furniture_in_product;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
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
