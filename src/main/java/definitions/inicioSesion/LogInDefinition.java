package definitions.inicioSesion;

import io.cucumber.java.en.Given;
import net.serenitybdd.annotations.Steps;
import steps.LoginSteps;

public class LogInDefinition {

  @Steps
  private LoginSteps loginSteps;

    @Given("you are logged in to salesforce with the credentials user {string} and password {string}")
    public void loginSalesforceOrgAccount(String username,String password) {
      loginSteps.openLoginPage();
      loginSteps.enterCredentials(username,password);
      loginSteps.logInCredentials();
    }
}
