Feature: Login cases

  Scenario Outline: Jira invalid Login
    Given Jira dashboard is opened.
    When Enter login data "<username>" and "<password>" and click login
    Then invalid credentials is displayed

    Examples:
      | username |  | password |
      | user1    |  | pass     |

  Scenario Outline: Jira successful Login
    Given Jira dashboard is opened.
    When Enter login data "<username>" and "<password>" and click login
    Then Navigate to project page
    And Task board is opend

    Examples:
      | username |  | password |
      |          |  |          |