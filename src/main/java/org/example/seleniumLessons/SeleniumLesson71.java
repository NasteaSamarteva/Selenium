package org.example.seleniumLessons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Arrays;
import java.util.List;

public class SeleniumLesson71 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("chromedriver.exe", "C:\\Users\\Nastya\\chromeDriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String[] productNamesToBeAdded = {"Cucumber", "Brocolli"};
        int j = 0;
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        Thread.sleep(2000);
        List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

        for (int i = 0; i < products.size(); i++) {
            String[] name = products.get(i).getText().split(" - ");
            String neededFormat = name[0].trim();
            // List<String> productNamesToBeAdded1 = List.of(productNamesToBeAdded);
            List<String> productNamesToBeAdded1 = Arrays.asList(productNamesToBeAdded);

            if (productNamesToBeAdded1.contains(neededFormat)) {
                j++;
                driver.findElements(By.xpath("//div[@class='product-action']//button")).get(i).click();

                if (j==productNamesToBeAdded.length) {
                    break;
                }
            }
        }
    }
}
