package com.sparta.pages;

import org.openqa.selenium.WebDriver;

public abstract class LoginPageModelAbstract extends PageModelAbstract{

    public LoginPageModelAbstract(WebDriver webDriver) {
        super(webDriver);
    }

    public void addUserToLogin(String username){

    }

    public void addPasswordToLogin(String password){

    }

    public void clickLogin(){

    }

    public void clickForgotPassword(){

    }

    public void addUserToCreateAccount(String username){

    }

    public void addPasswordToCreateAccount(String password){

    }

    public void clickCreateAccount(){

    }
}
