package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.CashwiseArchivePage;
import pages.CashwiseLoginPage;
import utilities.Config;
import utilities.Driver;
import utilities.Flow;

import java.util.List;

public class CashwiseArchive_steps {
    CashwiseLoginPage cashwiseLogin = new CashwiseLoginPage();
    CashwiseArchivePage cashwiseArchive = new CashwiseArchivePage();

    @Given("user logs in to the Cashwise main page")
    public void user_logs_in_to_the_cashwise_main_page() {
        Driver.getDriver().get(Config.getValue("cashwiseURL"));
        cashwiseLogin.signInButton.click();
        cashwiseLogin.emailBox.sendKeys(Config.getValue("cashwiseLoginEmail"));
        cashwiseLogin.passwordBox.sendKeys("123123");
        cashwiseLogin.loginButton.click();
        Flow.wait(2000);

    }
    @Given("user clicks on Sales sidebar and clicks on Clients button")
    public void user_clicks_on_sales_sidebar_and_clicks_on_clients_button() {
        cashwiseArchive.salesDropdownButton.click();
        cashwiseArchive.clientsButton.click();

    }
    @When("user clicks on the Archive icon on the left side of the table")
    public void user_clicks_on_the_archive_icon_on_the_left_side_of_the_table() {
        List<WebElement> row = Driver.getDriver().findElements(By.xpath("//table/tbody/tr"));
        int initialRowSize = row.size();
        if(initialRowSize > 0) {
            cashwiseArchive.archiveIcon.click();
        }
    }
    @Then("user refreshes the page and clicks on Archived section")
    public void user_refreshes_the_page_and_clicks_on_archived_section() {
        Driver.getDriver().navigate().refresh();
    }
    @Then("user should see client was archived")
    public void user_should_see_client_was_archived() {
        List<WebElement> row = Driver.getDriver().findElements(By.xpath("//table/tbody/tr"));
        int initialRowSize = row.size();
        //Assert.assertEquals(initialRowSize, Driver.getDriver().findElements(By.xpath("//table/tbody/tr")));
    }

}
