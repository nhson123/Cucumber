package Steps.tutor;

import Steps.tutor.pageFactory.DdtDataProviderPageFactory;
import base.BaseUtil;
import cucumber.api.java8.En;
import org.openqa.selenium.support.PageFactory;

/** Package: Steps.tutor Generated by: Hoang.Son.Nguyen Generated at: 01.12.2018 2018 */
public class DdtDataProviderSteps extends BaseUtil implements En {
  BaseUtil base;
  DdtDataProviderPageFactory ddtDataProviderPageFactory;

  public DdtDataProviderSteps(BaseUtil base) {
    this.base = base;
    Given(
        "^ich navigiere zu opensource-demo$",
        () -> {
          base.webDriver.navigate().to("https://opensource-demo.orangehrmlive.com/");
          ddtDataProviderPageFactory =
              PageFactory.initElements(this.webDriver, DdtDataProviderPageFactory.class);
        });

    And("^ich logge mich falch ein$", () -> {});
  }
}
