package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:target/cucumberReports.html",
        features = "src/test/resources/features", //-->
        glue = "steps", //--> to point where the steps definitions are
        tags = "@aigerim", //--> to specify which tag we want to run
        dryRun = false   //--> to control to run the scenarios without executing the code


)

public class Runner {



}
