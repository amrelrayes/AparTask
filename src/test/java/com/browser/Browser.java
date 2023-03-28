package com.browser;


import com.pages.*;

public class Browser {

    public HomePage homePage;
    public BoardPage boardPage;
//    public LoginPage loginPage;


    public Browser() {
        homePage = new HomePage();
        boardPage = new BoardPage();
//        loginPage = new LoginPage();
    }
}
