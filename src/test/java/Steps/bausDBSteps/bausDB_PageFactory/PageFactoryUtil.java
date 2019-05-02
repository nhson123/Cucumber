package Steps.bausDBSteps.bausDB_PageFactory;

import org.openqa.selenium.WebElement;
import org.picocontainer.classname.ClassName;

import java.util.logging.Logger;

public class PageFactoryUtil {
     static final Logger LOGGER = Logger.getLogger(ClassName.class.getName());

     static boolean displayed_enabled_check(String className, WebElement element){
        if(element.isEnabled() && element.isDisplayed()){
            LOGGER.info(className + ": is displayed and enabled");
            return true;
        }else {
            LOGGER.info(className + ": is NOT displayed or/and enabled");
            return false;
        }

    }
    static boolean displayed_check(String className, WebElement element){
        if(element.isDisplayed()){
            LOGGER.info(className + ": is displayed");
            return true;
        }else {
            LOGGER.info(className + ": is NOT displayed");
            return false;
        }

    }


    static boolean enaabled_check(String className, WebElement element){
        if(element.isEnabled()){
            LOGGER.info(className + ": is enabled");
            return true;
        }else {
            LOGGER.info(className + ": is NOT enabled");
            return false;
        }

    }
}
