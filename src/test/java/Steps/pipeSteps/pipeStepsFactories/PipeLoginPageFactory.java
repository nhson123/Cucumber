package Steps.pipeSteps.pipeStepsFactories;

import org.openqa.selenium.WebDriver;
import org.picocontainer.classname.ClassName;

import java.util.logging.Logger;

public class PipeLoginPageFactory {

    private WebDriver driver;
    private static final Logger LOGGER = Logger.getLogger(ClassName.class.getName());

    public PipeLoginPageFactory(WebDriver driver) {
        this.driver = driver;
    }

}
