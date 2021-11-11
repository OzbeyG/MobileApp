package com.mobile.step_definitions;

import com.mobile.pages.LoginPage;
import io.cucumber.java.en.Given;

public class LoginPageStepDefs {

    LoginPage loginPage = new LoginPage();


    @Given("user installed Optik Tv app")
    public void user_installed_optik_tv_app() throws Exception {
       loginPage.selectInstallButton();
    }
}
