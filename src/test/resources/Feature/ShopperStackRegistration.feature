@tag
Feature: Check Whether the user is able to Register

  @tag1
  Scenario: Registration Of end user
    Given I want check wether the user is able to resiter or not
    When user click on Register button and enter the data
      | Fname        | Anna                |
      | Lname        | Yadav               |
      | Gender       | Male                |
      | PhoneNumber  | 7949405236          |
      | EmailAddress | zanzZxYadav@gmail.com |
      | Password     | Anna@8888           |
    Then Success Toaster Message should be displayed
