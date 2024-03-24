package org.example.pageObject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public static WebDriver webDriver;

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }
    @FindBy(xpath = "//a[.='Log in']")
    private WebElement loginNavigation;
    @FindBy(xpath = "//input[@id='loginusername']")
    private WebElement usernameField;
    @FindBy(xpath = "//input[@id='loginpassword']")
    private WebElement passwordField;
    @FindBy(xpath = "//button[.='Log in']")
    private WebElement loginButton;
    @FindBy(xpath = "//a[@id='nameofuser']")
    private WebElement textWelcomeUser;
    public void clickLoginNavigation(){
        loginNavigation.click();
    }
    public void inputUsernameField(String username){
        usernameField.sendKeys(username);
    }
    public void inputPasswordField(String password){
        passwordField.sendKeys(password);
    }
    public void clickLoginButton(){
        loginButton.click();
    }
    public boolean verifyWelcomeUser(){
        return textWelcomeUser.isDisplayed();
    }

    public String alertMessage(){
        Alert alert = webDriver.switchTo().alert();
        String alertText = alert.getText();
        System.out.println("Alert Text: " + alertText);
        alert.accept();
        return alertText;
    }
}
