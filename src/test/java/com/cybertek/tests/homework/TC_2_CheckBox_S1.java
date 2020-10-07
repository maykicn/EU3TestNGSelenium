package com.cybertek.tests.homework;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class TC_2_CheckBox_S1 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.get("http://www.seleniumeasy.com/test/basic-checkbox-demo.html");
        WebElement singleCheckBox= driver.findElement(By.cssSelector("input#isAgeSelected"));
        Assert.assertFalse(singleCheckBox.isSelected(),"Verify “Success – Check box is checked” message is NOT displayed");
        singleCheckBox.click();
        Assert.assertTrue(singleCheckBox.isSelected(),"Verify “Success – Check box is checked” message is displayed.");
















        Thread.sleep(3000);
        driver.quit();

    }



}
