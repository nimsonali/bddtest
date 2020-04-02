Feature: test website

@smoketest
Scenario: test website for login

Given user is already on homelogin Page
When title of login page is Free CRM
Then user enters username and password
Then user click on login button


@Regressiontest
Scenario: test website for registration

Given user is already on registratin page
When user is on registration page
Then user enter data in registration data
Then user click on submit button
