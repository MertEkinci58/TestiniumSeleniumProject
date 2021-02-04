package com.example.pages;

import com.example.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {

    public static final By LOGIN_BUTTON_BEFORE_HOVER = By.xpath("//*[@id=\"main-header\"]/div[3]/div/div/div/div[3]/div/div[1]");
    public static final By LOGIN_BUTTON_AFTER_HOVER = By.xpath("//*[@id=\"main-header\"]/div[3]/div/div/div/div[3]/div/div[1]/div[2]/div/div/div");


    public HomePage(WebDriver driver)

    {
        super(driver);
    }

    public HomePage hoverToLogin(){
        hoverElement(LOGIN_BUTTON_BEFORE_HOVER);
        return this;
    }

    public HomePage clickLoginButton(){
        click(LOGIN_BUTTON_AFTER_HOVER);
        return this;
    }

}
