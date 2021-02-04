package com.example.pages;

import com.example.base.BasePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    static final By LOGIN_BUTTON_BEFORE_HOVER = By.xpath("//*[@id=\"main-header\"]/div[3]/div/div/div/div[3]/div/div[1]");
    static final By LOGIN_BUTTON_AFTER_HOVER = By.xpath("//*[@id=\"main-header\"]/div[3]/div/div/div/div[3]/div/div[1]/div[2]/div/div/div");
    static final String HOME_PAGE_URL = "https://www.gittigidiyor.com/";

    public HomePage(WebDriver driver)

    {
        super(driver);
    }

    public HomePage CheckIfHomePageIsOpened(){
        Assert.assertEquals("You Are Not At HomePage", HOME_PAGE_URL, getCurrentPageUrl());
        return this;
    }

    public HomePage HoverToLogin(){
        hoverElement(LOGIN_BUTTON_BEFORE_HOVER);
        return this;
    }

    public HomePage ClickLoginButton(){
        click(LOGIN_BUTTON_AFTER_HOVER);
        return this;
    }

}
