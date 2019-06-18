import java.io.File;

class Constants {

    // Settings
    private static final File PICTURE = new File (".\\files\\PICTURE.png");
    static final String PICTURE_LOCATION = PICTURE.getAbsolutePath();
    static final String CHROME_LOCATION = ".\\files\\chromedriver.exe";
    static final String FIREFOX_LOCATION = ".\\files\\geckodriver.exe";
    static final String URL_KEY_NAME = "URL";
    static final String BROWSER_KEY_NAME = "browserType";
    static final String TYPE_CHROME = "Chrome";
    static final String STRING_KEY_CHROME = "webdriver.chrome.driver";
    static final String TYPE_FIREFOX = "FireFox";
    static final String STRING_KEY_FIREFOX = "webdriver.firefox.driver";
    static final String REPORT_PATH = ".\\files\\extent.html";
    static final String SCREENSHOT_PATH = (PICTURE.getAbsolutePath().replace("PICTURE.png", "screenshots\\")).replace("\\.\\","\\") + System.currentTimeMillis();
    static final String TEST_NAME = "Second Project";
    static final String TEST_DESCRIPTION = "\"BuyMe\" Sanity Test";

    // HomeScreen
    static final String HOME_LOGIN_REGISTER = "seperator-link";
    static final String HOME_REGISTER = "text-btn";
    static final String HOME_DROPDOWN_ACTIVE_RESULTS = "active-result";
    static final String HOME_PRICE = "סכום";
    static final String HOME_AREA = "אזור";
    static final String HOME_CATEGORY = "קטגוריה";
    static final String HOME_SEARCH = "search";
    static final String HOME_SEARCH_CLASS = "class";
    static final String HOME_SEARCH_ITEM = "item";

    // Registration Screen
    static final String REGISTRATION_ERROR_TEXT = "כל המתנות מחכות לך! אבל קודם צריך מייל וסיסמה";
    static final String REGISTRATION_FIRST_NAME_TEXT = "Anna";
    static final String REGISTRATION_EMAIL_TEXT = Tools.createEmail();
    static final String REGISTRATION_PASSWORD_TEXT = "123456Ee";
    static final String REGISTRATION_URL_CHANGED = "URL has changed.";
    static final String REGISTRATION_ERROR = "parsley-required";
    static final String REGISTRATION_FIRST_NAME = "input[placeholder='שם פרטי']";
    static final String REGISTRATION_EMAIL = "input[placeholder='מייל']";
    static final String REGISTRATION_PASSWORD = "input[placeholder='סיסמה']";
    static final String REGISTRATION_PASSWORD_CONFIRM = "input[placeholder='אימות סיסמה']";
    static final String REGISTRATION_AGREE_FIRST = "confirmTerms";
    static final String REGISTRATION_AGREE_SECOND = "fa";
    static final String REGISTRATION_REGISTER = "orange";

    // ChooseGiftScreen
    static final String CHOOSE_GIFT_URL = "search";
    static final String CHOOSE_GIFT_SCROLL = "window.scrollTo(0, document.body.scrollHeight)";
    static final String CHOOSE_GIFT_BUSINESS = "supplier-logo";
    static final String CHOOSE_GIFT_AMOUNT_BOX = "input-cash";
    static final String CHOOSE_GIFT_AMOUNT = "11";

    // SenderReceiverScreen
    static final String INFO_SOMEONE_ELSE_OPTION = "label[data='forSomeone']";
    static final String INFO_INPUTS = "//label[@class='ember-view ui-field ui-input']/input[@class='ember-view ember-text-field']";
    static final String INFO_VALUE = "value";
    static final String INFO_SENDER = "sender";
    static final String INFO_SENDER_NAME_PRINT = "Sender name is as expected";
    static final String INFO_NAME = "name";
    static final String INFO_RECEIVER = "receiver";
    static final String INFO_RECEIVER_NAME_TEXT = "Maayan";
    static final String INFO_RECEIVER_NAME_PRINT = "Receiver name is as expected";
    static final String INFO_BLESSING = "textarea";
    static final String INFO_PREVIEW_BLESSING = "cut-greeting";
    static final String INFO_BLESSING_TEXT = "Happy birthday, hope you like this gift!";
    static final String INFO_BLESSING_PRINT = "Blessing is as expected";
    static final String INFO_PICTURE_CLASS = "ui-file";
    static final String INFO_PICTURE_TAG = "input";
    static final String INFO_TEXT_COLOR = "//div[@class='text']/div[@class='step-title highlighted']";
    static final String INFO_TEXT_COLOR_VALUE = "color";
    static final String INFO_EXPECTED_TEXT_COLOR = "rgba(250, 180, 66, 1)";
    static final String INFO_TEXT_COLOR_PRINT = "Text color is as expected";
    static final String INFO_EVENT = "לאיזה אירוע?";
    static final String INFO_EVENT_LIST = "active-result";
    static final String INFO_AFTER_PAYMENT = "send-now";
    static final String INFO_EMAIL_OPTION = "//span[@class='btn-send-option-inner']/span[@class='icon icon-envelope']";
    static final String INFO_EMAIL = "input-mail";
    static final String INFO_EMAIL_TEXT = "receiver@email.com";
    static final String INFO_SUBMIT = "btn-save";

