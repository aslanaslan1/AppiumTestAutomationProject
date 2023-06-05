
Feature: Mobile Test Automation Project

  @Test1
  Scenario: Managing Action Bar Tabs
    Given Launch the application and ensure that the app opens successfully
    When  Navigate to the ActionBar
    And   Verify that the Toggle tab mode option is inactive or passive
    And   Add three new tabs to the ActionBar
    When  Confirm that all three tabs have been successfully added
    And   Remove the last added tab using the Remove last tab option
    Then  Verify that the correct tab has been deleted
    When  Use the Remove all tabs option to delete all tabs
    Then  Ensure that there are no active tabs remaining in the activity














