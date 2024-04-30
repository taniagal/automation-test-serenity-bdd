package steps;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.annotations.Steps;
import org.fluentlenium.core.annotation.Page;
import org.hamcrest.Matchers;
import page.AccountPage;
import page.HomePage;

import java.util.Map;

import static java.util.concurrent.TimeUnit.SECONDS;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

public class EditAccountSteps {

    @Steps
    CreateNewAccountSteps createNewAccountSteps;

    @Page
    AccountPage accountPage;

    @Page
    HomePage homePage;

    @Step("Search account created")
    public void searchAccountCreated(String accountName) {
        homePage.accountButton.click();
        accountPage.accountsButton.click();
        accountPage.getTitle(accountName);
    }

    @Step("Edit account with information")
    public void editAccount(DataTable newAccountInformation) {
        accountPage.buttonModify.click();
        for (Map<String, String> row : newAccountInformation.asMaps(String.class, String.class)) {
            accountPage.inputAccountName.clear();
            accountPage.inputAccountName.sendKeys(row.get("AccountName"));
            accountPage.textAreaDescription.clear();
            accountPage.textAreaDescription.sendKeys(row.get("Description"));
            accountPage.inputPhone.clear();
            accountPage.inputPhone.sendKeys(row.get("Phone"));
            accountPage.inputBillingCountry.clear();
            accountPage.inputBillingCountry.sendKeys(row.get("BillingCountry"));
            accountPage.inputBillingCity.clear();
            accountPage.inputBillingCity.sendKeys(row.get("BillingCity"));
            accountPage.inputBillingState.clear();
            accountPage.inputBillingState.sendKeys(row.get("BillingState"));
            accountPage.inputBillingZipCode.clear();
            accountPage.inputBillingZipCode.sendKeys(row.get("BillingZipCode"));
            accountPage.inputShippingCountry.clear();
            accountPage.inputShippingCountry.sendKeys(row.get("ShippingCountry"));
            accountPage.inputShippingCity.clear();
            accountPage.inputShippingCity.sendKeys(row.get("ShippingCity"));
            accountPage.inputShippingState.clear();
            accountPage.inputShippingState.sendKeys(row.get("ShippingState"));
            accountPage.inputShippingZipCode.clear();
            accountPage.inputShippingZipCode.sendKeys(row.get("ShippingZipCode"));
    }
    }

    @Step("Validate account updated")
    public void validateAccountUpdated(DataTable accountUpdated) {
        accountPage.accountsButton.click();
        for (Map<String, String> row : accountUpdated.asMaps(String.class, String.class)) {
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
        accountPage.buttonModify.click();
    }
}
