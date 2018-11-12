package com.gmail.tusia9596.tests;

import com.gmail.tusia9596.pages.AccountSettingsPage;
import com.gmail.tusia9596.pages.LoginPage;
import com.gmail.tusia9596.pages.MainPage;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class LoginTest {
    public static WebDriver driver;
    public static MainPage mainPage;
    public static LoginPage loginPage;
    public static AccountSettingsPage accSettingsPage;

    @BeforeClass
    public static void setup () {
        File file= new File("C:/drivers/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
       ChromeDriver driver = new ChromeDriver();
       mainPage=new MainPage(driver);
       loginPage=new LoginPage(driver);
       accSettingsPage=new AccountSettingsPage(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.brixx.com/");

    }

    @Test
    public void loginTest() {
        mainPage.clickCookieAgree();
        mainPage.clickSignIn();
        loginPage.inputLogin("tusia9596@gmail.com");
        loginPage.inputPassword("Sometestpassword1");
        loginPage.clickSignIn();
        accSettingsPage.ClickLogin();
    }

    /*@AfterClass
    public static void tearDown () {
        driver.quit();
    }*/

}
