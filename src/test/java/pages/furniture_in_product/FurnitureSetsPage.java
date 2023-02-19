package pages.furniture_in_product;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.SearchPage;

public class FurnitureSetsPage extends SearchPage {

    @FindBy(xpath = "//h1[text()='Furniture sets']")
    private WebElement furnitureSetsList;

    public FurnitureSetsPage(WebDriver driver) {
        super(driver);
    }

    public String getTextMessage() {
        String textFurnitureSet = furnitureSetsList.getText();
        return textFurnitureSet;
    }
}
