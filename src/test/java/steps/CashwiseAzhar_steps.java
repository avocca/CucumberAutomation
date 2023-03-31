package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.CashWiseSignIn;
import utilities.Driver;
import utilities.Flow;

public class CashwiseAzhar_steps {
    CashWiseSignIn cashWiseSignIn = new CashWiseSignIn();

    @Given("user opens website cashWise")
    public void user_opens_website_cashWise() {
        Driver.getDriver().get("https://cashwise.us");
        Flow.wait(1000);
    }

    @Given("user clicks on sign in button")
    public void user_clicks_on_sign_in_button() {
        cashWiseSignIn.signInLink.click();
        Flow.wait(1000);
    }
    @When("user enters {string} and {string}  and clicks sign in button")
    public void user_enters_and_and_clicks_sign_in_button(String email, String password) {
        cashWiseSignIn.emailInputBox.sendKeys(email);
        cashWiseSignIn.passwordInputBox.sendKeys(password);
        cashWiseSignIn.signInButton.click();
        Flow.wait(1000);
    }


    @Then("user should land in {string}")
    public void user_should_land_in(String url) {
        String actualURL = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(url,actualURL);

    }













}
