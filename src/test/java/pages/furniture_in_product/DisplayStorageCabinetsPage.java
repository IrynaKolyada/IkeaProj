package pages.furniture_in_product;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.SearchPage;

public class DisplayStorageCabinetsPage extends SearchPage{

    @FindBy(xpath = "//h1[text()='Display & storage cabinets']")
    private WebElement cabinetsList;

    public DisplayStorageCabinetsPage(WebDriver driver) {
        super(driver);
    }
    public String getTextMessage() {
        String textCabinets = cabinetsList.getText();
        return textCabinets;
    }
}
