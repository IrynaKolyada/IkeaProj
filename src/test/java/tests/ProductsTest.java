package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import pages.*;

public class ProductsTest extends BaseTest {
    @Test
    public void testFindBeds() {
        final String productBeds = "Beds";
        MainPage mainPage = openBaseURL()
                .clickOnHamburgerMenu()
                .clickOnProductList()
                .clickOnFurniture()
                .clickOnBed();

        BedsPage bedsPage = new BedsPage(getDriver());
        Assert.assertEquals(bedsPage.getTextMessage(), productBeds);
    }

    @Test
    public void testFindMirrors() {
        final String productMirrors = "Mirrors";
        MainPage mainPage = openBaseURL()
                .clickOnHamburgerMenu()
                .clickOnProductList()
                .clickOnHomeDecor()
                .clickOnMirror();

        MirrorsPage mirrorsPage = new MirrorsPage(getDriver());
        Assert.assertEquals(mirrorsPage.getTextMessage(), productMirrors);
    }

    @Test
    public void testFindChairs() {
        final String productChairs = "Chairs";
        MainPage mainPage = openBaseURL()
                .clickOnHamburgerMenu()
                .clickOnProductList()
                .clickOnFurniture()
                .clickOnChairs();

        ChairsPage chairsPage = new ChairsPage(getDriver());
        Assert.assertEquals(chairsPage.getTextMessage(), productChairs);
    }
}
