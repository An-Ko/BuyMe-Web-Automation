//import java.io.File;
//
//class Delete2 {
//
//    static final String PLATFORM_NAME_VALUE = "Android";
//    static final String DEVICE_NAME_VALUE = "Redmi 4";
//    static final String APP_PACKAGE = "appPackage";
//    static final String APP_ACTIVITY = "appActivity";
//    static final String DRIVER_SPEC = "http://0.0.0.0:4723/wd/hub/";
//    static final String REPORT_PATH = "reportPath";
//
//    static final String XML_LOCATION = ".\\files\\config.xml";
//
//    static final File FILE = new File(".\\files\\PICTURE.png");
//
//    static final String SCREENSHOT_PATH = (FILE.getAbsolutePath().replace("PICTURE.png", "screenshots\\")).replace("\\.\\", "\\") + System.currentTimeMillis();
//
//    static final String SCREENSHOT_TYPE = ".png";
//
//    static final String TEST_NAME = "Third Project";
//
//    static final String TEST_DESCRIPTION = "\"BuyMe\" Sanity Test";
//
//    public enum Direction {
//        RIGHT, LEFT, UP, DOWN
//    }
//
//    // IntroRegistrationScreen
//    static final String INTRO_SCREEN_SKIP_BUTTON = "il.co.mintapp.buyme:id/skipButton";
//    static final String INTRO_SCREEN_GOOGLE_BUTTON = "il.co.mintapp.buyme:id/googleButton";
//    static final String INTRO_SCREEN_GOOGLE_ACCOUNT = "new UiSelector().resourceId(\"com.google.android.gms:id/account_name\").index(1)";
//
//    // HomeScreen
//    static final String HOME_SCREEN_AMOUNT = "11";
//    static final String HOME_SCREEN_PROFILE_TAB = "il.co.mintapp.buyme:id/profileTab";
//    static final String HOME_SCREEN_HOME_TAB = "il.co.mintapp.buyme:id/homeTab";
//    static final String HOME_SCREEN_RELATIVE_LAYOUT = "new UiSelector().className(\"android.widget.RelativeLayout\").index(0)";
//    static final String HOME_SCREEN_FILTER_BUTTON = "il.co.mintapp.buyme:id/filterButton";
//    static final String HOME_SCREEN_PRICES = "il.co.mintapp.buyme:id/filterButton";
//    static final String HOME_SCREEN_FILTER_ACTION = "il.co.mintapp.buyme:id/filterActionButton";
//    static final String HOME_SCREEN_BUSINESS = "il.co.mintapp.buyme:id/purchaseContainer";
//    static final String HOME_SCREEN_PRICE = "il.co.mintapp.buyme:id/priceEditText";
//    static final String HOME_SCREEN_PURCHASE_BUTTON = "il.co.mintapp.buyme:id/purchaseButton";
//    static final String HOME_SCREEN_THANKS = "il.co.mintapp.buyme:id/thanksTitle";
//    static final String HOME_SCREEN_OK_BUTTON = "il.co.mintapp.buyme:id/okButton";
//
//    // SettingsScreen
//    static final String SETTINGS_SCREEN_ABOUT_BUYME = "new UiSelector().text(\"על BUYME\")";
//    static final String SETTINGS_SCREEN_BUYME_TITLE = "il.co.mintapp.buyme:id/titleText";
//    static final String SETTINGS_SCREEN_BUYME_CONTENT = "il.co.mintapp.buyme:id/contentText";
//    static final String SETTINGS_SCREEN_BACK_BUTTON = "android.widget.ImageButton";
//
//    // SenderReceiverScreen
//    static final String SENDER_RECEIVER_SCREEN_RECEIVER_TEXT = "Maayan";
//    static final String SENDER_RECEIVER_SCREEN_SENDER_TEXT = "Anna";
//    static final String SENDER_RECEIVER_SCREEN_BLESSING_TEXT = "Happy birthday!";
//    static final String SENDER_RECEIVER_SCREEN_RECEIVER = "il.co.mintapp.buyme:id/toEditText";
//    static final String SENDER_RECEIVER_SCREEN_BLESSING = "il.co.mintapp.buyme:id/blessEditText";
//    static final String SENDER_RECEIVER_SCREEN_SENDER = "il.co.mintapp.buyme:id/userFrom";
//    static final String SENDER_RECEIVER_SCREEN_CONTINUE_BUTTON = "il.co.mintapp.buyme:id/goNextButton";
//
//    // HowToSendScreen
//    static final String HOW_TO_SEND_SCREEN_EMAIL_TEXT = "ThisIs@Fake.com";
//    static final String HOW_TO_SEND_SCREEN_SEND_NOW_BUTTON = "il.co.mintapp.buyme:id/nowRadioButton";
//    static final String HOW_TO_SEND_SCREEN_CHECKBOXES = "il.co.mintapp.buyme:id/optionCheckBox";
//    static final String HOW_TO_SEND_SCREEN_EMAIL = "il.co.mintapp.buyme:id/description";
//    static final String HOW_TO_SEND_SCREEN_CONTINUE_BUTTON = "il.co.mintapp.buyme:id/goNextButton";
//    static final String HOW_TO_SEND_SCREEN_ADD_CARD = "il.co.mintapp.buyme:id/addCardOption";
//
//    // Screenshots
//    static final String CHOOSE_LOGIN_METHOD = "Introduction and Registration screen, Intro & Registration Screen: ";
//    static final String CHOOSE_USER = "Intro & Registration Screen, Choose a user: ";
//    static final String THANK_YOU_MESSAGE = "Home Screen, Thank you message: ";
//    static final String ABOUT_BUYME = "Settings Screen, About BuyMe: ";
//    static final String FILTERED_RESULTS = "Home Screen, Filter results: ";
//    static final String PRICE = "Home Screen, Price: ";
//    static final String BLESSINGS = "Sender & Receiver Information Screen, Blessings: ";
//    static final String HOW_TO_SEND = "Sender & Receiver Information Screen, How to send :";
//    static final String PAYMENT = "Sender & Receiver Information Screen: Payment";
//
//
//    // Reports
//    static final String TEST_LOG_DETAILS_AFTER_CLASS = "Disconnecting driver";
//    static final String TEST_LOG_DETAILS_BEFORE_CLASS = "Connecting driver";
//
//    static final String CLICK_PASS = " was clicked successfully.";
//    static final String CLICK_FAIL = " was not clicked. ";
//    static final String PRINT_PASS = " was printed successfully.";
//    static final String PRINT_FAIL = " was not printed. ";
//    static final String INPUT_PASS = " was input successfully.";
//    static final String INPUT_FAIL = " was not input. ";
//    static final String SWIPE_PASS = "Swiped successfully.";
//    static final String SWIPE_FAIL = "Failed to swipe. ";
//    static final String IS_VISIBLE = " is visible";
//    static final String NOT_VISIBLE = " is not visible. ";
//
//    static final String INTRO_REGISTRATION_SCREEN = "Introduction and Registration screen: ";
//    static final String HOME_SCREEN = "Home screen: ";
//    static final String SETTINGS_SCREEN = "Settings (profile) screen: ";
//    static final String SENDER_RECEIVER_SCREEN = "Sender/Receiver information screen: ";
//    static final String HOW_TO_SEND_SCREEN = "How to send screen: ";
//    static final String PAYMENT_SCREEN = "Payment screen: ";
//
//    static final String LOGIN_REGISTRATION_BUTTON = "Login/Registration button";
//    static final String GOOGLE_LOGIN_OPTION = "Google login option";
//    static final String CHOOSE_USER_OPTION = "User option";
//    static final String THANKS_SCREEN = "Thanks screen";
//    static final String OK_BUTTON = "Ok button";
//    static final String PROFILE_TAB = "Profile tab";
//    static final String ABOUT_BUYME_OPTION = "About buyMe option";
//    static final String PRINT_BUYME_INFO = "About buyMe information";
//    static final String BACK_BUTTON = "Back button";
//    static final String HOME_TAB = "Home tab";
//    static final String CATEGORY = "Category";
//    static final String FILTER_BUTTON = "Filter button";
//    static final String LOWEST_PRICE_BUTTON = "Lowest price button";
//    static final String HIGHEST_PRICE_BUTTON = "Highest price button";
//    static final String SEARCH_BY_FILTER_BUTTON = "Filtered search button";
//    static final String BUSINESS_OPTION = "Business option";
//    static final String AMOUNT = "Amount";
//    static final String PURCHASE_BUTTON = "Purchase button";
//    static final String RECEIVER_NAME = "Receiver name";
//    static final String BLESSING = "Blessing";
//    static final String SENDER_NAME = "Sender name";
//    static final String CONTINUE_BUTTON = "Continue button";
//    static final String SEND_NOW_RADIO_BUTTON = "Send now radio button";
//    static final String SEND_BY_EMAIL_CHECKBOX = "Send by Email checkbox";
//    static final String EMAIL_ADDRESS = "Email address";
//    static final String CREDIT_CARD_OPTION = "Credit card option";
//
//}
//d