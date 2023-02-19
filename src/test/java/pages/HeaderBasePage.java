package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import javax.security.auth.x500.X500Principal;
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

    @FindBy(xpath = "//li[5]/nav/ul/li[19]/a")
    private WebElement kidsFurniture;

    @FindBy(xpath = "//li[5]/nav/ul/li[2]/a")
    private WebElement gameFurniture;

    @FindBy(xpath = "//li[5]/nav/ul/li[20]/a")
    private WebElement nurseryFurniture;

    @FindBy(xpath = "//li[5]/nav/ul/li[14]/a")
    private WebElement outdoorPatio;

    @FindBy(xpath = "//li[5]/nav/ul/li[18]/a")
    private WebElement roomDividers;

    @FindBy(xpath = "//li[5]/nav/ul/li[10]/a")
    private WebElement shelvesBookcase;

    @FindBy(xpath = "//li[5]/nav/ul/li[17]/a")
    private WebElement sideboard;

    @FindBy(xpath = "//li[5]/nav/ul/li[3]/a")
    private WebElement sofasSectionals;

    @FindBy(xpath = "//li[5]/nav/ul/li[7]/a")
    private WebElement tablesDesks;

    @FindBy(xpath = "//li[5]/nav/ul/li[9]/a")
    private WebElement tVMediaFurniture;

    @FindBy(xpath = "//li[5]/nav/ul/li[13]/a")
    private WebElement utilityStorageCarts;

    @FindBy(xpath = "//li[5]/nav/ul/li[4]/a")
    private WebElement armchairs;

    @FindBy(xpath = "//li[5]/nav/ul/li[6]/a")
    private WebElement armoiresWardrobes;

    @FindBy(xpath = "//li[5]/nav/ul/li[12]/a")
    private WebElement displayStorageCabinets;

    @FindBy(xpath = "//li[5]/nav/ul/li[11]/a")
    private WebElement dressersStorageDrawers;
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

    @FindBy(xpath = "//span[text()='Beds with storage']")
    private WebElement bedsWithStorage;

    @FindBy(xpath = "//div[@data-ref-id='69176285']")
    private WebElement bedMalma;

    @FindBy(xpath = "//span [text()='Bar tables']")
    private WebElement barTable;

    @FindBy(xpath = "//span [text()='RÖNNINGE ']")
    private WebElement barTableRoninge;

    @FindBy(xpath = "//span [text()='Café tables']")
    private WebElement cafeTable;

    @FindBy(xpath = "//span [text()='STENSELE ']")
    private WebElement cafeTableStensele;

    @FindBy(xpath = "//span [text()='Sectionals']")
    private WebElement sectionals;

    @FindBy(xpath = "//div[@data-product-number='89440581']")
    private WebElement sectionalsKivik;

    @FindBy(xpath = "//span [text()='TV stands & benches']")
    private WebElement tVunit;

    @FindBy(xpath = "//div[@data-product-number='70299879']")
    private WebElement bestaTVunit;

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

    public MainPage clickOnKidsFurniture() {
        click(kidsFurniture);
        return new MainPage(getDriver());
    }

    public MainPage clickOnNurseryFurniture() {
        click(nurseryFurniture);
        return new MainPage(getDriver());
    }

    public MainPage clickOnGameFurniture() {
        click(gameFurniture);
        return new MainPage(getDriver());
    }

    public MainPage clickOnOutdoorPatio() {
        click(outdoorPatio);
        return new MainPage(getDriver());
    }

    public MainPage clickOnRoomDividers() {
        click(roomDividers);
        return new MainPage(getDriver());
    }

    public MainPage clickOnShelvesBookcaseStorage() {
        click(shelvesBookcase);
        return new MainPage(getDriver());
    }

    public MainPage clickOnSideboard() {
        click(sideboard);
        return new MainPage(getDriver());
    }

    public MainPage clickOnFurnitureSet() {
        click(furnitureSet);
        return new MainPage(getDriver());
    }

    public MainPage clickOnSofasSectionals() {
        click(sofasSectionals);
        return new MainPage(getDriver());
    }

    public MainPage clickOnTablesDesks() {
        click(tablesDesks);
        return new MainPage(getDriver());
    }

    public MainPage clickOnTVMediaFurniture() {
        click(tVMediaFurniture);
        return new MainPage(getDriver());
    }

    public MainPage clickOnUtilityStorageCarts() {
        click(utilityStorageCarts);
        return new MainPage(getDriver());
    }

    public MainPage clickOnDisplayStorageCabinets() {
        click(displayStorageCabinets);
        return new MainPage(getDriver());
    }

    public MainPage clickOnArmchairs() {
        click(armchairs);
        return new MainPage(getDriver());
    }

    public MainPage clickOnArmoiresWardrobes() {
        click(armoiresWardrobes);
        return new MainPage(getDriver());
    }

    public MainPage clickOnDressersStorage() {
        click(dressersStorageDrawers);
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
    public MainPage clickOnBedWithStorage() {
        click(bedsWithStorage);
        return new MainPage(getDriver());
    }
    public MainPage clickOnBedMalma() {
        click(bedMalma);
        return new MainPage(getDriver());
    }
    public MainPage clickOnBarTable() {
        click(barTable);
        return new MainPage(getDriver());
    }
    public MainPage clickOnBarTableRoninge() {
        click(barTableRoninge);
        return new MainPage(getDriver());
    }
    public MainPage clickOnCafeTable() {
      click(cafeTable);
      return new MainPage(getDriver());
    }
    public MainPage clickOnCafeTableStensele() {
        click(cafeTableStensele);
        return new MainPage(getDriver());
    }
    public MainPage clickOnSectionals() {
        click(sectionals);
        return new MainPage(getDriver());
    }
    public MainPage clickOnSectionalsKivik() {
        click(sectionalsKivik);
        return new MainPage(getDriver());
    }
    public MainPage clickOnTvUnit() {
        click(tVunit);
        return new MainPage(getDriver());
    }
    public MainPage clickOnBestaTVunit() {
        click(bestaTVunit);
        return new MainPage(getDriver());
    }
}
