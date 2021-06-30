package StepDefinitions;

import Pages.LoginPages;
import Utilities.BaseDriver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;


public class LoginSteps {
    LoginPages lg = new LoginPages();

    @Given("^Navigate to Website$")
    public void navigateToWebsite() {
        WebDriver driver = BaseDriver.getDriver();
        driver.get("http://zero.webappsecurity.com/login.html");
        driver.manage().window().maximize();
    }

    @And("^Write to your username and your password$")
    public void writeToYourUsernameAndYourPassword() throws InterruptedException {
        lg.getUserName().sendKeys("username");
        Thread.sleep(2000);
        lg.getPassword().sendKeys("password");


    }

    @Then("^click to Sign In$")
    public void clickToSignIn() {
        lg.getSiginButton().click();
        lg.getSecurityBtn().click();
        lg.getClickWebsite().click();
    }
}
