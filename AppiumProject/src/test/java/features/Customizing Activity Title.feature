Feature:Customizing Activity Title
@Test2
Scenario: Customizing Activity Title
//Reached by clearing cache without deleting the application
  Given Clear the application cache without uninstalling the app
  When  Navigate to the Activity section of the app
  And   Open the Custom Title activity
  And   Verify the default text values in the textBox and navigationBar
  And   Modify the left and right textBox fields
  Then  Confirm that the relevant textBox and navigationBar texts have been updated
