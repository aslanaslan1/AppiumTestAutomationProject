Feature: Handling List Dialogs
  @Test3
  Scenario: Handling List Dialogs
  //Reached without clearing cache without deleting the application (noReset=true)
    Given Access the List Dialog section within the app
    When Open the activity that contains a list dialog
    And  Select an item from the list dialog
    Then After the selection is made verify the order and name of the selected item in the alert message
