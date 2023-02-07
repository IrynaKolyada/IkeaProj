package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BabyCategoryPage extends MainPage{

@FindBy(xpath = "//nav[@class='vn__nav vn-8-grid']/a[5]")
private WebElement babyTextiles;



    public BabyCategoryPage(WebDriver driver) {
        super(driver);
    }

    public BabyTextilesPage clickOnBabyTextilesCategory(){
        getWait10().until(ExpectedConditions.elementToBeClickable(babyTextiles)).click();
        return new BabyTextilesPage(getDriver());
    }

}
