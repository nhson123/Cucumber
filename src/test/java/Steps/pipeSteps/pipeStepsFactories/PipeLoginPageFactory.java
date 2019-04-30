package Steps.pipeSteps.pipeStepsFactories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.picocontainer.classname.ClassName;

import java.util.logging.Logger;

public class PipeLoginPageFactory {

    private WebDriver driver;
    private static final Logger LOGGER = Logger.getLogger(ClassName.class.getName());

    public PipeLoginPageFactory(WebDriver driver) {
        this.driver = driver;
    }

    @CacheLookup
    @FindBy(how = How.ID, using = "loginForm:username")
    WebElement userName;

    public boolean userNameFieldCheck(){
        if (userName.isDisplayed() && userName.isEnabled()){
            LOGGER.info(this.getClass().getName()+": Username is available");
            return true;
        } else {
            LOGGER.warning("Username is not available");
            return false;
        }
    }

    @CacheLookup
    @FindBy(how = How.ID, using = "loginForm:password")
    WebElement password;

    public boolean pwdFieldCheck(){
        if (password.isDisplayed() && password.isEnabled()){
            LOGGER.info(this.getClass().getName()+": Password is available");
            return true;
        }else {
            LOGGER.warning("Password is not available");
            return false;
        }
    }

    public boolean loginBtnCheck(){
        if (loginBtn.isDisplayed() && loginBtn.isEnabled()){
            LOGGER.info(this.getClass().getName()+": LoginBtn is available");
            return true;
        }else {
            LOGGER.warning("LoginBtn is not available");
            return false;
        }
    }

    @CacheLookup
    @FindBy(how = How.XPATH, using = "//span[@class='ui-button-text ui-c']")
    WebElement loginBtn;

    public void logIn(String username, String pwd){
        userName.sendKeys(username);
        password.sendKeys(pwd);
        loginBtn.click();
    }


}
