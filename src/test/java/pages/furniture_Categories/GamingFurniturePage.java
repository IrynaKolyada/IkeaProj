package pages.furniture_Categories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.SearchPage;

public class GamingFurniturePage extends SearchPage {

    @FindBy(xpath = "//h1[text()='Gaming furniture']")
    private WebElement gameFurnitureList;

    public GamingFurniturePage(WebDriver driver) {
        super(driver);
    }
    public String getTextMessage(){
        String textGameFurniture = gameFurnitureList.getText();
        return textGameFurniture;
    }
}
