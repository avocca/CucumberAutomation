package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.CashwiseSignUpSuccessfullyPage;
import utilities.Driver;
import utilities.Flow;

public class CashwiseSignupSuccessfully_steps {
    CashwiseSignUpSuccessfullyPage cashwiseSignUpSuccessfullyPage = new CashwiseSignUpSuccessfullyPage();
    @Given("the user navigates to the CashWise web page")
    public void the_user_navigates_to_the_cash_wise_web_page() {
        Driver.getDriver().get("https://cashwise.us");
    }
    @When("the user clicks on the {string} button")
    public void the_user_clicks_on_the_button(String signUpBtn) {
        cashwiseSignUpSuccessfullyPage.signUpbutton.click();

    }
    @When("the user fills out the form with a valid email {string}, password {string}, and {string}>")
    public void the_user_fills_out_the_form_with_a_valid_email_password_and(String email, String password,String confirmation) {
        cashwiseSignUpSuccessfullyPage.emailInputBox.sendKeys(email);
        cashwiseSignUpSuccessfullyPage.passwordInputBox.sendKeys(password);
        cashwiseSignUpSuccessfullyPage.confirmationPassword.sendKeys(confirmation);
        cashwiseSignUpSuccessfullyPage.continueButton.click();

    }
    @When("the user fills out personal info: name {string}, surname {string}, name of business {string}, address {string}, and currency {string}")
    public void the_user_fills_out_personal_info_name_surname_name_of_business_address_and_currency(String name, String surname, String business_name, String adress, String currency) {
        cashwiseSignUpSuccessfullyPage.nameBtn.sendKeys(name);
        cashwiseSignUpSuccessfullyPage.surnameBtn.sendKeys(surname);
        cashwiseSignUpSuccessfullyPage.nameOfBussiness.sendKeys(business_name);
        cashwiseSignUpSuccessfullyPage.AreOfBussiness.click();
        cashwiseSignUpSuccessfullyPage.selectBussinessType.click();
        cashwiseSignUpSuccessfullyPage.address.sendKeys(adress);
        cashwiseSignUpSuccessfullyPage.currencyChoose.click();
        cashwiseSignUpSuccessfullyPage.usdBtn.click();


    }
    @When("the user clicks the {string} button")
    public void the_user_clicks_the_button(String signUp) {
        cashwiseSignUpSuccessfullyPage.sighUpFinal.click();
        Flow.wait(10000);


    }

    @Then("the user land on {string}")
    public void the_user_land_on(String url) {
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(url, actualUrl);
        Flow.wait(1000);
    }

}
