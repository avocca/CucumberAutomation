package steps;

import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class Archive_steps {
    @Then("user should see a white blank page")
    public void user_should_see_a_white_blank_page() {
    //html/body[.='You need to enable JavaScript to run this app.']
        WebElement body = Driver.getDriver().findElement(By.tagName("body"));
        String htmlContent = body.getAttribute("innerHTML");
        if (htmlContent.trim().isEmpty()) {
            // The page is blank
            System.out.println("The page is blank.");
        } else {
            // The page is not blank
            System.out.println("The page is not blank.");
        }

    }


}
