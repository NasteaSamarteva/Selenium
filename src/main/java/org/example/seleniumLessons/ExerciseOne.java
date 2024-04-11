package org.example.seleniumLessons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class ExerciseOne {
    public static void main(String[] args) {
        System.setProperty("chromedriver.exe", "C:\\Users\\Nastya\\chromeDriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("rahulshettyacademy");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("learning");
        driver.findElement(By.xpath("(//span[@class='checkmark'])[2]")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Okay']")));
        driver.findElement(By.xpath("//button[text()='Okay']")).click();
        Select dropdown = new Select(driver.findElement(By.cssSelector("select.form-control")));
        dropdown.selectByVisibleText("Consultant");

        driver.findElement(By.id("terms")).click();
        driver.findElement(By.id("signInBtn")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button.btn-info")));

        List<WebElement> elements = driver.findElements(By.cssSelector("button.btn-info"));

        elements.forEach(element -> element.click());
        driver.findElement(By.xpath("//a[@class='nav-link btn btn-primary']")).click();

    }
}
