package tests;

import base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class ChooseItemTest extends BaseTest {

    @Test
    public void testFindSampleBed() {
        final String productBedMalma = "High bed frame/2 storage boxes, black-brown/Luröy,";
        MainPage mainPage = openBaseURL()
                .clickOnFurnitureFromProduct()
                .clickOnBed()
                .clickOnBedWithStorage()
                .clickOnBedMalma();

        MalmBedPage malmBedPage = new MalmBedPage(getDriver());
        Assert.assertEquals(malmBedPage.getTextMessage(), productBedMalma);
    }

    @Test
    public void testFindSampleBar() {
        final String productBarTableRoninge = "RÖNNINGE";
        MainPage mainPage = openBaseURL()
                .clickOnFurnitureFromProduct()
                .clickOnBar()
                .clickOnBarTable()
                .clickOnBarTableRoninge();

        RoningeBarTable roningeBarTable = new RoningeBarTable(getDriver());
        Assert.assertEquals(roningeBarTable.getTextMessage(), productBarTableRoninge);
    }

    @Test
    public void testFindSampleCafe() {
        final String productCafeTableStensele = "STENSELE";
        MainPage mainPage = openBaseURL()
                .clickOnFurnitureFromProduct()
                .clickOnCafe()
                .clickOnCafeTable()
                .clickOnCafeTableStensele();

        StenseleCafeTable stenseleCafeTable = new StenseleCafeTable(getDriver());
        Assert.assertEquals(stenseleCafeTable.getTextMessage(), productCafeTableStensele);
    }

    @Test
    public void testFindSampleSofasSectionals() {
        final String productSectionalsKivik = "KIVIK";
        MainPage mainPage = openBaseURL()
                .clickOnFurnitureFromProduct()
                .clickOnSofasSectionals()
                .clickOnSectionals()
                .clickOnSectionalsKivik();

        KivikSectionalsPage kivikSectionalsPage = new KivikSectionalsPage(getDriver());
        Assert.assertEquals(kivikSectionalsPage.getTextMessage(), productSectionalsKivik);
    }

    @Test
    public void testFindSampleTVunit() {
        final String productTVbesta = "BESTÅ";
        MainPage mainPage = openBaseURL()
                .clickOnFurnitureFromProduct()
                .clickOnTVMediaFurniture()
                .clickOnTvUnit()
                .clickOnBestaTVunit();

        BestaTvUnit bestaTvUnit = new BestaTvUnit(getDriver());
        Assert.assertEquals(bestaTvUnit.getTextMessage(), productTVbesta);
    }
}
