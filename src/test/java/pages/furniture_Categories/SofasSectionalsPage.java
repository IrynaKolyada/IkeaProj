package pages.furniture_Categories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.SearchPage;

public class SofasSectionalsPage extends SearchPage {

    @FindBy(xpath = "//h1[text()='Sofas & sectionals']")
    private WebElement sofasSectionalsList;
    public SofasSectionalsPage(WebDriver driver) {
        super(driver);
    }
    public String getTextMessage() {
        String textSofasSectionals = sofasSectionalsList.getText();
        return textSofasSectionals;
    }
}
