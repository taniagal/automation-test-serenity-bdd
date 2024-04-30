package definitions.inicioSesion;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import steps.CreateNewAccountSteps;
import steps.EditAccountSteps;

public class EditAccountDefinitions {

    @Steps
    private EditAccountSteps editAccountSteps;

    @Given("you have an account created with the name {string}")
    public void searchAccountCreated(String accountName) {
        editAccountSteps.searchAccountCreated(accountName);
    }

    @When("^you edit the account with the next information$")
    public void editAccount(DataTable newAccountInformation) {
        editAccountSteps.editAccount(newAccountInformation);
    }

    @Then("^the account should be updated with the new information$")
    public void validateInformationAccountUpdated(DataTable accountUpdated) {
        editAccountSteps.validateAccountUpdated(accountUpdated);
    }
}
