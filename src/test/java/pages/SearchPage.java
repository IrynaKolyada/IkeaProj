package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends FooterBasePage {

    @FindBy(xpath = "//body[@class='checkout-shoppingbag']")
    private WebElement shoppingCart;

    @FindBy(xpath = "//div[@class='search-field']//input[@type='search']")
    private WebElement searchFieldSearchPage;


    public SearchPage(WebDriver driver) {
        super(driver);
    }


    public ItemPage findItemAndClick(int num) {
        getActions().moveToElement(getDriver().findElement(
                By.xpath("//div[@class='plp-fragment-wrapper'][" + num + "]//div[@class='pip-product-compact']")))
                .click()
                .build()
                .perform();

        return new ItemPage(getDriver());
    }
}
