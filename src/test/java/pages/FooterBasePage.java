package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public abstract class FooterBasePage extends HeaderBasePage{

    @FindBy(xpath = "//div[@class='hnf-footer__socialMediaLinks']")
    private WebElement footerIconBar;

    @FindBy(xpath = "//div[@class='hnf-footer__socialMediaLinks']/ul/li/a")
    private List<WebElement> socialMediaIcons;

    public FooterBasePage(WebDriver driver) {
        super(driver);
    }

    protected WebElement getFooterIconBar(){
        return footerIconBar;
    }

    protected List<WebElement> getSocialMediaIcons(){
        return socialMediaIcons;
    }

    public MainPage scrollToFooterIconBar(){

        scrollDown();
        getActions().moveToElement(footerIconBar).build().perform();

//        scrollByVisibleElement(footerIconBar);

        return new MainPage(getDriver());
    }

    public int getNumberSocialMediaNumberIcons(){
        return getNumber(socialMediaIcons);
    }

    public List<String> getListSocialMedia(String text){

        return getTextOfList(socialMediaIcons, text);
    }



    public void clickAllsocialMediaIcons(int index) throws InterruptedException {
          scrollByVisibleElement(footerIconBar);

       Thread.sleep(2000);
        getActions().pause(3000).moveToElement(footerIconBar).perform();

         Thread.sleep(3000);
        click(getSocialMediaIcons().get(index));

    }


}
