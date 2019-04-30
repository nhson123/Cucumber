package Steps.bausDBSteps;

import Steps.bausDBSteps.bausDB_PageFactory.BausDB_LoginPageFactory;
import Steps.bausDBSteps.bausDB_PageFactory.BausDB_PersonenadminFactory;
import base.BaseUtil;
import cucumber.api.java8.En;

public class BausDB_Personenadmin {
    public static class BausDB_PersonenAdmin implements En {

        private BaseUtil base;
        private BausDB_LoginPageFactory bausDB_loginPageFactory;
        private BausDB_PersonenadminFactory bausDB_personenadminFactory;

        public BausDB_PersonenAdmin(BaseUtil base) {
            this.base = base;
            And("^ich sehe sämtliche Webelement auf PersonenadminSeite$", () -> {
            });
        }
    }
}
