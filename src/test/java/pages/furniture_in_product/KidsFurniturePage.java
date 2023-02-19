package pages.furniture_in_product;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.SearchPage;

public class KidsFurniturePage extends SearchPage {
    @FindBy(xpath = "//h1[text()='Kids furniture']")
    private WebElement kidsFurnitureList;

    public KidsFurniturePage(WebDriver driver) {
        super(driver);
    }
    public String getTextMessage() {
        String textKidsFurniture = kidsFurnitureList.getText();
        return textKidsFurniture;
    }
}
