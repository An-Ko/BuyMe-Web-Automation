import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

class SenderReceiverInfoScreen {

    // find the for someone else radio button
    static WebElement findSomeoneElse(WebDriver driver) {
        return driver.findElement(By.cssSelector(Constants.INFO_SOMEONE_ELSE_OPTION));
    }

    // return the element in the given index from a list of elements with the "ui-input" class
    private static WebElement inputs (WebDriver driver, int index) {
        List<WebElement> inputs = driver.findElements(By.xpath(Constants.INFO_INPUTS));
        return inputs.get(index);
    }

    // find receiver name text box
    static WebElement findReceiverName(WebDriver driver) {
        return inputs(driver,0);
    }

    // find current sender name value
    static String findReceiverNameValue(WebDriver driver) {
        return findReceiverName(driver).getAttribute(Constants.INFO_VALUE);
    }

    // find previewed receiver name text
    static String findPreviewReceiverNameText(WebDriver driver) {
        return driver.findElement(By.className(Constants.INFO_RECEIVER)).findElement(By.className(Constants.INFO_NAME)).getText();
    }

    // find sender name text box
    static WebElement findSenderName(WebDriver driver) {
        return inputs(driver,1);
    }

    // find current sender name value
    static String findSenderNameValue(WebDriver driver) {
        return findSenderName(driver).getAttribute(Constants.INFO_VALUE);
    }

    // find previewed sender name text
    static String findPreviewSenderNameText(WebDriver driver) {
        return driver.findElement(By.className(Constants.INFO_SENDER)).findElement(By.className(Constants.INFO_NAME)).getText();
    }

    // find blessing text box
    static WebElement findBlessing(WebDriver driver) {
        return driver.findElement(By.tagName(Constants.INFO_BLESSING));
    }

    // find current blessing value
    static String findBlessingValue(WebDriver driver) {
        return findBlessing(driver).getAttribute(Constants.INFO_VALUE);
    }

    // find previewed blessing
    static String findPreviewBlessingText(WebDriver driver) {
        return driver.findElement(By.className(Constants.INFO_PREVIEW_BLESSING)).getText();
    }

    // find button used to upload an image
    static WebElement findPictureUploadOption(WebDriver driver) {
        return driver.findElement(By.className(Constants.INFO_PICTURE_CLASS)).findElement(By.tagName(Constants.INFO_PICTURE_TAG));
    }

    // find sender text color
    static String findTextColor(WebDriver driver) {
        return driver.findElement(By.xpath(Constants.INFO_TEXT_COLOR)).getCssValue(Constants.INFO_TEXT_COLOR_VALUE);
    }

    // choose birthday option from the events drop down
    static WebElement findEvent(WebDriver driver) {
        driver.findElement(By.linkText(Constants.INFO_EVENT)).click();
        List<WebElement> areas = driver.findElements(By.className(Constants.INFO_EVENT_LIST));
        return areas.get(3);
    }

    // find the send gift right after payment radio button
    static WebElement findAfterPayment(WebDriver driver) {
        return driver.findElement(By.className(Constants.INFO_AFTER_PAYMENT));
    }

    // find the send by email option
    static WebElement findEmailOption(WebDriver driver) {
        return driver.findElement(By.xpath(Constants.INFO_EMAIL_OPTION));
    }

    // find receiving email textbox
    static WebElement findEmail(WebDriver driver) {
        return driver.findElement(By.className(Constants.INFO_EMAIL));
    }

    // find the save button
    static WebElement findSubmit(WebDriver driver) {
        return driver.findElement(By.className(Constants.INFO_SUBMIT));
    }

}
