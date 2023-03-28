package com.pages;

import com.driver.WebDriverHandler;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public abstract class BasePage {
    public BasePage() {
        PageFactory.initElements(new AjaxElementLocatorFactory(WebDriverHandler.getWebDriver(), 40), this);
    }


    public abstract void navigateTo(String s);
}
