package com.example.pages;

import com.example.base.BasePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.Random;

public class ProductPage extends BasePage {

    static final By SEARCH_AREA = By.name("k");
    static final By FIND_PRODUCT = By.xpath("//*[@id=\"main-header\"]/div[3]/div/div/div/div[2]/form/div/div[2]/button");
    static final By POLICY_ALERT_CLOSE = By.xpath("//a[@class='policy-alert-close btn-alert-close']");
    static final By SECOND_PAGE = By.xpath("//a[text()='2']");
    static final By SECOND_PAGE_CONTROLLER = By.xpath(".//div[contains(@class,'pager')]//li[contains(@class,'selected')]/a");
    static final By LOW_PRICE = By.id("sp-price-lowPrice");
    static final By HIGH_PRICE = By.id("sp-price-highPrice");

    String productPrice;
    String productDetailLowPrice;
    String productDetailHighPrice;

    public ProductPage(WebDriver driver){
        super(driver);
    }

    public ProductPage ClickSearchField(){
        click(SEARCH_AREA);
        return this;
    }

    public ProductPage FillSearchField(){
        sendKeys(SEARCH_AREA,"bilgisayar");
        return this;
    }

    public ProductPage ClickFindProduct(){
        click(FIND_PRODUCT);
        return this;
    }

    public ProductPage ClosePolicyAlert(){
        click(POLICY_ALERT_CLOSE);
        return this;
    }

    public ProductPage ClickSecondPage(){
        click(SECOND_PAGE);
        return this;
    }

    public ProductPage CheckPageOpened() {
        String currentPageNumber= getText(SECOND_PAGE_CONTROLLER);
        Assert.assertEquals("You Are Not At Second Page","2",currentPageNumber);
        return this;
    }

    public ProductPage ClickRandomProduct(){
        Random rnd = new Random();
        int index = rnd.nextInt(20)+1;

        By price = By.xpath(".//li[contains(@class,'srp-item-list')]["+index+"]//p[contains(@class,'fiyat')]");

        productPrice = getText(price);

        click(price);

        return this;
    }

    public ProductPage SelectProductDetailPrice(){
        productDetailLowPrice = getText(LOW_PRICE);
        productDetailHighPrice = getText(HIGH_PRICE);

        return this;
    }
    
    public ProductPage ProductPriceCompare(){
        if(productDetailLowPrice.equals("")){
            Assert.assertEquals("Prices Not Equal",productPrice,productDetailHighPrice);
            return this;
        }

        Assert.assertEquals("Prices Not Equal", productPrice, productDetailLowPrice);
        return this;
    }
}
