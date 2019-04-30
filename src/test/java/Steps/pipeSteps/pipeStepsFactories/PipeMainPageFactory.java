package Steps.pipeSteps.pipeStepsFactories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.picocontainer.classname.ClassName;

import java.util.logging.Logger;

public class PipeMainPageFactory {
    private WebDriver driver;
    private static final Logger LOGGER = Logger.getLogger(ClassName.class.getName());

    public PipeMainPageFactory(WebDriver driver) {
        this.driver = driver;
    }

    @CacheLookup
    @FindBy(how = How.ID, using = "menu:dockItem0")
    WebElement dock;

    public void clickDock(){
        Actions builder = new Actions(driver);
        builder.moveToElement(person).perform();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        person.isEnabled();
        person.click();
    }

    @CacheLookup
    @FindBy(how = How.XPATH, using = "//img[@src='/web-portal/faces/javax.faces.resource/dock-personensuche.png?ln=transformers/images/dock']")
    WebElement person;
}
