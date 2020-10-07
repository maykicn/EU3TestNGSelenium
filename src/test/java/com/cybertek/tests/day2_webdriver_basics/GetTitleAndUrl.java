package com.cybertek.tests.day2_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleAndUrl {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        driver.navigate().to("http://practice.cybertekschool.com");

        System.out.println(driver.getTitle());
        System.out.println("driver.getTitle() = " + driver.getTitle());

        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

        System.out.println("driver.getPageSource() = " + driver.getPageSource());


    }




}
