package pages;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import util.ElementHelper;
import java.util.concurrent.TimeUnit;
public class HidingAndShowingFragmentPage {
    AppiumDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;
    By clickContinueButton1 = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Continue\")");
    By clickOKButton1 = MobileBy.AndroidUIAutomator("new UiSelector().text(\"OK\")");
    By clickApp = MobileBy.AndroidUIAutomator("new UiSelector().text(\"App\")");
    By clickFragment = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Fragment\")");
    By clickHideAndShow = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Hide and Show\")");
    By checkHideButton1 = By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.Button");
    By checkTextButton1 = MobileBy.AndroidUIAutomator("new UiSelector().text(\"The fragment saves and restores this text.\")");
    By checkHideButton2 = By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button");
    By checkTextButton2 = MobileBy.AndroidUIAutomator("new UiSelector().text(\"The TextView saves and restores this text.\")");
    By clickHideButton2 = By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button");
    By checkShowButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button");
    By clickShowButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button");
    public HidingAndShowingFragmentPage(AppiumDriver driver){
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
    public void clickHideAndShow(){
        driver.findElement(clickHideAndShow).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    public void checkHideButton1(){
        Assert.assertTrue(driver.findElement(checkHideButton1).isDisplayed(),"Hide Button1 not verified");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    public void checkTextButton1(){
        Assert.assertTrue(driver.findElement(checkTextButton1).isDisplayed(),"Text Button1 not verified");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    public void checkHideButton2(){
        Assert.assertTrue(driver.findElement(checkHideButton2).isDisplayed(),"Hide Button2 not verified");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    public void checkTextButton2(){
        Assert.assertTrue(driver.findElement(checkTextButton2).isDisplayed(),"Text Button2 not verified");

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    public void clickHideButton2(){
        driver.findElement(clickHideButton2).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    public void checkShowButton(){
        Assert.assertTrue(driver.findElement(checkShowButton).isDisplayed(),"Show Button not verified");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    public void clickShowButton(){
        Assert.assertTrue(driver.findElement(clickShowButton).isDisplayed(),"Show Button not verified");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertTrue(driver.findElement(checkHideButton2).isDisplayed(),"Show Button not verified");

    }
}