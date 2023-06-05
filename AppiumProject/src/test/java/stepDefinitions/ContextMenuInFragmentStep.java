package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ContextMenuInFragmentPage;
import util.DriverFactory;

public class ContextMenuInFragmentStep {


    ContextMenuInFragmentPage contextMenuInFragmentPage = new ContextMenuInFragmentPage(DriverFactory.getDriver());


    @Given("Navigate to the Fragment section of the app")
    public void navigate_to_the_fragment_section_of_the_app() {
        contextMenuInFragmentPage.clickContinueButton1();
        contextMenuInFragmentPage.clickOKButton1();
        contextMenuInFragmentPage.clickApp();
        contextMenuInFragmentPage.clickFragment();

    }

    @When("Open the activity that contains the context menu")
    public void open_the_activity_that_contains_the_context_menu() {
        contextMenuInFragmentPage.clickContextMenu();

    }

    @When("Long-press the long press me button")
    public void long_press_the_long_press_me_button() {
        contextMenuInFragmentPage.clickLongPress();

    }

    @Then("Verify that the Menu A and Menu B elements are displayed")
    public void verify_that_the_menu_a_and_menu_b_elements_are_displayed() {
        contextMenuInFragmentPage.checkMenuA();
        contextMenuInFragmentPage.checkMenuB();

    }

}
