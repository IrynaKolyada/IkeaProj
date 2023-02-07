package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import pages.MainPage;
import utils.ReportUTils;
import utils.TestUtils;

import java.lang.reflect.Method;
import java.time.Duration;

public abstract class BaseTest {

    public final String BASE_URL = TestUtils.getBaseUrl();
    private WebDriver driver;
    private WebDriverWait webDriverWait20;
    private WebDriverWait webDriverWait10;

    @BeforeSuite
    protected void beforeSuite(ITestContext context) {

        Reporter.log(ReportUTils.getReportHeader(context), true);
    }

    @BeforeMethod
    protected void beforeMethod(Method method, ITestResult result) {

        driver = BaseUtils.createDriver();
        Reporter.log(ReportUTils.END_LINE, true);
        Reporter.log("TEST RUN", true);
        Reporter.log(ReportUTils.getClassNameTestName(method, result), true);
    }

    @AfterMethod
    protected void afterMethod(Method method, ITestResult result) {
         Reporter.log(ReportUTils.getTestStatistics(method, result), true);

        driver.quit();
        webDriverWait20 = null;
        webDriverWait10 = null;
    }

    protected WebDriver getDriver() {

        return driver;
    }

    protected WebDriverWait getWait20() {
        if (webDriverWait20 == null) {
            webDriverWait20 = new WebDriverWait(driver, Duration.ofSeconds(20));
        }

        return webDriverWait20;
    }

    protected WebDriverWait getWait10() {
        if (webDriverWait10 == null) {
            webDriverWait10 = new WebDriverWait(driver, Duration.ofSeconds(10));
        }

        return webDriverWait10;
    }

    public MainPage openBaseURL() {
        getDriver().get(BASE_URL);

        return new MainPage(getDriver());
    }



}
