package cucumberproject;

import org.junit.runner.RunWith;

import io.cucumber.core.backend.Snippet;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Features\\BookAHotel.feature" ,
snippets = SnippetType.CAMELCASE ,glue ="Steps" , 
dryRun = !true,
plugin = {
	    "pretty",
	    "html:target/HtmlReports/cucumber-report.html",
	    "json:target/JsonReports/cucumber-report.json"
	}
)

public class TestRunner {
	
	

}
