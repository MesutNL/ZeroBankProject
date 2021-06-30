package Pages;

import Utilities.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPages extends Parent {

    public LoginPages() {
        PageFactory.initElements(BaseDriver.getDriver(), this);
    }

    @FindBy(id = "details-button")
    private WebElement securityBtn;

    @FindBy(id = "proceed-link")
    private WebElement clickWebsite;

    @FindBy(id = "user_login")
    private WebElement userName;

    @FindBy(id = "user_password")
    private WebElement password;

    @FindBy(name = "submit")
    private WebElement siginButton;

    @FindBy(id = "pay_bills_tab")
    private WebElement payBills;

    @FindBy(xpath = "//a[text()='Add New Payee']")
    private WebElement addNewPayee;

    @FindBy(id = "np_new_payee_name")
    private WebElement payeeName;

    @FindBy(id = "np_new_payee_address")
    private WebElement payeeAdress;

    @FindBy(css = "#np_new_payee_account")
    private WebElement account;

    @FindBy(id = "np_new_payee_details")
    private WebElement payeeDetails;

    @FindBy(id = "add_new_payee")
    private WebElement addBtn;

    @FindBy(id = "alert_content")
    private WebElement successMessage;

    @FindBy(xpath = "//a[text()='Purchase Foreign Currency']")
    private WebElement purchase;

    @FindBy(id = "pc_currency")
    public WebElement currencySelect;

    @FindBy(css = "input[id='pc_amount']")
    private WebElement amount;

    @FindBy(id = "pc_inDollars_true")
    private WebElement dolar;

    @FindBy(id = "pc_inDollars_false")
    private WebElement selectedCurrency;

    @FindBy(id = "pc_calculate_costs")
    private WebElement calculate;

    @FindBy(id = "purchase_cash")
    private WebElement purchasecash;

    public WebElement getPurchase() {
        return purchase;
    }

    public WebElement getCurrencySelect() {
        return currencySelect;
    }

    public WebElement getAmount() {
        return amount;
    }

    public WebElement getDolar() {
        return dolar;
    }

    public WebElement getSelectedCurrency() {
        return selectedCurrency;
    }

    public WebElement getCalculate() {
        return calculate;
    }

    public WebElement getPurchasecash() {
        return purchasecash;
    }


    public WebElement getUserName() {
        return userName;
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getSiginButton() {
        return siginButton;
    }

    public WebElement getPayBills() {
        return payBills;
    }

    public WebElement getAddNewPayee() {
        return addNewPayee;
    }

    public WebElement getPayeeName() {
        return payeeName;
    }

    public WebElement getPayeeAdress() {
        return payeeAdress;
    }

    public WebElement getAccount() {
        return account;
    }

    public WebElement getPayeeDetails() {
        return payeeDetails;
    }

    public WebElement getAddBtn() {
        return addBtn;
    }

    public WebElement getSuccessMessage() {
        return successMessage;
    }

    public WebElement getSecurityBtn() {
        return securityBtn;
    }

    public WebElement getClickWebsite() {
        return clickWebsite;
    }
}
