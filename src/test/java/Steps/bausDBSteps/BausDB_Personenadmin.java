package Steps.bausDBSteps;

import Steps.bausDBSteps.bausDB_PageFactory.BausDB_LoginPageFactory;
import Steps.bausDBSteps.bausDB_PageFactory.BausDB_Personenadmin_PF;
import Steps.bausDBSteps.bausDB_PageFactory.PageFactoryUtil;
import base.BaseUtil;
import cucumber.api.java8.En;
import org.openqa.selenium.support.PageFactory;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class BausDB_Personenadmin {
    public static class BausDB_PersonenAdmin implements En {

        private BaseUtil base;
        private BausDB_LoginPageFactory bausDB_loginPageFactory;
        private BausDB_Personenadmin_PF bausDB_personenadminPF;

        public BausDB_PersonenAdmin(BaseUtil base) {
            this.base = base;
            And("^ich sehe sämtliche Webelement auf PersonenadminSeite$", () -> {
                bausDB_personenadminPF = PageFactory.initElements(base.webDriver, BausDB_Personenadmin_PF.class);
                assertTrue(bausDB_personenadminPF.personErstellenBtn_Check());
                assertTrue(bausDB_personenadminPF.perlustrierung_Hochladen_check());
                assertTrue(bausDB_personenadminPF.logged_User_check());
                assertTrue(bausDB_personenadminPF.tabelPersonLength_check());
                assertTrue(bausDB_personenadminPF.eintraegeAnzeigen_check());
                assertTrue(bausDB_personenadminPF.suchenLaben_check());
                assertTrue(bausDB_personenadminPF.sucheEingabe_check());
                assertTrue(bausDB_personenadminPF.personTabelleAdmin_check());
                assertTrue(bausDB_personenadminPF.personTabelleAdminInfo_check());
                assertTrue(bausDB_personenadminPF.pagination_check());
                assertTrue(bausDB_personenadminPF.header_name_check());
                assertTrue(bausDB_personenadminPF.table_body_check());
                assertTrue(bausDB_personenadminPF.cell1_check());
                assertTrue(bausDB_personenadminPF.cellButton_check());
                assertEquals(bausDB_personenadminPF.tabsButtonList().size(), 4);
                String[] arrayCheck = {"Dashboard", "Verwaltung", "Auswertung", "Administration"};
                assertEquals(PageFactoryUtil.attribute_List(bausDB_personenadminPF.tabsButtonList()), arrayCheck);
                assertTrue(bausDB_personenadminPF.dashboard_btn_check());
                bausDB_personenadminPF.dashboard_btn_click();
                assertTrue(bausDB_personenadminPF.dashboard_WBG_check());
                assertTrue(bausDB_personenadminPF.dashboard_SNM_check());
                assertTrue(bausDB_personenadminPF.dashboard_LWI_check());
                assertTrue(bausDB_personenadminPF.dashboard_BPL_check());
                assertTrue(bausDB_personenadminPF.suche_Bauservives_check());
                assertTrue(bausDB_personenadminPF.gewerkverwaltung_check());
                assertTrue(bausDB_personenadminPF.projektverwaltung_check());
                assertTrue(bausDB_personenadminPF.nachtragverwaltung_check());
                assertTrue(bausDB_personenadminPF.verwaltung_btn_check());
                bausDB_personenadminPF.verwaltung_btn_click();
                assertTrue(bausDB_personenadminPF.wbg_Meldungsverwaltung_check());
                assertTrue(bausDB_personenadminPF.wbg_Projektkostenverwaltung_check());
                assertTrue(bausDB_personenadminPF.kostenrückerstattungen_check());
                assertTrue(bausDB_personenadminPF.kostenrückerstattungsrechnungen_check());
                assertTrue(bausDB_personenadminPF.auswertung_btn_check());
                bausDB_personenadminPF.auswertung_btn_click();
                assertTrue(bausDB_personenadminPF.bpl_auswertung_check());
                assertTrue(bausDB_personenadminPF.bpl_Meine_Performance_check());
                assertTrue(bausDB_personenadminPF.lwi_Auswertungen_check());
                assertTrue(bausDB_personenadminPF.monatliche_Auswertung_check());
                assertTrue(bausDB_personenadminPF.abteilungsperformance_check());
                assertTrue(bausDB_personenadminPF.produktperformance_check());
                assertTrue(bausDB_personenadminPF.snm_Kontrolliste_check());
                assertTrue(bausDB_personenadminPF.snm_Auswertung_UEbersicht_check());
                assertTrue(bausDB_personenadminPF.snm_Auswertung_WW_check());
                assertTrue(bausDB_personenadminPF.wbg_Kontrollliste_check());
                assertTrue(bausDB_personenadminPF.wbg_Monatsbericht_check());
                assertTrue(bausDB_personenadminPF.wbg_Zielübersicht_check());
                assertTrue(bausDB_personenadminPF.administration_btn_check());
                bausDB_personenadminPF.administration_btn_click();
                assertTrue(bausDB_personenadminPF.adminDropdownlist_Check());
                assertTrue(bausDB_personenadminPF.rollenAdministration_check());
                assertTrue(bausDB_personenadminPF.berechtigungsadminstration_check());
                assertTrue(bausDB_personenadminPF.berechtigungsGruppenadminstration_check());
                bausDB_personenadminPF.logged_User_click();
                assertTrue(bausDB_personenadminPF.password_Aendern_check());
                assertTrue(bausDB_personenadminPF.logout_btn_check());
                //bausDB_personenadminPF.logout_click();

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                bausDB_personenadminPF.administration_btn_click();
                bausDB_personenadminPF.cellButton_click();


            });
        }
    }
}
