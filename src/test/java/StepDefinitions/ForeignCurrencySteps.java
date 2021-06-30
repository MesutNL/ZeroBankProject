package StepDefinitions;

import Pages.LoginPages;
import Pages.Parent;
import Utilities.BaseDriver;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import org.openqa.selenium.support.ui.Select;

public class ForeignCurrencySteps {
    LoginPages lp = new LoginPages();

    @And("^Click to Purchase Foreign Currency$")
    public void clickToPurchaseForeignCurrency()  {
        lp.getPurchase().click();
        Parent.delay(3);
    }

    @And("^Select one Currency$")
    public void selectOneCurrency()  {
        Select sl=new Select(lp.currencySelect);
        sl.selectByValue("CNY");


        Parent.delay(3);
    }

    @And("^Send to Amount \"([^\"]*)\"$")
    public void sendToAmount(String amount) {
        lp.getAmount().sendKeys(amount);

    }

    @And("^Click to Dollar$")
    public void clickToDollar() {
        lp.getDolar().click();
        Parent.delay(3);
    }

    @And("^Click To calculate$")
    public void clickToCalculate() {
        lp.getCalculate().click();
        Parent.delay(3);
    }

    @And("^Click to purchase$")
    public void clickToPurchase() {
        lp.getPurchasecash().click();
        Parent.delay(3);
    }

    @And("^Click to Selected Currency$")
    public void clickToSelectedCurrency() {
       lp.getSelectedCurrency().click();
        Parent.delay(3);
    }


}
