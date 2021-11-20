package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pom.Login;

public class LoginStepDefinitions {

    Login login;
    SharedStepsUI  sharedStepsUI;

    public LoginStepDefinitions() {
        login = new Login();
        sharedStepsUI = new SharedStepsUI();
    }

    @Given("user at cogmento homepage")
    public void user_at_cogmento_homepage() {
        sharedStepsUI.navigateToCogmentoApp();
    }

    @When("user click on login button from homepage")
    public void userClickOnLoginButtonFromHomepage() {
        login.clickOnLoginButtonHP();
    }

    @And("user enter {string} at email input field")
    public void user_enter_at_email_input_field(String email) {
        login.enterEmailAddress(email);
    }

    @And("user enter {string} at password input field")
    public void user_enter_at_password_input_field(String password) {
        login.enterPassword(password);
    }

    @And("user click on login button from login page")
    public void userClickOnLoginButtonFromLoginPage() {
        login.clickOnLoginButtonLP();
    }

    @Then("user should navigated to account dashboard page")
    public void user_should_navigated_to_account_dashboard_page() {
        String expectedResult = "Something went wrong...";
        String actualResult = login.getErrorMsg();
        System.out.println(actualResult);
        Assert.assertEquals(expectedResult, actualResult, "Failed, not matched!");
    }

}
