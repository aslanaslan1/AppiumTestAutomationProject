Feature: Hiding and Showing Fragments

  @Test5
  Scenario:Hiding and Showing Fragments
  // Reached without clearing cache without deleting the application (noReset=true)
    Given Access the Hide and Show menu within the Fragment section
    When  Open the activity that contains two Hide buttons and two text boxes
    And   Click the second Hide button and verify that the text box is hidden and the button text changes to Show
    Then  Press the Show button and confirm that the text box reappears and the button text changes back to Hide