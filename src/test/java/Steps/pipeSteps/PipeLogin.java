package Steps.pipeSteps;

import Steps.pipeSteps.pipeStepsFactories.PipeLoginPageFactory;
import Steps.pipeSteps.pipeStepsFactories.PipeMainPageFactory;
import Steps.pipeSteps.pipeStepsFactories.PipeWorkPlaceChoicePageFactory;
import base.BaseUtil;
import cucumber.api.java8.En;
import org.openqa.selenium.support.PageFactory;
import org.picocontainer.classname.ClassName;
import java.util.logging.Level;

import static org.testng.Assert.assertTrue;

public class PipeLogin extends BaseUtil implements En {

    private BaseUtil base;

    private PipeLoginPageFactory pipeLoginPageFactory;
    private PipeWorkPlaceChoicePageFactory pipeWorkPlaceChoicePageFactory;
    private PipeMainPageFactory mainPageFactory;

    public PipeLogin(BaseUtil base) {
        this.base = base;

        Given("^ich navigiere zu \"([^\"]*)\"$", (String arg0) -> {
            base.webDriver.navigate().to(arg0);
            base.webDriver.manage().window().maximize();
            //TODO wenn a user logged --> log out
            pipeLoginPageFactory = PageFactory.initElements(base.webDriver, PipeLoginPageFactory.class);
            assertTrue(pipeLoginPageFactory.userNameFieldCheck());
            assertTrue(pipeLoginPageFactory.pwdFieldCheck());
            assertTrue(pipeLoginPageFactory.loginBtnCheck());
        });

        And("^ich logge mich als \"([^\"]*)\" und \"([^\"]*)\" ein$", (String userName, String passWord) -> {
            LOGGER.log(Level.FINER, "Ich bin von Given Logger" + userName + passWord, ClassName.class.getName());
            pipeLoginPageFactory.logIn(userName, passWord);

        });
        Then("^ich bin auf die Seite Arbeitsplatzauswahl$", () -> {
            pipeWorkPlaceChoicePageFactory = PageFactory.initElements(base.webDriver, PipeWorkPlaceChoicePageFactory.class);
            assertTrue(pipeWorkPlaceChoicePageFactory.arbeitsplatzAuswahlCheck());
            assertTrue(pipeWorkPlaceChoicePageFactory.auswahlBtnCheck());
            assertTrue(pipeWorkPlaceChoicePageFactory.raumAuswahlCheck());
        });
        And("^ich wähle den \"([^\"]*)\" als Raum und \"([^\"]*)\" als Platz$", (String raum, String platz) -> {
            pipeWorkPlaceChoicePageFactory.raumDropdownCheck();

        });
        And("^ich check die aktuelle Seite und leiet eventuell die Platzauswahl ein$", () -> {
            mainPageFactory = PageFactory.initElements(base.webDriver, PipeMainPageFactory.class);
            mainPageFactory.clickDock();

        });
    }
}
