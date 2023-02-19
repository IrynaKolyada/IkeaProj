package pages.furniture_in_product;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.SearchPage;

public class CafePage extends SearchPage{

    @FindBy(xpath = "//h1[text()='Café furniture']")
    private WebElement cafeList;

    public CafePage(WebDriver driver) {
        super(driver);
    }

    public String getTextMessage() {
        String textCafe = cafeList.getText();
        return textCafe;
    }

}
