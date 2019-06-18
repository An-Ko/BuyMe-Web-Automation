//import org.junit.Assert;
//import org.openqa.selenium.*;
//
//import static org.openqa.selenium.Keys.CONTROL;
//
////WebDriverException
//
//public class Delete3 {
//
//    //choose gift screen
//
//    // confirm URL is different from Home Screen URL
//    static void assertUrl(WebDriver driver) {
//        String urlExpected = HomeScreen.url;
//        String urlActual = driver.getCurrentUrl();
//        Assert.assertNotSame(urlExpected,urlActual);
//        System.out.println("URL has changed.");
//    }
//
//    // enter a gift card amount
//    static void sendAmount(WebDriver driver) {
//        ChooseGiftScreen.findAmount(driver).sendKeys("11");
//        ChooseGiftScreen.findAmount(driver).sendKeys(Keys.ENTER);
//    }
//
//
//    //home screen
//
//    static Object ChatBegone(WebDriver driver) {
//        return ((JavascriptExecutor)driver).executeScript("document.getElementById(\"chat-widget-container\").style.display=\"none\";");
//    }
//
//
//    //registration screen
//
//    // assert error message on login screen
//    static void assertError (WebDriver driver) {
//        Assert.assertEquals("כל המתנות מחכות לך! אבל קודם צריך מייל וסיסמה",driver.findElement(By.className("parsley-required")).getText());
//    }
//
//    // click the confirm terms radio button
//    static void chooseAgree (WebDriver driver) {
//        WebElement agree = driver.findElement(By.className("confirmTerms")).findElement(By.className("fa"));
//        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", agree);
//    }
//
//
//    //sender receiver screen
//
//
//    // enter receiver name
//    static void enterReceiverName(WebDriver driver) {
//        SenderReceiverInfoScreen.findReceiverName(driver).sendKeys("Maayan");
//    }
//
//
//    // assert receiver name
//    static void assertReceiverName(WebDriver driver) {
//        Assert.assertEquals(SenderReceiverInfoScreen.findReceiverName(driver).getAttribute("value"),driver.findElement(By.className("receiver")).findElement(By.className("name")).getText());
//        System.out.println("Receiver name is as expected");
//    }
//
//
//    // remove former sender name and enter a new one
//    static void enterSenderName(WebDriver driver) {
//        SenderReceiverInfoScreen.findSenderName(driver).sendKeys(CONTROL,"a");
//        SenderReceiverInfoScreen.findSenderName(driver).sendKeys(CONTROL,"x");
//        SenderReceiverInfoScreen.findSenderName(driver).sendKeys("Anna");
//    }
//
//
//    // assert sender name
//    static void assertSenderName(WebDriver driver) {
//        Assert.assertEquals(SenderReceiverInfoScreen.findSenderName(driver).getAttribute("value"),driver.findElement(By.className("sender")).findElement(By.className("name")).getText());
//        System.out.println("Sender name is as expected");
//    }
//
//
//    // enter blessing
//    static void enterBlessing(WebDriver driver) {
//        SenderReceiverInfoScreen.findBlessing(driver).clear();
//        SenderReceiverInfoScreen.findBlessing(driver).sendKeys("Happy birthday, hope you like this gift!");
//    }
//
//
//    // assert receiver name
//    static void assertBlessing(WebDriver driver) {
//        Assert.assertEquals(SenderReceiverInfoScreen.findBlessing(driver).getAttribute("value"),driver.findElement(By.className("cut-greeting")).getText());
//        System.out.println("Blessing is as expected");
//    }
//
//
//    // upload a picture
//    static void uploadPicture(WebDriver driver) {
//        driver.findElement(By.className("ui-file")).findElement(By.tagName("input")).sendKeys(Constants.PICTURE_LOCATION);
//    }
//
//
//    // asserts sender text
//    static void assertText(WebDriver driver) {
//        Assert.assertEquals("rgba(250, 180, 66, 1)",driver.findElement(By.xpath("//div[@class='text']/div[@class='step-title highlighted']")).getCssValue("color"));
//        System.out.println("Text color is as expected");
//    }
//
//
//    // enter receiver email
//    static void enterEmail (WebDriver driver) {
//        driver.findElement(By.className("input-mail")).sendKeys("receiver@email.com");
//    }
//
//    // click on the save button
//    static void clickSubmit(WebDriver driver) {
//        driver.findElement(By.className("btn-save")).click();
//    }
//
//
//
//
//
//}
