package Steps.bausDBSteps.bausDB_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.picocontainer.classname.ClassName;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class BausDB_LoginPageFactory {

    private WebDriver driver;
    private static final Logger LOGGER = Logger.getLogger(ClassName.class.getName());

    public BausDB_LoginPageFactory(WebDriver driver) {
        this.driver = driver;
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @CacheLookup
    @FindBy(how = How.ID, using = "name")
    WebElement userName;

    public boolean userNameField_Check() {
        if (userName.isDisplayed() && userName.isEnabled()) {
            LOGGER.info(this.getClass().getName() + ": Username is available");
            return true;
        } else {
            LOGGER.warning("Username is not available");
            return false;
        }
    }

    public void setUserNameField(String username) {
        if (userName.isEnabled()) {
            userName.clear();
            userName.sendKeys(username);
        }
    }

    @CacheLookup
    @FindBy(how = How.ID, using = "password")
    WebElement password;

    public boolean pwdField_Check() {
        if (password.isDisplayed() && password.isEnabled()) {
            LOGGER.info(this.getClass().getName() + ": Password is available");
            return true;
        } else {
            LOGGER.warning("Password is not available");
            return false;
        }
    }

    public void setPwdField(String pwd) {
        if (password.isEnabled()) {
            password.clear();
            password.sendKeys(pwd);
        }
    }

    public boolean anmeldeBtn_Check() {
        if (anmeldeBtn.isDisplayed() && anmeldeBtn.isEnabled()) {
            LOGGER.info(this.getClass().getName() + ": LoginBtn is available");
            return true;
        } else {
            LOGGER.warning("LoginBtn is not available");
            return false;
        }
    }

    @CacheLookup
    @FindBy(how = How.XPATH, using = "//button[@class='btn btn-primary']")
    WebElement anmeldeBtn;

    public void anmelden(String username, String pwd) {
        setUserNameField(username);
        setPwdField(pwd);
        anmeldeBtn.click();
    }

    @CacheLookup
    @FindBy(how = How.XPATH, using = "//img[contains(@class,'brandimage')]")
    WebElement wwLogo;

    public boolean wwLogo_Check() {
        if (wwLogo.isDisplayed()) {
            LOGGER.info(this.getClass().getName() + ": wwLogo is available");
            return true;
        } else {
            LOGGER.warning("wwLogo is not available");
            return false;
        }
    }

    @CacheLookup
    @FindBy(how = How.XPATH, using = "//a[@class='btn btn-link']")
    WebElement pwdResetBtn;

    public boolean pwdResetBtn_Check() {
        if (pwdResetBtn.isDisplayed() && pwdResetBtn.isEnabled()) {
            LOGGER.info(this.getClass().getName() + ": pwdResetBtn is available");
            return true;
        } else {
            LOGGER.warning("pwdResetBtn is not available");
            return false;
        }
    }

    @CacheLookup
    @FindBy(how = How.XPATH, using = "//strong[contains(text(),'Falscher Benutzer oder falsches Passwort.')]")
    WebElement loginFehler;

    public boolean loginFehler_Check() {
        if (loginFehler.isDisplayed()) {
            LOGGER.info(this.getClass().getName() + ": loginFehler is available");
            return true;
        } else {
            LOGGER.warning("loginFehler is not available");
            return false;
        }
    }
}
