package steps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import pages.CashwiseLoginPage;
import pages.CashwiseMainPage;
import utilities.Driver;
import utilities.Flow;


public class CashwiseAigerim_steps {
    CashwiseLoginPage cashwiseLoginPage = new CashwiseLoginPage();
    CashwiseMainPage cashwiseMainPage = new CashwiseMainPage();

    @Given("user in cashswise page")
    public void user_in_cashswise_page() {
        Driver.getDriver().get("http://cashwise.us");
    }
    @When("user logs in {string} and {string}")
    public void user_logs_in_and(String email, String password) {
        cashwiseLoginPage.signInButton.click();
        cashwiseLoginPage.emailBox.sendKeys("cashwise@gmail.com");
        cashwiseLoginPage.passwordBox.sendKeys("123123");
        cashwiseLoginPage.loginButton.click();
    }
    @When("user clicks reports menu bar")
    public void user_clicks_reports_menu_bar() {
        cashwiseMainPage.reportsButton.click();
    }

    @Then("user should click all categories dropdown menu and able to see the list of available categories")
    public void user_should_click_all_categories_dropdown_menu_and_able_to_see_the_list_of_available_categories() {
        cashwiseMainPage.allCategoriesButton.click();
        Flow.wait(1000);
        System.out.println("Number of Categories: " + cashwiseMainPage.allCategoriesOptions.size());
        for (WebElement option : cashwiseMainPage.allCategoriesOptions ){
            System.out.println(option.getText());
        }

    }
}

















