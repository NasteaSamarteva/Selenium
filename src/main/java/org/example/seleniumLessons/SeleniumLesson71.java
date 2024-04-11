package org.example.seleniumLessons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SeleniumLesson71 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("chromedriver.exe", "C:\\Users\\Nastya\\chromeDriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        String[] productNamesToBeAdded = {"Cucumber", "Brocolli"};
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        SeleniumLesson71 pickItem = new SeleniumLesson71();
        pickItem.addItems(driver, productNamesToBeAdded);
        driver.findElement(By.cssSelector("img[alt='Cart']")).click();
        driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
        driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
        driver.findElement(By.cssSelector("button.promoBtn")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
        System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());

    }

    public void addItems(WebDriver driver, String[] productNamesToBeAdded) {
        int j = 0;
        List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

        for (int i = 0; i < products.size(); i++) {
            String[] name = products.get(i).getText().split(" - ");
            String neededFormat = name[0].trim();
            // List<String> productNamesToBeAdded1 = List.of(productNamesToBeAdded);
            List<String> productNamesToBeAdded1 = Arrays.asList(productNamesToBeAdded);

            if (productNamesToBeAdded1.contains(neededFormat)) {
                j++;
                driver.findElements(By.xpath("//div[@class='product-action']//button")).get(i).click();

                if (j == productNamesToBeAdded.length) {
                    break;
                }
            }
        }
    }
}
