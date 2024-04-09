package org.example.seleniumLessons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.sql.SQLOutput;

public class SeleniumLesson52 {
    public static void main(String[] args) {
        System.setProperty("chromedriver.exe", "C:\\Users\\Nastya\\chromeDriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        WebElement dropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select selectDropdown = new Select(dropdown);
        selectDropdown.selectByIndex(3);
        System.out.println(selectDropdown.getFirstSelectedOption().getText());
        selectDropdown.selectByVisibleText("AED");
        System.out.println(selectDropdown.getFirstSelectedOption().getText());
        selectDropdown.selectByValue("INR");
        System.out.println(selectDropdown.getFirstSelectedOption().getText());
    }
}
