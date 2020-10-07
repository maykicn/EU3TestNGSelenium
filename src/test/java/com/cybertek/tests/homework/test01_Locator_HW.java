package com.cybertek.tests.homework;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class test01_Locator_HW {
    public static void main(String[] args) {

        WebDriver driver=WebDriverFactory.getDriver("chrome");

        driver.get("https://www.ebay.de/");
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("teile");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        System.out.println("print number of results " + driver.findElement(By.xpath("(//h1[@class='srp-controls__count-heading']/span)[1]")).getText());


    }
}
