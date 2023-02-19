package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class KivikSectionalsPage extends SearchPage {

    @FindBy(xpath = "//span [text()='KIVIK ']")
    private WebElement kivikSectional;

    public KivikSectionalsPage(WebDriver driver) {
        super(driver);
    }
    public String getTextMessage() {
        String textKivikSectional = kivikSectional.getText();
        return textKivikSectional;
    }
}
