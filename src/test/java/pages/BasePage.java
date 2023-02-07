package pages;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public abstract class BasePage {
    private final WebDriver driver;
    private WebDriverWait webDriverWait10;
    private Actions actions;

    protected BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    protected WebDriver getDriver() {
        return driver;
    }


    public Actions getActions() {
        if (actions == null) {
            actions = new Actions(driver);
        }
        return actions;
    }

    protected WebDriverWait getWait10() {
        if (webDriverWait10 == null) {
            webDriverWait10 = new WebDriverWait(driver, Duration.ofSeconds(10));
        }

        return webDriverWait10;
    }

    public void wait10ElementToBeVisible(WebElement element) {
        getWait10().until(ExpectedConditions.visibilityOf(element));
    }

    protected WebElement wait10ElementToBeClickable(WebElement element) {
        return getWait10().until(ExpectedConditions.elementToBeClickable(element));
    }


    protected void click(WebElement element) {
        element.click();
    }

    protected void clear(WebElement element) {
        element.clear();
    }

    protected void inputRandomNumber(WebElement element, int num) {
        element.sendKeys(getRandomStr(num));
    }

    protected String getText(WebElement element) {
        if (!element.getText().isEmpty()) {
            wait10ElementToBeVisible(element);
        }
        return element.getText();
    }

    protected void inputAndEnter(WebElement element, String text) {
        element.sendKeys(text + Keys.ENTER);
    }

    protected void scrollByVisibleElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    public void scrollDown() {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)", "");
    }

    protected void scrollUpByVisibleElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,-250)", element);
    }

    public void scrollUp() {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0, -document.body.scrollHeight)", "");
    }

    public static String getRandomStr(int length) {
        return RandomStringUtils.random(length, "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789");
    }

    protected int getNumber(List<WebElement> elements) {
        return elements.size();
    }

    public String getCurrentURL() {

        return getDriver().getCurrentUrl();
    }

    public String getTitle() {

        return getDriver().getTitle();
    }


    protected List<String> getTextOfList(List<WebElement> elements, String text) {
        if (elements.size() > 0) {
            getWait10().until(ExpectedConditions.visibilityOfAllElements(elements));
            List<String> textList = new ArrayList<>();
            for (WebElement element : elements) {
                getWait10().until(ExpectedConditions.visibilityOfAllElements(elements));
                textList.add(element.getAttribute(text));
            }
            return textList;
        }
        return null;
    }

    protected List<String> getUrlList(List<WebElement> elements) {
        if (elements.size() > 0) {
            getWait10().until(ExpectedConditions.visibilityOfAllElements(elements));
            List<String> textList = new ArrayList<>();
            for (WebElement element : elements) {
                getWait10().until(ExpectedConditions.visibilityOfAllElements(elements));
                textList.add(getCurrentURL());
            }
            return textList;
        }
        return null;
    }

    protected void clickAllElementsInList(List<WebElement> elements) {
        List<WebElement> allElements = new ArrayList<>(elements);

        for (WebElement element : allElements) {
            if (element.isEnabled() && element.isDisplayed()) {
                wait10ElementToBeVisible(element);
                wait10ElementToBeClickable(element).click();
            } else {
                Reporter.log("Element " + element + " is not visible or not clickable ", true);
            }
        }


    }

    public String getAttribute(WebElement element, String attribute) {
        if (!element.getText().isEmpty()) {
            wait10ElementToBeVisible(element);
        }

        return element.getAttribute(attribute);
    }


//    public <T extends BasePage> T setSearchField(Class<T> type, String text) throws InterruptedException {
//        JavascriptExecutor js = (JavascriptExecutor) getDriver();
//        Thread.sleep(1000);
//        js.executeScript("window.scrollTo(0, 0)", "");
//        inputSearch.clear();
//        inputSearch.sendKeys(text);
//        Constructor<T> cons = null;
//        try {
//            cons = type.getConstructor(WebDriver.class);
//            return cons.newInstance(getDriver());
//        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    public HomePage clickAddToCartButton(int num) {
//        getAction(getDriver()).moveToElement(getDriver()
//                        .findElement(By.xpath("//div[@class='plp-fragment-wrapper'][" + num + "]//div[@class='pip-product-compact']//button[1]")))
//                .click().build().perform();
//
//        getWait().until(ExpectedConditions.visibilityOf(counterInCart));
//
//        return this;
//    }

//    getDriver().findElement(By.xpath(String.format("//div[@id='search-results']/div[%s]", itemIndex))).click();
//    public <T extends BaseHeaderPage> T clickItemOnSearchResult(Class<T> type, int itemIndex) {
//        getDriver().findElement(By.xpath(String.format("//div[@id='search-results']/div[%s]", itemIndex))).click();
//        Constructor<T> cons = null;
//        try {
//            cons = type.getConstructor(WebDriver.class);
//            return cons.newInstance(getDriver());
//        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
//            throw new RuntimeException(e);
//        }
//    }


}
