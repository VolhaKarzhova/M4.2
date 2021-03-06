package pageObject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MailStatusPage extends AbstractPage {

    public static final By MAIL_ADDRESSEE_LOCATOR = By.xpath("//span[@class='message-sent__info']");

    public MailStatusPage(WebDriver driver) {
        super(driver);
    }

    public String getAddresseeFromSuccessfulSendLetterMessage() {
        waitForElementVisible(MAIL_ADDRESSEE_LOCATOR);
        return driver.findElement(MAIL_ADDRESSEE_LOCATOR).getText();
    }
}