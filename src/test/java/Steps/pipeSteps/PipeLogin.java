package Steps.pipeSteps;

import Steps.pipeSteps.pipeStepsFactories.PipeLoginPageFactory;
import Steps.tutor.pageFactory.AlertHandlePageFactory;
import base.BaseUtil;
import cucumber.api.java8.En;
import org.openqa.selenium.support.PageFactory;
import org.picocontainer.classname.ClassName;

import java.util.logging.Level;
import java.util.logging.Logger;

public class PipeLogin extends BaseUtil implements En {

    private BaseUtil base;

    private PipeLoginPageFactory pipeLoginPageFactory;

    public PipeLogin(BaseUtil base) {
        this.base = base;

        Given("^ich navigiere zu \"([^\"]*)\"$", (String arg0) -> {
            base.webDriver.navigate().to(arg0);
            base.webDriver.manage().window().maximize();
            PageFactory.initElements(base.webDriver, PipeLoginPageFactory.class);
            System.out.println("GHallo!!");
        });

        And("^ich logge mich als \"([^\"]*)\" und \"([^\"]*)\" ein$", (String arg0, String arg1) -> {
            LOGGER.log(Level.FINER, "Ich bin von Given Logger"+arg0+arg1, ClassName.class.getName().toString());
        });
    }
}
