package com.gmail.tusia9596.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountSettingsPage {
    public AccountSettingsPage (WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver=driver;
    }
    public WebDriver driver;
    @FindBy (xpath=".//upperdropdownmenu/div/div")
    private WebElement accountMenuButton;
    public void ClickLogin() {
        accountMenuButton.click();
 }
}
