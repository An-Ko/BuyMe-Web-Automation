import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

class RegistrationScreen {


    // find error message on login screen
    static WebElement findError (WebDriver driver) {
        return driver.findElement(By.className(Constants.REGISTRATION_ERROR));
    }

    // find username text box at registration screen
    static WebElement findFirstName (WebDriver driver) {
        return driver.findElement(By.cssSelector(Constants.REGISTRATION_FIRST_NAME));
    }

    // find email text box at registration screen
    static WebElement findEmail (WebDriver driver) {
        return driver.findElement(By.cssSelector(Constants.REGISTRATION_EMAIL));
    }

    // find password text box at registration screen
    static WebElement findPassword (WebDriver driver) {
        return driver.findElement(By.cssSelector(Constants.REGISTRATION_PASSWORD));
    }

    // find password text box at registration screen
    static WebElement findConfirmPassword (WebDriver driver) {
        return driver.findElement(By.cssSelector(Constants.REGISTRATION_PASSWORD_CONFIRM));
    }

    // find the confirm terms radio button
    static WebElement findAgree (WebDriver driver) {
        return driver.findElement(By.className(Constants.REGISTRATION_AGREE_FIRST))
                .findElement(By.className(Constants.REGISTRATION_AGREE_SECOND));
    }

    // find the registration button
    static WebElement findRegister (WebDriver driver) {
        return driver.findElement(By.className(Constants.REGISTRATION_REGISTER));
    }
}
