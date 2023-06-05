package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

import java.util.concurrent.TimeUnit;

public class HandlingIncomingMessageNotificationPage {

    AppiumDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;
    By clickContinueButton1 = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Continue\")");
    By clickOKButton1 = MobileBy.AndroidUIAutomator("new UiSelector().text(\"OK\")");
    By clickApp = MobileBy.AndroidUIAutomator("new UiSelector().text(\"App\")");
    By clickNotification = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Notification\")");
    By clickIncomingMessage = MobileBy.AndroidUIAutomator("new UiSelector().text(\"IncomingMessage\")");
    By clickShowNotification = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Show Notification\")");
    public HandlingIncomingMessageNotificationPage(AppiumDriver driver){

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
    public void clickApp(){
        driver.findElement(clickApp).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    public void clickNotification(){
        driver.findElement(clickNotification).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    public void clickIncomingMessage(){
        driver.findElement(clickIncomingMessage).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    public void clickShowNotification(){
        driver.findElement(clickShowNotification).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }


}
