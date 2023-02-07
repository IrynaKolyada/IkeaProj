package pages;

import org.testng.annotations.DataProvider;

public class TestData {

    @DataProvider(name = "SocialMediaIcons")
    public static Object[][] footerMenuTestDataProvider(){

        return new Object[][]{
                {0,  "facebook", "https://www.facebook.com/IKEAUSA", "IKEA - Home|Facebook"},
                {1,  "instagram", "https://www.instagram.com/IKEAUSA/", "IKEA USA (@ikeausa)•Instagram"},
                {2,   "pinterest", "https://www.pinterest.com/IKEAUSA/", "IKEA (IKEAUSA)|Official Pinterest"},
                {3,   "twitter", "https://twitter.com/IKEAUSA", "IKEA USA (@IKEAUSA)/Twitter"},
                {4,   "youtube", "https://www.youtube.com/user/IKEAUSA", "IKEA USA - YouTube"}
        };
    }

}
