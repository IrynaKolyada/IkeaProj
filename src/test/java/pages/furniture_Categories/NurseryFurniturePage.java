package pages.furniture_Categories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.SearchPage;

public class NurseryFurniturePage extends SearchPage {

    @FindBy(xpath = "//h1[text()='Nursery Furniture']")
    private WebElement NurseryFurnitureList;

    public NurseryFurniturePage(WebDriver driver) {
        super(driver);
    }
    public String getTextMessage(){
        String textNurseryFurniture = NurseryFurnitureList.getText();
        return textNurseryFurniture;
    }
}
