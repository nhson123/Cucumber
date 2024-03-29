package Steps.wiener.PageFactory;

import Steps.assertion.WebElementChecks;
import Steps.hooks.UtilityScreenshot;
import base.BaseUtil;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.picocontainer.classname.ClassName;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import static java.util.concurrent.TimeUnit.SECONDS;

/**
 * Package: Steps.wiener.PageFactory Generated by: Hoang.Son.Nguyen Generated at: 08.11.2018 2018
 */
public class PFHelper extends BaseUtil {
  private static final Logger LOGGER = Logger.getLogger(ClassName.class.getName());
  // imlicit wait
  public static void waitForSecondsTimeOut(int second, WebDriver webDriver) {
    webDriver.manage().timeouts().implicitlyWait(second, SECONDS);
  }

  public static void waitForMinutesTimeOut(int minutes, WebDriver webDriver) {
    webDriver.manage().timeouts().implicitlyWait(minutes, TimeUnit.MINUTES);
  }
  // threat wait
  public static void waitForSeconds(int secs) throws InterruptedException {
    SECONDS.sleep(secs);
  }

  public static void waitForMinutes(int mins) throws InterruptedException {
    TimeUnit.MINUTES.sleep(mins);
  }

  public static void element_visible_enabled_check(
      WebDriver webDriver, WebElement element, String rootClass, String rootMethod) {
    if (!WebElementChecks.displayed_enabled_check(element)) {
      LOGGER.warning("Error in: " + rootClass + " Method: " + rootMethod);
      UtilityScreenshot.CaptureScreenshot(webDriver, rootClass + "." + rootMethod);
    }
  }

  public static void threatSleep(int miliSecond) {
    try {
      Thread.sleep(miliSecond);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  public static void string_check(
      WebDriver webDriver, WebElement element, String currently, String expected) {
    if (!currently.equals(expected)) {
      LOGGER.warning("Error in Stringcheck, is: " + currently + " expected: " + expected);
      UtilityScreenshot.CaptureScreenshot(webDriver, currently + "!=" + expected);
    }
  }

  public static WebDriver switchToLastChildWindows(WebDriver driver) {
    String winHandleBefore = driver.getWindowHandle();
    for (String winHandle : driver.getWindowHandles()) {
      // switch to the last window
      // System.out.println("hahahah: " + winHandle);
      driver.switchTo().window(winHandle);
    }
    return driver;
  }

  public static void webElementRightClick_ContextClick(
      WebDriver webDriver, WebElement webElement, int toClick) {
    Actions actions = new Actions(webDriver);
    actions.moveToElement(webElement).build().perform();
    actions.contextClick(webElement).build().perform();
    PFHelper.threatSleep(500);
    Robot robot = null;
    for (int i = 0; i < toClick; i++) {
      try {
        robot = new Robot();
      } catch (AWTException e) {
        e.printStackTrace();
      }
      robot.keyPress(KeyEvent.VK_DOWN);
      PFHelper.threatSleep(100);
    }
    robot.keyPress(KeyEvent.VK_ENTER);
    robot.keyRelease(KeyEvent.VK_ENTER);
    PFHelper.threatSleep(500);
    // webDriver.switchTo().defaultContent();
  }

  public static void dragAndDrop(WebDriver webDriver, WebElement source, WebElement target) {
    (new Actions(webDriver)).dragAndDrop(source, target).perform();
    /*
    Actions actions = new Actions(webDriver);
    PFHelper.threatSleep(500);
    // actions.dragAndDrop(source, target).build().perform();
    actions
        .keyDown(Keys.CONTROL)
        .click()
        .dragAndDrop(source, target)
        .keyUp(Keys.CONTROL)
        .build()
        .perform();
    PFHelper.threatSleep(500);
    System.out.println("DragDrop");


    new Actions(webDriver)
        .moveToElement(source)
        .pause(Duration.ofSeconds(1))
        .clickAndHold(source)
        .pause(Duration.ofSeconds(1))
        .moveByOffset(1, 0)
        .moveToElement(target)
        .moveByOffset(1, 0)
        .pause(Duration.ofSeconds(1))
        .release()
        .perform();
        */

  }

  public static void highlightWebElement(WebDriver driver, WebElement element) {
    JavascriptExecutor js = (JavascriptExecutor) driver;

    js.executeScript(
        "arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",
        element);

    try {
      Thread.sleep(500);
    } catch (InterruptedException e) {

      System.out.println(e.getMessage());
    }

    js.executeScript("arguments[0].setAttribute('style','border: solid 2px white');", element);
  }

  public static void verifyLinkActive(String linkUrl) {
    try {
      URL url = new URL(linkUrl);

      HttpURLConnection httpURLConnect = (HttpURLConnection) url.openConnection();

      httpURLConnect.setConnectTimeout(1000);

      httpURLConnect.connect();
      /*
      if (httpURLConnect.getResponseCode() == 200) {
        LOGGER.info(linkUrl + " - " + httpURLConnect.getResponseMessage());
      }
      */
      if (httpURLConnect.getResponseCode() == HttpURLConnection.HTTP_NOT_FOUND) {
        LOGGER.warning(
            linkUrl
                + " - "
                + httpURLConnect.getResponseMessage()
                + " - "
                + HttpURLConnection.HTTP_NOT_FOUND);
      }
    } catch (Exception e) {

    }
  }
}
