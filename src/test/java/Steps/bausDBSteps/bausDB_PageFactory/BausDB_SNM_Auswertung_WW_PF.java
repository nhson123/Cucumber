package Steps.bausDBSteps.bausDB_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.picocontainer.classname.ClassName;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class BausDB_SNM_Auswertung_WW_PF {

    private WebDriver driver;
    private String className;
    private static final Logger LOGGER = Logger.getLogger(ClassName.class.getName());
    private WebDriverWait wait;


    public BausDB_SNM_Auswertung_WW_PF(WebDriver driver) {
        this.driver = driver;
        className = this.getClass().getName();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 15);
    }

    @CacheLookup
    @FindBy(how = How.XPATH, using = "//h4[contains(text(),'SNM Auswertung - WW')]")
    WebElement snm_Header;

    public boolean snm_Header_Check() {
        wait.until(ExpectedConditions.visibilityOf(snm_Header));
        if (snm_Header.isDisplayed()) {
            LOGGER.info(this.getClass().getName() + ": snm_Header is available");
            return true;
        } else {
            LOGGER.warning("snm_Header is not available");
            return false;
        }
    }

    @CacheLookup
    @FindBy(how = How.XPATH, using = "//label[contains(text(),'Gültigkeit (Tage)')]")
    WebElement validity_Label;

    public boolean validity_Label_Check() {
        if (validity_Label.isDisplayed()) {
            LOGGER.info(this.getClass().getName() + ": validity_Label is available");
            return true;
        } else {
            LOGGER.warning("validity_Label is not available");
            return false;
        }
    }

    @CacheLookup
    @FindBy(how = How.XPATH, using = "//label[contains(text(),'Url')]")
    WebElement url_Label;

    public boolean url_Label_Check() {
        if (url_Label.isDisplayed()) {
            LOGGER.info(this.getClass().getName() + ": url_Label is available");
            return true;
        } else {
            LOGGER.warning("url_Label is not available");
            return false;
        }
    }

    @CacheLookup
    @FindBy(how = How.ID, using = "validity")
    WebElement validity_input;

    public boolean validity_input_Check() {
        if (validity_input.isDisplayed() && validity_input.isEnabled()) {
            LOGGER.info(this.getClass().getName() + ": validity_input is available");
            return true;
        } else {
            LOGGER.warning("validity_input is not available");
            return false;
        }
    }

    public void validity_SetValue(String value) {
        PageFactoryUtil.webelement_Setvalue(validity_input, value);
    }

    @CacheLookup
    @FindBy(how = How.ID, using = "tempUrl")
    WebElement temp_Url;

    public boolean temp_Url_Check() {
        wait.until(ExpectedConditions.visibilityOf(temp_Url));
        if (temp_Url.isDisplayed()) {
            LOGGER.info(this.getClass().getName() + ": temp_Url is available");
            return true;
        } else {
            LOGGER.warning("temp_Url is not available");
            return false;
        }
    }

    public String get_Temp_Url(String attribute){
        return PageFactoryUtil.get_WebElement_Attribute(temp_Url, "value");
    }

    @CacheLookup
    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Generieren')]")
    WebElement url_Gen;

    public boolean url_Gen_Check() {
        if (url_Gen.isDisplayed() && url_Gen.isEnabled()) {
            LOGGER.info(this.getClass().getName() + ": url_Gen is available");
            return true;
        } else {
            LOGGER.warning("url_Gen is not available");
            return false;
        }
    }
    public void url_Gen_click(){
        url_Gen.click();
    }

    @CacheLookup
    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Kopieren')]")
    WebElement url_Copy;

    public boolean url_Copy_Check() {
        if (url_Copy.isDisplayed() && url_Copy.isEnabled()) {
            LOGGER.info(this.getClass().getName() + ": url_Copy is available");
            return true;
        } else {
            LOGGER.warning("url_Copy is not available");
            return false;
        }
    }
    public void url_Copy_click(){
        url_Copy.click();
    }

}

