package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoyaltyHubPage extends SingInAccount{

//    @FindBy(xpath = "//li[@id='hnf-header-profile']//span[@class='hnf-btn__label']")
//    private WebElement signInId;
    //li[@id='hnf-header-profile']
     @FindBy(xpath = "//li[@id='hnf-header-profile']")
    private WebElement signInId;

    public LoyaltyHubPage(WebDriver driver) {
        super(driver);
    }

//    public String getSignInId(){
//      return  getText(signInId);
//    }
    public String getSignInId(){
        return signInId.getAttribute("data-hej-first-name");
    }
}
