package org.deep.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {

    WebDriver driver;

    public LandingPage(WebDriver driver) {

        this.driver = driver;
    }

//    private By emailInput = By.id("Email");
//    private By password = By.id("Password");
//    private By loginButton = By.xpath("//input[@value='Log in']");


//    @FindBy(xpath = "//a[@href='/login']") WebElement loginButton;
    @FindBy(id="Email") WebElement emailInput;
    @FindBy(id="Password") WebElement password;
    @FindBy(xpath = "//input[@value='Log in']") WebElement login;



    public void loginDemo(String email, String passwordValue) {

//        driver.get(URl);
        emailInput.sendKeys(email);
        password.sendKeys(passwordValue);
        login.click();
//        driver.findElement(emailInput).sendKeys(email);
//        driver.findElement(password).sendKeys(passwordValue);
//        driver.findElement(loginButton).click();

    }

}
