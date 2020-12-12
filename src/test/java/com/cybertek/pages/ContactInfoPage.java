package com.cybertek.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactInfoPage extends BasePage{


    @FindBy(css= "div.control-label.html-property>h1")
    public WebElement name;

    @FindBy(css= "a.phone")
    public WebElement phone;

    @FindBy(css= "a.email")
    public WebElement email;


}
