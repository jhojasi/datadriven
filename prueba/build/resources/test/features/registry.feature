Feature: I as a user of the page
  I need to register
  To access a promotions

  Scenario: Complete forms with personal data to register an account
    Given The user is in home page
    When He writes personal information to register account on utest
      | userData |
      | 1        |
    Then he should see the message Add your address
