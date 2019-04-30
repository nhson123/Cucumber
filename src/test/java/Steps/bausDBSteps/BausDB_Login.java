package Steps.bausDBSteps;

import Steps.bausDBSteps.bausDB_PageFactory.BausDB_LoginPageFactory;
import base.BaseUtil;
import cucumber.api.java8.En;
import org.openqa.selenium.support.PageFactory;
import static org.testng.Assert.assertTrue;

public class BausDB_Login extends BaseUtil implements En {
    private BaseUtil base;
    private BausDB_LoginPageFactory bausDB_loginPageFactory;

    public BausDB_Login(BaseUtil base) {
        this.base = base;

        Given("^ich navigiere zu BausDB \"([^\"]*)\"$", (String url) -> {
            base.webDriver.navigate().to(url);
            base.webDriver.manage().window().maximize();
            bausDB_loginPageFactory = PageFactory.initElements(base.webDriver, BausDB_LoginPageFactory.class);
            //check the web element avaiable
            assertTrue(bausDB_loginPageFactory.userNameField_Check());
            assertTrue(bausDB_loginPageFactory.pwdField_Check());
            assertTrue(bausDB_loginPageFactory.anmeldeBtn_Check());
            assertTrue(bausDB_loginPageFactory.wwLogo_Check());
            assertTrue(bausDB_loginPageFactory.pwdResetBtn_Check());
        });
        And("^ich logge mich als \"([^\"]*)\" und \"([^\"]*)\" in Bausdb ein$", (String username, String pwd) -> {
            bausDB_loginPageFactory = PageFactory.initElements(base.webDriver, BausDB_LoginPageFactory.class);
            bausDB_loginPageFactory.anmelden(username,pwd);
        });

        Then("^Login Fehlermeldung ersichtlich$", () -> {
            bausDB_loginPageFactory.loginFehler_Check();
        });

    }
}
