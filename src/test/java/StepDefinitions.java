import base.BasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;

public class StepDefinitions {

    String homePageExpectedTitle = "nopCommerce demo store";
    String homePageActualTitle;
    String registerPageExpectedTitle = "nopCommerce demo store. Register";
    String registerPageActualTitle;
    String loginPageExpectedTitle = "nopCommerce demo store. Login";
    String loginPageActualTitle;
    String registrationActualSuccessMsg;

    @Given("i navigate to url {string}")
    public void i_navigate_to_url(String url) {
        BasePage.navigateToUrl(url);
    }

    @Then("i should be navigated to home page")
    public void i_should_be_navigated_to_home_page() {
        homePageActualTitle = BasePage.getPageTitle();
        Assertions.assertEquals(homePageExpectedTitle, homePageActualTitle);
    }

    @When("i click on log in link from the nav bar")
    public void i_click_on_log_in_link_from_the_nav_bar() {
        BasePage.homePage.clickLoginLink();
    }

    @Then("i should be navigated to login page")
    public void i_should_be_navigated_to_login_page() {
        loginPageActualTitle = BasePage.getPageTitle();
        Assertions.assertEquals(loginPageExpectedTitle, loginPageActualTitle);
    }

    @When("i enter email as {string}")
    public void i_enter_email_as(String email) {
        BasePage.loginPage.enterEmail(email);
    }

    @When("i enter password as {string}")
    public void i_enter_password_as(String password) {
        BasePage.loginPage.enterPassword(password);
    }

    @When("i click on log in button")
    public void i_click_on_log_in_button() {
        BasePage.loginPage.clickLogin();
    }

    @Then("i should be logged in successfully")
    public void i_should_be_logged_in_successfully() {
        BasePage.homePage.verifyLogout();
    }

    @When("i click on register link from the nav bar")
    public void i_click_on_register_link_from_the_nav_bar() {
        BasePage.homePage.clickRegisterLink();
    }

    @Then("i should be navigated to register page")
    public void i_should_be_navigated_to_register_page()
    {
        registerPageActualTitle = BasePage.getPageTitle();
        Assertions.assertEquals(registerPageExpectedTitle,registerPageActualTitle);
    }


    @When("i select gender as female")
    public void i_select_gender_as_female()
    {
        BasePage.registerPage.clickFemaleRadioButton();
    }

    @When("i enter firstName lastName email password confirmPassword")
    public void i_enter_first_name_last_name_email_password_confirm_password(io.cucumber.datatable.DataTable dataTable)
    {

        BasePage.registerPage.enterFirstName(dataTable.cell(1,0));
        BasePage.registerPage.enterLastName(dataTable.cell(1,1));
        BasePage.registerPage.enterEmail(dataTable.cell(1,2));
        BasePage.registerPage.enterPassword(dataTable.cell(1,3));
        BasePage.registerPage.enterConfPassword(dataTable.cell(1,4));

    }


    @When("i click on register button")
    public void i_click_on_register_button()
    {
        BasePage.registerPage.clickRegisterButton();
    }

    @Then("i should see message {string}")
    public void i_should_see_message(String registrationExpectedSuccessMsg)
    {
       registrationActualSuccessMsg =  BasePage.registerPage.getRegistrationText();
       Assertions.assertEquals(registrationExpectedSuccessMsg,registrationActualSuccessMsg);
    }

    @Then("i should see error message for first name as {string}")
    public void iShouldSeeErrorMessageForFirstNameAs(String fnErrorMsg)
    {

    }


    @And("i should see error message for last name as {string}")
    public void iShouldSeeErrorMessageForLastNameAs(String lnErrorMsg)
    {

    }


    @And("i should see error message for email as {string}")
    public void iShouldSeeErrorMessageForEmailAs(String emailErrorMsg)
    {

    }


    @And("i should see error message for password as {string}")
    public void iShouldSeeErrorMessageForPasswordAs(String pwErrorMsg)
    {

    }


    @And("i should see error message for confirm password as {string}")
    public void iShouldSeeErrorMessageForConfirmPasswordAs(String cpwErrorMsg)
    {

    }
}
