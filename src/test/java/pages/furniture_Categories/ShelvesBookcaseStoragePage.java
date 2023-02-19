package pages.furniture_Categories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.SearchPage;

public class ShelvesBookcaseStoragePage extends SearchPage {

    @FindBy(xpath = "//h1[text()='Shelving units, bookcases & storage options']")
    private WebElement shelvesBookcaseList;

    public ShelvesBookcaseStoragePage(WebDriver driver) {
        super(driver);
    }
    public String getTextMessage(){
        String textShelvesBookcase = shelvesBookcaseList.getText();
        return textShelvesBookcase;
    }
}
