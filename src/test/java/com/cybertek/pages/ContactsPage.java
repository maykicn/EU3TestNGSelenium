package com.cybertek.pages;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage  extends BasePage {


    public  WebElement getInfoEmail(String emailInput ){

       WebElement email=Driver.get().findElement(By.xpath("//td[contains(text(),'"+emailInput+"')]"));

       return email;


    }









}
