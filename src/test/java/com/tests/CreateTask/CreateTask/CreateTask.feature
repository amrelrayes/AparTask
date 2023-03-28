Feature: Create Task

  Scenario Outline: Task creation with all data
    Given Jira dashboard is opened.
    And Enter login data "<username>" and "<password>" and click login
    And Navigate to project page
    When click on create
    And select task from menu
    Then Enter Summary title
    And Enter Description in descirption field
    And choose assingee
    And click on submit


    Examples:
      | username |  | password |
      | user1    |  | pass     |
