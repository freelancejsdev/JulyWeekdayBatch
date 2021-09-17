Feature: Login to nop commerce
  In order to login to nop commerce
  As a user
  I should provide email and password

  @register  @login @registerLogin @ui
  Scenario: Verify login functionality with valid credentials
   Given i navigate to url "https://demo.nopcommerce.com/"
   Then  i should be navigated to home page
   When  i click on log in link from the nav bar
   Then  i should be navigated to login page
   When  i enter email as "user1@nop.com"
   And   i enter password as "Testing@123"
   And   i click on log in button
   Then  i should be logged in successfully


