import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.junit.*;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class Main {

    private static WebDriver driver;
    private static WebDriverWait wait;
    private static ExtentReports extent;
    private static ExtentTest test;

    @BeforeClass
    public static void first() throws org.xml.sax.SAXException, ParserConfigurationException, IOException {
        System.setProperty(Constants.STRING_KEY_CHROME, Constants.CHROME_LOCATION);
        System.setProperty(Constants.STRING_KEY_FIREFOX, Constants.FIREFOX_LOCATION);
        if (Tools.getData(Constants.BROWSER_KEY_NAME).equals(Constants.TYPE_CHROME)) {
            driver = new ChromeDriver();
        } else if (Tools.getData(Constants.BROWSER_KEY_NAME).equals(Constants.TYPE_FIREFOX)) {
            driver = new FirefoxDriver();
        }

        driver.manage().window().maximize();
        driver.get(Tools.getData(Constants.URL_KEY_NAME));
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 20);

        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(Constants.REPORT_PATH);
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        test = extent.createTest(Constants.TEST_NAME, Constants.TEST_DESCRIPTION);
        test.log(Status.INFO, Constants.TEST_LOG_DETAILS_BEFORE_CLASS);
    }

    @Test
    public void Test_01_Registration() throws IOException {

        test.pass(Constants.HOME_GUEST_SCREENSHOT, MediaEntityBuilder.createScreenCaptureFromPath
                (Tools.takeScreenShot(1,driver)).build());

        Tools.tryClick(HomeScreen.findLoginOrRegister(driver),
                Constants.HOME_SCREEN, Constants.LOGIN_BUTTON, test);

        test.pass(Constants.LOGIN_SCREENSHOT, MediaEntityBuilder.createScreenCaptureFromPath
                (Tools.takeScreenShot(2, driver)).build());

        // - Registration screen
        Tools.tryClick(RegistrationScreen.findRegister(driver),
                Constants.REGISTRATION_SCREEN, Constants.REGISTER_BUTTON, test);

        Tools.tryAssertEquals(Constants.REGISTRATION_ERROR_TEXT, RegistrationScreen.findError(driver).getText(),
                Constants.REGISTRATION_SCREEN, Constants.ASSERT_ERROR, test,"");

        Tools.tryClick(HomeScreen.findRegister(driver),
                Constants.REGISTRATION_SCREEN, Constants.REGISTER_OPTION, test);

        Tools.tryInput(Constants.REGISTRATION_FIRST_NAME_TEXT, RegistrationScreen.findFirstName(driver), false,
                Constants.REGISTRATION_SCREEN, Constants.FIRST_NAME_INPUT, test);

        Tools.tryInput(Constants.REGISTRATION_EMAIL_TEXT, RegistrationScreen.findEmail(driver), false,
                Constants.REGISTRATION_SCREEN, Constants.EMAIL_INPUT, test);

        Tools.tryInput(Constants.REGISTRATION_PASSWORD_TEXT, RegistrationScreen.findPassword(driver), false,
                Constants.REGISTRATION_SCREEN, Constants.PASSWORD_INPUT, test);

        Tools.tryInput(Constants.REGISTRATION_PASSWORD_TEXT, RegistrationScreen.findConfirmPassword(driver), false,
                Constants.REGISTRATION_SCREEN, Constants.CONFIRM_PASSWORD_INPUT, test);

        Tools.tryJSClick(RegistrationScreen.findAgree(driver),
                Constants.REGISTRATION_SCREEN, Constants.AGREE_BUTTON, test, driver);

        test.pass(Constants.REGISTRATION_SCREENSHOT, MediaEntityBuilder.createScreenCaptureFromPath
                (Tools.takeScreenShot(3, driver)).build());

        Tools.tryClick(RegistrationScreen.findRegister(driver),
                Constants.REGISTRATION_SCREEN, Constants.REGISTER_BUTTON, test);

    }

    @Test
    public void Test_02_Choose_Gift_Properties() throws IOException, SAXException, ParserConfigurationException {

        // - Choose gift properties

        // wait for URL to change back from login screen
        Tools.tryWaitURL(wait, Tools.getData(Constants.URL_KEY_NAME),
                Constants.HOME_SCREEN, Constants.ASSERT_URL, test);

        Tools.tryClick(HomeScreen.findPrice(driver),
                Constants.HOME_SCREEN, Constants.PRICE_OPTION, test);

        Tools.tryClick(HomeScreen.findArea(driver),
                Constants.HOME_SCREEN, Constants.AREA_OPTION, test);

        Tools.tryClick(HomeScreen.findCategory(driver),
                Constants.HOME_SCREEN, Constants.CATEGORY_OPTION, test);

        test.pass(Constants.HOME_USER_SCREENSHOT, MediaEntityBuilder.createScreenCaptureFromPath
                (Tools.takeScreenShot(4, driver)).build());

        HomeScreen.url = driver.getCurrentUrl();

        Tools.tryClick(HomeScreen.findSearch(driver),
                Constants.HOME_SCREEN, Constants.SEARCH_BUTTON, test);

    }

    @Test
    public void Test_03_Choose_Giftcard() throws IOException {

        // - Choose gift card

        Tools.tryWaitPartialURL(wait, Constants.CHOOSE_GIFT_URL,
                Constants.CHOOSE_GIFT_SCREEN, Constants.ASSERT_URL, test);

        Tools.tryAssertNotSame(HomeScreen.url, driver.getCurrentUrl(),
                Constants.REGISTRATION_SCREEN, Constants.ASSERT_ERROR, test,Constants.REGISTRATION_URL_CHANGED);

        test.pass(Constants.RESTAURANTS_SCREENSHOT, MediaEntityBuilder.createScreenCaptureFromPath
                (Tools.takeScreenShot(5, driver)).build());

        ChooseGiftScreen.scrollToBottom(driver);
        test.log(Status.PASS, Constants.CHOOSE_GIFT_SCREEN + Constants.SCROLL_PASS);

        test.pass(Constants.RESTAURANTS_SCREENSHOT, MediaEntityBuilder.createScreenCaptureFromPath
                (Tools.takeScreenShot(6, driver)).build());

        Tools.tryClick(ChooseGiftScreen.findBusiness(driver),
                Constants.CHOOSE_GIFT_SCREEN, Constants.BUSINESS_OPTION, test);

        Tools.tryWaitElement(wait, ChooseGiftScreen.findAmount(driver),
                Constants.CHOOSE_GIFT_SCREEN, Constants.AMOUNT_INPUT, test);

        test.pass(Constants.GIFTCARD_SCREENSHOT, MediaEntityBuilder.createScreenCaptureFromPath
                (Tools.takeScreenShot(7, driver)).build());

        Tools.tryInput(Constants.CHOOSE_GIFT_AMOUNT, ChooseGiftScreen.findAmount(driver), true,
                Constants.CHOOSE_GIFT_SCREEN, Constants.AMOUNT_INPUT, test);
    }

    @Test
    public void Test_04_Sender_Receiver_Details() throws IOException {

        // - Enter sender / receiver details

        Tools.tryClick(SenderReceiverInfoScreen.findSomeoneElse(driver),
                Constants.SENDER_RECEIVER_SCREEN, Constants.SOMEONE_ELSE_BUTTON, test);

        Tools.tryInput(Constants.INFO_RECEIVER_NAME_TEXT, SenderReceiverInfoScreen.findReceiverName(driver), false,
                Constants.SENDER_RECEIVER_SCREEN, Constants.RECEIVER_NAME_INPUT, test);

        Tools.tryInput(Constants.REGISTRATION_FIRST_NAME_TEXT, SenderReceiverInfoScreen.findSenderName(driver), false,
                Constants.SENDER_RECEIVER_SCREEN, Constants.SENDER_NAME_INPUT, test);

        Tools.tryClick(SenderReceiverInfoScreen.findEvent(driver),
                Constants.SENDER_RECEIVER_SCREEN, Constants.EVENT_OPTION, test);

        Tools.tryInput(Constants.INFO_BLESSING_TEXT, SenderReceiverInfoScreen.findBlessing(driver), false,
                Constants.SENDER_RECEIVER_SCREEN, Constants.BLESSING_INPUT, test);

        Tools.tryUpload(Constants.PICTURE_LOCATION, SenderReceiverInfoScreen.findPictureUploadOption(driver),
                Constants.SENDER_RECEIVER_SCREEN, Constants.PICTURE_UPLOAD, test);

        Tools.tryAssertEquals(Constants.INFO_EXPECTED_TEXT_COLOR, SenderReceiverInfoScreen.findTextColor(driver),
                Constants.SENDER_RECEIVER_SCREEN, Constants.ASSERT_TEXT, test, Constants.INFO_TEXT_COLOR_PRINT);

        Tools.tryClick(SenderReceiverInfoScreen.findAfterPayment(driver),
                Constants.SENDER_RECEIVER_SCREEN, Constants.AFTER_PAYMENT_BUTTON, test);

        Tools.tryClick(SenderReceiverInfoScreen.findEmailOption(driver),
                Constants.SENDER_RECEIVER_SCREEN, Constants.RECEIVER_EMAIL_BUTTON, test);

        Tools.tryInput(Constants.INFO_EMAIL_TEXT, SenderReceiverInfoScreen.findEmail(driver), false,
                Constants.SENDER_RECEIVER_SCREEN, Constants.RECEIVER_EMAIL_INPUT, test);

        Tools.tryClick(SenderReceiverInfoScreen.findSubmit(driver),
                Constants.SENDER_RECEIVER_SCREEN, Constants.SUBMIT_BUTTON, test);

        test.pass(Constants.DETAILS_SCREENSHOT, MediaEntityBuilder.createScreenCaptureFromPath
                (Tools.takeScreenShot(8, driver)).build());

        Tools.tryAssertEquals(SenderReceiverInfoScreen.findSenderNameValue(driver), SenderReceiverInfoScreen.findPreviewSenderNameText(driver),
                Constants.SENDER_RECEIVER_SCREEN, Constants.SENDER_NAME_INPUT, test, Constants.INFO_SENDER_NAME_PRINT);

        Tools.tryAssertEquals(SenderReceiverInfoScreen.findReceiverNameValue(driver), SenderReceiverInfoScreen.findPreviewReceiverNameText(driver),
                Constants.SENDER_RECEIVER_SCREEN, Constants.RECEIVER_NAME_INPUT, test, Constants.INFO_RECEIVER_NAME_PRINT);


        Tools.tryAssertEquals(SenderReceiverInfoScreen.findBlessingValue(driver), SenderReceiverInfoScreen.findPreviewBlessingText(driver),
                Constants.SENDER_RECEIVER_SCREEN, Constants.BLESSING_INPUT, test, Constants.INFO_BLESSING_PRINT);

    }

    @AfterClass
    public static void last() {
        driver.quit();
        test.log(Status.INFO, Constants.TEST_LOG_DETAILS_AFTER_CLASS);
        extent.flush();
    }
}