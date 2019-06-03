package Steps.bausDBSteps.bausDB_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.picocontainer.classname.ClassName;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class BausDB_SNM_Auswertung_Details_PF {

    private WebDriver driver;
    private static final Logger LOGGER = Logger.getLogger(ClassName.class.getName());

    public BausDB_SNM_Auswertung_Details_PF(WebDriver driver) {
        this.driver = driver;
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @CacheLookup
    @FindBy(how = How.XPATH, using = "//body/div[@class='logo']/*[1]")
    WebElement ww_Logo;

    public boolean ww_Logo_Check() {
        if (ww_Logo.isDisplayed()) {
            LOGGER.info(this.getClass().getName() + ": ww_Logo is available");
            return true;
        } else {
            LOGGER.warning("ww_Logo is not available");
            return false;
        }
    }

    @CacheLookup
    @FindBy(how = How.XPATH, using = "//th")
    List<WebElement> headers;

    public boolean table_Header_Check() {
        boolean check = true;
        for (int i = 0; i < headers.size(); i++) {
            switch (i) {
                case 0:
                    if (!headers.get(0).getText().equals("SAP Meldungsnummer")) {
                        check = false;
                    }
                case 1:
                    if (!headers.get(1).getText().equals("SAP Übergabedatum")) {
                        check = false;
                    }
                case 2:
                    if (!headers.get(2).getText().equals("Bearbeitungsdauer (in Tagen)")) {
                        check = false;
                    }
                case 3:
                    if (!headers.get(3).getText().equals("Inbearbeitungsnahme innerhalb von 24 Stunden (Tagen)")) {
                        check = false;
                    }
                case 4:
                    if (!headers.get(4).getText().equals("Miethauer zum Zeitpunkt des SAP Eingangs (in Tagen)")) {
                        check = false;
                    }
                case 5:
                    if (!headers.get(5).getText().equals("Instandgesetzt von SNM (Erstrecherche)")) {
                        check = false;
                    }
                case 6:
                    if (!headers.get(6).getText().equals("Gebrechen (Erstrecherche)")) {
                        check = false;
                    }
                case 7:
                    if (!headers.get(7).getText().equals("Mietersachen (Erstrecherche)")) {
                        check = false;
                    }
                case 8:
                    if (!headers.get(8).getText().equals("Instandgesetzt von SNM (Zweitrecherche)")) {
                        check = false;
                    }
                case 9:
                    if (!headers.get(9).getText().equals("Gebrechen (Zweitrecherche)")) {
                        check = false;
                    }
                case 10:
                    if (!headers.get(10).getText().equals("Mietersachen (Zweitrecherche)")) {
                        check = false;
                    }
                case 11:
                    if (!headers.get(11).getText().equals("Gewährleistungen")) {
                        check = false;
                    }
                case 12:
                    if (!headers.get(12).getText().equals("Gewerkkosten via DVS")) {
                        check = false;
                    }
                case 13:
                    if (!headers.get(13).getText().equals("Nachtragkosten via DVS")) {
                        check = false;
                    }
                case 14:
                    if (!headers.get(14).getText().equals("Kosten Rahmenvertrag")) {
                        check = false;
                    }
                case 15:
                    if (!headers.get(15).getText().equals("Kosten ohne LV")) {
                        check = false;
                    }
                case 16:
                    if (!headers.get(16).getText().equals("Technischer Platz")) {
                        check = false;
                    }
                case 17:
                    if (!headers.get(17).getText().equals("Addresse")) {
                        check = false;
                    }
                case 18:
                    if (!headers.get(18).getText().equals("Gebietsteil")) {
                        check = false;
                    }
                case 19:
                    if (!headers.get(19).getText().equals("Instandgesetzt von")) {
                            check = false;
                    }
                case 20:
                    if (!headers.get(20).getText().equals("Pipeticketids")) {
                        check = false;
                    }
            }

        }

        return check;
    }


}
