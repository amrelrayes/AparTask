package com.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverHandler {

    private static WebDriver webDriver;
    private static String chromeDriverPath = "";
    private static String driverType = "webdriver.chrome.driver";

    public WebDriverHandler() {
        setDriverCapabilities();
    }

    public static WebDriver getWebDriver() {
        return webDriver;
    }

    public static void close() {
        webDriver.quit();
    }

    private void setDriverCapabilities() {

        System.setProperty("webdriver.chrome.driver", "src/chromedriver.exe");
        ChromeOptions chromeCapabilities = new ChromeOptions();
        webDriver = new ChromeDriver(chromeCapabilities);
        webDriver.manage().window().maximize();
        chromeCapabilities.addArguments("--disable-notifications");
    }

    public void navigateTo(String link) {
        webDriver.navigate().to(link);
    }
}
