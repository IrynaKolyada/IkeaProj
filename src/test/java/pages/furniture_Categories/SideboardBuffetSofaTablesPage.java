package pages.furniture_Categories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;
import pages.SearchPage;

public class SideboardBuffetSofaTablesPage extends SearchPage {

    @FindBy(xpath = "//h1[text()='Sideboards, buffets & sofa tables']")
    private WebElement sideboardTablesList;
    public SideboardBuffetSofaTablesPage(WebDriver driver) {
        super(driver);
    }
    public String getTextMessage(){
        String textSideboardTables = sideboardTablesList.getText();
        return textSideboardTables;
    }
}
