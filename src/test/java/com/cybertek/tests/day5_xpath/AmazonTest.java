package com.cybertek.tests.day5_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonTest {

    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");

        driver.get("https://www.amazon.com/");

       /* driver.findElement(By.id("twotabsearchtextbox")).sendKeys("selenium");*/

        WebElement searchBox=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));

        searchBox.sendKeys("Selenium");

        //click serch button

        driver.findElement(By.xpath("//input[@value='Go']")).click();

        WebElement result= driver.findElement(By.xpath("//span[contains(text(),'results for')]"));

        String resultText=result.getText();

        System.out.println("resultText = " + resultText);

        String expectedResult="1-48 of 180 results for";
        if(expectedResult.equals(resultText)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("expectedResult = " + expectedResult);
            System.out.println("resultText = " + resultText);
        }

        driver.quit();

        /*driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();

        String result= driver.findElement(By.xpath("(//div[@class='a-section a-spacing-small a-spacing-top-small']/span)[1]")).getText();
        String search=driver.findElement(By.xpath("(//div[@class='a-section a-spacing-small a-spacing-top-small']/span)[3]")).getText();
        String actualResult=result+" "+search;
        System.out.println(actualResult);

        if(actualResult.equals(expectedResult)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }*/


    }

}
