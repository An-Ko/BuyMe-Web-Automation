import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.ComparisonFailure;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.NoSuchElementException;

class Tools {

    // return data from config file based on received keyName
    static String getData(String keyName) throws ParserConfigurationException, IOException, SAXException {
        File configXmlFile = new File(Constants.XML_LOCATION);
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(configXmlFile);
        if (doc != null) {
            doc.getDocumentElement().normalize();
        }
        assert doc != null;
        return doc.getElementsByTagName(keyName).item(0).getTextContent();
    }


    // take a screenshot and return screenshot's path
    static String takeScreenShot(long num, WebDriver driver) {
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File screenShotFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
        File destinationFile = new File(Constants.SCREENSHOT_PATH + num + Constants.SCREENSHOT_TYPE);
        try {
            FileUtils.copyFile(screenShotFile, destinationFile);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return Constants.SCREENSHOT_PATH + num + Constants.SCREENSHOT_TYPE;
    }


    // create a random fake email address
    static String createEmail() {
        DateFormat dateFormat = new SimpleDateFormat(Constants.EMAIL_DATE_FORMAT);
        Date now = new Date();
        return dateFormat.format(now) + Constants.EMAIL_FAKE;
    }


    // try-catch methods below

    // try to click on a given element
    static void tryClick(WebElement element, String screen, String action, ExtentTest test) {
        try {
            element.click();
            test.log(Status.PASS, screen + action + Constants.CLICK_PASS);
        } catch (NoSuchElementException e) {
            test.log(Status.FAIL, screen + action + Constants.CLICK_FAIL + e.getMessage());
        }
    }

    // try to click on a given element using JavascriptExecutor
    static void tryJSClick(WebElement element, String screen, String action, ExtentTest test, WebDriver driver) {
        try {
            ((JavascriptExecutor)driver).executeScript(Constants.JS_CLICK, element);
            test.log(Status.PASS, screen + action + Constants.CLICK_PASS);
        } catch (NoSuchElementException e) {
            test.log(Status.FAIL, screen + action + Constants.CLICK_FAIL + e.getMessage());
        }
    }

    // try to input text into a given element
    static void tryInput(String input, WebElement element, Boolean enter, String screen, String action, ExtentTest test) {
        try {
            element.clear();
            element.sendKeys(input);
            if (enter) {
                element.sendKeys(Keys.ENTER);
            }
            test.log(Status.PASS, screen + action + Constants.INPUT_PASS);
        } catch (NoSuchElementException | ElementNotInteractableException e) {
            test.log(Status.FAIL, Constants.INPUT_FAIL + screen + action + e.getMessage());
        }
    }

    // try to wait for a given element
    static void tryWaitElement(WebDriverWait wait, WebElement element, String screen, String action, ExtentTest test) {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(element));
            test.log(Status.PASS, screen + action + Constants.CLICKABLE_PASS);
        } catch (NoSuchElementException e) {
            test.log(Status.FAIL, screen + action + Constants.CLICKABLE_FAIL + e.getMessage());
        }
    }

    // try to wait for a URL to change to given URL
    static void tryWaitURL(WebDriverWait wait, String url, String screen, String action, ExtentTest test) {
        try {
            wait.until(ExpectedConditions.urlToBe(url));
            test.log(Status.PASS, screen + action + Constants.CHANGE_PASS);
        } catch (NoSuchElementException e) {
            test.log(Status.FAIL, screen + action + Constants.CHANGE_FAIL + e.getMessage());
        }
    }

    // try to wait for URL to contain given String
    static void tryWaitPartialURL(WebDriverWait wait, String url, String screen, String action, ExtentTest test) {
        try {
            wait.until(ExpectedConditions.urlContains(url));
            test.log(Status.PASS, screen + action + Constants.CHANGE_PASS);
        } catch (NoSuchElementException e) {
            test.log(Status.FAIL, screen + action + Constants.CHANGE_FAIL + e.getMessage());
        }
    }

    // assert if element text is equal to a given text
    static void tryAssertEquals(String expected, String actual, String screen, String action, ExtentTest test, String print) {
        try {
            Assert.assertEquals(expected, actual);
            test.log(Status.PASS, screen + action + Constants.ASSERT_PASS);
            System.out.println(print);
        } catch (NoSuchElementException | ComparisonFailure e) {
            test.log(Status.FAIL, screen + action + Constants.ASSERT_FAIL + e.getMessage());
        }
    }

    // assert if element text is different from a given text
    static void tryAssertNotSame(String expected, String actual, String screen, String action, ExtentTest test, String print) {
        try {
            Assert.assertNotSame(expected,actual);
            test.log(Status.PASS, screen + action + Constants.ASSERT_PASS);
            System.out.println(print);
        } catch (NoSuchElementException | ComparisonFailure e) {
            test.log(Status.FAIL, screen + action + Constants.ASSERT_FAIL + e.getMessage());
        }
    }

    // try to upload an image
    static void tryUpload(String fileLocation, WebElement element, String screen, String action, ExtentTest test) {
        try {
            element.sendKeys(fileLocation);
            test.log(Status.PASS, screen + action + Constants.UPLOAD_PASS);
        } catch (NoSuchElementException | ElementNotInteractableException e) {
            test.log(Status.FAIL, screen + action + Constants.UPLOAD_FAIL + e.getMessage());
        }
    }

}