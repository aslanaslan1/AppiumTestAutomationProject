Feature: Scrollable Tabs
  @Test7
  Scenario: Scrollable Tabs
  //Delete and reinstall the application before continuing
    Given Uninstall the application and reinstall it
    When  Open the Tabs menu within the Views section
    And   Navigate to the Scrollable option
    And   Switch to the tab located at the last position
    Then  Click the tab and verify that the opened page information corresponds to tab thirty