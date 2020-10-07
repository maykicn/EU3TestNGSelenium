package com.cybertek.tests.homework;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class TC_3_CheckBox_S2 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.get("http://www.seleniumeasy.com/test/basic-checkbox-demo.html");
        WebElement checkButton= driver.findElement(By.cssSelector("input#check1"));
        Assert.assertTrue(checkButton.getAttribute("value").equals("Check All"),"Verify “Check All” button text is “Check All”");
        checkButton.click();
        Thread.sleep(3000);
        WebElement allCheck=driver.findElement(By.cssSelector("input#isChkd"));
        Assert.assertTrue(allCheck.getAttribute("value").equals("true"),"Verify all check boxes are checked");
        Assert.assertTrue(checkButton.getAttribute("value").equals("Uncheck All"),"Verify button text changed to “Uncheck All”");


        Thread.sleep(3000);
        driver.quit();

    }
}
