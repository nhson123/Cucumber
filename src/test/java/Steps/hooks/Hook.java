package Steps.hooks;

/**
 * Package: Steps Generated by: Hoang.Son.Nguyen Generated at: 18.10.2018 2018
 */

import Steps.tutor.pageFactory.PropertiesFileReader;
import base.BaseUtil;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.IOException;
import java.util.HashMap;

public class Hook extends BaseUtil {
    PropertiesFileReader prop;

    private BaseUtil base;

    public Hook(BaseUtil base) {
        this.base = base;
    }

    @Before("@First")
    public void beforeScenarioFirst() {
        System.out.println("This will run before the First Scenario");
    }

    @Before("@chrome")
    public void beforeScenarioChrome() throws IOException {
        System.setProperty("webdriver.chrome.driver", PropertiesFileReader.getValue("chromeWebDriverPath"));
        // just to deactivate the download warning in Chrome
        String downloadFilepath = System.getProperty("user.home") + "/Desktop";
        HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
        chromePrefs.put("profile.default_content_settings.popups", 0);
        chromePrefs.put("download.default_directory", downloadFilepath);
        chromePrefs.put("safebrowsing.enabled", "true");
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", chromePrefs);
        options.addArguments("--disable-infobars");
        options.addArguments("--disable-notifications");
        // options.addArguments("--headless");
        DesiredCapabilities cap = DesiredCapabilities.chrome();
        cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        cap.setCapability(ChromeOptions.CAPABILITY, options);

        base.webDriver = new ChromeDriver(cap);
        //
        base.stepInfo = "Als Bespiel kann hier Infos von WebDriver zur Selenium weiter";
        System.out.println("Webdriver will run before first test");
        // base.webDriver = new ChromeDriver();
        base.webDriver.manage().window().maximize();
    }

    @Before("@firefox")
    public void beforeScenarioFirefox() throws IOException {
        base.stepInfo = "Als Bespiel kann hier Infos von WebDriver zur Selenium weiter";
        System.setProperty(
                "webdriver.gecko.driver", PropertiesFileReader.getValue("firefoxWebDrierPath"));
        // handle the unstruted certificate site
        DesiredCapabilities ds = new DesiredCapabilities();
        ds.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        base.webDriver = new FirefoxDriver(ds);
        base.webDriver.manage().window().maximize();
    }

    @Before("@htmlUnitDriver")
    public void beforeScenarioHtmlUnitDriver() {
        base.webDriver = new HtmlUnitDriver();
    }

    @Before("@phantomJs")
    public void beforeScenarioPhantomJs() throws IOException {
        DesiredCapabilities DesireCaps = new DesiredCapabilities();
        DesireCaps.setJavascriptEnabled(true);
        DesireCaps.setCapability("takesScreenshot", true);
        DesireCaps.setCapability(
                PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY,
                PropertiesFileReader.getValue("phantomJsWebDriverPath"));
        base.webDriver = new PhantomJSDriver(DesireCaps);
    }

    @Before
    public void beforeScenarioStart(Scenario scenario) {
        if (scenario.isFailed()) {
            System.out.println("Oh wehh " + scenario.getName() + " schlägt fehlt");
        }
        System.out.println("-----------------Start of Scenario-----------------");
        System.out.println();
    }


    @After
    public void afterScenario(Scenario scenario) {
        if (scenario.isFailed()) {
            UtilityScreenshot.CaptureScreenshot(base.webDriver, scenario.getName());
        }
        if (null != base.webDriver) {
            base.webDriver.quit();
            base.webDriver = null;
        }
    }

    @After
    public void afterScenarioFinish() {
        // SendTestReportAsEmail send = new SendTestReportAsEmail();
        // send.sendEmail();
        System.out.println();
        System.out.println("-----------------WebDriver closed-----------------");
    }
}
