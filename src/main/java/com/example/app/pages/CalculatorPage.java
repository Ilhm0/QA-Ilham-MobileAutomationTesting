package com.example.app.pages;

import static com.example.app.drivers.AndroidDriverInit.driver;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class CalculatorPage extends BasePageObject {

  public String getTitle() {
//    By locator = MobileBy.xpath(
//        "//android.view.ViewGroup[@resource-id='com.isl.simpleapp:id/toolbar']//android.widget.TextView");
//    AndroidElement labelTitle = driver.findElement(locator);
//    return labelTitle.getText();
    return getText(MobileBy.xpath("//android.view.ViewGroup[@resource-id='com.isl.simpleapp:id/toolbar']//android.widget.TextView"));
  }

  public boolean checkHamburgerBtnAppear() {
//    By locator = MobileBy.AccessibilityId("Open navigation drawer");
//    AndroidElement hamburgerBtn = driver.findElement(locator);
//    return hamburgerBtn.isDisplayed();

    //explicit wait
    By locator = MobileBy.AccessibilityId("Open navigation drawer");
    WebDriverWait wait = new WebDriverWait(driver, 10, 1000);
    AndroidElement hamburgerBtn = (AndroidElement) wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    return hamburgerBtn.isDisplayed();
  }

  public void inputAngka1(String angka1){

    type(MobileBy.id("com.isl.simpleapp:id/et_1"), angka1);
  }

  public void inputAngka2(String angka2){

    type(MobileBy.id("com.isl.simpleapp:id/et_2"), angka2);
  }

  public void operator(){
    click(MobileBy.id("com.isl.simpleapp:id/spinner_1"));
  }

  public void addition(){
    click(MobileBy.xpath("//android.widget.TextView[@resource-id=\"android:id/text1\" and @text=\"+\"]"));
  }

  public  void subtraction(){
    click(MobileBy.xpath("//android.widget.TextView[@resource-id=\"android:id/text1\" and @text=\"-\"]"));
  }

  public  void multiplication (){
    click(MobileBy.xpath("//android.widget.TextView[@resource-id=\"android:id/text1\" and @text=\"*\"]"));
  }

  public  void division(){
    click(MobileBy.xpath("//android.widget.TextView[@resource-id=\"android:id/text1\" and @text=\"/\"]"));
  }

  public void equals(){
    click(MobileBy.id("com.isl.simpleapp:id/acb_calculate"));
  }

  public String getResult() {

    return getText(MobileBy.id("com.isl.simpleapp:id/tv_result"));

  }

  public void longPress() {
    AndroidElement element = find(MobileBy.id("com.isl.simpleapp:id/acb_calculate"));
    TouchAction action = new TouchAction(getDriver());
    action.longPress(PointOption.point(element.getCenter()))
            .waitAction(WaitOptions.waitOptions(
                    Duration.of(5, ChronoUnit.SECONDS))).release()
            .perform();
  }

  public void tapMultipleTimes(){
    AndroidElement element = find(MobileBy.id("com.isl.simpleapp:id/acb_calculate"));
    TouchAction action = new TouchAction(getDriver());
    action.tap(TapOptions.tapOptions().withTapsCount(5)
            .withElement(ElementOption.element(element)))
            .perform();
  }
}
