package Steps.bausDBSteps.bausDB_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.picocontainer.classname.ClassName;

import java.util.logging.Logger;

public class BausDB_PersonenadminFactory {

    private WebDriver driver;
    private static final Logger LOGGER = Logger.getLogger(ClassName.class.getName());

    public BausDB_PersonenadminFactory(WebDriver driver) {
        this.driver = driver;
    }

    @CacheLookup
    @FindBy(how = How.XPATH, using = "//h1[contains(text(),'Personenadministration')]")
    WebElement personAdminLogo;

    public boolean personAdminLogo_Check() {
        if (personAdminLogo.isDisplayed()) {
            LOGGER.info(this.getClass().getName() + ": personAdminLogo is available");
            return true;
        } else {
            LOGGER.warning("personAdminLogo is not available");
            return false;

        }

    }
}
