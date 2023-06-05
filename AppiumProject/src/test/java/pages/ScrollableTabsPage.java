package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static java.time.Duration.ofMillis;

public class ScrollableTabsPage {

    AppiumDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;

    By clickContinueButton1 = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Continue\")");
    By clickOKButton1 = MobileBy.AndroidUIAutomator("new UiSelector().text(\"OK\")");
    By clickViews = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Views\")");
    By clickTabs = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Tabs\")");
    By clickScrollLabs = MobileBy.AndroidUIAutomator("new UiSelector().text(\"5. Scrollable\")");


    public ScrollableTabsPage(AppiumDriver driver){

        this.driver =driver;
        this.wait = new WebDriverWait(driver,(10));
        this.elementHelper = new ElementHelper(driver);
    }

    public void clickContinueButton1(){
        driver.findElement(clickContinueButton1).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    public void clickOKButton1(){
        driver.findElement(clickOKButton1).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    public void clickViews(){
        driver.findElement(clickViews).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    public void clickTabs(){

        TouchAction swipe = new TouchAction<>(driver)
                .press(PointOption.point(500,1926))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(800)))
                .moveTo(PointOption.point(500,1924))
                .release()
                .perform();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(clickTabs).click();
    }
    public void clickScrollLabs(){
        driver.findElement(clickScrollLabs).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        TouchAction swipe = new TouchAction(driver)
                .press(PointOption.point(1013,436))
                .waitAction(waitOptions(ofMillis(800)))
                .moveTo(PointOption.point(597,1017))
                .release()
                .perform();

    }


}
