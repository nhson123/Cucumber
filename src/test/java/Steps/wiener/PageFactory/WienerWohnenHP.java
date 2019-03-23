package Steps.wiener.PageFactory;

import Steps.arrange.DriverWait;
import Steps.hooks.UtilityScreenshot;
import org.junit.rules.ErrorCollector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.picocontainer.classname.ClassName;

import java.util.logging.Logger;

import static org.junit.Assert.assertTrue;

/**
 * Package: Steps.wiener.PageFactory Generated by: Hoang.Son.Nguyen Generated at: 29.10.2018 2018
 */
public class WienerWohnenHP {
  private WebDriver driver;
  private static final Logger LOGGER = Logger.getLogger(ClassName.class.getName());
  //  System.setProperty("webdriver.chrome.logfile", "TestLog.txt");
  ErrorCollector errorCollector = new ErrorCollector();

  public WienerWohnenHP(WebDriver driver) {
    this.driver = driver;
  }

  // Wiener wohnen Logo
  @FindBy(how = How.XPATH, using = "//a[@class='logo']")
  @CacheLookup
  WebElement wienerWohnenLogo;

  public void hp_Logo_check() {
    assertTrue(wienerWohnenLogo.isDisplayed());
    assertTrue(wienerWohnenLogo.getText().equals("Startseite von Wiener Wohnen"));
    if (!wienerWohnenLogo.getText().equals("Startseite von Wiener Wohnen")) {
      LOGGER.warning(
          this.getClass().getName()
              + " Fehler, expected: Startseite von Wiener Wohnen, get: "
              + wienerWohnenLogo.getText());
    }
  }

  // InteressenIn link
  @FindBy(how = How.XPATH, using = "//a[contains(text(),'InteressentIn')]")
  @CacheLookup
  WebElement interessantIn;

  public void interessantIn_check() {
    assertTrue(interessantIn.isDisplayed());
    assertTrue(interessantIn.isEnabled());
  }

  public void interessantIn_click() {
    interessantIn.click();
  }

  // @FindBy(how = How.XPATH, using = "//a[contains(text(),'Gemeindewohnung')]")
  @FindBy(how = How.CSS, using = "#mainnav > li:nth-child(2) > ul > li:nth-child(1) > a")
  @CacheLookup
  WebElement GemeinWohnung;

  private String x;

  public void setGemeinWohnung_check() {
    assertTrue(GemeinWohnung.isDisplayed());
    assertTrue(GemeinWohnung.isEnabled());

    if (!GemeinWohnung.isDisplayed() || !GemeinWohnung.isEnabled()) {
      UtilityScreenshot.CaptureScreenshot(
          driver, new Object() {}.getClass().getEnclosingMethod().getName());
    }
  }

  public void GemeinWohnung_click() {
    /*
    WebElement element = GemeinWohnung;
    DriverWait.waitForSecondsTimeOut(9,driver);
    Actions builder = new Actions(driver);
    builder.moveToElement(element).click(element);
    builder.perform();
    */
    GemeinWohnung.click();
  }

  @FindBy(how = How.XPATH, using = "//h1[@id='page-title']")
  @CacheLookup
  WebElement gemeinTitel;

  public void gemeinTitel_check() {
    assertTrue(gemeinTitel.isDisplayed());
    assertTrue(gemeinTitel.isEnabled());
  }

  @FindBy(how = How.XPATH, using = "//a[contains(text(),'der Wohnberatung Wien')]")
  @CacheLookup
  WebElement wohnberatungWien;

  public void wohnberatungWien_check() {
    assertTrue(wohnberatungWien.isDisplayed());
    assertTrue(wohnberatungWien.isEnabled());
  }

  public void WohnberatungWien_click() {
    WebDriverWait wait = new WebDriverWait(driver, 5);
    WebElement element = wait.until(ExpectedConditions.elementToBeClickable(wohnberatungWien));
    element.click();
  }

  @FindBy(how = How.XPATH, using = "//img[@class='navbar-brand-logo-normal']")
  @CacheLookup
  WebElement wohnberatungLogo;

  @FindBy(how = How.XPATH, using = "//h1[contains(@class,'element-header')]")
  @CacheLookup
  WebElement wohnberatungHP;

  public void gemeinWohnungHP_check() {
    DriverWait.waitForSecondsTimeOut(3, driver);
    String winHandleBefore = driver.getWindowHandle();
    for (String winHandle : driver.getWindowHandles()) {
      // switch to the last window
      driver.switchTo().window(winHandle);
    }
    assertTrue(wohnberatungLogo.isDisplayed());
    assertTrue(wohnberatungHP.isDisplayed());
  }

  @CacheLookup
  @FindBy(how = How.XPATH, using = "//a[@title='Impressum']")
  WebElement impresium;

  public void impresium_check() {
    assertTrue(impresium.isDisplayed());
    assertTrue(impresium.isEnabled());
  }
}