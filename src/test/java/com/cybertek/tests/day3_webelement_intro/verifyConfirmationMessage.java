package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class verifyConfirmationMessage {

    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");

        driver.navigate().to("http://practice.cybertekschool.com/forgot_password");

        String expectedEmail="mike12345678946546@gmail.com";

        WebElement emailInputBox= driver.findElement(By.name("email"));
        emailInputBox.sendKeys(expectedEmail);

        String actualEmail = emailInputBox.getAttribute("value");

        if(expectedEmail.equals(actualEmail)){
            System.out.println("PASS");

        }else{
            System.out.println("FAIL");

        }


        String expectedConfirmationMessage="Your e-mail's been sent!";

        WebElement retrieveButton= driver.findElement(By.id("form_submit"));
        retrieveButton.click();

        WebElement actualConfirmationMessage=driver.findElement(By.name("confirmation_message"));



        if(actualConfirmationMessage.getText().equals(expectedConfirmationMessage)){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }

        driver.quit();

    }
}
