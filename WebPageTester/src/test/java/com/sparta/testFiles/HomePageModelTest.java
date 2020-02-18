package com.sparta.testFiles;

import com.sparta.pages.models.HomePageModel;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePageModelTest {
    private WebDriver webDriver;
    private HomePageModel homePageModel;

    public HomePageModelTest() {
        this.webDriver = new ChromeDriver();
        this.homePageModel = new HomePageModel(webDriver);
    }

    @BeforeEach
    public void doBefore() {
        webDriver.get("https://news.ycombinator.com/");
    }

    @Test
    public void testClickOnHomeImage(){
        homePageModel.navigateToHome();
        Assertions.assertEquals("https://news.ycombinator.com/", webDriver.getCurrentUrl());
    }

    @Test
    public void testClickOnHackerNews() {
        homePageModel.navigateToNews();
        Assertions.assertEquals("https://news.ycombinator.com/news", webDriver.getCurrentUrl());
    }

    @Test
    public void testClickOnNew() {
        homePageModel.navigateToNew();
        Assertions.assertEquals("https://news.ycombinator.com/newest", webDriver.getCurrentUrl());
    }

    @Test
    public void testClickOnPast() {
        homePageModel.navigateToPast();
        Assertions.assertEquals("https://news.ycombinator.com/front", webDriver.getCurrentUrl());
    }

    @Test
    public void testClickOnComments() {
        homePageModel.navigateToComments();
        Assertions.assertEquals("https://news.ycombinator.com/newcomments", webDriver.getCurrentUrl());
    }

    @Test
    public void testClickOnAsk() {
        homePageModel.navigateToAsk();
        Assertions.assertEquals("https://news.ycombinator.com/ask", webDriver.getCurrentUrl());
    }

    @Test
    public void testClickOnShow() {
        homePageModel.navigateToShow();
        Assertions.assertEquals("https://news.ycombinator.com/show", webDriver.getCurrentUrl());
    }

    @Test
    public void testClickOnJobs() {
        homePageModel.navigateToJobs();
        Assertions.assertEquals("https://news.ycombinator.com/jobs", webDriver.getCurrentUrl());
    }

    @Test
    public void testClickOnSubmit() {
        homePageModel.navigateToSubmit();
        Assertions.assertEquals("https://news.ycombinator.com/submit", webDriver.getCurrentUrl());
    }

    @Test
    public void testSearchJava() {
        String inputToTest = "Java";
        homePageModel.inputIntoSearchBarAndSearch(inputToTest);
        Assertions.assertEquals("https://hn.algolia.com/?q=" + inputToTest, webDriver.getCurrentUrl());
    }

    @Test
    public void testSearch1Java() {
        String inputToTest = "123Java";
        homePageModel.inputIntoSearchBarAndSearch(inputToTest);
        Assertions.assertEquals("https://hn.algolia.com/?q=" + inputToTest, webDriver.getCurrentUrl());
    }

    @Test
    public void testClickOnNewThenPastThenComments(){
        homePageModel.navigateToNew().navigateToPast().navigateToComments();
        Assertions.assertEquals("https://news.ycombinator.com/newcomments", webDriver.getCurrentUrl());
    }

    @Test
    public void testClickOnAskThenPastThenCommentsThenGoBackAPage(){ //should end on past
        homePageModel.navigateToAsk().navigateToPast().navigateToComments().goBackAPage();
        Assertions.assertEquals("https://news.ycombinator.com/front", webDriver.getCurrentUrl());
    }

    @Test
    public void testClickOnPastThenSubmit(){
        homePageModel.navigateToPast().navigateToSubmit();
        Assertions.assertEquals("https://news.ycombinator.com/submit", webDriver.getCurrentUrl());
    }

    @Test
    public void testClickOnLogin(){
        homePageModel.navigateToLogin();
        Assertions.assertEquals("https://news.ycombinator.com/login?goto=news", webDriver.getCurrentUrl());
    }

    // how do I do this?
    // cant continue after going back a page
/*    @Test
    public void testClickOnPastThenGoBackAPageThenForwardAPage(){
        homePageModel.navigateToPast().
        Assertions.assertEquals("https://news.ycombinator.com/front", webDriver.getCurrentUrl());
    }*/

    @AfterEach
    public void closeAtEnd() {
        webDriver.close();
    }
}
