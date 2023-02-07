package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends FooterBasePage{
    @FindBy(xpath = "//li//span[@class='hnf-header__cart-counter']")
    private WebElement numberItemInBag;

    @FindBy(xpath = "//li//span[@class='hnf-btn__inner js-shopping-cart-icon']")
    private WebElement numberByAttribute;

    @FindBy(xpath = "//*[local-name()='svg' and@class='cart-ingka-svg-icon cart-ingka-accordion-item-header__icon']")
    private WebElement discountLink;

    @FindBy(xpath = "//div/input[@id='discountCode']")
    private WebElement discountField;

    @FindBy(xpath = "//button//span[@class='cart-ingka-btn__label'][1]")
    private WebElement applyButton;

    @FindBy(xpath = "//div[@class='cart-ingka-form-field__content']//span[@class='cart-ingka-form-field__message']")
    private WebElement errorMessage;

    public ShoppingCartPage(WebDriver driver) {
        super(driver);
    }

    public String getActualNumber(String text){
        return numberByAttribute.getAttribute(text);
    }

    public ShoppingCartPage clickOnDiscountLink (){
        wait10ElementToBeVisible(discountLink);
        getActions().moveToElement(discountLink).click().build().perform();
        return this;
    }

    public ShoppingCartPage inputDiscountCodeAndApply(int num){
        wait10ElementToBeVisible(discountField);
        click(discountField);
        clear(discountField);
        inputRandomNumber(discountField,num);
        click(applyButton);
        return this;
    }

    public  String getErrorMessage (){
       return   getText(errorMessage);
    }
}
