package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import pages.DemoBlazeHomePage;
import utilities.Config;
import utilities.Driver;
import utilities.Flow;
import utilities.MyLogger;

import java.util.Random;

public class DemoBlazeSignUp_steps {

    DemoBlazeHomePage blazeHomePage = new DemoBlazeHomePage();
    @Given("user is on demo blaze application")
    public void user_is_on_demo_blaze_application() {
        MyLogger.info("User is on demo blaze website");
        Driver.getDriver().get(Config.getValue("demoblazeURL"));
        Flow.wait(1000);
    }
    @Given("user clicks on sign up button")
    public void user_clicks_on_sign_up_button() {
        MyLogger.warn("Clicking sign up link");
        blazeHomePage.signUpButton.click();
        Flow.wait(500);
    }
    @When("user enters credentials {string} and {string} and clicks sign up")
    public void user_enters_credentials_and_and_clicks_sign_up(String username, String password) {
        MyLogger.warn("Entering Credentials: username: " + username + " pass: " + password);
        if(username.equals("placeholder")){
           username = username + new Random().nextInt(10000); //or user javafaker
       }
       blazeHomePage.formUsernameInputBox.sendKeys(username);
       blazeHomePage.formPasswordInputBox.sendKeys(password);
       blazeHomePage.signUp.click();
       Flow.wait(1000);
    }
    @Then("user should see alert message {string}")
    public void user_should_see_alert_message(String message) {
        MyLogger.info("Verifying the alert messages");
        Alert signUpAlert = Driver.getDriver().switchTo().alert();
        String actualMessage = signUpAlert.getText();
        Assert.assertEquals(message, actualMessage);


    }

}