package Steps.pipeSteps.pipeStepsFactories;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.HasInputDevices;
import org.openqa.selenium.interactions.Keyboard;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.picocontainer.classname.ClassName;
import org.openqa.selenium.Keys;

import java.util.logging.Logger;

public class PipeWorkPlaceChoicePageFactory {

    private WebDriver driver;
    private static final Logger LOGGER = Logger.getLogger(ClassName.class.getName());

    public PipeWorkPlaceChoicePageFactory(WebDriver driver) {
        this.driver = driver;
    }

    @CacheLookup
    @FindBy(how = How.XPATH, using = "//div[@class='login-body']  ")
    WebElement logo;


    @CacheLookup
    @FindBy(how = How.ID, using = "workplaceSelection:roomSvzAutoComplete_input")
    WebElement raumAuswahl;

    public boolean raumAuswahlCheck() {
        if (raumAuswahl.isDisplayed() && raumAuswahl.isEnabled()) {
            LOGGER.info(this.getClass().getName() + ": raumAuswahl is available");
            return true;
        } else {
            LOGGER.warning("raumAuswahl is not available");
            return false;
        }
    }

    @CacheLookup
    @FindBy(how = How.ID, using = "workplaceSelection:workplaceSvzAutoComplete_input")
    WebElement arbeitsplatzAuswahl;

    public boolean arbeitsplatzAuswahlCheck() {
        if (arbeitsplatzAuswahl.isDisplayed()) {
            LOGGER.info(this.getClass().getName() + ": arbeitsplatzAuswahl is available");
            return true;
        } else {
            LOGGER.warning("arbeitsplatzAuswahl is not available");
            return false;
        }
    }

    @CacheLookup
    @FindBy(how = How.XPATH, using = "//span[@class='ui-button-text ui-c']")
    WebElement auswahlBtn;

    public boolean auswahlBtnCheck() {
        if (auswahlBtn.isDisplayed()) {
            LOGGER.info(this.getClass().getName() + ": auswahlBtn is available");
            return true;
        } else {
            LOGGER.warning("auswahlBtn is not available");
            return false;
        }
    }

    @CacheLookup
    @FindBy(how = How.XPATH, using = "//tr[2]//td[1]//div[1]//div[1]//span[1]//button[1]//span[1]")
    WebElement raumDropdown;

    public boolean raumDropdownCheck() {
        if (raumDropdown.isDisplayed()&&raumDropdown.isEnabled()) {
            LOGGER.info(this.getClass().getName() + ": raumDropdown is available");
            return true;
        } else {
            LOGGER.warning("raumDropdown is not available");
            return false;
        }
    }
    public void raumAuswahl(String raum) {
        raumAuswahl.sendKeys(raum);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        raumAuswahl.sendKeys(Keys.ENTER);
        auswahlBtn.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public void platzAuswahl(String platz) {
        arbeitsplatzAuswahl.sendKeys(platz);
        arbeitsplatzAuswahl.sendKeys(Keys.RETURN);
    }


}
