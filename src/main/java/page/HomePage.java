package page;

import net.serenitybdd.annotations.At;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

@At("https://flow-computing-7203.lightning.force.com/lightning/page/home")
public class HomePage extends PageObject {

    @FindBy(css="button[type='button']")
    public WebElementFacade searchButtonHomePage;

    @FindBy(xpath="//ul[@class='verticalNavMenuList slds-text-align_center slds-text-color_inverse slds-p-left_x-small slds-p-right_x-small']/li[position()=3]")
    public WebElementFacade accountButton;
}
