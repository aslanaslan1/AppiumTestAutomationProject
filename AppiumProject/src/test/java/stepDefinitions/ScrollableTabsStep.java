package stepDefinitions;

import io.appium.java_client.TouchAction;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ScrollableTabsPage;
import util.DriverFactory;

public class ScrollableTabsStep {

    ScrollableTabsPage scrollableTabsPage = new ScrollableTabsPage(DriverFactory.getDriver());

    @Given("Uninstall the application and reinstall it")
    public void uninstall_the_application_and_reinstall_it() {
        scrollableTabsPage.clickContinueButton1();
        scrollableTabsPage.clickOKButton1();

    }

    @When("Open the Tabs menu within the Views section")
    public void open_the_tabs_menu_within_the_views_section() {
        scrollableTabsPage.clickViews();

    }

    @When("Navigate to the Scrollable option")
    public void navigate_to_the_scrollable_option() {

        scrollableTabsPage.clickTabs();
        scrollableTabsPage.clickScrollLabs();

    }

    @When("Switch to the tab located at the last position")
    public void switch_to_the_tab_located_at_the_last_position() {


    }

    @Then("Click the tab and verify that the opened page information corresponds to tab thirty")
    public void click_the_tab_and_verify_that_the_opened_page_information_corresponds_to_tab_thirty() {

    }



}
