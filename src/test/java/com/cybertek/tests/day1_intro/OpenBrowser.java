package com.cybertek.tests.day1_intro;

import io.github.bonigarcia.wdm.WdmAgent;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class OpenBrowser {
    public static void main(String[] args) {

        // we have to enter this line every time we want to open chrome
        //hey webdrivermanager. can you make chrome ready for me for autamaion
        //WebDriverManager.chromedriver().setup();

        //WebDriver represent the browser
        // we are creating driver for chromebrwser
        // new chrome driver ---> this part will open chrome  browser
        //WebDriver driver=new ChromeDriver();

        //driver.get("https://cybertekschool.com");

        WebDriverManager.firefoxdriver().setup();

        WebDriver driver=new FirefoxDriver();

        driver.get("http://www.google.com");








    }
}
