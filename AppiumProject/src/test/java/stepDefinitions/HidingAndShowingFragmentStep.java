package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HidingAndShowingFragmentPage;
import util.DriverFactory;

public class HidingAndShowingFragmentStep {

    HidingAndShowingFragmentPage hidingAndShowingFragmentPage = new HidingAndShowingFragmentPage(DriverFactory.getDriver());

    @Given("Access the Hide and Show menu within the Fragment section")
    public void access_the_hide_and_show_menu_within_the_fragment_section() {
        hidingAndShowingFragmentPage.clickContinueButton1();
        hidingAndShowingFragmentPage.clickOKButton1();
        hidingAndShowingFragmentPage.clickApp();
        hidingAndShowingFragmentPage.clickFragment();
    }
    @When("Open the activity that contains two Hide buttons and two text boxes")
    public void open_the_activity_that_contains_two_hide_buttons_and_two_text_boxes() {
        hidingAndShowingFragmentPage.clickHideAndShow();
        hidingAndShowingFragmentPage.checkHideButton1();
        hidingAndShowingFragmentPage.checkTextButton1();
        hidingAndShowingFragmentPage.checkHideButton2();
        hidingAndShowingFragmentPage.checkTextButton2();
    }
    @When("Click the second Hide button and verify that the text box is hidden and the button text changes to Show")
    public void click_the_second_hide_button_and_verify_that_the_text_box_is_hidden_and_the_button_text_changes_to_show() {
        hidingAndShowingFragmentPage.clickHideButton2();
        hidingAndShowingFragmentPage.checkShowButton();
    }

    @Then("Press the Show button and confirm that the text box reappears and the button text changes back to Hide")
    public void press_the_show_button_and_confirm_that_the_text_box_reappears_and_the_button_text_changes_back_to_hide() {
        hidingAndShowingFragmentPage.clickShowButton();
        hidingAndShowingFragmentPage.checkHideButton2();
    }
}
