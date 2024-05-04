@tag
Feature: Check Whether the user is able to Register

  @tag1
  Scenario: Registration Of end user
    Given I want check wether the user is able to resiter or not
    When user click on Register button and enter the data
      | Fname        | Anna                  |
      | Lname        | Yadav                 |
      | Gender       | Male                  |
      | PhoneNumber  |            7949405200 |
      | EmailAddress | topzanzSZxYadav@gmail.com |
      | Password     | Anna@8888             |
    Then Success Toaster Message should be displayed

  @Tag2
  Scenario: Registration Of end user
    Given Check Whether the user is able login with valid data
    When user click on login button
      | EmailAddress | topzanzSZxYadav@gmail.com |
      | Password     | Anna@8888             |
    Then Home page Should display
