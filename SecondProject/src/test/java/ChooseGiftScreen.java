import org.openqa.selenium.*;

import java.util.List;

class ChooseGiftScreen {

    // scroll to the bottom of the page
    static void scrollToBottom(WebDriver driver) {
        ((JavascriptExecutor) driver).executeScript(Constants.CHOOSE_GIFT_SCROLL);
    }

    // choose a business to buy from
    static WebElement findBusiness(WebDriver driver) {
        List<WebElement> prices = driver.findElements(By.className(Constants.CHOOSE_GIFT_BUSINESS));
        return prices.get(1);
    }

    // find gift card input field
    static WebElement findAmount (WebDriver driver) {
        return driver.findElement(By.className(Constants.CHOOSE_GIFT_AMOUNT_BOX));
    }

}
