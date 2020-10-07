package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class linkTextandPartialLink {
    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/dynamic_loading");

        WebElement link1 = driver.findElement(By.linkText("Example 1: Element on page that is hidden and become visible after trigger"));
        //link1.click();

        WebElement link4=driver.findElement(By.partialLinkText("Example 4"));
        link4.click();

        WebElement link2= driver.findElement(By.partialLinkText("Example 5"));
        link2.click();
    }
}
