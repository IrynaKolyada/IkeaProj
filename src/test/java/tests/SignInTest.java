package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import pages.LoyaltyHubPage;

public class SignInTest extends BaseTest {

    @Test
    public void testSignInAsRegularUser() throws InterruptedException {
      LoyaltyHubPage loyaltyHubPage = openBaseURL()
                .clickLogInButton()
                .clickSignInButton()
                .signInAsRegularUser();
//
//        String actualPageTitle = loyaltyHubPage.getTitle();
//        Reporter.log(actualPageTitle, true);
//        Assert.assertEquals(actualPageTitle, "Login - IKEA");

//        Thread.sleep(3000);
//        String actualSignInId = loyaltyHubPage.getSignInId();
//        Reporter.log(actualSignInId, true);
//        Assert.assertEquals(actualSignInId, "");

    }
}
