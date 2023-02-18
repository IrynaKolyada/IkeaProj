package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public abstract class HeaderBasePage extends BasePage {

    @FindBy(xpath = "//div[@class='search-wrapper']//input[@type='search']")
    private WebElement searchFieldHeaderMenu;

    @FindBy(xpath = "//button[@aria-labelledby='hnf-header-hamburger-label']")
    private WebElement hamburgerIcon;

    @FindBy(xpath = "//div//ul[@class='hnf-menu__nav__main']/li[1]")
    private WebElement productsOption;

    @FindBy(xpath = "//a[@data-tracking-label='products']")
    private WebElement productsInList;

    @FindBy(xpath = "//[@class='hnf-header__nav__main']")
    private WebElement productCategory;

    @FindBy(xpath = "//nav[2]/ul/li[5]/a")
    private WebElement furniture;

    @FindBy(xpath = "//li[5]/nav/ul/li[5]/a")
    private WebElement bed;

    @FindBy(xpath = "//li[5]/nav/ul/li[15]/a")
    private WebElement bar;

    @FindBy(xpath = "//li[5]/nav/ul/li[16]/a")
    private WebElement cafe;

    @FindBy(xpath = "//li[5]/nav/ul/li[21]/a")
    private WebElement furnitureSet;

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

    public MainPage clickAndClearSearchField() {
        click(searchFieldHeaderMenu);
        clear(searchFieldHeaderMenu);

        return new MainPage(getDriver());
    }

    public SearchPage inputTextAndClickEnter(String text) {

        inputAndEnter(searchFieldHeaderMenu, text);

        return new SearchPage(getDriver());
    }

    public MainPage clickAndChooseDepartmentInHamburgerMenu() {
        click(hamburgerIcon);
        getWait10().until(ExpectedConditions.elementToBeClickable(productsOption)).click();
        getWait10().until(ExpectedConditions.elementToBeClickable(babyKidsOption)).click();
        return new MainPage(getDriver());
    }

    public BabyCategoryPage clickOnBabyCategory() {
        getWait10().until(ExpectedConditions.elementToBeClickable(babyCategory)).click();

        return new BabyCategoryPage(getDriver());
    }

    public MainPage clickOnProdactCategoryHeaderAndChooseDepartmentInHamburgerMenu() {
        click(productCategoryHeader);
        getWait10().until(ExpectedConditions.elementToBeClickable(babyKidsOption)).click();
        return new MainPage(getDriver());
    }

    public MainPage clickOnHamburgerMenu() {
        click(hamburgerIcon);
        return new MainPage(getDriver());
    }

    public MainPage clickOnProductList() {
        click(productsInList);
        return new MainPage(getDriver());
    }

    public MainPage clickOnFurniture() {
        click(furniture);
        return new MainPage(getDriver());
    }

    public MainPage clickOnBed() {
        click(bed);
        return new MainPage(getDriver());
    }

    public MainPage clickOnBar() {
        click(bar);
        return new MainPage(getDriver());
    }
    public MainPage clickOnFurnitureSet() {
        click(furnitureSet);
        return new MainPage(getDriver());
    }

    public MainPage clickOnCafe() {
        click(cafe);
        return new MainPage(getDriver());
    }

    public int countOfSearchFieldInputs() {
        click(searchFieldHeaderMenu);
        return getNumber(numberOfSearchHistory);
    }

    public MainPage clickLogInButton() {
        click(logInButton);
        return new MainPage(getDriver());
    }

    public SingInAccount clickSignInButton() {
        click(signInButton);
        return new SingInAccount(getDriver());
    }

    public MainPage clickOnFurnitureFromProduct() {
        clickOnHamburgerMenu();
        clickOnProductList();
        clickOnFurniture();
        return new MainPage(getDriver());
    }
}
