package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HandlingListDialogsPage;
import util.DriverFactory;


public class HandlingListDialogsSteps {

   HandlingListDialogsPage handlingListDialogsPage = new HandlingListDialogsPage(DriverFactory.getDriver());

    @Given("Access the List Dialog section within the app")
    public void access_the_list_dialog_section_within_the_app() {
     handlingListDialogsPage.clickContinueButton1();
     handlingListDialogsPage.clickOKButton1();
     handlingListDialogsPage.clickApp();
    }

    @When("Open the activity that contains a list dialog")
    public void open_the_activity_that_contains_a_list_dialog() {
     handlingListDialogsPage.clickToAlertDialogs();

    }

    @When("Select an item from the list dialog")
    public void select_an_item_from_the_list_dialog() {
     handlingListDialogsPage.clickToListDialogs();
     handlingListDialogsPage.clickToCommand();
    }

    @Then("After the selection is made verify the order and name of the selected item in the alert message")
    public void after_the_selection_is_made_verify_the_order_and_name_of_the_selected_item_in_the_alert_message() {
     handlingListDialogsPage.checkResult();

    }

}
