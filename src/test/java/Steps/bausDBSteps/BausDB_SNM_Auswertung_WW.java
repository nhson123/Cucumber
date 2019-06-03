package Steps.bausDBSteps;

import Steps.bausDBSteps.bausDB_PageFactory.BausDB_SNM_Auswertung_Details_PF;
import Steps.bausDBSteps.bausDB_PageFactory.BausDB_SNM_Auswertung_WW_PF;
import base.BaseUtil;
import cucumber.api.java8.En;
import org.openqa.selenium.support.PageFactory;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static org.testng.Assert.assertNotEquals;

public class BausDB_SNM_Auswertung_WW implements En {
    private BaseUtil base;
    private BausDB_SNM_Auswertung_WW_PF bausDB_snm_auswertung_ww_pf;
    private BausDB_SNM_Auswertung_Details_PF bausDB_snm_auswertung_details_pf;

    public BausDB_SNM_Auswertung_WW(BaseUtil base) {
        this.base = base;
        Given("^nun navigiere ich zu \"([^\"]*)\"$", (String url) -> {
            base.webDriver.navigate().to(url);

        });
        Then("^ich bin auf SNW Auwertung WW Seite$", () -> {
            bausDB_snm_auswertung_ww_pf = PageFactory.initElements(base.webDriver,BausDB_SNM_Auswertung_WW_PF.class);
            assertTrue(bausDB_snm_auswertung_ww_pf.snm_Header_Check());
            assertTrue(bausDB_snm_auswertung_ww_pf.validity_Label_Check());
            assertTrue(bausDB_snm_auswertung_ww_pf.url_Label_Check());
            assertTrue(bausDB_snm_auswertung_ww_pf.validity_input_Check());
            assertTrue(bausDB_snm_auswertung_ww_pf.temp_Url_Check());
            assertTrue(bausDB_snm_auswertung_ww_pf.url_Gen_Check());
            assertTrue(bausDB_snm_auswertung_ww_pf.url_Copy_Check());
            String before = bausDB_snm_auswertung_ww_pf.get_Temp_Url("value");
            bausDB_snm_auswertung_ww_pf.validity_SetValue("5");
            bausDB_snm_auswertung_ww_pf.url_Gen_click();
            bausDB_snm_auswertung_ww_pf = PageFactory.initElements(base.webDriver,BausDB_SNM_Auswertung_WW_PF.class);
            bausDB_snm_auswertung_ww_pf.url_Copy_click();
            assertNotEquals(before,bausDB_snm_auswertung_ww_pf.get_Temp_Url("value"));
            base.webDriver.get(bausDB_snm_auswertung_ww_pf.get_Temp_Url("value"));
            assertEquals(base.webDriver.getTitle(), "Wiener Wohnen | Bauservices DB");
            bausDB_snm_auswertung_details_pf = PageFactory.initElements(base.webDriver,BausDB_SNM_Auswertung_Details_PF.class);
            assertTrue(bausDB_snm_auswertung_details_pf.ww_Logo_Check());
            assertTrue(bausDB_snm_auswertung_details_pf.table_Header_Check());

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

    }

}

