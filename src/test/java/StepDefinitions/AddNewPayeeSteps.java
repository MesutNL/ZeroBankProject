package StepDefinitions;

import Pages.LoginPages;
import Pages.Parent;
import Utilities.BaseDriver;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class AddNewPayeeSteps {
    LoginPages lp = new LoginPages();

    @And("^Click to Pay Bills$")
    public void clickToPayBills() {
        lp.getPayBills().click();
    }

    @Then("^Click to Add New Payee$")
    public void clickToAddNewPayee() {
        lp.getAddNewPayee().click();
        Parent.delay(3);
    }

    @And("^fill who are you paying's page$")
    public void fillWhoAreYouPayingSPage() throws InterruptedException {

        Thread.sleep(6000);
        lp.getPayeeName().sendKeys("Group 1");
        lp.getPayeeAdress().sendKeys("Java Street");
        lp.getAccount().sendKeys("123423");
        lp.getPayeeDetails().sendKeys("for auto");
    }

    @And("^fill who are you paying's pages$")
    public void fillWhoAreYouPayingSPages() {

        lp.getPayeeName().sendKeys("Group 1");
        lp.getPayeeAdress().sendKeys("Java Street");
        Parent.delay(3);
    }

    @And("^Click to Add Button$")
    public void clickToAddButton() {
        lp.getAddBtn().click();



    }

    @Then("^succesfully message should be displayed$")
    public void succesfullyMessageShouldBeDisplayed() {
        String message = lp.getSuccessMessage().getText();
        Assert.assertTrue(message.contains("successfully"));
        Parent.delay(5);


    }

    @Then("^error message sould be displayed$")
    public void errorMessageSouldBeDisplayed() {
        System.out.println("lp.getAccount().getAttribute(\"validationMessage\") = " + lp.getAccount().getAttribute("validationMessage"));
        Assert.assertTrue(lp.getAccount().getAttribute("validationMessage").contains("this field"));

    }


}
