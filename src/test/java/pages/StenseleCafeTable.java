package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StenseleCafeTable extends SearchPage{

    @FindBy(xpath = "//span [text()='STENSELE ']")
    private WebElement cafeTableStensele;

    public StenseleCafeTable(WebDriver driver) {
        super(driver);
    }
    public String getTextMessage() {
        String textCafeTableStensele = cafeTableStensele.getText();
        return textCafeTableStensele;
    }
}
