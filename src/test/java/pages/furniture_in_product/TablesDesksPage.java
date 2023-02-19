package pages.furniture_in_product;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.SearchPage;

public class TablesDesksPage extends SearchPage {

    @FindBy(xpath = "//h1[text()='Tables & desks']")
    private WebElement tablesDeskList;

    public TablesDesksPage(WebDriver driver) {
        super(driver);
    }
    public String getTextMessage() {
        String textTablesDesk = tablesDeskList.getText();
        return textTablesDesk;
    }
}
