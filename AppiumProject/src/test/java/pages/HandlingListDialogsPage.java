package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import util.ElementHelper;

import java.util.concurrent.TimeUnit;

public class HandlingListDialogsPage {
    AppiumDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;

    By clickContinueButton1 = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Continue\")");
    By clickOKButton1 = MobileBy.AndroidUIAutomator("new UiSelector().text(\"OK\")");
    By clickApp = MobileBy.AndroidUIAutomator("new UiSelector().text(\"App\")");
    By clickToAlertDialogs = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Alert Dialogs\")");
    By clickToListDialogs = MobileBy.AndroidUIAutomator("new UiSelector().text(\"List dialog\")");
    By clickToCommand = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Command two\")");
    By checkResult = MobileBy.AndroidUIAutomator("new UiSelector().text(\"You selected: 1 , Command two\")"); //Burada Assertion olacaak

    public HandlingListDialogsPage(AppiumDriver driver){

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
    public void clickToAlertDialogs(){
        driver.findElement(clickToAlertDialogs).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    public void clickToListDialogs(){
        driver.findElement(clickToListDialogs).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    public void clickToCommand(){
        driver.findElement(clickToCommand).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    public void checkResult(){
        Assert.assertTrue(driver.findElement(checkResult).isDisplayed(),"Result not verified");

    }











}
