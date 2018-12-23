Feature: Add, Modify and Delete an Employee Functionality

  Background: 
    Given I logged into OrangeHRM
    And I navigated to the Add Employee Page

  Scenario: Add Employee
    When I provide the first name, middle name and last name of the employee
    Then I successfully added an employee

  Scenario: Modify Employee
    When I navigated to the Employee List Page
    And I search for an added employee
   And selected that employee
    Then I navigated to the employee profile
    And I can edit Employee information
  Scenario: Delete Employee

    Then I should be able to delete that employee
