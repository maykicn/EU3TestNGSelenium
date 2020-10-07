package com.cybertek.tests.homework;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class test02_Locator_HW {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://www.ebay.de/");

        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Selenium");

        driver.findElement(By.xpath("//input[@type='submit']")).click();

    }
}
