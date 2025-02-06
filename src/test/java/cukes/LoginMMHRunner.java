package cukes;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Automation\\IntellliJ\\Test_V2\\src\\test\\java\\feature",
        glue = {"Step"},
        tags = "@Test", // Specify the tag of the scenario you want to run
        monochrome = false
)
public class LoginMMHRunner {
}
