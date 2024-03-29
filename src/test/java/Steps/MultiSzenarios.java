package Steps;

import Tranformation.EmailTranformation;
import cucumber.api.PendingException;
import cucumber.api.Transform;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

/**
 * Package: PACKAGE_NAME
 * Generated by: Hoang.Son.Nguyen
 * Generated at: 12.03.2018 2018
 */
public class MultiSzenarios {
    @Given("^i navigate to GoogleStartPage$")
    public void inavigatetoGoogleStartPage() throws Throwable {
        System.out.println("i navigate to GoogleStartPage");
        //throw new PendingException();
    }

    @And("^i enter my username and password$")
    public void iEnterMyUsernameAndPassword() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @And("^i click the Login button$")
    public void iClickTheLoginButton() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @Then("^i see my GooglePage$")
    public void iSeeMyGooglePage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // throw new PendingException();
    }

    @Given("^i am on my GooglePage$")
    public void iAmOnMyGooglePage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // throw new PendingException();
    }

    @And("^i click the Logout button$")
    public void iClickTheLogoutButton() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @Then("^i see GoogleStartPage$")
    public void iSeeGoogleStartPage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @And("^i click the close button$")
    public void iClickTheCloseButton() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @Then("^window closes$")
    public void windowCloses() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }


    @And("^i enter my email as Email: ([^\"]*)$")
        public void iEnterMyEmailAsAdminAdmin (@Transform(EmailTranformation.class) String email) throws Throwable {
            System.out.println("The transformed email is now: " + email+ "\n");
        }

    @And("^i check my salary id (\\d+)$")
    public void iCheckMySalaryIdDigit(int salary) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
