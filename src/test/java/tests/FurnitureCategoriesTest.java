package tests;

import base.BaseTest;
import com.beust.ah.A;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

import pages.furniture_Categories.*;

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

    @Test
    public void testFindGameFurnitureList() {
        final String productGameFurniture = "Gaming furniture";
        MainPage mainPage = openBaseURL()
                .clickOnFurnitureFromProduct()
                .clickOnGameFurniture();

        GamingFurniturePage gamingFurniturePage = new GamingFurniturePage(getDriver());
        Assert.assertEquals(gamingFurniturePage.getTextMessage(), productGameFurniture);
    }

    @Test
    public void testFindKidsFurnitureList() {
        final String productKidsFurniture = "Kids furniture";
        MainPage mainPage = openBaseURL()
                .clickOnFurnitureFromProduct()
                .clickOnKidsFurniture();

        KidsFurniturePage kidsFurniturePage = new KidsFurniturePage(getDriver());
        Assert.assertEquals(kidsFurniturePage.getTextMessage(), productKidsFurniture);
    }

    @Test
    public void testFindNurseryFurnitureList() {
        final String productNurseryFurniture = "Nursery Furniture";
        MainPage mainPage = openBaseURL()
                .clickOnFurnitureFromProduct()
                .clickOnNurseryFurniture();

        NurseryFurniturePage nurseryFurniturePage = new NurseryFurniturePage(getDriver());
        Assert.assertEquals(nurseryFurniturePage.getTextMessage(), productNurseryFurniture);
    }

    @Test
    public void testFindOutdoorPatioList() {
        final String productOutdoorPatio = "Outdoor & patio furniture";
        MainPage mainPage = openBaseURL()
                .clickOnFurnitureFromProduct()
                .clickOnOutdoorPatio();

        OutdoorPatioPage outdoorPatioPage = new OutdoorPatioPage(getDriver());
        Assert.assertEquals(outdoorPatioPage.getTextMessage(), productOutdoorPatio);
    }

    @Test
    public void testFindRoomDividersList() {
        final String productRoomDividers = "Room dividers";
        MainPage mainPage = openBaseURL()
                .clickOnFurnitureFromProduct()
                .clickOnRoomDividers();

        RoomDividersPage roomDividersPage = new RoomDividersPage((getDriver()));
        Assert.assertEquals(roomDividersPage.getTextMessage(), productRoomDividers);
    }

    @Test
    public void testFindShelvesBookcaseList() {
        final String productShelvesBookcase = "Shelving units, bookcases & storage options";
        MainPage mainPage = openBaseURL()
                .clickOnFurnitureFromProduct()
                .clickOnShelvesBookcaseStorage();

        ShelvesBookcaseStoragePage shelvesBookcaseStoragePage = new ShelvesBookcaseStoragePage(getDriver());
        Assert.assertEquals(shelvesBookcaseStoragePage.getTextMessage(), productShelvesBookcase);
    }

    @Test
    public void testFindSideboardsList() {
        final String productSideboards = "Sideboards, buffets & sofa tables";
        MainPage mainPage = openBaseURL()
                .clickOnFurnitureFromProduct()
                .clickOnSideboard();

        SideboardBuffetSofaTablesPage sideboardBuffetSofaTablesPage = new SideboardBuffetSofaTablesPage(getDriver());
        Assert.assertEquals(sideboardBuffetSofaTablesPage.getTextMessage(), productSideboards);
    }

    @Test
    public void testFindSofaSectionalsList() {
        final String productSofaSectionals = "Sofas & sectionals";
        MainPage mainPage = openBaseURL()
                .clickOnFurnitureFromProduct()
                .clickOnSofasSectionals();

        SofasSectionalsPage sofasSectionalsPage = new SofasSectionalsPage(getDriver());
        Assert.assertEquals(sofasSectionalsPage.getTextMessage(), productSofaSectionals);
    }

    @Test
    public void testFindTablesDesksList() {
        final String productTablesDesks = "Tables & desks";
        MainPage mainPage = openBaseURL()
                .clickOnFurnitureFromProduct()
                .clickOnTablesDesks();

        TablesDesksPage tablesDesksPage = new TablesDesksPage(getDriver());
        Assert.assertEquals(tablesDesksPage.getTextMessage(), productTablesDesks);
    }

    @Test
    public void testTVMediaFurnitureList() {
        final String productTVMeidaFurniture = "TV & media furniture";
        MainPage mainPage = openBaseURL()
                .clickOnFurnitureFromProduct()
                .clickOnTVMediaFurniture();
    }

    @Test
    public void testFindUtilityStorageCartsList() {
        final String productUtilityStorageCartsFurniture = "Utility & storage carts";
        MainPage mainPage = openBaseURL()
                .clickOnFurnitureFromProduct()
                .clickOnUtilityStorageCarts();

        UtilityStorageCartsPage utilityStorageCartsPage = new UtilityStorageCartsPage(getDriver());
        Assert.assertEquals(utilityStorageCartsPage.getTextMessage(), productUtilityStorageCartsFurniture);
    }

    @Test
    public void testFindArmchairsAccentChairsList() {
        final String productArmchairs = "Armchairs & accent chairs";
        MainPage mainPage = openBaseURL()
                .clickOnFurnitureFromProduct()
                .clickOnArmchairs();

        ArmchairsAccentChairsPage armchairsAccentChairsPage = new ArmchairsAccentChairsPage(getDriver());
        Assert.assertEquals(armchairsAccentChairsPage.getTextMessage(), productArmchairs);
    }

    @Test
    public void testFindArmoiresWardrobesList() {
        final String productArmoiresWardrobes = "Armoires & wardrobes";
        MainPage mainPage = openBaseURL()
                .clickOnFurnitureFromProduct()
                .clickOnArmoiresWardrobes();

        ArmoiresWardrobesPage armoiresWardrobesPage = new ArmoiresWardrobesPage(getDriver());
        Assert.assertEquals(armoiresWardrobesPage.getTextMessage(), productArmoiresWardrobes);
    }

    @Test
    public void testFindDisplayStorageCabinetsList() {
        final String productDisplayStorageCabinets = "Display & storage cabinets";
        MainPage mainPage = openBaseURL()
                .clickOnFurnitureFromProduct()
                .clickOnDisplayStorageCabinets();

        DisplayStorageCabinetsPage displayStorageCabinetsPage = new DisplayStorageCabinetsPage(getDriver());
        Assert.assertEquals(displayStorageCabinetsPage.getTextMessage(), productDisplayStorageCabinets);
    }

    @Test
    public void testFindDressersStorageDrawersList() {
        final String productDressersStorageDrawers = "Dressers & storage drawers";
        MainPage mainPage = openBaseURL()
                .clickOnFurnitureFromProduct()
                .clickOnDressersStorage();

        DressersStorageDrawersPage dressersStorageDrawersPage = new DressersStorageDrawersPage(getDriver());
        Assert.assertEquals(dressersStorageDrawersPage.getTextMessage(), productDressersStorageDrawers);
    }
}

