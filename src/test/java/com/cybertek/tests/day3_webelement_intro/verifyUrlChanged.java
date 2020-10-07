package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class verifyUrlChanged {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= WebDriverFactory.getDriver("Chrome");

        driver.get("http://practice.cybertekschool.com/forgot_password");

        WebElement emailInputBox=driver.findElement(By.name("email"));

        emailInputBox.sendKeys("maykicn@gmail.com");

        WebElement retrievePasswordButton=driver.findElement(By.id("form_submit"));

        retrievePasswordButton.click();

        String expectedUrl= driver.getCurrentUrl();

        if(expectedUrl.equals("http://practice.cybertekschool.com/email_sent")){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }


        Thread.sleep(3000);

        driver.quit();



    }
}
