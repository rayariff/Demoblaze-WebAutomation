package org.example.pageObject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupPage {
    public static WebDriver webDriver;

    public SignupPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }
    @FindBy(xpath = "//a[.='Sign up']")
    private WebElement signupNavigation;
    @FindBy(xpath = "//input[@id='sign-username']")
    private WebElement usernameField;
    @FindBy(xpath = "//input[@id='sign-password']")
    private WebElement passwordField;
    @FindBy(xpath = "//button[.='Sign up']")
    private WebElement signupButton;

    public void clickSignupNavigation(){
        signupNavigation.click();
    }
    public void inputUsernameField(String username){
        usernameField.sendKeys(username);
    }
    public void inputPasswordField(String password){
        passwordField.sendKeys(password);
    }
    public void clickSignupButton(){
        signupButton.click();
    }
}
