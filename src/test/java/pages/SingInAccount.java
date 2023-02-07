package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SingInAccount extends MainPage{

    @FindBy(id = "username")
    private WebElement userEmail;

    @FindBy(id = "password")
    private WebElement userPassword;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement continueButton;

    public SingInAccount(WebDriver driver) {
        super(driver);
    }

    public SingInAccount clickClearInputRegularUserEmail(){
        click(userEmail);
        clear(userEmail);
        String email = "alenatest704@gmail.com";
        inputAndEnter(userEmail,email);
        return this;
    }

    public SingInAccount clickClearInputRegularUserPassword (){
        click(userPassword);
        clear(userPassword);
        String password = "Irina566";
        inputAndEnter(userPassword,password);
        return this;
    }

   public void clickContinueButton(){
        click(continueButton);
   }

    public LoyaltyHubPage signInAsRegularUser(){
        clickClearInputRegularUserEmail();
        clickClearInputRegularUserPassword();
        clickContinueButton();
        return new LoyaltyHubPage(getDriver());
    }

}
