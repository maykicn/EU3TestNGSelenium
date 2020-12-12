package com.cybertek.tests.day14_extent_reports;

import com.cybertek.pages.ContactInfoPage;
import com.cybertek.pages.ContactsPage;
import com.cybertek.pages.DashboardPage;
import com.cybertek.pages.LoginPage;
import com.cybertek.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class task extends TestBase {


    @Test
    public void test1(){

        extentLogger = report.createTest("Contact Info Verification");


        LoginPage loginPage=new LoginPage();

        extentLogger.info("Login as a Sales Manager");
        loginPage.loginAsSaleManager();


        DashboardPage dashboardPage = new DashboardPage();

        extentLogger.info("Navigate to --> Customers > Contacts");
        dashboardPage.navigateToModule("Customers","Contacts");

        ContactsPage contactsPage = new ContactsPage();
        contactsPage.waitUntilLoaderScreenDisappear();

        String sourceEmail="mbrackstone9@example.com";
        contactsPage.getInfoEmail(sourceEmail).click();

        ContactInfoPage contactInfoPage = new ContactInfoPage();

        String actualFullName= contactInfoPage.name.getText();
        String actualEmail = contactInfoPage.email.getText();
        String actualPhone = contactInfoPage.phone.getText();

        extentLogger.info("Verify full name is Mariam Brackstone");
        Assert.assertEquals(actualFullName,"Mariam Brackstone","verify full name");

        extentLogger.info("Verify email is mbrackstone9@example.com");
        Assert.assertEquals(actualEmail,"mbrackstone9@example.com","verify email");

        extentLogger.info("Verify phone number is +18982323434");
        Assert.assertEquals(actualPhone,"+18982323434","verify phone number");


        extentLogger.pass("PASSED");




    }




}
