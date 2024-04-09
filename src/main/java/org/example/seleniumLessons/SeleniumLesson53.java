package org.example.seleniumLessons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class SeleniumLesson53 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("chromedriver.exe", "C:\\Users\\Nastya\\chromeDriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        driver.findElement(By.cssSelector("input[id*=SeniorCitizenDiscount]")).click();
        System.out.println(driver.findElement(By.cssSelector("input[id*=SeniorCitizenDiscount]")).isSelected());

        List<WebElement> checkboxes = driver.findElements(By.xpath("//div[@id='discount-checkbox']//div//input[@type='checkbox']"));

        System.out.println(checkboxes.size());

        //System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
        driver.findElement(By.id("Div1")).getAttribute("style");
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
        driver.findElement(By.id("Div1")).getAttribute("style");
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();

        if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
            System.out.println("enabled");
            Assert.assertTrue(true);
        } else Assert.assertTrue(false);


        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000L);

        for (int i = 0; i < 4; i++) {
            driver.findElement(By.id("hrefIncAdt")).click();
        }
        driver.findElement(By.id("btnclosepaxoption")).click();
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());


    }
}
