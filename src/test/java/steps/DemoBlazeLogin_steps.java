package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.DemoBlazeHomePage;
import utilities.Driver;
import utilities.Flow;
import utilities.TempStorage;

public class DemoBlazeLogin_steps {
    DemoBlazeHomePage blazeHomePage = new DemoBlazeHomePage();
    @Given("user clicks on login button for demo blaze")
    public void user_clicks_on_login_button_for_demo_blaze() {
        blazeHomePage.loginButton.click();
        Flow.wait(500);
    }
    @When("user enters credentials {string} and {string} and clicks login")
    public void user_enters_credentials_and_and_clicks_login(String username, String password) {
        TempStorage.addData("username", username);
        blazeHomePage.formUsernameInputBox.sendKeys(username);
        blazeHomePage.formPasswordInputBox.sendKeys(password);
        blazeHomePage.formLoginButton.click();
        Flow.wait(1000);
    }
    @Then("user should successfully login")
    public void user_should_successfully_login() {
        String username = TempStorage.getData("username");
        String linkText = "Welcome " + username;
        WebElement welcomeUser = Driver.getDriver().findElement(By.linkText(linkText));
        Assert.assertTrue(welcomeUser.isDisplayed());
    }

}
