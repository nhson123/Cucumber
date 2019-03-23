package Steps.action;

import Steps.arrange.DriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.NoSuchElementException;
import java.util.logging.Level;

import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;

/**
 * Package: action
 * Generated by: Hoang.Son.Nguyen
 * Generated at: 01.04.2018 2018
 */
public class FindElementBasics {
    public static WebElement findById(WebDriver webDriver, String id){
        WebElement webElement;
        try {

            webElement = webDriver.findElement(By.id(id));
            LOGGER.log(Level.FINE, webDriver.getClass().getName() +  webElement.getText());
            return webElement;
        } catch (NoSuchElementException ex) {
            DriverWait.waitForSecondsTimeOut(2,webDriver);
            LOGGER.log(Level.WARNING, webDriver.getClass().getName() + ex.toString());
            return null;
        }
    }
    public static WebElement findByName(WebDriver webDriver, String name){
        WebElement webElement = webDriver.findElement(By.name(name));
        return webElement;
    }
    public static WebElement findByLinkText(WebDriver webDriver, String linkText){
        WebElement webElement = webDriver.findElement(By.linkText(linkText));
        return webElement;
    }
    public static WebElement findByLinkPartialText(WebDriver webDriver, String partLinkText){
        WebElement webElement = webDriver.findElement(By.partialLinkText(partLinkText));
        return webElement;
    }
    public static WebElement findByXPath(WebDriver webDriver, String xpath){
        WebElement webElement;
        try {

            webElement = webDriver.findElement(By.xpath(xpath));
            LOGGER.log(Level.FINE, webDriver.getClass().getName() +  webElement.getText());
            return webElement;
        } catch (NoSuchElementException ex) {
            DriverWait.waitForSecondsTimeOut(2,webDriver);
            LOGGER.log(Level.WARNING, webDriver.getClass().getName() + ex.toString());
            return null;
        }

    }
}