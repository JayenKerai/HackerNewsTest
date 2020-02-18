package com.sparta.pages;

import com.sparta.pages.models.CommentsPageModel;
import com.sparta.pages.models.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public abstract class GeneralNewsPageModelAbstract extends PageModelAbstract{

    public GeneralNewsPageModelAbstract(WebDriver webDriver) {
        super(webDriver);
    }

    public HomePageModel navigateToHome() {
        String code = "//img[@src='y18.gif']";
        webDriver.findElement(By.xpath(code)).click();
        return (new HomePageModel(webDriver));
    }

    public NewsPageModel navigateToNews() {
        webDriver.findElement(By.linkText("Hacker News")).click();
        return (new NewsPageModel(webDriver));
    }

    public NewPageModel navigateToNew() {
        webDriver.findElement(By.linkText("new")).click();
        return (new NewPageModel(webDriver));
    }

    public PastPageModel navigateToPast() {
        webDriver.findElement(By.linkText("past")).click();
        return (new PastPageModel(webDriver));
    }

    public CommentsPageModel navigateToComments() {
        webDriver.findElement(By.linkText("comments")).click();
        return (new CommentsPageModel(webDriver));
    }

    public AskPageModel navigateToAsk() {
        webDriver.findElement(By.linkText("ask")).click();
        return (new AskPageModel(webDriver));
    }

    public ShowPageModel navigateToShow() {
        webDriver.findElement(By.linkText("show")).click();
        return (new ShowPageModel(webDriver));
    }

    public JobsPageModel navigateToJobs() {
        webDriver.findElement(By.linkText("jobs")).click();
        return (new JobsPageModel(webDriver));
    }

    public SubmitPageModel navigateToSubmit() {
        webDriver.findElement(By.linkText("submit")).click();
        return (new SubmitPageModel(webDriver));
    }

    public SearchPageModel inputIntoSearchBarAndSearch(String input) {
        webDriver.findElement(By.name("q")).sendKeys(input, Keys.ENTER);
        return (new SearchPageModel(webDriver));
    }

    public SearchPageModel inputIntoSearchBar(String input) {
        webDriver.findElement(By.name("q")).sendKeys(input);
        return (new SearchPageModel(webDriver));
    }

    public SearchPageModel inputEnterIntoSearchBar(String input) {
        webDriver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        return (new SearchPageModel(webDriver));
    }

    public LoginPageModel navigateToLogin() {
        webDriver.findElement(By.linkText("login")).click();
        return (new LoginPageModel(webDriver));
    }
}
