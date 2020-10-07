package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class
nameLocatortTest {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        // maek browser fullscreen
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/sign_up");

        WebElement fullNameInput=driver.findElement(By.name("full_name"));
        fullNameInput.sendKeys("mike smith");

        WebElement fullEmailInput= driver.findElement(By.name("email"));
        fullEmailInput.sendKeys(("mike@smith"));

        WebElement signUpButton= driver.findElement(By.name("wooden_spoon"));
        signUpButton.click();











    }

}
