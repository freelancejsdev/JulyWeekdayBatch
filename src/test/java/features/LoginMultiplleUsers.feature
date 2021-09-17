Feature: Login to nop commerce
  In order to login to nop commerce
  As a user
  I should provide email and password

    @regression  @smoke @sanity
  Scenario Outline: Verify login with multiple users
    Given i navigate to url "https://demo.nopcommerce.com/"
    Then  i should be navigated to home page
    When  i click on log in link from the nav bar
    Then  i should be navigated to login page
    When  i enter email as "<email>"
    And   i enter password as "<password>"
    And   i click on log in button
    Then  i should be logged in successfully

    Examples:
      | email         | password  |
      | user1@nop.com | Testing@1 |
      | user2@nop.com | Testing@2 |
      | user3@nop.com | Testing@3 |
      | user4@nop.com | Testing@4 |