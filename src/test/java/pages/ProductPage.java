package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends SearchPage{

    @FindBy(xpath = "//div[@class='pip-buy-module__buttons--container']")
    private WebElement addToBagButton;

    @FindBy(xpath = "//div[@class='rec-modal-header rec-modal-header--floating-header']//span[@class='rec-btn__inner']")
    private WebElement xButton;


    @FindBy(xpath = "//div/ul/li[5]/a/span")
    private WebElement shoppingBagIcon;


    public ProductPage(WebDriver driver) {

        super(driver);
    }

    public ProductPage clickAddToBagButton(){
        scrollByVisibleElement(addToBagButton);
        click(addToBagButton);
        return this;
    }

    public ProductPage clickXbutton(){
        scrollUpByVisibleElement(xButton);
        click(xButton);
        return this;
    }

    public ShoppingCartPage clickOnShoppingBagIcon(){
        wait10ElementToBeVisible(shoppingBagIcon);
        scrollUp();
        click(shoppingBagIcon);
        return new ShoppingCartPage(getDriver());
    }
    @FindBy(xpath = "//h1[@class='plp-page-title__title']")
    private WebElement bedsList;

    String getTextMessage (){
        String textBeds = bedsList.getText();
        return textBeds;
    }

}
