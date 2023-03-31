package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.CashwiseLoginPage;
import utilities.Driver;
import utilities.Flow;

public class CashwiseLogin_steps {
    CashwiseLoginPage cashwiseLoginPage = new CashwiseLoginPage();
    @Given("I am on the Cashwise login page")
    public void i_am_on_the_cashwise_login_page() {
        Driver.getDriver().get("https://cashwise.us");
    }

    @Given("I click on sign in button")
    public void i_click_on_sign_in_button() {

        cashwiseLoginPage.signInButton.click();
    }

    @When("I logs in {string} and {string}")
    public void i_logs_in_and(String email, String password) {
        cashwiseLoginPage.emailBox.sendKeys(email);
        cashwiseLoginPage.passwordBox.sendKeys(password);
        cashwiseLoginPage.loginButton.click();
        Flow.wait(2000);
    }

    @Then("I should land on {string} page")
    public void i_should_land_on_page(String url) {
        String actualURL = Driver.getDriver().getCurrentUrl();
        Assert.fail("on purpose");
        Assert.assertEquals(actualURL, url);

    }

}
