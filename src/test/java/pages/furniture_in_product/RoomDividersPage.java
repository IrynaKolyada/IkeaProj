package pages.furniture_in_product;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.SearchPage;

public class RoomDividersPage extends SearchPage {

    @FindBy(xpath = "//h1[text()='Room dividers']")
    private WebElement roomDividersList;

    public RoomDividersPage(WebDriver driver) {
        super(driver);
    }
    public String getTextMessage() {
        String textRoomDividers = roomDividersList.getText();
        return textRoomDividers;
    }
}
