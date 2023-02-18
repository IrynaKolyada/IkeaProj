package pages.furniture_Categories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.SearchPage;

public class ArmchairsAccentChairsPage extends SearchPage {

    @FindBy(xpath = "//h1[text()='Armchairs & accent chairs']")
    private WebElement armChairsList;

    public ArmchairsAccentChairsPage(WebDriver driver) {
        super(driver);
    }

    public String getTextMessage() {
        String textArmchair = armChairsList.getText();
        return textArmchair;
    }
}
