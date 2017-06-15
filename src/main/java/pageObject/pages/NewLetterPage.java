package pageObject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewLetterPage extends AbstractPage {

    private static final By ADDRESSEE_INPUT_LOCATOR = By.xpath("//*[@data-original-name='To']");
    private static final By SUBJECT_INPUT_LOCATOR = By.name("Subject");
    private static final By MAIL_BODY_INPUT_LOCATOR = By.cssSelector("#tinymce");
    private static final By FRAME_NAME = By.xpath("//iframe[contains(@id, 'composeEditor')]");

    public NewLetterPage(WebDriver driver) {
        super(driver);
    }

    public NewLetterPage fillAddresseeInput(String addressee) {
        driver.findElement(ADDRESSEE_INPUT_LOCATOR).sendKeys(addressee);
        return this;
    }

    public NewLetterPage fillSubjectInput(String subject) {
        driver.findElement(SUBJECT_INPUT_LOCATOR).sendKeys(subject);
        return this;
    }

    public NewLetterPage fillMailBodyInput(String body) {
        driver.switchTo().frame(driver.findElement(FRAME_NAME));
        driver.findElement(MAIL_BODY_INPUT_LOCATOR).sendKeys(body);
        driver.switchTo().defaultContent();
        return this;
    }
}