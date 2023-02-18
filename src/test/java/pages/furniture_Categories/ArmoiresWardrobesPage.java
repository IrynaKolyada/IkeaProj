package pages.furniture_Categories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.SearchPage;

public class ArmoiresWardrobesPage extends SearchPage {

    @FindBy(xpath = "//h1[text()='Armoires & wardrobes']")
    private WebElement wardrobesList;

    public ArmoiresWardrobesPage(WebDriver driver) {
        super(driver);
    }

    public String getTextMessage() {
        String textWardrobes = wardrobesList.getText();
        return textWardrobes;
    }
}
