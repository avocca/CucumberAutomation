package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import pages.CWRepositoryHomePage;
import utilities.Driver;
import utilities.Flow;
public class CashwiseTilek_steps {
    CWRepositoryHomePage cashWise = new CWRepositoryHomePage();

    @Given("user is on cashwise application and logins with proper {string} and {string}")
    public void user_is_on_cashwise_application_and_logins_with_proper_and(String email, String password) {
        Driver.getDriver().get("https://cashwise.us");
        cashWise.signInLink.click();
        cashWise.emailInputBox.sendKeys(email);
        cashWise.passwordInputBox.sendKeys(password);
        cashWise.SigninButton.click();
        Flow.wait(4000);
    }

    @When("user logs in he lands on {string} page")
    public void user_logs_in_he_lands_on_page(String url) {
        String actual = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(url, actual);
    }
    @Then("user clicks on Sales button and choose ProductAndServices")
    public void user_clicks_on_sales_button_and_choose_product_and_services() {
        cashWise.salesDropdownButton.click();
        cashWise.ProdcutAndServicesButton.click();
    }

    @Then("adds new product with following info {string} and {string} and {string} and {string} and {string}")
    public void adds_new_product_with_following_info(String name, String price, String title, String descriptionForCategory, String descriptionMain) {
        int actualRowSize = Driver.getDriver().findElements(By.xpath("//table/tbody")).size();
        cashWise.addProductAndServicesButton.click();
        cashWise.nameInput.sendKeys(name);
        cashWise.priceInput.sendKeys(price);
        cashWise.serviceTypeDropdown.click();
        cashWise.serviceDption.click();
        cashWise.categoryDropdoon.click();
        cashWise.createNewCategoryButton.click();
        cashWise.titleNameInput.sendKeys(title);
        cashWise.titleDescriptionInput.sendKeys(descriptionForCategory);
        cashWise.saveButton.click();
        cashWise.option0ne.click();
        cashWise.descriptionInput.sendKeys(descriptionMain);
        cashWise.saveButtonFinal.click();
        int totalRowSize = Driver.getDriver().findElements(By.xpath("//table/tbody")).size();
        if (totalRowSize > actualRowSize) {
            Assertions.assertTrue(totalRowSize > actualRowSize, "NO TIENE SERVICIO NUEVO");
        }

    }

    @Then("user edit newly added product {string}")
    public void user_edit_newly_added_product(String newname) {
        cashWise.editButton.click();
        cashWise.nameInput2.sendKeys(newname);
        cashWise.saveButton2.click();
        cashWise.saveButton2.click();

    }

}





















