package com.example.app.pages;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;

public class NavigationMenu extends BasePageObject {

  public void clickHamburgerBtn(){
    click(MobileBy.AccessibilityId("Open navigation drawer"));
  }

  public void clickListMenu(){
    click(MobileBy.id("com.isl.simpleapp:id/et_2"));
  }

  public void clickCalculatorMenu(){click(MobileBy.id("android:id/text1"));}

}
