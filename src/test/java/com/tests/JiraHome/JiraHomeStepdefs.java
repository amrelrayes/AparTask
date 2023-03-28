package com.tests.JiraHome;

import com.browser.Browser;
import com.driver.WebDriverHandler;
import com.tests.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.IOException;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public class JiraHomeStepdefs extends BaseTest {


    @Given("Jira dashboard is opened.")
    public void jiraDashboardIsOpened() {

    }

    @When("Enter login data {string} and {string} and click login")
    public void enterLoginDataAndAndClickLogin(String userName, String password) {
        browser.homePage.setUsername();
        browser.homePage.typeUsername(userName);
        browser.homePage.setPassword();
        browser.homePage.typePassword(password);
        browser.homePage.clinkOnLogin();
    }

    @Then("invalid credentials is displayed")
    public void invalidCredentialsIsDisplayed() {
        Assert.assertTrue(browser.homePage.getErrorMessage().isDisplayed());
    }


    @Then("Navigate to project page")
    public void navigateToProjectPage() {

//        webDriverHandler.navigateTo("ttps://jira.vf-eg.internal.vodafone.com/login.jsp?os_destination=%2Fsecure%2FRapidBoard.jspa%3FrapidView%3D5067%26selectedIssue%3DIP-2862");
            webDriverHandler = new WebDriverHandler();
            browser = new Browser();
            webDriverHandler.navigateTo("ttps://jira.vf-eg.internal.vodafone.com/login.jsp?os_destination=%2Fsecure%2FRapidBoard.jspa%3FrapidView%3D5067%26selectedIssue%3DIP-2862");
        }

        //        browser.boardPage.navigateTo("https://jira.vf-eg.internal.vodafone.com/login.jsp?os_destination=%2Fsecure%2FRapidBoard.jspa%3FrapidView%3D5067%26selectedIssue%3DIP-2862");



    @And("Task board is opend")
    public void taskBoardIsOpend() {
        Assert.assertTrue(browser.boardPage.getKanbanBoard().isDisplayed());


    }
}
