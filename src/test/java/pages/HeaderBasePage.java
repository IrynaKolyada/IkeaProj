package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public abstract class HeaderBasePage extends BasePage{

    @FindBy(xpath = "//div[@class='search-wrapper']//input[@type='search']")
    private WebElement searchFieldHeaderMenu;

    @FindBy(xpath = "//button[@aria-labelledby='hnf-header-hamburger-label']")
    private WebElement hamburgerIcon;

    @FindBy(xpath = "//div//ul[@class='hnf-menu__nav__main']/li[1]")
    private WebElement productsOption;

    @FindBy(xpath = "//nav//ul[@data-tracking-label='products']/li[9]")
    private WebElement babyKidsOption;

    @FindBy(xpath = "//nav//ul[@aria-label='Submenu for Baby & kids']/li[2]")
    private WebElement babySubMenu;

    @FindBy(xpath = "//nav//ul[@aria-label='Submenu for Baby & kids']/li[2]")
    private WebElement babyCategory;

    @FindBy(xpath = "//div//ul[@class='hnf-header__nav__main']/li[1]")
    private WebElement productCategoryHeader;

    @FindBy(xpath = "//div[@class='search-results']//li")
    private List<WebElement> numberOfSearchHistory;

    @FindBy(xpath = "//li[@id='hnf-header-profile']//a")
    private WebElement logInButton;

    @FindBy(xpath = "//div[@class='header__content']/a")
    private WebElement signInButton;

    public HeaderBasePage(WebDriver driver) {
        super(driver);

    }

    public MainPage clickAndClearSearchField(){
        click(searchFieldHeaderMenu);
        clear(searchFieldHeaderMenu);

        return new MainPage(getDriver());
    }

    public SearchPage inputTextAndClickEnter(String text){

        inputAndEnter(searchFieldHeaderMenu, text);

        return new SearchPage(getDriver());
    }

    public MainPage clickAndChooseDepartmentInHamburgerMenu(){
        click(hamburgerIcon);
        getWait10().until(ExpectedConditions.elementToBeClickable(productsOption)).click();
        getWait10().until(ExpectedConditions.elementToBeClickable(babyKidsOption)).click();
        return new MainPage(getDriver());
    }

    public BabyCategoryPage clickOnBabyCategory(){
        getWait10().until(ExpectedConditions.elementToBeClickable(babyCategory)).click();

        return new BabyCategoryPage(getDriver());
    }

    public MainPage clickOnProdactCategoryHeaderAndChooseDepartmentInHamburgerMenu(){
        click(productCategoryHeader);
        getWait10().until(ExpectedConditions.elementToBeClickable(babyKidsOption)).click();
        return new MainPage(getDriver());
    }
    public int countOfSearchFieldInputs(){
        click(searchFieldHeaderMenu);
       return getNumber(numberOfSearchHistory);

    }

    public MainPage clickLogInButton(){
        click(logInButton);
        return new MainPage (getDriver());
    }

    public SingInAccount clickSignInButton(){
        click(signInButton);
        return new SingInAccount(getDriver());
    }

}
