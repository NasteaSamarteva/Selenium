package org.example.seleniumLessons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLesson48 {
    public static void main(String[] args) {
        System.setProperty("chromedriver.exe", "C:\\Users\\Nastya\\chromeDriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://google.com");
        driver.navigate().to("https://rahulshettyacademy.com");
        driver.navigate().back();
        driver.navigate().forward();
    }
}
