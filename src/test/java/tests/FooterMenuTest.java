package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.TestData;

import java.util.List;

public class FooterMenuTest extends BaseTest {
    @Test
    public void testFooterMenuHasSocialMediaIcons(){
        final  List<String> expectedMediaIcons = List.of("facebook", "instagram", "pinterest", "twitter", "youtube");

        List<String> actualMediaIcons = openBaseURL().scrollToFooterIconBar().getListSocialMedia("aria-label");
        Reporter.log("List url ---" + actualMediaIcons, true);

        MainPage mainPage = new MainPage(getDriver());

        Assert.assertEquals(mainPage.getNumberSocialMediaNumberIcons(), 5);
        Assert.assertEquals(actualMediaIcons,expectedMediaIcons);
    }

    @Test(dataProvider = "SocialMediaIcons", dataProviderClass = TestData.class)
    public void testSocialMediaIconsNavigateToCorrespondingPages(
            int index,  String iconName, String expectedUrl, String expectedTitle) throws InterruptedException {

      MainPage mainPage = new MainPage(getDriver());
      final String oldUrl = mainPage.getCurrentURL();
      final String oldTitle = mainPage.getTitle();

      openBaseURL()
                .clickAllsocialMediaIcons(index);

      String actualUrl = getDriver().getCurrentUrl();
      String actualTitle = getDriver().getTitle();

        Assert.assertNotEquals(actualUrl, oldUrl);
        Assert.assertNotEquals(actualTitle, oldTitle);
        Assert.assertEquals(actualTitle, expectedTitle);
        Assert.assertEquals(actualUrl, expectedUrl);
    }
}
