package Steps.bausDBSteps.bausDB_PageFactory;

import org.openqa.selenium.WebElement;
import org.picocontainer.classname.ClassName;

import java.util.List;
import java.util.logging.Logger;

public class PageFactoryUtil {
    static final Logger LOGGER = Logger.getLogger(ClassName.class.getName());

    static boolean displayed_enabled_check(String className, WebElement element) {
        if (element.isEnabled() && element.isDisplayed()) {
            LOGGER.info(className + ": is displayed and enabled");
            return true;
        } else {
            LOGGER.info(className + ": is NOT displayed or/and enabled");
            return false;
        }

    }

    static boolean displayed_check(String className, WebElement element) {
        if (element.isDisplayed()) {
            LOGGER.info(className + ": is displayed");
            return true;
        } else {
            LOGGER.info(className + ": is NOT displayed");
            return false;
        }

    }


    static boolean enaabled_check(String className, WebElement element) {
        if (element.isEnabled()) {
            LOGGER.info(className + ": is enabled");
            return true;
        } else {
            LOGGER.info(className + ": is NOT enabled");
            return false;
        }

    }

    public static String[] attribute_List(List<WebElement> list) {
        String[] array = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i).getText();
        }
        return array;
    }

    public static void webelement_Setvalue(WebElement element, String value) {
        element.clear();
        element.sendKeys(value);
    }

    public static String get_WebElement_Attribute(WebElement element, String attribut){
        return element.getAttribute(attribut);
    }
}
