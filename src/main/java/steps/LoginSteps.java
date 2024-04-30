package steps;

import net.serenitybdd.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import page.HomePage;
import page.LoginPage;

public class LoginSteps {

    @Page
    private LoginPage loginPage;

    @Page
    private HomePage homePage;

    @Step("user open login page")
    public void openLoginPage(){
        loginPage.open();
    }

    @Step("the user enters their credentials")
    public void enterCredentials(String userName, String password){
        loginPage.inputUsername.sendKeys(userName);
        loginPage.inputPassword.sendKeys(password);
    }

    @Step("the user logs in with the credentials")
    public void logInCredentials(){
        loginPage.buttonLogIn.click();
        homePage.accountButton.waitUntilVisible();
    }

    @Step("validate Log in successful")
    public void logInSuccessful()  {
        loginPage.buttonLogIn.click();
        homePage.searchButtonHomePage.waitUntilVisible();
    }
}
