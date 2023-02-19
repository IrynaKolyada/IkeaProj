package pages.furniture_in_product;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.SearchPage;

public class TVMediaFurniturePage extends SearchPage {

    @FindBy(xpath = "//h1[text()='TV & media furniture']")
    private WebElement mediaFurnitureList;

    public TVMediaFurniturePage(WebDriver driver) {
        super(driver);
    }
    public String getTextMessage() {
        String textMediaFurniture = mediaFurnitureList.getText();
        return textMediaFurniture;
    }
}
