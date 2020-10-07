package com.cybertek.tests.day10_actions_js;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HoverTest {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");

    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

    /**
     * hover over each image in the website
     * verify each name:user text is displayed
     */

//    @Test
//    public void hoverTest() throws InterruptedException {
//        driver.get("http://practice.cybertekschool.com/hovers");
//        boolean flag = true;
//        int i = 1;
//        while (flag) {
//            String path = "(//img)[" + i + "]";
//            WebElement img = null;
//            if (driver.) {
//                driver.quit();
//            } else {
//
//                img = driver.findElement(By.xpath(path));
//            }
//
//            Actions actions = new Actions(driver);
//            Thread.sleep(2000);
//            actions.moveToElement(img).perform();
//            WebElement viewLink = driver.findElement(By.linkText("View profile"));
//            Thread.sleep(3000);
//
//
//        }
//    }

        @Test
        public void oneImage() throws InterruptedException {
            driver.get("http://practice.cybertekschool.com/hovers");

            WebElement img1 = driver.findElement(By.tagName("img"));

            Actions actions = new Actions(driver);

            Thread.sleep(2000);
            actions.moveToElement(img1).perform();

            WebElement text1 = driver.findElement(By.xpath("//h5[.='name: user1']"));

            Assert.assertTrue(text1.isDisplayed(),"verify text 1 is displayed");

        }

        /**
         * hover over each image in the website
         * verify each name:user text is displayed
         */
        @Test
        public void test2() throws InterruptedException {
            driver.get("http://practice.cybertekschool.com/hovers");

            for (int i = 1; i <= 3; i++) {

                String xpathImg = "(//img)[" + i + "]";
                WebElement img = driver.findElement(By.xpath(xpathImg));
                System.out.println(xpathImg);

                Actions actions = new Actions(driver);
                Thread.sleep(1000);
                actions.moveToElement(img).perform();

                String textXpath = "//h5[.='name: user" + i + "']";
                WebElement text1 = driver.findElement(By.xpath(textXpath));
                System.out.println(textXpath);
                Assert.assertTrue(text1.isDisplayed(), "verify user " + i + " is displayed");

            }
        }



            //String path="(//img)["+1+"]";
        //
        //System.out.println("path = " + path);
            //(//img)[1]
        //WebElement img1 = driver.findElement(By.xpath(path));
        //WebElement img1 = driver.findElement(By.tagName("img"));
        //Actions --> class that contains all the user interactions
        //how to create actions object --> passing driver as a constructor
        //Actions actions = new Actions(driver);
        //perform() --> perform the action, complete the action
        //moveToElement --> move you mouse to webelement(hover over)
        //Thread.sleep(2000);
        //actions.moveToElement(img1).perform();

        //WebElement viewLink = driver.findElement(By.linkText("View profile"));

        //Thread.sleep(3000);

        //Assert.assertTrue(viewLink.isDisplayed(),"verify view link is displayed");




}