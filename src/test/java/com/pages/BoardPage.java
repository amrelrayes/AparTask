package com.pages;

import com.driver.WebDriverHandler;
import org.apache.bcel.generic.Select;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class BoardPage extends BasePage {


    @FindBy(linkText = "title=\"Kanban board\"")
    private WebElement kanbanBoard;
    @FindBy(id = "create_link")
    private WebElement create;
    @FindBy(id = "create-issue-submit")
    private WebElement submit;


    @FindBy(linkText = "icon aui-ss-icon noloading drop-menu")
    private WebElement dropDownList;
    public void dropDownList (String value)
    {
        Select fisrtItemList = new Select(driver.findElement(by linkText("aui-list-item-link aui-iconised-link")));
        fisrtItemList.selectByVisibleText(value); }


    public WebElement getKanbanBoard() {
        return kanbanBoard;
    }

    @Override
    public void navigateTo(String s) {

    }
}

