package org.deep.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage {

    WebDriver driver;

    public LandingPage(WebDriver driver) {

        this.driver = driver;
    }

    @FindBy(id = "Email")
    WebElement emailInput;
    @FindBy(id = "Password")
    WebElement password;
    @FindBy(xpath = "//input[@value='Log in']")
    WebElement login;


    public void loginDemo(String email, String passwordValue) {

        emailInput.sendKeys(email);
        password.sendKeys(passwordValue);
        login.click();
    }

}
