package com.mobile.pages;

import com.mobile.utils.MobileDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;




public class LoginPage {

    @AndroidFindBy(id = "cm.aptoide.pt:id/positive_button")
    private WebElement installButtonInput;

    @AndroidFindBy(id = "android:id/button1")
    private WebElement installOverWifiConfirmBtnInput;


    public LoginPage(){
        try {
            PageFactory.initElements(new AppiumFieldDecorator(MobileDriver.getDriver()),this);
        }catch (Exception e){e.printStackTrace();}
    }



      public void selectInstallButton() throws Exception {

          installButtonInput.click();
      }



}
