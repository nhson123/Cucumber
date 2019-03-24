package Steps.pipeSteps;

import base.BaseUtil;
import cucumber.api.java8.En;
import org.picocontainer.classname.ClassName;

import java.util.logging.Logger;

public class PipeLogin extends BaseUtil implements En {

    private BaseUtil base;

    private static final Logger LOGGER = Logger.getLogger(ClassName.class.getName());

    public PipeLogin(BaseUtil base) {
        this.base = base;

        Given("^ich navigiere zu \"([^\"]*)\"$", (String arg0) -> {
            base.webDriver.navigate().to(arg0);
            base.webDriver.manage().window().maximize();
        });
    }
}
