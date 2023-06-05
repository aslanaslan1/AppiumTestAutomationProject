package pages;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import util.ElementHelper;

import java.util.concurrent.TimeUnit;

public class CustomizingActivityTitlePage {
    public AppiumDriver<WebElement> driver;
    public WebDriverWait wait;
    ElementHelper elementHelper;

    //Test2
    By clickContinueButton = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Continue\")");
    By clickOKButton = MobileBy.AndroidUIAutomator("new UiSelector().text(\"OK\")");
    By clickApp1 = MobileBy.AndroidUIAutomator("new UiSelector().text(\"App\")");
    By clickToActivityBar = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Activity\")");
    By customTitle = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Custom Title\")");
    By leftTextBox = By.id("com.hmh.api:id/left_text");
    By navigationBar = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Right is always right\")");
    By modifyChangeLeft = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Change Left\"");
    By modifyChangeRight = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Change Right\"");
    By updatedLeftside = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Alaaddin\"");
    By updatedRightside = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Geyik\"");


    public CustomizingActivityTitlePage(AppiumDriver driver){

        this.driver =driver;
        this.wait = new WebDriverWait(driver,(10));
        this.elementHelper = new ElementHelper(driver);
    }
    public void clickApp1(){
        driver.findElement(clickContinueButton).click();
        driver.findElement(clickOKButton).click();
        driver.findElement(clickApp1).click();
    }
    public void clickToActivityBar(){
        driver.findElement(clickToActivityBar).click();
    }
    public void customTitle(){
        driver.findElement(customTitle).click();
    }
    public void leftTextBox(){
        Assert.assertTrue(driver.findElement(leftTextBox).isDisplayed(),"Left box is not verified");

    }
    public void navigationBar(){
        Assert.assertTrue(driver.findElement(navigationBar).isDisplayed(),"Left box is not verified");

    }
    public void modifyChangeLeft()   {
        driver.findElement(modifyChangeLeft).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(modifyChangeLeft).clear();
        driver.getKeyboard().sendKeys("Alaaddin");
    }
    public void modifyChangeRight(){
        driver.findElement(modifyChangeRight).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(modifyChangeRight).clear();
        driver.getKeyboard().sendKeys("Geyik");
    }
    public void updatedLeftside(){
        Assert.assertTrue(driver.findElement(updatedLeftside).isDisplayed(),"Update is not verified");

    }
    public void updatedRightside(){
        Assert.assertTrue(driver.findElement(updatedRightside).isDisplayed(),"Update is not verified");

    }

}
