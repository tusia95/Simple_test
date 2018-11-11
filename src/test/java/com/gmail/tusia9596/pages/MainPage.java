package com.gmail.tusia9596.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    public MainPage (WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver=driver;
    }
    public WebDriver driver;
    @FindBy (id="catapultCookie")
            private WebElement cookieAgreeButton;

    @FindBy (xpath=".//a[text() = 'Sign In']")
    private  WebElement toSignInButton;

    public void clickCookieAgree() {
        cookieAgreeButton.click();
    }
    public void clickSignIn() {
        toSignInButton.click();
    }



}
