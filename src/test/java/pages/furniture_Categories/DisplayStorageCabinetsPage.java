package pages.furniture_Categories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.SearchPage;

import org.openqa.selenium.By;
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
