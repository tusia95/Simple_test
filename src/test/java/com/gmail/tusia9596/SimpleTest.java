package com.gmail.tusia9596;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class SimpleTest {
    public static void main(String[] args) {
        //System.setProperties("webdriver.chrome.driver","C:/Users/Роман Бурмистров/IdeaProjects/simple_test/drivers/chromedriver.exe");
        File file= new File("C:/drivers");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

}


