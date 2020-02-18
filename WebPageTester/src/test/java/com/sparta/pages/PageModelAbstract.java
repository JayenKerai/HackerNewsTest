package com.sparta.pages;

import org.openqa.selenium.WebDriver;

public abstract class PageModelAbstract {
    protected WebDriver webDriver;

    public PageModelAbstract(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void closePage() {
        webDriver.close();
    }

    public void goBackAPage() {
        webDriver.navigate().back();
    }

    public void goForwardAPage() {
        webDriver.navigate().forward();
    }

    public void refreshPage() {
        webDriver.navigate().refresh();
    }
}
