package br.com.chronosacademy.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        tags = "@dadosEmBranco", // @fecharModal or @fecharModalNoX or @createNewAccount or @login1 or @dadosEmBranco
        glue = "br.com.chronosacademy.steps",
        plugin = {"json:target/reports/CucumberReports.json","pretty"},
        snippets = CucumberOptions.SnippetType.CAMELCASE

)
public class RunnerTest {


}