    // Tools
    static final String XML_LOCATION = ".\\files\\config.xml";
    static final String EMAIL_DATE_FORMAT = "yyyyMMddHHmmss";
    static final String EMAIL_FAKE = "@SoFake.com";
    static final String JS_CLICK = "arguments[0].click();";

    // Screenshots / logs
    static final String HOME_GUEST_SCREENSHOT = "Home screen before registration";
    static final String LOGIN_SCREENSHOT = "Login screen";
    static final String REGISTRATION_SCREENSHOT = "Registration screen";
    static final String HOME_USER_SCREENSHOT = "Home screen after registration";
    static final String RESTAURANTS_SCREENSHOT = "Choose restaurant screen";
    static final String GIFTCARD_SCREENSHOT = "Choose giftCard amound screen";
    static final String DETAILS_SCREENSHOT = "Sender/receiver details screen";

    static final String SCREENSHOT_TYPE = ".png";

    static final String TEST_LOG_DETAILS_BEFORE_CLASS = "Connecting driver";
    static final String TEST_LOG_DETAILS_AFTER_CLASS = "Disconnecting driver";

    // Reports
    static final String CLICK_FAIL = " could not be clicked. ";
    static final String CLICK_PASS = " was clicked successfully.";
    static final String INPUT_FAIL = "Could not input ";
    static final String INPUT_PASS = " was input successfully.";
    static final String ASSERT_FAIL = " was not as expected. ";
    static final String ASSERT_PASS = " was as expected. ";
    static final String UPLOAD_FAIL = " could not be uploaded. ";
    static final String UPLOAD_PASS = " was uploaded successfully.";
    static final String SCROLL_PASS = "Bottom of the page was scrolled to successfully.";
    static final String CLICKABLE_FAIL = " is not clickable. ";
    static final String CLICKABLE_PASS = " is clickable.";
    static final String HOME_SCREEN = "Home screen: ";
    static final String REGISTRATION_SCREEN = "Registration screen: ";
    static final String CHOOSE_GIFT_SCREEN = "Choose gift screen: ";
    static final String SENDER_RECEIVER_SCREEN = "Sender/Receiver screen: ";
    static final String ASSERT_ERROR = "Error message on login screen";
    static final String LOGIN_BUTTON = "Login button";
    static final String REGISTER_OPTION = "Register option";
    static final String FIRST_NAME_INPUT = "First name";
    static final String EMAIL_INPUT = "Email address";
    static final String PASSWORD_INPUT = "Password";
    static final String CONFIRM_PASSWORD_INPUT = "Confirmation password";
    static final String AGREE_BUTTON = "Agree to terms radio button";
    static final String REGISTER_BUTTON = "Register button";
    static final String CHANGE_FAIL = " change failed. ";
    static final String CHANGE_PASS = " change succeeded.";
    static final String ASSERT_URL = "URL";
    static final String PRICE_OPTION = "Price option";
    static final String AREA_OPTION = "Area option";
    static final String CATEGORY_OPTION = "Category option";
    static final String SEARCH_BUTTON = "Search button";
    static final String BUSINESS_OPTION = "Business option";
    static final String AMOUNT_INPUT = "Amount";
    static final String SOMEONE_ELSE_BUTTON = "For someone else radio button";
    static final String RECEIVER_NAME_INPUT = "Receiver name";
    static final String SENDER_NAME_INPUT = "Sender name";
    static final String EVENT_OPTION = "Event option";
    static final String BLESSING_INPUT = "Blessing";
    static final String PICTURE_UPLOAD = "Picture";
    static final String ASSERT_TEXT = "Sender text color";
    static final String AFTER_PAYMENT_BUTTON = "After payment radio button";
    static final String RECEIVER_EMAIL_BUTTON = "Receiver email button";
    static final String RECEIVER_EMAIL_INPUT = "Receiver email";
    static final String SUBMIT_BUTTON = "Submit button";
}
