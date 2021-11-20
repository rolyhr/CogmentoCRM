Feature: As a user, I should able to login at Cogmento application

  Background:
    Given user at cogmento homepage

  @login
  Scenario Outline: user should be able to navigate login page and login with valid credentials
    When user click on login button from homepage
    And user enter "<email_address>" at email input field
    And user enter "<password>" at password input field
    And user click on login button from login page
    Then user should navigated to account dashboard page

    Examples:
      |  email_address          |       password     |
      |  sample1@email.com      |       pass321      |
      |  sample123@email.com    |       pass546      |
      |  sample165@email.com    |       pass3430     |