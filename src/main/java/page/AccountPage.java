package page;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends PageObject {

    @FindBy(xpath="//one-app-nav-bar-item-root[@class='navItem slds-context-bar__item slds-shrink-none slds-is-active']")
    public WebElementFacade accountsButton;

    @FindBy(xpath="//div[@id='brandBand_1']/div/div/div/div/div[position()=1]/div[position()=1]/div[position()=2]/ul/li[position()=1]/a")
    public WebElementFacade newAccountButton;

    @FindBy(xpath="//div[@class='actionBody']")
    public WebElementFacade modalePage;

    @FindBy(xpath="//input[@name='Phone']")
    public WebElementFacade inputPhone;

    @FindBy(xpath="//input[@name='Name']")
    public WebElementFacade inputAccountName;

    @FindBy(xpath="//input[@name='Website']")
    public WebElementFacade inputWebSite;

    @FindBy(xpath="//records-record-layout-text-area[@data-input-element-id='input-field']/lightning-textarea/div/textarea")
    public WebElementFacade textAreaDescription;

    @FindBy(xpath="//button[@class='slds-combobox__input slds-input_faux fix-slds-input_faux slds-combobox__input-value']")
    public WebElementFacade conboboxType;

    @FindBy(xpath="//div[@class='slds-form']/slot/records-record-layout-row[position()=2]/slot//textarea")
    public WebElementFacade textAreaBillingStreet;

    @FindBy(xpath="//div[@class='slds-form']/slot/records-record-layout-row[position()=2]/slot//input[@name='city']")
    public WebElementFacade inputBillingCity;

    @FindBy(xpath="//div[@class='slds-form']/slot/records-record-layout-row[position()=2]/slot//input[@name='province']")
    public WebElementFacade inputBillingState;

    @FindBy(xpath="//div[@class='slds-form']/slot/records-record-layout-row[position()=2]/slot//input[@name='postalCode']")
    public WebElementFacade inputBillingZipCode;

    @FindBy(xpath="//div[@class='slds-form']/slot/records-record-layout-row[position()=2]/slot//input[@name='country']")
    public WebElementFacade inputBillingCountry;

    @FindBy(xpath="//div[@class='slds-form']/slot/records-record-layout-row[position()=3]/slot//textarea")
    public WebElementFacade textAreaShippingStreet;

    @FindBy(xpath="//div[@class='slds-form']/slot/records-record-layout-row[position()=3]/slot//input[@name='city']")
    public WebElementFacade inputShippingCity;

    @FindBy(xpath="//div[@class='slds-form']/slot/records-record-layout-row[position()=3]/slot//input[@name='province']")
    public WebElementFacade inputShippingState;

    @FindBy(xpath="//div[@class='slds-form']/slot/records-record-layout-row[position()=3]/slot//input[@name='postalCode']")
    public WebElementFacade inputShippingZipCode;

    @FindBy(xpath="//div[@class='slds-form']/slot/records-record-layout-row[position()=3]/slot//input[@name='country']")
    public WebElementFacade inputShippingCountry;

    @FindBy(xpath="//button[@name='SaveAndNew']")
    public WebElementFacade buttonSaveCreateNewAccount;

    @FindBy(xpath="//button[@name='Edit']")
    public WebElementFacade buttonModify;

    @FindBy(xpath="//button[@name='CancelEdit']")
    public WebElementFacade buttonCancelNewAccount;

    @FindBy(xpath="//a[@name='SaveAndNew']")
    public WebElementFacade buttonAccountCreatedTitle;

    @FindBy(xpath="//records-record-layout-block//records-record-layout-section[position()=1]/div/div/div/slot/records-record-layout-row[position()=1]//lightning-formatted-text")
    public WebElementFacade accountNameText;

    @FindBy(xpath="//records-record-layout-block//records-record-layout-section[position()=1]/div/div/div/slot/records-record-layout-row[position()=4]//lightning-formatted-text")
    public WebElementFacade descriptionABoutText;

    @FindBy(xpath="//records-record-layout-block//records-record-layout-section[position()=2]/div/div/div/slot/records-record-layout-row[position()=1]//lightning-formatted-phone")
    public WebElementFacade phoneText;

    @FindBy(xpath="//records-record-layout-block//records-record-layout-section[position()=2]/div/div/div/slot/records-record-layout-row[position()=2]//lightning-formatted-address/a/div[position()=1]")
    public WebElementFacade billingStreetText;

    @FindBy(xpath="//records-record-layout-block//records-record-layout-section[position()=2]/div/div/div/slot/records-record-layout-row[position()=2]//lightning-formatted-address/a/div[position()=3]")
    public WebElementFacade billingCountryText;

    @FindBy(xpath="//records-record-layout-block//records-record-layout-section[position()=2]/div/div/div/slot/records-record-layout-row[position()=2]//lightning-formatted-address/a/div[position()=2]")
    public WebElementFacade billingCityStateText;

    @FindBy(xpath="//records-record-layout-block//records-record-layout-section[position()=2]/div/div/div/slot/records-record-layout-row[position()=3]//lightning-formatted-address/a/div[position()=1]")
    public WebElementFacade shippingStreetText;

    @FindBy(xpath="//records-record-layout-block//records-record-layout-section[position()=2]/div/div/div/slot/records-record-layout-row[position()=3]//lightning-formatted-address/a/div[position()=3]")
    public WebElementFacade shippingCountryText;

    @FindBy(xpath="//records-record-layout-block//records-record-layout-section[position()=2]/div/div/div/slot/records-record-layout-row[position()=3]//lightning-formatted-address/a/div[position()=2]")
    public WebElementFacade shippingCityStateText;


    public void getTitle(String title){
        getDriver().findElement(By.xpath("//a[@title='"+title+"']")).click();
    }
}

