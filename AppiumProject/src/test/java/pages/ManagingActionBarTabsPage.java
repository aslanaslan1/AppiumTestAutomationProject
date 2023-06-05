package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import util.ElementHelper;

import java.util.concurrent.TimeUnit;

public class ManagingActionBarTabsPage {
    AppiumDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;


    //Test1
    By clickContinueButton = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Continue\")");
    By clickOKButton = MobileBy.AndroidUIAutomator("new UiSelector().text(\"OK\")");
    By verifyToPage = MobileBy.AndroidUIAutomator("new UiSelector().text(\"API Demos\")");
    By clickApp = MobileBy.AndroidUIAutomator("new UiSelector().text(\"App\")");
    By clickToActionBar = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Action Bar\")");
    By clickToActionBarTabs = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Action Bar Tabs\")");
    By clickToggleTap = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Toggle tab mode\")");
    By clickToNewTabs = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Add new tab\")");
    By checkTab0 = MobileBy.AndroidUIAutomator("new UiSelector().text(\"TAB 0\")");
    By checkTab1 = MobileBy.AndroidUIAutomator("new UiSelector().text(\"TAB 1\")");
    By checkTab2 = MobileBy.AndroidUIAutomator("new UiSelector().text(\"TAB 2\")");
    By removeLastTab = By.id("com.hmh.api:id/btn_remove_tab");
    By removeToAllTabs = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Remove all tab\")");


    public ManagingActionBarTabsPage(AppiumDriver driver){

        this.driver =driver;
        this.wait = new WebDriverWait(driver,(10));
        this.elementHelper = new ElementHelper(driver);
    }
    public void verifyToPage(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(clickContinueButton).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(clickOKButton).click();
        Assert.assertTrue(driver.findElement(verifyToPage).isDisplayed(),"Page does not load");

    }
    public void clickToActionBar(){
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.findElement(clickApp).click();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.findElement(clickToActionBar).click();
        driver.findElement(clickToActionBarTabs).click();
    }
    public void clickToggleTap(){
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.findElement(clickToggleTap).click();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    }
    public void clickToNewTabs(){

        driver.findElement(clickToNewTabs).click();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.findElement(clickToNewTabs).click();
        driver.findElement(clickToNewTabs).click();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    }
    public void verifyTabs(){

        Assert.assertTrue(driver.findElement(checkTab0).isDisplayed(),"Tab 0 is not verified");
        Assert.assertTrue(driver.findElement(checkTab1).isDisplayed(),"Tab 1 is not verified");
        Assert.assertTrue(driver.findElement(checkTab2).isDisplayed(),"Tab 2 is not verified");
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    }
    public void removeLastTab() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.findElement(removeLastTab).click();
        Thread.sleep(2000);
    }
    public void verifyLastTabRemove(){

        Assert.assertFalse(driver.findElement(checkTab2).isDisplayed(),"Last Tab visible"); // bu Alanda hata var
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

    }
    public void removeToAllTabs(){
        driver.findElement(removeToAllTabs).click();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    }
    public void verifyAllTabsCleared(){
        Assert.assertFalse(driver.findElement(checkTab0).isEnabled(),"Tab 0 visible"); // bu Alanda hata var
        Assert.assertFalse(driver.findElement(checkTab1).isEnabled(),"Tab 1 visible"); // bu Alanda hata var
        driver.findElement(checkTab0).clear();
    }

}
