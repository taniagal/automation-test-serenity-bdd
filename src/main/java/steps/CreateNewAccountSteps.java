package steps;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.hamcrest.Matchers;
import page.AccountPage;
import page.HomePage;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.*;

import java.util.Map;

public class CreateNewAccountSteps {
    @Page
    private AccountPage accountPage;

    @Page
    private HomePage homePage;

    @Step("Add new phone information")
    public void addNewPhoneInformation(String phone)  {
        accountPage.inputPhone.sendKeys(phone);
    }

    @Step("Add new principal information")
    public void addPrincipalInformation(String accountName, String webSite, String guy, String description, String mainAccount) {
        accountPage.inputAccountName.sendKeys(accountName);
        accountPage.inputWebSite.sendKeys(webSite);
        accountPage.textAreaDescription.sendKeys(description);
        accountPage.textAreaDescription.sendKeys(description);
    }

    @Step("Add billing address")
    public void addBillingAddress(DataTable billingAddress) {
        for (Map<String, String> row : billingAddress.asMaps(String.class, String.class)) {
            accountPage.textAreaBillingStreet.sendKeys(row.get("BillingStreet"));
            accountPage.inputBillingCity.sendKeys(row.get("BillingCity"));
            accountPage.inputBillingState.sendKeys(row.get("BillingState"));
            accountPage.inputBillingZipCode.sendKeys(row.get("BillingZipCode"));
            accountPage.inputBillingCountry.sendKeys(row.get("BillingCountry"));
        }
    }
    @Step("Add Shipping address")
    public void addShippingAddress(DataTable shippingAddress) {
        for (Map<String, String> row : shippingAddress.asMaps(String.class, String.class)) {
            accountPage.textAreaShippingStreet.sendKeys(row.get("ShippingStreet"));
            accountPage.inputShippingCity.sendKeys(row.get("ShippingCity"));
            accountPage.inputShippingState.sendKeys(row.get("ShippingState"));
            accountPage.inputShippingZipCode.sendKeys(row.get("ShippingZipCode"));
            accountPage.inputShippingCountry.sendKeys(row.get("ShippingCountry"));
        }
    }
    @Step("Go Create New Account")
    public void goCreateNewAccount() {
        this.goAccounts();
        accountPage.newAccountButton.waitUntilClickable();
        accountPage.newAccountButton.click();
        accountPage.inputAccountName.waitUntilVisible();
    }

    @Step("Go to accounts")
    public void goAccounts() {
        homePage.accountButton.click();
        accountPage.accountsButton.click();
    }

    @Step("save and create new account")
    public void saveCreateNewAccount() {
        accountPage.buttonSaveCreateNewAccount.click();
        accountPage.buttonCancelNewAccount.click();
    }

    @Step("validate the information for the account created ")
    public void validateAccountCreated(DataTable informationAccountCreated){
        accountPage.accountsButton.click();
        for (Map<String, String> row : informationAccountCreated.asMaps(String.class, String.class)) {
            accountPage.getTitle(row.get("AccountName"));
          assertThat("Error", accountPage.accountNameText.getText(), Matchers.is(equalTo(row.get("AccountName"))));
            assertThat ("Error",accountPage.descriptionABoutText.getText(), Matchers.is(equalTo(row.get("Description"))));
            assertThat ("Error",accountPage.phoneText.getText(), Matchers.is(equalTo(row.get("Phone"))));
            assertThat ("Error",accountPage.billingStreetText.getText(), Matchers.is(equalTo(row.get("BillingStreet"))));
            assertThat ("Error",accountPage.billingCountryText.getText(), Matchers.is(equalTo(row.get("BillingCountry"))));
            assertThat ("Error",accountPage.billingCityStateText.getText(), Matchers.containsString((row.get("BillingCity"))+", "+(row.get("BillingState"))));
            assertThat ("Error",accountPage.shippingStreetText.getText(), Matchers.is(equalTo(row.get("ShippingStreet"))));
            assertThat ("Error",accountPage.shippingCountryText.getText(), Matchers.is(equalTo(row.get("ShippingCountry"))));
            assertThat ("Error",accountPage.shippingCityStateText.getText(), Matchers.containsString((row.get("ShippingCity"))+", "+(row.get("ShippingState"))));
        }
    }
}
