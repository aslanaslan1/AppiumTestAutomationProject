package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CustomizingActivityTitlePage;
import util.DriverFactory;

public class CustomizingActivityTitleStep {
    CustomizingActivityTitlePage customizingActivityTitlePage = new CustomizingActivityTitlePage(DriverFactory.getDriver());



    @Given("Clear the application cache without uninstalling the app")
    public void clear_the_application_cache_without_uninstalling_the_app() {
        customizingActivityTitlePage.clickApp1();

    }

    @When("Navigate to the Activity section of the app")
    public void navigate_to_the_activity_section_of_the_app() {
        customizingActivityTitlePage.clickToActivityBar();
    }

    @When("Open the Custom Title activity")
    public void open_the_custom_title_activity() {
        customizingActivityTitlePage.customTitle();
    }

    @When("Verify the default text values in the textBox and navigationBar")
    public void verify_the_default_text_values_in_the_text_box_and_navigation_bar() {
        customizingActivityTitlePage.leftTextBox();
        customizingActivityTitlePage.navigationBar();
    }

    @When("Modify the left and right textBox fields")
    public void modify_the_left_and_right_text_box_fields() throws InterruptedException {
        customizingActivityTitlePage.modifyChangeLeft();
        customizingActivityTitlePage.modifyChangeRight();
    }

    @Then("Confirm that the relevant textBox and navigationBar texts have been updated")
    public void confirm_that_the_relevant_text_box_and_navigation_bar_texts_have_been_updated() {
        customizingActivityTitlePage.updatedLeftside();
        customizingActivityTitlePage.updatedRightside();

    }


}
