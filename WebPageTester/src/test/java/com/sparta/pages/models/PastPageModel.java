package com.sparta.pages.models;

import com.sparta.pages.GeneralNewsPageModelAbstract;
import com.sparta.pages.PageModelAbstract;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PastPageModel extends GeneralNewsPageModelAbstract {

    public PastPageModel(WebDriver webDriver) {
        super(webDriver);
    }

    public PageModelAbstract navigateToGoBackADay(){
        webDriver.findElement(By.linkText("day")).click();
        return (new PastPageModel(webDriver));
    }

    public PageModelAbstract navigateToGoBackAMonth(){
        webDriver.findElement(By.linkText("month")).click();
        return (new PastPageModel(webDriver));
    }

    public PageModelAbstract navigateToGoBackAYear(){
        webDriver.findElement(By.linkText("year")).click();
        return (new PastPageModel(webDriver));
    }

/*    public PageModelAbstract navigateToGoForwardADay(){
        webDriver.findElement(By.linkText("day")).click();
        return (new PastPageModel(webDriver));
    }*/
}
