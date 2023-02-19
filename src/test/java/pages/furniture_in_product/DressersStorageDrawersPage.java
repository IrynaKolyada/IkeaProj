package pages.furniture_in_product;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.SearchPage;

public class DressersStorageDrawersPage extends SearchPage{

    @FindBy(xpath = "//h1[text()='Dressers & storage drawers']")
    private WebElement drawersList;

    public DressersStorageDrawersPage(WebDriver driver) {
        super(driver);
    }
    public String getTextMessage(){
        String textDrawers = drawersList.getText();
        return textDrawers;
    }

}
