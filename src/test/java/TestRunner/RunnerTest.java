package TestRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "/home/qq182/IdeaProjects/Cucumber-Project/src/test/java/Features/Account.feature",
        glue = "stepDefinitions", tags = "@PortalTest",
        plugin = {"pretty","html:target/cucumber.json"}

)
public class RunnerTest
{

}
