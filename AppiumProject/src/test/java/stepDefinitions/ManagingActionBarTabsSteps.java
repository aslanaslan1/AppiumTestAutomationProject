package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ManagingActionBarTabsPage;
import util.DriverFactory;

public class ManagingActionBarTabsSteps {
    ManagingActionBarTabsPage managingActionBarTabsPage = new ManagingActionBarTabsPage(DriverFactory.getDriver());

    @Given("Launch the application and ensure that the app opens successfully")
    public void launch_the_application_and_ensure_that_the_app_opens_successfully() {
        managingActionBarTabsPage.verifyToPage();


    }

    @When("Navigate to the ActionBar")
    public void navigate_to_the_action_bar() {
        managingActionBarTabsPage.clickToActionBar();
    }

    @When("Verify that the Toggle tab mode option is inactive or passive")
    public void verify_that_the_toggle_tab_mode_option_is_inactive_passive() {
        managingActionBarTabsPage.clickToggleTap();

    }

    @When("Add three new tabs to the ActionBar")
    public void add_three_new_tabs_to_the_action_bar() {
        managingActionBarTabsPage.clickToNewTabs();

    }

    @When("Confirm that all three tabs have been successfully added")
    public void confirm_that_all_three_tabs_have_been_successfully_added() {
        managingActionBarTabsPage.verifyTabs();

    }

    @When("Remove the last added tab using the Remove last tab option")
    public void remove_the_last_added_tab_using_the_remove_last_tab_option() throws InterruptedException {
        managingActionBarTabsPage.removeLastTab();

    }

    @Then("Verify that the correct tab has been deleted")
    public void verify_that_the_correct_tab_has_been_deleted() {
        managingActionBarTabsPage.verifyLastTabRemove();

    }

    @When("Use the Remove all tabs option to delete all tabs")
    public void use_the_remove_all_tabs_option_to_delete_all_tabs() {
        managingActionBarTabsPage.removeToAllTabs();

    }

    @Then("Ensure that there are no active tabs remaining in the activity")
    public void ensure_that_there_are_no_active_tabs_remaining_in_the_activity() {
        managingActionBarTabsPage.verifyAllTabsCleared();

    }
}
