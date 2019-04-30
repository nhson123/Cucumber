package Steps.bausDBSteps;

import Steps.bausDBSteps.bausDB_PageFactory.BausDB_LoginPageFactory;
import Steps.bausDBSteps.bausDB_PageFactory.BausDB_PersonenadminFactory;
import Steps.tutor.pageFactory.PageFactorySuperClass;
import base.BaseUtil;
import cucumber.api.java8.En;
import org.openqa.selenium.support.PageFactory;

import static org.testng.Assert.assertTrue;

public class BausDB_Personenadmin {
    public static class BausDB_PersonenAdmin implements En {

        private BaseUtil base;
        private BausDB_LoginPageFactory bausDB_loginPageFactory;
        private BausDB_PersonenadminFactory bausDB_personenadminFactory;

        public BausDB_PersonenAdmin(BaseUtil base) {
            this.base = base;
            And("^ich sehe sämtliche Webelement auf PersonenadminSeite$", () -> {
                bausDB_personenadminFactory = PageFactory.initElements(base.webDriver, BausDB_PersonenadminFactory.class);
                assertTrue(bausDB_personenadminFactory.personErstellenBtn_Check());
            });
        }
    }
}
