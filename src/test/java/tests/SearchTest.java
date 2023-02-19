package tests;


import base.BaseTest;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import pages.*;
import pages.furniture_in_product.BedsPage;


public class SearchTest extends BaseTest {
    static final String Attribute = "data-count";

    @Test
    public void testSearchAndAddItemToCart() {
        final String item1 = "sofa";
        final String item2 = "table";
        final String expectedErrorMessage = "Discount code is invalid. ";
        openBaseURL()
                .clickAndClearSearchField()
                .inputTextAndClickEnter(item1);

        SearchPage searchPage = new SearchPage(getDriver());

        searchPage
                .findItemAndClick(1)
                .clickAddToBagButton()
                .clickXbutton()
                .inputTextAndClickEnter(item2)
                .findItemAndClick(3)
                .clickAddToBagButton()
                .clickXbutton()
                .clickOnShoppingBagIcon()
                .clickOnDiscountLink()
                .inputDiscountCodeAndApply(15);

        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(getDriver());

        Assert.assertEquals(shoppingCartPage.getActualNumber(Attribute), "2");
        Assert.assertEquals(shoppingCartPage.getErrorMessage(), expectedErrorMessage);
    }

    @Ignore
    @Test
    public void testHamburgerMenuOptions() {

        MainPage mainPage = openBaseURL()
                .clickAndChooseDepartmentInHamburgerMenu()
                .clickOnBabyCategory()
                .clickOnBabyTextilesCategory();

        new ItemPage(getDriver())
                .findItemAndClick(5)
                .clickAddToBagButton()
                .clickXbutton()
                .clickOnShoppingBagIcon();

        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(getDriver());

        Assert.assertEquals(shoppingCartPage.getActualNumber(Attribute), "1");
    }

    @Test
    public void testProductHeader() {

        MainPage mainPage = openBaseURL()
                .clickOnProdactCategoryHeaderAndChooseDepartmentInHamburgerMenu()
                .clickOnBabyCategory()
                .clickOnBabyTextilesCategory();
    }

    @Test
    public void testCountOfSearchingHistory() {
        int numberSearchHistory = openBaseURL().countOfSearchFieldInputs();
        Reporter.log("numberOfInputs " + numberSearchHistory, true);
        Assert.assertTrue(numberSearchHistory > 0);
    }
}
