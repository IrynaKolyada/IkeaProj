package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import pages.*;
import pages.furniture_Categories.BarPage;
import pages.furniture_Categories.BedsPage;
import pages.furniture_Categories.CafePage;
import pages.furniture_Categories.FurnitureSetsPage;

public class FurnitureCategoriesTest extends BaseTest {

    @Test
    public void testFindBedsList() {
        final String productBeds = "Beds";
        MainPage mainPage = openBaseURL()
                .clickOnFurnitureFromProduct()
                .clickOnBed();

        BedsPage bedsPage = new BedsPage(getDriver());
        Assert.assertEquals(bedsPage.getTextMessage(), productBeds);
    }
    @Test
    public void testFindBarsList() {
        final String productBars = "Bar furniture";
        MainPage mainPage = openBaseURL()
                .clickOnFurnitureFromProduct()
                .clickOnBar();

        BarPage barPage = new BarPage(getDriver());
        Assert.assertEquals(barPage.getTextMessage(), productBars);
    }
    @Test
    public void testFindCafeList() {
        final String productCafe = "Café furniture";
        MainPage mainPage = openBaseURL()
                .clickOnFurnitureFromProduct()
                .clickOnCafe();

        CafePage cafePage = new CafePage(getDriver());
        Assert.assertEquals(cafePage.getTextMessage(), productCafe);
    }
    @Test
    public void testFindFurnitureSetList() {
        final String productFurnitureSet = "Furniture sets";
        MainPage mainPage = openBaseURL()
                .clickOnFurnitureFromProduct()
                .clickOnFurnitureSet();

        FurnitureSetsPage furnitureSetsPage = new FurnitureSetsPage(getDriver());
        Assert.assertEquals(furnitureSetsPage.getTextMessage(), productFurnitureSet);
    }
}

