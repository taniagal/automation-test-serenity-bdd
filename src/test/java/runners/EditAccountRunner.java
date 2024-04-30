package runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
//@RunWith(SerenityRunner.class)
//@RunWith(JUnit4.class)
@CucumberOptions(
        features = "src/test/resources/features/account/create_new_account.feature",
        glue = "definitions/inicioSesion",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        plugin = "pretty"
)
public class EditAccountRunner {
}
