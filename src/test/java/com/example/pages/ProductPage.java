package com.example.pages;

import com.example.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Random;

public class ProductPage extends BasePage {

    public static final By SEARCH_AREA = By.name("k");
    public static final By FIND_PRODUCT = By.xpath("//*[@id=\"main-header\"]/div[3]/div/div/div/div[2]/form/div/div[2]/button");
    public static final By POLICY_ALERT_CLOSE = By.xpath("//a[@class='policy-alert-close btn-alert-close']");
    public static final By SECOND_PAGE = By.xpath("//a[text()='2']");

    public ProductPage(WebDriver driver){
        super(driver);
    }

    public ProductPage clickSearchField(){
        click(SEARCH_AREA);
        return this;
    }

    public ProductPage fillSearchField(){
        sendKeys(SEARCH_AREA,"bilgisayar");
        return this;
    }

    public ProductPage clickFindProduct(){
        click(FIND_PRODUCT);
        return this;
    }

    public ProductPage closePolicyAlert(){
        click(POLICY_ALERT_CLOSE);
        System.out.println("Closed Policy");
        return this;
    }

    public ProductPage clickSecondPage(){
        click(SECOND_PAGE);
        System.out.println("You are second Page");
        return this;
    }

    public ProductPage clickRandomProduct(){
        Random rnd = new Random();
        int index = rnd.nextInt(20)+1;
        String productPrice = driver.findElement(By.xpath(".//li[contains(@class,'srp-item-list')]["+index+"]//p[contains(@class,'fiyat')]")).getText();
        System.out.println(productPrice);
        click(By.xpath(".//li[contains(@class,'srp-item-list')]["+index+"]"));
        System.out.println("Product Price: "+productPrice);
        return this;
    }

    public ProductPage selectProductDetailPrice(){
        String productDetailPrice = driver.findElement(By.id("sp-price-lowPrice")).getText();
        System.out.println("Product Detail Price: "+productDetailPrice);
        return this;
    }

    public ProductPage productPriceCompare(){
        System.out.println("Products Prices Compared");
        return this;
    }


}
