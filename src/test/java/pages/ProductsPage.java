package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends SearchPage {

    @FindBy(xpath = "//span[text()='Products']")
    private WebElement productPage;

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public String getTextMessage (){
        String textProduct = productPage.getText();
        return textProduct;
    }
}
