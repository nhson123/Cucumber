package Steps.tutor.pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.picocontainer.classname.ClassName;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.logging.Logger;

/** Package: Steps.tutor.pageFactory Generated by: Hoang.Son.Nguyen Generated at: 01.12.2018 2018 */
public class DdtDataProviderPageFactory {
  private WebDriver driver;
  private static final Logger LOGGER = Logger.getLogger(ClassName.class.getName());

  public DdtDataProviderPageFactory(WebDriver driver) {
    this.driver = driver;
  }

  @CacheLookup
  @FindBy(
      how = How.XPATH,
      using = "//img[@src='/webres_5acde3dbd3adc6.90334155/themes/default/images/login/logo.png']")
  WebElement orangeLog;

  @CacheLookup
  @FindBy(how = How.XPATH, using = "//input[@id='txtUsername']")
  WebElement loginName;

  @CacheLookup
  @FindBy(how = How.XPATH, using = "//input[@id='txtPassword']")
  WebElement loginPwd;

  @CacheLookup
  @FindBy(how = How.XPATH, using = "//input[@id='btnLogin']")
  WebElement loginButton;

  @Test(dataProvider = "dataProv")
  public void userLogin(String name, String pwd) {
    loginName.sendKeys(name);
    loginPwd.sendKeys(pwd);
    loginButton.click();
  }

  @DataProvider(name = "dataProv")
  public Object[][] dataProv() {
    Object[][] data = new Object[2][3];
    data[0][0] = "name0";
    data[0][1] = "pwd0";
    data[1][0] = "name1";
    data[1][1] = "pwd1";
    data[2][0] = "name2";
    data[2][1] = "pwd2";
    return data;
  }
}
