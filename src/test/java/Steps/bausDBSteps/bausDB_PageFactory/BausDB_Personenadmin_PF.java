package Steps.bausDBSteps.bausDB_PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.picocontainer.classname.ClassName;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class BausDB_Personenadmin_PF {
    private WebDriver driver;
    private String className;
    private static final Logger LOGGER = Logger.getLogger(ClassName.class.getName());
    private WebDriverWait wait;

    public BausDB_Personenadmin_PF(WebDriver driver) {
        this.driver = driver;
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        className = this.getClass().getName();
        wait = new WebDriverWait(driver, 20);
    }

    @CacheLookup
    @FindBy(how = How.XPATH, using = "//h1[contains(text(),'Personenadministration')]")
    WebElement personAdminLogo;

    public boolean personAdminLogo_Check() {
        if (personAdminLogo.isDisplayed()) {
            LOGGER.info(this.getClass().getName() + ": personAdminLogo is available");
            return true;
        } else {
            LOGGER.warning("personAdminLogo is not available");
            return false;

        }

    }

    @CacheLookup
    @FindBy(how = How.XPATH, using = "//h1[contains(text(),'Personenadministration')]")
    WebElement personErstellenBtn;

    public boolean personErstellenBtn_Check() {
        if (personErstellenBtn.isDisplayed() && personErstellenBtn.isEnabled()) {
            LOGGER.info(this.getClass().getName() + ": personErstellenBtn is available");
            return true;
        } else {
            LOGGER.warning("personErstellenBtn is not available");
            return false;

        }

    }

    @CacheLookup
    @FindBy(how = How.XPATH, using = "//select[@name='table-person-administration_length']")
    WebElement tabelPersonLength;

    public boolean tabelPersonLength_check() {
        return (PageFactoryUtil.displayed_enabled_check(className, tabelPersonLength));
    }

    @CacheLookup
    @FindBy(how = How.XPATH, using = "//select[@name='table-person-administration_length']")
    WebElement eintraegeAnzeigen;

    public boolean eintraegeAnzeigen_check() {
        return (PageFactoryUtil.displayed_enabled_check(className, eintraegeAnzeigen));
    }

    @CacheLookup
    @FindBy(how = How.XPATH, using = "//label[contains(text(),'Suchen')]")
    WebElement suchenLaben;

    public boolean suchenLaben_check() {
        return (PageFactoryUtil.displayed_enabled_check(className + "." + suchenLaben.getText(), suchenLaben));
    }

    @CacheLookup
    @FindBy(how = How.XPATH, using = "//input[@class='form-control form-control-sm']")
    WebElement sucheEingabe;

    public boolean sucheEingabe_check() {
        return (PageFactoryUtil.displayed_enabled_check(className + "." + sucheEingabe.getAttribute("type"), sucheEingabe));
    }

    @CacheLookup
    @FindBy(how = How.ID, using = "table-person-administration")
    WebElement personTabelleAdmin;

    public boolean personTabelleAdmin_check() {
        return (PageFactoryUtil.displayed_enabled_check(className + "." + personTabelleAdmin.getAttribute("id"), personTabelleAdmin));
    }

    public WebElement getTable() {
        return personTabelleAdmin;
    }

    @CacheLookup
    @FindBy(how = How.ID, using = "table-person-administration_info")
    WebElement personTabelleAdminInfo;

    public boolean personTabelleAdminInfo_check() {
        return (PageFactoryUtil.displayed_enabled_check(className + "." + personTabelleAdminInfo.getAttribute("id"), personTabelleAdminInfo));
    }

    @CacheLookup
    @FindBy(how = How.ID, using = "table-person-administration_paginate")
    WebElement pagination;

    public boolean pagination_check() {
        return (PageFactoryUtil.enaabled_check(className + "." + pagination.getAttribute("id"), pagination));
    }

    @CacheLookup
    @FindBy(how = How.XPATH, using = "//th[contains(text(),'Name')]")
    WebElement header_name;

    public boolean header_name_check() {
        return (PageFactoryUtil.displayed_enabled_check(className + "." + header_name.getAttribute("id"), header_name));
    }

    @CacheLookup
    @FindBy(how = How.XPATH, using = "//table[@id='table-person-administration']//tbody")
    WebElement table_body;

    public boolean table_body_check() {
        wait.until(ExpectedConditions.visibilityOf(table_body));
        return (PageFactoryUtil.displayed_enabled_check(className + "." + table_body.getTagName(), table_body));
    }

    // Dynamic table muss loaded new
    @CacheLookup
    @FindBy(how = How.XPATH, using = "//td[@class='sorting_1']")
    WebElement cell1;

    public boolean cell1_check() {
        System.out.println("Cell: " + cell1.getText());
        return (PageFactoryUtil.displayed_enabled_check(className + "." + cell1.getTagName(), cell1));
    }


    @CacheLookup
    @FindBy(how = How.XPATH, using = "//td[9]//a[1]")
    WebElement cellButton;

    @CacheLookup
    @FindBy(how = How.XPATH, using = "//body/div[@id='app']/nav[@class='navbar navbar-expand-md navbar-light']/div[@class='container']/div[@id='navbarSupportedContent']/ul[@class='navbar-nav mr-auto']/li[*]/a[1]")
    List<WebElement> tabsButtons;

    public List<WebElement> tabsButtonList() {
        return tabsButtons;
    }

    @CacheLookup
    @FindBy(how = How.XPATH, using = "//body/div[@id='app']/nav[@class='navbar navbar-expand-md navbar-light']/div[@class='container']/div[@id='navbarSupportedContent']/ul[@class='navbar-nav mr-auto']/li[1]/a[1] ")
    WebElement dashboard_btn;

    public boolean dashboard_btn_check() {
        return (PageFactoryUtil.displayed_enabled_check(className + "." + dashboard_btn.getAttribute("id"), dashboard_btn));
    }

    public void dashboard_btn_click() {
        if (dashboard_btn_check()) dashboard_btn.click();
    }

    // Check das DropDown liste von Dashboard
    @CacheLookup
    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Dashboard WBG')]")
    WebElement dashboard_WBG;

    public boolean dashboard_WBG_check() {
        wait.until(ExpectedConditions.visibilityOf(dashboard_WBG));
        return (PageFactoryUtil.displayed_enabled_check(className + "." + dashboard_WBG.getTagName(), dashboard_WBG));
    }


    @CacheLookup
    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Dashboard SNM')]")
    WebElement dashboard_SNM;

    public boolean dashboard_SNM_check() {
        wait.until(ExpectedConditions.visibilityOf(dashboard_SNM));
        return (PageFactoryUtil.displayed_enabled_check(className + "." + dashboard_SNM.getTagName(), dashboard_SNM));
    }

    @CacheLookup
    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Dashboard LWI')]")
    WebElement dashboard_LWI;

    public boolean dashboard_LWI_check() {
        wait.until(ExpectedConditions.visibilityOf(dashboard_LWI));
        return (PageFactoryUtil.displayed_enabled_check(className + "." + dashboard_LWI.getTagName(), dashboard_LWI));
    }

    @CacheLookup
    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Dashboard BPL')]")
    WebElement dashboard_BPL;

    public boolean dashboard_BPL_check() {
        wait.until(ExpectedConditions.visibilityOf(dashboard_BPL));
        return (PageFactoryUtil.displayed_enabled_check(className + "." + dashboard_BPL.getTagName(), dashboard_BPL));
    }

    @CacheLookup
    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Suche Bauservices')]")
    WebElement suche_Bauservices;

    public boolean suche_Bauservives_check() {
        wait.until(ExpectedConditions.visibilityOf(suche_Bauservices));
        return (PageFactoryUtil.displayed_enabled_check(className + "." + suche_Bauservices.getTagName(), suche_Bauservices));
    }

    @CacheLookup
    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Gewerkverwaltung')]")
    WebElement gewerkverwaltung;

    public boolean gewerkverwaltung_check() {
        wait.until(ExpectedConditions.visibilityOf(gewerkverwaltung));
        return (PageFactoryUtil.displayed_enabled_check(className + "." + gewerkverwaltung.getTagName(), gewerkverwaltung));
    }

    @CacheLookup
    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Projektverwaltung')]")
    WebElement projektverwaltung;

    public boolean projektverwaltung_check() {
        wait.until(ExpectedConditions.visibilityOf(projektverwaltung));
        return (PageFactoryUtil.displayed_enabled_check(className + "." + projektverwaltung.getTagName(), projektverwaltung));
    }

    @CacheLookup
    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Projektverwaltung')]")
    WebElement nachtragverwaltung;

    public boolean nachtragverwaltung_check() {
        wait.until(ExpectedConditions.visibilityOf(nachtragverwaltung));
        return (PageFactoryUtil.displayed_enabled_check(className + "." + nachtragverwaltung.getTagName(), nachtragverwaltung));
    }

    @CacheLookup
    @FindBy(how = How.XPATH, using = "//body/div[@id='app']/nav[@class='navbar navbar-expand-md navbar-light']/div[@class='container']/div[@id='navbarSupportedContent']/ul[@class='navbar-nav mr-auto']/li[2]/a[1] ")
    WebElement verwaltung_btn;

    public boolean verwaltung_btn_check() {
        wait.until(ExpectedConditions.visibilityOf(verwaltung_btn));
        return (PageFactoryUtil.displayed_enabled_check(className + "." + verwaltung_btn.getTagName(), verwaltung_btn));
    }

    public void verwaltung_btn_click() {
        verwaltung_btn.click();
    }

    // Verwaltung Dropdown

    @CacheLookup
    @FindBy(how = How.XPATH, using = "//a[contains(text(),'WBG Meldungsverwaltung')]")
    WebElement wbg_Meldungsverwaltung;

    public boolean wbg_Meldungsverwaltung_check() {
        wait.until(ExpectedConditions.visibilityOf(wbg_Meldungsverwaltung));
        return (PageFactoryUtil.displayed_enabled_check(className + "." + wbg_Meldungsverwaltung.getTagName(), wbg_Meldungsverwaltung));
    }

    @CacheLookup
    @FindBy(how = How.XPATH, using = "//a[contains(text(),'WBG Projektkostenverwaltung')]")
    WebElement wbg_Projektkostenverwaltung;

    public boolean wbg_Projektkostenverwaltung_check() {
        wait.until(ExpectedConditions.visibilityOf(wbg_Projektkostenverwaltung));
        return (PageFactoryUtil.displayed_enabled_check(className + "." + wbg_Projektkostenverwaltung.getTagName(), wbg_Projektkostenverwaltung));
    }

    @CacheLookup
    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Hausbesorger')]")
    WebElement hausbesorger;

    public boolean hausbesorger_check() {
        wait.until(ExpectedConditions.visibilityOf(hausbesorger));
        return (PageFactoryUtil.displayed_enabled_check(className + "." + hausbesorger.getTagName(), hausbesorger));
    }

    @CacheLookup
    @FindBy(how = How.XPATH, using = "//a[contains(text(),'SNM Meldungsverwaltung')]")
    WebElement snm_Meldungsverwaltung;

    public boolean snm_Meldungsverwaltung_check() {
        wait.until(ExpectedConditions.visibilityOf(snm_Meldungsverwaltung));
        return (PageFactoryUtil.displayed_enabled_check(className + "." + snm_Meldungsverwaltung.getTagName(), snm_Meldungsverwaltung));
    }

    @CacheLookup
    @FindBy(how = How.XPATH, using = "//a[contains(text(),'SNM Projektkostenverwaltung')]")
    WebElement snm_Projektkostenverwaltung;

    public boolean snm_Projektkostenverwaltung_check() {
        wait.until(ExpectedConditions.visibilityOf(snm_Projektkostenverwaltung));
        return (PageFactoryUtil.displayed_enabled_check(className + "." + snm_Projektkostenverwaltung.getTagName(), snm_Projektkostenverwaltung));
    }

    @CacheLookup
    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Kostenrückerstattungen')]")
    WebElement kostenrückerstattungen;

    public boolean kostenrückerstattungen_check() {
        wait.until(ExpectedConditions.visibilityOf(kostenrückerstattungen));
        return (PageFactoryUtil.displayed_enabled_check(className + "." + kostenrückerstattungen.getTagName(), kostenrückerstattungen));
    }

    @CacheLookup
    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Kostenrückerstattungsrechnungen')]")
    WebElement Kostenrückerstattungsrechnungen;

    public boolean kostenrückerstattungsrechnungen_check() {
        wait.until(ExpectedConditions.visibilityOf(Kostenrückerstattungsrechnungen));
        return (PageFactoryUtil.displayed_enabled_check(className + "." + Kostenrückerstattungsrechnungen.getTagName(), Kostenrückerstattungsrechnungen));
    }

    @CacheLookup
    @FindBy(how = How.XPATH, using = "//body/div[@id='app']/nav[@class='navbar navbar-expand-md navbar-light']/div[@class='container']/div[@id='navbarSupportedContent']/ul[@class='navbar-nav mr-auto']/li[3]/a[1]")
    WebElement auswertung_btn;

    public boolean auswertung_btn_check() {
        wait.until(ExpectedConditions.visibilityOf(auswertung_btn));
        return (PageFactoryUtil.displayed_enabled_check(className + "." + auswertung_btn.getTagName(), auswertung_btn));
    }

    public void auswertung_btn_click() {
        auswertung_btn.click();
    }

    //Administration liste
    @CacheLookup
    @FindBy(how = How.XPATH, using = "//div[@class='dropdown-menu show']//a[1]")
    WebElement bpl_auswertung;

    public boolean bpl_auswertung_check() {
        wait.until(ExpectedConditions.visibilityOf(bpl_auswertung));
        return (PageFactoryUtil.displayed_enabled_check(className + "." + bpl_auswertung.getTagName(), bpl_auswertung));
    }

    @CacheLookup
    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Meine Performance')]")
    WebElement bpl_Meine_Performance;

    public boolean bpl_Meine_Performance_check() {
        wait.until(ExpectedConditions.visibilityOf(bpl_Meine_Performance));
        return (PageFactoryUtil.displayed_enabled_check(className + "." + bpl_Meine_Performance.getTagName(), bpl_Meine_Performance));
    }

    @CacheLookup
    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Abteilungsperformance')]")
    WebElement abteilungsperformance;

    public boolean abteilungsperformance_check() {
        wait.until(ExpectedConditions.visibilityOf(abteilungsperformance));
        return (PageFactoryUtil.displayed_enabled_check(className + "." + abteilungsperformance.getTagName(), abteilungsperformance));
    }

    @CacheLookup
    @FindBy(how = How.XPATH, using = "//li[@class='nav-item dropdown show']//a[4]")
    WebElement lwi_Auswertungen;

    public boolean lwi_Auswertungen_check() {
        wait.until(ExpectedConditions.visibilityOf(lwi_Auswertungen));
        return (PageFactoryUtil.displayed_enabled_check(className + "." + lwi_Auswertungen.getTagName(), lwi_Auswertungen));
    }

    @CacheLookup
    @FindBy(how = How.XPATH, using = "//a[contains(text(),'monatliche Auswertung')]")
    WebElement monatliche_Auswertung;

    public boolean monatliche_Auswertung_check() {
        wait.until(ExpectedConditions.visibilityOf(monatliche_Auswertung));
        return (PageFactoryUtil.displayed_enabled_check(className + "." + monatliche_Auswertung.getTagName(), monatliche_Auswertung));
    }

    @CacheLookup
    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Produktperformance')]")
    WebElement produktperformance;

    public boolean produktperformance_check() {
        wait.until(ExpectedConditions.visibilityOf(produktperformance));
        return (PageFactoryUtil.displayed_enabled_check(className + "." + produktperformance.getTagName(), produktperformance));
    }

    @CacheLookup
    @FindBy(how = How.XPATH, using = "//a[contains(text(),'SNM Kontrolliste')]")
    WebElement snm_Kontrolliste;

    public boolean snm_Kontrolliste_check() {
        wait.until(ExpectedConditions.visibilityOf(snm_Kontrolliste));
        return (PageFactoryUtil.displayed_enabled_check(className + "." + snm_Kontrolliste.getTagName(), snm_Kontrolliste));
    }

    @CacheLookup
    @FindBy(how = How.XPATH, using = "//a[contains(text(),'SNM Auswertung Übersicht')]")
    WebElement snm_Auswertung_UEbersicht;

    public boolean snm_Auswertung_UEbersicht_check() {
        wait.until(ExpectedConditions.visibilityOf(snm_Auswertung_UEbersicht));
        return (PageFactoryUtil.displayed_enabled_check(className + "." + snm_Auswertung_UEbersicht.getTagName(), snm_Auswertung_UEbersicht));
    }

    @CacheLookup
    @FindBy(how = How.XPATH, using = "//a[contains(text(),'SNM Auswertung Wiener Wohnen')]")
    WebElement snm_Auswertung_WW;

    public boolean snm_Auswertung_WW_check() {
        wait.until(ExpectedConditions.visibilityOf(snm_Auswertung_WW));
        return (PageFactoryUtil.displayed_enabled_check(className + "." + snm_Auswertung_WW.getTagName(), snm_Auswertung_WW));
    }

    @CacheLookup
    @FindBy(how = How.XPATH, using = "//a[contains(text(),'WBG Kontrollliste')]")
    WebElement wbg_Kontrollliste;

    public boolean wbg_Kontrollliste_check() {
        wait.until(ExpectedConditions.visibilityOf(wbg_Kontrollliste));
        return (PageFactoryUtil.displayed_enabled_check(className + "." + wbg_Kontrollliste.getTagName(), wbg_Kontrollliste));
    }

    @CacheLookup
    @FindBy(how = How.XPATH, using = "//a[contains(text(),'WBG Monatsbericht')]")
    WebElement wbg_Monatsbericht;

    public boolean wbg_Monatsbericht_check() {
        wait.until(ExpectedConditions.visibilityOf(wbg_Monatsbericht));
        return (PageFactoryUtil.displayed_enabled_check(className + "." + wbg_Monatsbericht.getTagName(), wbg_Monatsbericht));
    }

    @CacheLookup
    @FindBy(how = How.XPATH, using = "//a[contains(text(),'WBG Zielübersicht')]")
    WebElement wbg_Zielübersicht;

    public boolean wbg_Zielübersicht_check() {
        wait.until(ExpectedConditions.visibilityOf(wbg_Zielübersicht));
        return (PageFactoryUtil.displayed_enabled_check(className + "." + wbg_Zielübersicht.getTagName(), wbg_Zielübersicht));
    }

    @CacheLookup
    @FindBy(how = How.XPATH, using = "//body/div[@id='app']/nav[@class='navbar navbar-expand-md navbar-light']/div[@class='container']/div[@id='navbarSupportedContent']/ul[@class='navbar-nav mr-auto']/li[4]/a[1]")
    WebElement administration_btn;

    public boolean administration_btn_check() {
        wait.until(ExpectedConditions.visibilityOf(administration_btn));
        return (PageFactoryUtil.displayed_enabled_check(className + "." + administration_btn.getTagName(), administration_btn));
    }

    // Administration
    public void administration_btn_click() {
        administration_btn.click();
    }

    @CacheLookup
    @FindBy(how = How.XPATH, using = "//a[contains(text(),'WBG Zielübersicht')]")
    List<WebElement> adminList;

    public boolean cellButton_check() {
        return (PageFactoryUtil.displayed_enabled_check(className + "." + cellButton.getTagName(), cellButton));
    }

    public void cellButton_click() {
        cellButton.click();
    }

    @CacheLookup
    @FindBy(how = How.XPATH, using = "//li[@class='nav-item dropdown show']//a[*]")
    List<WebElement> adminDropdownlist;

    public boolean adminDropdownlist_Check() {
        boolean check = true;
        for (int i = 0; i < adminDropdownlist.size(); i++) {
            switch (i) {
                case 0:
                    if (!adminDropdownlist.get(0).getText().equals("Administration")) {
                        check = false;
                    }
                case 1:
                    if (!adminDropdownlist.get(1).getText().equals("Personenadministration")) {
                        check = false;
                    }
                case 2:
                    if (!adminDropdownlist.get(2).getText().equals("Gruppen Verwaltung")) {
                        check = false;
                    }
                case 3:
                    if (!adminDropdownlist.get(3).getText().equals("Firmenadministration")) {
                        check = false;
                    }
                case 4:
                    if (!adminDropdownlist.get(4).getText().equals("RA Lose")) {
                        check = false;
                    }
                case 5:
                    if (!adminDropdownlist.get(5).getText().equals("Gebiets Verwaltung")) {
                        check = false;
                    }
                case 6:
                    if (!adminDropdownlist.get(6).getText().equals("Leistungsverzeichnis")) {
                        check = false;
                    }
                case 7:
                    if (!adminDropdownlist.get(7).getText().equals("Gewerkadministration")) {
                        check = false;
                    }
                case 8:
                    if (!adminDropdownlist.get(8).getText().equals("Sachkonto Verwaltung")) {
                        check = false;
                    }
                case 9:
                    if (!adminDropdownlist.get(9).getText().equals("Feiertag Verwaltung")) {
                        check = false;
                    }
                case 10:
                    if (!adminDropdownlist.get(10).getText().equals("Identadressen Verwaltung")) {
                        check = false;
                    }
                case 11:
                    if (!adminDropdownlist.get(11).getText().equals("Planleistung Verwaltung")) {
                        check = false;
                    }
                case 12:
                    if (!adminDropdownlist.get(12).getText().equals("Geschoß Verwaltung")) {
                        check = false;
                    }
                case 13:
                    if (!adminDropdownlist.get(13).getText().equals("Wärmebereitungsgerät Verwaltung")) {
                        check = false;
                    }
                case 14:
                    if (!adminDropdownlist.get(14).getText().equals("Gerätezustand Verwaltung")) {
                        check = false;
                    }
                case 15:
                    if (!adminDropdownlist.get(15).getText().equals("Ursachen Verwaltung")) {
                        check = false;
                    }
                case 16:
                    if (!adminDropdownlist.get(16).getText().equals("Defektkatalog Verwaltung")) {
                        check = false;
                    }
                case 17:
                    if (!adminDropdownlist.get(17).getText().equals("Ablauf Status Verwaltung")) {
                        check = false;
                    }
                case 18:
                    if (!adminDropdownlist.get(18).getText().equals("Bearbeitungsstatus LWI Verwaltung")) {
                        check = false;
                    }
                case 19:
                    if (!adminDropdownlist.get(19).getText().equals("Regiestundenverwaltung")) {
                        check = false;
                    }
                case 20:
                    if (!adminDropdownlist.get(20).getText().equals("Checklistelemente Verwaltung")) {
                        check = false;
                    }
            }
        }
        return check;
    }

    @CacheLookup
    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Rollenadministration')]")
    WebElement rollenAdministration;

    public boolean rollenAdministration_check() {
        return (PageFactoryUtil.displayed_enabled_check(className + "." + rollenAdministration.getTagName(), rollenAdministration));
    }

    @CacheLookup
    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Berechtigungsadministration')]")
    WebElement berechtigungsadminstration;

    public boolean berechtigungsadminstration_check() {
        return (PageFactoryUtil.displayed_enabled_check(className + "." + berechtigungsadminstration.getTagName(), berechtigungsadminstration));
    }

    @CacheLookup
    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Berechtigungsgruppenadministration')]")
    WebElement berechtigungsGruppenadminstration;

    public boolean berechtigungsGruppenadminstration_check() {
        return (PageFactoryUtil.displayed_enabled_check(className + "." + berechtigungsGruppenadminstration.getTagName(), berechtigungsGruppenadminstration));
    }

    @CacheLookup
    @FindBy(how = How.ID, using = "upload_link")
    WebElement perlustrierung_Hochladen;

    public boolean perlustrierung_Hochladen_check() {
        return (PageFactoryUtil.displayed_enabled_check(className + "." + perlustrierung_Hochladen.getTagName(), perlustrierung_Hochladen) && perlustrierung_Hochladen.getText().equals("Perlustrierungs Hochladen"));
    }

    @CacheLookup
    @FindBy(how = How.XPATH, using = "//ul[@class='navbar-nav ml-auto']//a[@id='navbarDropdown']")
    WebElement logged_User;

    public boolean logged_User_check() {
        return (PageFactoryUtil.displayed_enabled_check(className + "." + logged_User.getTagName(), logged_User));
    }

    public void logged_User_click(){
        logged_User.click();
    }

    @CacheLookup
    @FindBy(how = How.XPATH, using = "//div[@class='dropdown-menu show']//a[1]")
    WebElement password_Aendern;

    public boolean password_Aendern_check() {
        wait.until(ExpectedConditions.visibilityOf(password_Aendern));
        return (PageFactoryUtil.displayed_enabled_check(className + "." + password_Aendern.getTagName(), password_Aendern) && password_Aendern.getText().equals("Passwort ändern"));
    }

    @CacheLookup
    @FindBy(how = How.XPATH, using = "//ul[@class='navbar-nav ml-auto']//a[2]")
    WebElement logout_btn;

    public boolean logout_btn_check() {
        wait.until(ExpectedConditions.visibilityOf(logout_btn));
        return (PageFactoryUtil.displayed_enabled_check(className + "." + logout_btn.getTagName(), logout_btn) && logout_btn.getText().equals("Logout"));
    }
    public void logout_click(){
        logout_btn.click();
    }
}



