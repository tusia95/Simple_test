package com.gmail.tusia9596.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public WebDriver driver;

    @FindBy(id = "loginEmailInputEl")
    private WebElement loginField;

    @FindBy(id = "loginPassInputEl")
    private WebElement passwordField;

    @FindBy(id = "sign-in")
    private WebElement signInButton;

    public void inputLogin(String login) {
        loginField.sendKeys(login);
    }

    public void inputPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void clickSignIn() {
        signInButton.click();
    }
}



