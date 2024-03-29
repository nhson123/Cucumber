package Steps.tutor.pageFactory;

import Steps.wiener.PageFactory.PFHelper;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.picocontainer.classname.ClassName;

import java.util.logging.Logger;

/** Package: Steps.tutor.pageFactory Generated by: Hoang.Son.Nguyen Generated at: 19.11.2018 2018 */
public class AlertHandlePageFactory {
  private WebDriver driver;
  private static final Logger LOGGER = Logger.getLogger(ClassName.class.getName());

  public AlertHandlePageFactory(WebDriver driver) {
    this.driver = driver;
  }

  @CacheLookup
  @FindBy(how = How.XPATH, using = "//button[@id='dblClkBtn']")
  WebElement alertBoxBtn;

  public void alertBoxBtn_check() {
    PFHelper.element_visible_enabled_check(
        driver,
        alertBoxBtn,
        this.getClass().getName(),
        new Object() {}.getClass().getEnclosingMethod().getName());
  }

  public void alertBoxBtn_doubleClick() {
    Actions actions = new Actions(driver);
    actions.doubleClick(alertBoxBtn).perform();
    PFHelper.threatSleep(1000);
  }

  public void alertAccept() {
    driver.switchTo().alert().accept();
    PFHelper.threatSleep(1000);
  }

  @CacheLookup
  @FindBy(how = How.XPATH, using = "//img[@id='sourceImage']")
  WebElement artOfTestingImage;

  @CacheLookup
  @FindBy(how = How.XPATH, using = "//div[@id='targetDiv']")
  WebElement dropField;

  public void dragDropArtOfTest() {
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].scrollIntoView()", artOfTestingImage);
    Actions actions = new Actions(driver);
    actions.dragAndDrop(artOfTestingImage, dropField).perform();
    LOGGER.info("Drag und Drop executed!");
    //Actions actions = new Actions(driver);
    //actions.clickAndHold(artOfTestingImage).moveToElement(dropField).release(dropField).perform();
    PFHelper.threatSleep(1000);

  }

  public void submitClickJS() {
    ((JavascriptExecutor) driver).executeScript("document.getElementById('idOfButton').click();");
  }

  @CacheLookup
  @FindBy(how = How.XPATH, using = "//input[@id='fname']")
  WebElement textBox;

  public void hightlightTextBox() {
    PFHelper.highlightWebElement(this.driver, textBox);
  }
}
