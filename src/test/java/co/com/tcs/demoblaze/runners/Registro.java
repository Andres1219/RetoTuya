package co.com.tcs.demoblaze.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src\\test\\resources\\features\\iniciosesion.feature",
        glue = "co.com.tcs.demoblaze.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class Registro {
}
