package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;
import java.util.concurrent.TimeUnit;


public class ContextMenuInFragmentPage {
    AppiumDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;

    By clickContinueButton1 = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Continue\")");
    By clickOKButton1 = MobileBy.AndroidUIAutomator("new UiSelector().text(\"OK\")");
    By clickApp = MobileBy.AndroidUIAutomator("new UiSelector().text(\"App\")");
    By clickFragment = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Fragment\")");
    By clickContextMenu = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Context Menu\")");
    By clickLongPress = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Long press me\")"); //Bu alana long press eklenecek
    By checkMenuA = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Menu A\")");
    By checkMenuB = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Menu B\")");
    public ContextMenuInFragmentPage(AppiumDriver driver){

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
    public void clickFragment(){
        driver.findElement(clickFragment).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    public void clickContextMenu(){
        driver.findElement(clickContextMenu).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    public void clickLongPress(){
        TouchAction action = new TouchAction(driver);
       // action.longPress(clickLongPress);
        //driver.findElement(clickLongPress).click(); // bu alana long press nasil yapilir onun metodu gelecek
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }
    public void checkMenuA(){
        driver.findElement(checkMenuA).isDisplayed();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }
    public void checkMenuB(){
        driver.findElement(checkMenuB).isDisplayed();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


    }




}
