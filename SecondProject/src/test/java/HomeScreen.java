import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

class HomeScreen {

    // String for the Home Screen URL to go into
    static String url;

    // find login or register button
    static WebElement findLoginOrRegister (WebDriver driver)  {
        return driver.findElement(By.className(Constants.HOME_LOGIN_REGISTER));
    }

    // find register button
    static WebElement findRegister (WebDriver driver) {
        return driver.findElement(By.className(Constants.HOME_REGISTER));
    }

    // find desired price from drop down
    static WebElement findPrice (WebDriver driver) {
        driver.findElement(By.partialLinkText(Constants.HOME_PRICE)).click();
        List<WebElement> prices = driver.findElements(By.className(Constants.HOME_DROPDOWN_ACTIVE_RESULTS));
        return prices.get(1);
    }

    // find desired area from drop down
    static WebElement findArea (WebDriver driver) {
        driver.findElement(By.partialLinkText(Constants.HOME_AREA)).click();
        List<WebElement> areas = driver.findElements(By.className(Constants.HOME_DROPDOWN_ACTIVE_RESULTS));
        return areas.get(1);
    }

    // find desired category from drop down
    static WebElement findCategory (WebDriver driver) {
        driver.findElement(By.partialLinkText(Constants.HOME_CATEGORY)).click();
        List<WebElement> categories = driver.findElements(By.className(Constants.HOME_DROPDOWN_ACTIVE_RESULTS));
        return categories.get(3);
    }

    // find search button
    static WebElement findSearch (WebDriver driver) {
        List<WebElement> searches = driver.findElements(By.className(Constants.HOME_SEARCH));
        WebElement search = driver.findElement(By.className(Constants.HOME_SEARCH));
        for (WebElement result : searches) {
            if (!result.getAttribute(Constants.HOME_SEARCH_CLASS).equals(Constants.HOME_SEARCH_ITEM)) {
                search = result;
                break;
            }
        }
        return search;
    }

}
