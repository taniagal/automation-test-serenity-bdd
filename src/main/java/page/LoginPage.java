package page;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://flow-computing-7203.my.salesforce.com")
public class LoginPage extends PageObject {

    public LoginPage(WebDriver driver) {
     super(driver);
    }

    @FindBy(id="username")
    public WebElementFacade inputUsername;

    @FindBy(id="password")
    public WebElementFacade inputPassword;

    @FindBy(id="Login")
    public WebElementFacade buttonLogIn;
}

