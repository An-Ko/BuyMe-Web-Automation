//import com.aventstack.extentreports.MediaEntityBuilder;
//import com.aventstack.extentreports.Status;
//import org.junit.ComparisonFailure;
//import org.junit.Test;
//import org.openqa.selenium.ElementNotInteractableException;
//import org.openqa.selenium.NoSuchElementException;
//import org.openqa.selenium.WebDriverException;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.xml.sax.SAXException;
//
//import javax.xml.parsers.ParserConfigurationException;
//import java.io.IOException;
//
//public class Delete {
//    @Test
//    public void sanityTest() throws IOException, SAXException, ParserConfigurationException {
//
//        test.pass(Constants.HOME_GUEST_SCREENSHOT, MediaEntityBuilder.createScreenCaptureFromPath(Tools.takeScreenShot(Constants.SCREENSHOT_PATH + 1)).build());
//        try {
//            HomeScreen.findLoginOrRegister(driver).click();
//            test.log(Status.PASS, Constants.HOME_SCREEN + Constants.LOGIN_BUTTON + Constants.CLICK_PASS);
//        } catch (NoSuchElementException e) {
//            test.log(Status.FAIL, Constants.HOME_SCREEN + Constants.LOGIN_BUTTON + Constants.FIND_FAIL + e.getMessage());
//        } catch (WebDriverException e) {
//            test.log(Status.FAIL, Constants.HOME_SCREEN + Constants.LOGIN_BUTTON + Constants.CLICK_FAIL + e.getMessage());
//        }
//        test.pass(Constants.LOGIN_SCREENSHOT, MediaEntityBuilder.createScreenCaptureFromPath(Tools.takeScreenShot(Constants.SCREENSHOT_PATH + 2)).build());
//
//        // - Registration screen
//        RegistrationScreen.findRegister(driver).click();
//        try {
//            RegistrationScreen.assertError(driver);
//        } catch (ComparisonFailure e) {
//            test.log(Status.FAIL, Constants.REGISTRATION_SCREEN + Constants.ASSERT_ERROR + Constants.ASSERT_FAIL + e.getMessage());
//        } finally {
//            test.log(Status.PASS, Constants.REGISTRATION_SCREEN + Constants.ASSERT_ERROR + Constants.ASSERT_PASS);
//        }
//        try {
//            HomeScreen.findRegister(driver).click();
//        } catch (NoSuchElementException e) {
//            test.log(Status.FAIL, Constants.REGISTRATION_SCREEN + Constants.REGISTER_OPTION + Constants.FIND_FAIL + e.getMessage());
//        } catch (WebDriverException e) {
//            test.log(Status.FAIL, Constants.REGISTRATION_SCREEN + Constants.REGISTER_OPTION + Constants.CLICK_FAIL + e.getMessage());
//        } finally {
//            test.log(Status.PASS, Constants.REGISTRATION_SCREEN + Constants.REGISTER_OPTION + Constants.CLICK_PASS);
//        }
//        try {
//            RegistrationScreen.enterFirstName(driver);
//        } catch (NoSuchElementException e) {
//            test.log(Status.FAIL, Constants.REGISTRATION_SCREEN + Constants.FIRST_NAME_INPUT + Constants.FIND_FAIL + e.getMessage());
//        } catch (ElementNotInteractableException e) {
//            test.log(Status.FAIL, Constants.REGISTRATION_SCREEN + Constants.FIRST_NAME_INPUT + Constants.INPUT_FAIL + e.getMessage());
//        } finally {
//            test.log(Status.PASS, Constants.REGISTRATION_SCREEN + Constants.FIRST_NAME_INPUT + Constants.INPUT_PASS);
//        }
//        try {
//            RegistrationScreen.enterEmail(driver);
//        } catch (NoSuchElementException e) {
//            test.log(Status.FAIL, Constants.REGISTRATION_SCREEN + Constants.EMAIL_INPUT + Constants.FIND_FAIL + e.getMessage());
//        } catch (ElementNotInteractableException e) {
//            test.log(Status.FAIL, Constants.REGISTRATION_SCREEN + Constants.EMAIL_INPUT + Constants.INPUT_FAIL + e.getMessage());
//        } finally {
//            test.log(Status.PASS, Constants.REGISTRATION_SCREEN + Constants.EMAIL_INPUT + Constants.INPUT_PASS);
//        }
//        try {
//            RegistrationScreen.enterPassword(driver);
//        } catch (NoSuchElementException e) {
//            test.log(Status.FAIL, Constants.REGISTRATION_SCREEN + Constants.PASSWORD_INPUT + Constants.FIND_FAIL + e.getMessage());
//        } catch (ElementNotInteractableException e) {
//            test.log(Status.FAIL, Constants.REGISTRATION_SCREEN + Constants.PASSWORD_INPUT + Constants.INPUT_FAIL + e.getMessage());
//        } finally {
//            test.log(Status.PASS, Constants.REGISTRATION_SCREEN + Constants.PASSWORD_INPUT + Constants.INPUT_PASS);
//        }
//        try {
//            RegistrationScreen.enterConfirmPassword(driver);
//        } catch (NoSuchElementException e) {
//            test.log(Status.FAIL, Constants.REGISTRATION_SCREEN + Constants.CONFIRM_PASSWORD_INPUT + Constants.FIND_FAIL + e.getMessage());
//        } catch (ElementNotInteractableException e) {
//            test.log(Status.FAIL, Constants.REGISTRATION_SCREEN + Constants.CONFIRM_PASSWORD_INPUT + Constants.INPUT_FAIL + e.getMessage());
//        } finally {
//            test.log(Status.PASS, Constants.REGISTRATION_SCREEN + Constants.CONFIRM_PASSWORD_INPUT + Constants.INPUT_PASS);
//        }
//        try {
//            RegistrationScreen.chooseAgree(driver);
//        } catch (NoSuchElementException e) {
//            test.log(Status.FAIL, Constants.REGISTRATION_SCREEN + Constants.AGREE_BUTTON + Constants.FIND_FAIL + e.getMessage());
//        } catch (WebDriverException e) {
//            test.log(Status.FAIL, Constants.REGISTRATION_SCREEN + Constants.AGREE_BUTTON + Constants.CLICK_FAIL + e.getMessage());
//        } finally {
//            test.log(Status.PASS, Constants.REGISTRATION_SCREEN + Constants.AGREE_BUTTON + Constants.CLICK_PASS);
//        }
//        test.pass(Constants.REGISTRATION_SCREENSHOT, MediaEntityBuilder.createScreenCaptureFromPath(Tools.takeScreenShot(Constants.SCREENSHOT_PATH + 3)).build());
//        try {
//            RegistrationScreen.findRegister(driver).click();
//        } catch (NoSuchElementException e) {
//            test.log(Status.FAIL, Constants.REGISTRATION_SCREEN + Constants.REGISTER_BUTTON + Constants.FIND_FAIL + e.getMessage());
//        } catch (WebDriverException e) {
//            test.log(Status.FAIL, Constants.REGISTRATION_SCREEN + Constants.REGISTER_BUTTON + Constants.CLICK_FAIL + e.getMessage());
//        } finally {
//            test.log(Status.PASS, Constants.REGISTRATION_SCREEN + Constants.REGISTER_BUTTON + Constants.CLICK_PASS);
//        }
//
//        // - Choose gift properties
//        // wait for URL to change back from login screen
//        WebDriverWait wait = new WebDriverWait(driver, 20);
//        try {
//            wait.until(ExpectedConditions.urlToBe(Tools.getData(Constants.URL_KEY_NAME)));
//        } catch (ComparisonFailure e) {
//            test.log(Status.FAIL, Constants.HOME_SCREEN + Constants.ASSERT_URL + Constants.CHANGE_FAIL + e.getMessage());
//        } finally {
//            test.log(Status.PASS, Constants.HOME_SCREEN + Constants.ASSERT_URL + Constants.CHANGE_PASS);
//        }
//        try {
//            HomeScreen.ChatBegone(driver);
//        } catch (NoSuchElementException e) {} finally {
//            test.log(Status.PASS, Constants.CHAT_CLOSED + Constants.LOGIN_BUTTON);
//        }
//        try {
//            HomeScreen.findPrice(driver).click();
//        } catch (NoSuchElementException e) {
//            test.log(Status.FAIL, Constants.HOME_SCREEN + Constants.PRICE_OPTION + Constants.FIND_FAIL + e.getMessage());
//        } catch (WebDriverException e) {
//            test.log(Status.FAIL, Constants.HOME_SCREEN + Constants.PRICE_OPTION + Constants.CLICK_FAIL + e.getMessage());
//        } finally {
//            test.log(Status.PASS, Constants.HOME_SCREEN + Constants.PRICE_OPTION + Constants.CLICK_PASS);
//        }
//        try {
//            HomeScreen.findArea(driver).click();
//        } catch (NoSuchElementException e) {
//            test.log(Status.FAIL, Constants.HOME_SCREEN + Constants.AREA_OPTION + Constants.FIND_FAIL + e.getMessage());
//        } catch (WebDriverException e) {
//            test.log(Status.FAIL, Constants.HOME_SCREEN + Constants.AREA_OPTION + Constants.CLICK_FAIL + e.getMessage());
//        } finally {
//            test.log(Status.PASS, Constants.HOME_SCREEN + Constants.AREA_OPTION + Constants.CLICK_PASS);
//        }
//        try {
//            HomeScreen.findCategory(driver).click();
//        } catch (NoSuchElementException e) {
//            test.log(Status.FAIL, Constants.HOME_SCREEN + Constants.CATEGORY_OPTION + Constants.FIND_FAIL + e.getMessage());
//        } catch (WebDriverException e) {
//            test.log(Status.FAIL, Constants.HOME_SCREEN + Constants.CATEGORY_OPTION + Constants.CLICK_FAIL + e.getMessage());
//        } finally {
//            test.log(Status.PASS, Constants.HOME_SCREEN + Constants.CATEGORY_OPTION + Constants.CLICK_PASS);
//        }
//        test.pass(Constants.HOME_USER_SCREENSHOT, MediaEntityBuilder.createScreenCaptureFromPath(Tools.takeScreenShot(Constants.SCREENSHOT_PATH + 4)).build());
//        HomeScreen.url = driver.getCurrentUrl();
//        try {
//            HomeScreen.findSearch(driver).click();
//        } catch (NoSuchElementException e) {
//            test.log(Status.FAIL, Constants.HOME_SCREEN + Constants.SEARCH_BUTTON + Constants.FIND_FAIL + e.getMessage());
//        } catch (WebDriverException e) {
//            test.log(Status.FAIL, Constants.HOME_SCREEN + Constants.SEARCH_BUTTON + Constants.CLICK_FAIL + e.getMessage());
//        } finally {
//            test.log(Status.PASS, Constants.HOME_SCREEN + Constants.SEARCH_BUTTON + Constants.CLICK_PASS);
//        }
//
//        // - Choose gift card
//        try {
//            wait.until(ExpectedConditions.urlContains(Constants.GIFT_URL));
//        } catch (ComparisonFailure e) {
//            test.log(Status.FAIL, Constants.CHOOSE_GIFT_SCREEN + Constants.ASSERT_URL + Constants.CHANGE_FAIL + e.getMessage());
//        } finally {
//            test.log(Status.PASS, Constants.CHOOSE_GIFT_SCREEN + Constants.ASSERT_URL + Constants.CHANGE_PASS);
//        }
//        try {
//            ChooseGiftScreen.assertUrl(driver);
//        } catch (ComparisonFailure e) {
//            test.log(Status.FAIL, Constants.CHOOSE_GIFT_SCREEN + Constants.ASSERT_URL + Constants.ASSERT_FAIL + e.getMessage());
//        } finally {
//            test.log(Status.PASS, Constants.CHOOSE_GIFT_SCREEN + Constants.ASSERT_URL + Constants.ASSERT_PASS);
//        }
//        test.pass(Constants.RESTAURANTS_SCREENSHOT, MediaEntityBuilder.createScreenCaptureFromPath(Tools.takeScreenShot(Constants.SCREENSHOT_PATH + 5)).build());
//        ChooseGiftScreen.scrollToBottom(driver);
//        test.log(Status.PASS, Constants.CHOOSE_GIFT_SCREEN + Constants.SCROLL_PASS);
//        test.pass(Constants.RESTAURANTS_SCREENSHOT, MediaEntityBuilder.createScreenCaptureFromPath(Tools.takeScreenShot(Constants.SCREENSHOT_PATH + 6)).build());
//        try {
//            ChooseGiftScreen.findBusiness(driver).click();
//        } catch (NoSuchElementException e) {
//            test.log(Status.FAIL, Constants.CHOOSE_GIFT_SCREEN + Constants.BUSINESS_OPTION + Constants.FIND_FAIL + e.getMessage());
//        } catch (WebDriverException e) {
//            test.log(Status.FAIL, Constants.CHOOSE_GIFT_SCREEN + Constants.BUSINESS_OPTION + Constants.CLICK_FAIL + e.getMessage());
//        } finally {
//            test.log(Status.PASS, Constants.CHOOSE_GIFT_SCREEN + Constants.BUSINESS_OPTION + Constants.CLICK_PASS);
//        }
//        try {
//            wait.until(ExpectedConditions.elementToBeClickable(ChooseGiftScreen.findAmount(driver)));
//        } catch (ComparisonFailure e) {
//            test.log(Status.FAIL, Constants.CHOOSE_GIFT_SCREEN + Constants.AMOUNT_INPUT + Constants.CLICKABLE_FAIL + e.getMessage());
//        } finally {
//            test.log(Status.PASS, Constants.CHOOSE_GIFT_SCREEN + Constants.AMOUNT_INPUT + Constants.CLICKABLE_PASS);
//        }
//        test.pass(Constants.GIFTCARD_SCREENSHOT, MediaEntityBuilder.createScreenCaptureFromPath(Tools.takeScreenShot(Constants.SCREENSHOT_PATH + 7)).build());
//        try {
//            ChooseGiftScreen.sendAmount(driver);
//        } catch (NoSuchElementException e) {
//            test.log(Status.FAIL, Constants.CHOOSE_GIFT_SCREEN + Constants.AMOUNT_INPUT + Constants.FIND_FAIL + "confused 2 " + e.getMessage());
//        } catch (ElementNotInteractableException e) {
//            test.log(Status.FAIL, Constants.CHOOSE_GIFT_SCREEN + Constants.AMOUNT_INPUT + Constants.INPUT_FAIL + e.getMessage());
//        } finally {
//            test.log(Status.PASS, Constants.CHOOSE_GIFT_SCREEN + Constants.AMOUNT_INPUT + Constants.INPUT_PASS);
//        }
//
//        // - Enter sender / receiver details
//        try {
//            SenderReceiverInfoScreen.findSomeoneElse(driver).click();
//        } catch (NoSuchElementException e) {
//            test.log(Status.FAIL, Constants.SENDER_RECEIVER_SCREEN + Constants.SOMEONE_ELSE_BUTTON + Constants.FIND_FAIL + e.getMessage());
//        } catch (WebDriverException e) {
//            test.log(Status.FAIL, Constants.SENDER_RECEIVER_SCREEN + Constants.SOMEONE_ELSE_BUTTON + Constants.CLICK_FAIL + e.getMessage());
//        } finally {
//            test.log(Status.PASS, Constants.SENDER_RECEIVER_SCREEN + Constants.SOMEONE_ELSE_BUTTON + Constants.CLICK_PASS);
//        }
//        try {
//            SenderReceiverInfoScreen.enterReceiverName(driver);
//        } catch (NoSuchElementException e) {
//            test.log(Status.FAIL, Constants.SENDER_RECEIVER_SCREEN + Constants.RECEIVER_NAME_INPUT + Constants.FIND_FAIL + e.getMessage());
//        } catch (ElementNotInteractableException e) {
//            test.log(Status.FAIL, Constants.SENDER_RECEIVER_SCREEN + Constants.RECEIVER_NAME_INPUT + Constants.INPUT_FAIL + e.getMessage());
//        } finally {
//            test.log(Status.PASS, Constants.SENDER_RECEIVER_SCREEN + Constants.RECEIVER_NAME_INPUT + Constants.INPUT_PASS);
//        }
//        try {
//            SenderReceiverInfoScreen.enterSenderName(driver);
//        } catch (NoSuchElementException e) {
//            test.log(Status.FAIL, Constants.SENDER_RECEIVER_SCREEN + Constants.SENDER_NAME_INPUT + Constants.FIND_FAIL + e.getMessage());
//        } catch (ElementNotInteractableException e) {
//            test.log(Status.FAIL, Constants.SENDER_RECEIVER_SCREEN + Constants.SENDER_NAME_INPUT + Constants.INPUT_FAIL + e.getMessage());
//        } finally {
//            test.log(Status.PASS, Constants.SENDER_RECEIVER_SCREEN + Constants.SENDER_NAME_INPUT + Constants.INPUT_PASS);
//        }
//        try {
//            SenderReceiverInfoScreen.findEvent(driver).click();
//        } catch (NoSuchElementException e) {
//            test.log(Status.FAIL, Constants.SENDER_RECEIVER_SCREEN + Constants.EVENT_OPTION + Constants.FIND_FAIL + e.getMessage());
//        } catch (WebDriverException e) {
//            test.log(Status.FAIL, Constants.SENDER_RECEIVER_SCREEN + Constants.EVENT_OPTION + Constants.CLICK_FAIL + e.getMessage());
//        } finally {
//            test.log(Status.PASS, Constants.SENDER_RECEIVER_SCREEN + Constants.EVENT_OPTION + Constants.CLICK_PASS);
//        }
//        try {
//            SenderReceiverInfoScreen.enterBlessing(driver);
//        } catch (NoSuchElementException e) {
//            test.log(Status.FAIL, Constants.SENDER_RECEIVER_SCREEN + Constants.BLESSING_INPUT + Constants.FIND_FAIL + e.getMessage());
//        } catch (ElementNotInteractableException e) {
//            test.log(Status.FAIL, Constants.SENDER_RECEIVER_SCREEN + Constants.BLESSING_INPUT + Constants.INPUT_FAIL + e.getMessage());
//        } finally {
//            test.log(Status.PASS, Constants.SENDER_RECEIVER_SCREEN + Constants.BLESSING_INPUT + Constants.INPUT_PASS);
//        }
//        try {
//            SenderReceiverInfoScreen.uploadPicture(driver);
//        } catch (NoSuchElementException e) {
//            test.log(Status.FAIL, Constants.SENDER_RECEIVER_SCREEN + Constants.PICTURE_UPLOAD + Constants.FIND_FAIL + e.getMessage());
//        } catch (WebDriverException e) {
//            test.log(Status.FAIL, Constants.SENDER_RECEIVER_SCREEN + Constants.PICTURE_UPLOAD + Constants.UPLOAD_FAIL + e.getMessage());
//        } finally {
//            test.log(Status.PASS, Constants.SENDER_RECEIVER_SCREEN + Constants.PICTURE_UPLOAD + Constants.UPLOAD_PASS);
//        }
//        try {
//            SenderReceiverInfoScreen.assertText(driver);
//        } catch (ComparisonFailure e) {
//            test.log(Status.FAIL, Constants.SENDER_RECEIVER_SCREEN + Constants.ASSERT_TEXT + Constants.ASSERT_FAIL + e.getMessage());
//        } finally {
//            test.log(Status.PASS, Constants.SENDER_RECEIVER_SCREEN + Constants.ASSERT_TEXT + Constants.ASSERT_PASS);
//        }
//        try {
//            SenderReceiverInfoScreen.findAfterPayment(driver).click();
//        } catch (NoSuchElementException e) {
//            test.log(Status.FAIL, Constants.SENDER_RECEIVER_SCREEN + Constants.AFTER_PAYMENT_BUTTON + Constants.FIND_FAIL + e.getMessage());
//        } catch (WebDriverException e) {
//            test.log(Status.FAIL, Constants.SENDER_RECEIVER_SCREEN + Constants.AFTER_PAYMENT_BUTTON + Constants.CLICK_FAIL + e.getMessage());
//        } finally {
//            test.log(Status.PASS, Constants.SENDER_RECEIVER_SCREEN + Constants.AFTER_PAYMENT_BUTTON + Constants.CLICK_PASS);
//        }
//        try {
//            SenderReceiverInfoScreen.findEmail(driver).click();
//        } catch (NoSuchElementException e) {
//            test.log(Status.FAIL, Constants.SENDER_RECEIVER_SCREEN + Constants.RECEIVER_EMAIL_BUTTON + Constants.FIND_FAIL + e.getMessage());
//        } catch (WebDriverException e) {
//            test.log(Status.FAIL, Constants.SENDER_RECEIVER_SCREEN + Constants.RECEIVER_EMAIL_BUTTON + Constants.CLICK_FAIL + e.getMessage());
//        } finally {
//            test.log(Status.PASS, Constants.SENDER_RECEIVER_SCREEN + Constants.RECEIVER_EMAIL_BUTTON + Constants.CLICK_PASS);
//        }
//        try {
//            SenderReceiverInfoScreen.enterEmail(driver);
//        } catch (NoSuchElementException e) {
//            test.log(Status.FAIL, Constants.SENDER_RECEIVER_SCREEN + Constants.RECEIVER_EMAIL_INPUT + Constants.FIND_FAIL + e.getMessage());
//        } catch (ElementNotInteractableException e) {
//            test.log(Status.FAIL, Constants.SENDER_RECEIVER_SCREEN + Constants.RECEIVER_EMAIL_INPUT + Constants.INPUT_FAIL + e.getMessage());
//        } finally {
//            test.log(Status.PASS, Constants.SENDER_RECEIVER_SCREEN + Constants.RECEIVER_EMAIL_INPUT + Constants.INPUT_PASS);
//        }
//        try {
//            SenderReceiverInfoScreen.clickSubmit(driver);
//        } catch (NoSuchElementException e) {
//            test.log(Status.FAIL, Constants.SENDER_RECEIVER_SCREEN + Constants.SUBMIT_BUTTON + Constants.FIND_FAIL + e.getMessage());
//        } catch (WebDriverException e) {
//            test.log(Status.FAIL, Constants.SENDER_RECEIVER_SCREEN + Constants.SUBMIT_BUTTON + Constants.CLICK_FAIL + e.getMessage());
//        } finally {
//            test.log(Status.PASS, Constants.SENDER_RECEIVER_SCREEN + Constants.SUBMIT_BUTTON + Constants.CLICK_PASS);
//        }
//        test.pass(Constants.DETAILS_SCREENSHOT, MediaEntityBuilder.createScreenCaptureFromPath(Tools.takeScreenShot(Constants.SCREENSHOT_PATH + 8)).build());
//        try {
//            SenderReceiverInfoScreen.assertSenderName(driver);
//        } catch (ComparisonFailure e) {
//            test.log(Status.FAIL, Constants.SENDER_RECEIVER_SCREEN + Constants.SENDER_NAME_INPUT + Constants.ASSERT_FAIL + e.getMessage());
//        } finally {
//            test.log(Status.PASS, Constants.SENDER_RECEIVER_SCREEN + Constants.SENDER_NAME_INPUT + Constants.ASSERT_PASS);
//        }
//        try {
//            SenderReceiverInfoScreen.assertReceiverName(driver);
//        } catch (ComparisonFailure e) {
//            test.log(Status.FAIL, Constants.SENDER_RECEIVER_SCREEN + Constants.RECEIVER_NAME_INPUT + Constants.ASSERT_FAIL + e.getMessage());
//        } finally {
//            test.log(Status.PASS, Constants.SENDER_RECEIVER_SCREEN + Constants.RECEIVER_NAME_INPUT + Constants.ASSERT_PASS);
//        }
//        try {
//            SenderReceiverInfoScreen.assertBlessing(driver);
//        } catch (ComparisonFailure e) {
//            test.log(Status.FAIL, Constants.SENDER_RECEIVER_SCREEN + Constants.BLESSING_INPUT + Constants.ASSERT_FAIL + e.getMessage());
//        } finally {
//            test.log(Status.PASS, Constants.SENDER_RECEIVER_SCREEN + Constants.BLESSING_INPUT + Constants.ASSERT_PASS);
//        }
//    }
//}
