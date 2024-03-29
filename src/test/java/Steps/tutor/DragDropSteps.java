package Steps.tutor;

import Steps.tutor.pageFactory.DragDropPageFactory;
import Steps.wiener.PageFactory.PFHelper;
import base.BaseUtil;
import cucumber.api.java8.En;
import org.openqa.selenium.support.PageFactory;

/** Package: Steps.tutor Generated by: Hoang.Son.Nguyen Generated at: 23.11.2018 2018 */
public class DragDropSteps extends BaseUtil implements En {
  BaseUtil base;
  DragDropPageFactory dragDropPageFactory;

  public DragDropSteps(BaseUtil base) {
    this.base = base;
    Given(
        "^ich navigiere zu dragDrop seite$",
        () -> {
          base.webDriver.navigate().to("http://demo.guru99.com/test/drag_drop.html");
          PFHelper.threatSleep(1000);
          dragDropPageFactory = PageFactory.initElements(base.webDriver, DragDropPageFactory.class);
        });
    And(
        "^ich checke die dragDrop seite$",
        () -> {
          dragDropPageFactory.guruLogo_check();
        });

    When(
        "^ich ziehe die Bank zu  debit Acoount$",
        () -> {
          dragDropPageFactory.dragDropBank();
        });

    Then(
        "^ich ziehe die (\\d+) zu debit Amount$",
        (Integer arg0) -> {
          dragDropPageFactory.dragDrop5000();
        });
  }
}
