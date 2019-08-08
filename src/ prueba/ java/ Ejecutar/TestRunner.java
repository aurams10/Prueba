

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src\\test\\java\\Feature",
		glue="Prueba.Prueba",
				dryRun=false,
				monochrome=false,
				strict=false,
		format={"pretty","html:test-output","json:json_output/cucumber.json","junit:junit_xml_output/cucumber.xml"}
		)

public class TestRunner {

}

