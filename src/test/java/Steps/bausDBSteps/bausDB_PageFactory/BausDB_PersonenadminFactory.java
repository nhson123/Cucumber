package Steps.bausDBSteps.bausDB_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.picocontainer.classname.ClassName;

import java.util.List;
import java.util.logging.Logger;

public class BausDB_PersonenadminFactory {
    private WebDriver driver;
    private String className;
    private static final Logger LOGGER = Logger.getLogger(ClassName.class.getName());

    public BausDB_PersonenadminFactory(WebDriver driver) {
        this.driver = driver;
        className = this.getClass().getName();
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
        return (PageFactoryUtil.displayed_enabled_check(className + "." + table_body.getTagName(), table_body));
    }

    // Dynamic table muss loaded new
    @CacheLookup
    @FindBy(how = How.XPATH, using = "//td[@class='sorting_1']")
    WebElement cell1;

    public boolean cell1_check() {
        System.out.println("Cell: "+cell1.getText());
        return (PageFactoryUtil.displayed_enabled_check(className + "." + cell1.getTagName(), cell1));
    }


    @CacheLookup
    @FindBy(how = How.XPATH, using = "//td[9]//a[1]")
    WebElement cellButton;

    @CacheLookup
    @FindBy(how = How.XPATH, using = "//body/div[@id='app']/nav[@class='navbar navbar-expand-md navbar-light']/div[@class='container']/div[@id='navbarSupportedContent']/ul[@class='navbar-nav mr-auto']/li[*]/a[1]")
    List<WebElement> tabsButtons;

    public List<WebElement> tabsButtonList(){
        return tabsButtons;
    }

    public boolean cellButton_check() {
        return (PageFactoryUtil.displayed_enabled_check(className + "." + cellButton.getTagName(), cellButton));
    }

    public void cellButton_click(){
        cellButton.click();
    }
}

