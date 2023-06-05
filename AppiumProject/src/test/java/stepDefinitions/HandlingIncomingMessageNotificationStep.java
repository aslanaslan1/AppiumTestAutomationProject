package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HandlingIncomingMessageNotificationPage;
import util.DriverFactory;

public class HandlingIncomingMessageNotificationStep {
    HandlingIncomingMessageNotificationPage handlingIncomingMessageNotificationPage = new HandlingIncomingMessageNotificationPage(DriverFactory.getDriver());

    @Given("Open the Incoming Message section within the app")
    public void open_the_incoming_message_section_within_the_app() {
        handlingIncomingMessageNotificationPage.clickContinueButton1();
        handlingIncomingMessageNotificationPage.clickOKButton1();
        handlingIncomingMessageNotificationPage.clickApp();
        handlingIncomingMessageNotificationPage.clickNotification();
        handlingIncomingMessageNotificationPage.clickIncomingMessage();
    }
    @When("Click the Show Notification button")
    public void click_the_show_notification_button() {
        handlingIncomingMessageNotificationPage.clickShowNotification();
    }

   /* @When("Expand the Notification Bar area")
    public void expand_the_notification_bar_area() {

    }

    @Then("Verify the presence of the notification")
    public void verify_the_presence_of_the_notification() {

    }

    @Then("Click the notification and check that the notification detail matches the text in the notification bar")
    public void click_the_notification_and_check_that_the_notification_detail_matches_the_text_in_the_notification_bar() {

    }*/


}
