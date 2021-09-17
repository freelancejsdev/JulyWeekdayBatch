Feature: Register new user

  Background: Navigate to url and goto register page
    Given i navigate to url "https://demo.nopcommerce.com/"
    Then  i should be navigated to home page
    When  i click on register link from the nav bar
    Then  i should be navigated to register page

  @regression @registerLogin
  Scenario: Verify register functionality with valid data

    When  i select gender as female
    And   i enter firstName lastName email password confirmPassword
      | firstName | lastName | email           | password    | confirmPassword |
      | user      | qa       | userqa2@nop.com | Testing@123 | Testing@123     |
    And  i click on register button
    Then i should see message "Your registration completed"

  @regression
  Scenario: Verify error messages when mandatory fields are not filled

    And  i click on register button
    Then i should see error message for first name as "First name is required."
    And  i should see error message for last name as "Last name is required."
    And  i should see error message for email as "Email is required."
    And  i should see error message for password as "Password is required."
    And  i should see error message for confirm password as "Password is required."

