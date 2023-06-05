Feature: Context Menu in Fragments

  @Test4
  Scenario: Context Menu in Fragments
  //Reached without clearing cache without deleting the application (noReset=true)
    Given Navigate to the Fragment section of the app
    When  Open the activity that contains the context menu
    And   Long-press the long press me button
    Then  Verify that the Menu A and Menu B elements are displayed

