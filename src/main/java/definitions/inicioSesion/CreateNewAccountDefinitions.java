package definitions.inicioSesion;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import steps.CreateNewAccountSteps;

public class CreateNewAccountDefinitions {
    @Steps
    private CreateNewAccountSteps createNewAccountSteps;

    @When("you add the next phone {string}")
    public void addPhoneNumberCreateNewAccount(String phone) {
        createNewAccountSteps.addNewPhoneInformation(phone);
    }

    @When("you go to accounts and you create a new account with the principal information {string},{string},{string},{string},{string}")
    public void addPrincipalInformationCreateNewAccount(String accountName,String webSite,String guy, String description, String mainAccount) {
        createNewAccountSteps.goCreateNewAccount();
        createNewAccountSteps.addPrincipalInformation(accountName,webSite,guy,description,mainAccount);
    }

    @When("^you add the next billing address$")
    public void addBillingAddress(DataTable billingAddress) {
        createNewAccountSteps.addBillingAddress(billingAddress);
    }

    @When("^you add the next shipping address$")
    public void addShippingAddress(DataTable shippingAddress) {
        createNewAccountSteps.addShippingAddress(shippingAddress);
    }

    @When("you save the information to create a new account")
    public void saveCreateNewAccount() {
        createNewAccountSteps.saveCreateNewAccount();
    }

    @Then("^the account should be created with the next information$")
    public void validateAccountCreated(DataTable informationAccountCreated) {
        createNewAccountSteps.validateAccountCreated(informationAccountCreated);
    }
}
