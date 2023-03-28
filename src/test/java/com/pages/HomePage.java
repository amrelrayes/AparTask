package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {


    @FindBy(id = "login-form-username")
    private WebElement userNameField;

    @FindBy(id = "login-form-password")
    private WebElement passwordField;

    @FindBy(id = "login")
    private WebElement btnLogin;

    @FindBy(id = "usernameerror")
    private WebElement errorMessage;
    public WebElement getErrorMessage() {
        return errorMessage;
    }




    public void setUsername() {
        userNameField.click();


    }

    public void setPassword() {

        passwordField.click();

    }


    public WebElement getBtnLogin() {
        return btnLogin;
    }

    public void clinkOnLogin() {
        getBtnLogin().click();
    }


    public void typeUsername(String userName) {
        userNameField.sendKeys(userName);
    }

    public void typePassword(String password) {
        passwordField.sendKeys(password);
    }


    @Override
    public void navigateTo(String s) {

    }
}