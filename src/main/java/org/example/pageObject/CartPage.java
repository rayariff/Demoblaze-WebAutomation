package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
    public static WebDriver webDriver;
    public CartPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }
    @FindBy(xpath = "//a[.='Cart']")
    private WebElement cartNavigation;
    @FindBy(xpath = "//h2[.='Products']")
    private WebElement cartPage;
    @FindBy(xpath = "//img[@src='imgs/galaxy_s6.jpg']")
    private WebElement imageProduct;
    @FindBy(xpath = "//td[.='Samsung galaxy s6']")
    private WebElement nameProduct;
    @FindBy(xpath = "//td[.='360']")
    private WebElement priceProduct;
    @FindBy(xpath = "//a[.='Delete']")
    private WebElement deleteButton;
    @FindBy(xpath = "//h3[@id='totalp']")
    private WebElement totalPriceProduct;
    @FindBy(xpath = "//button[@class='btn btn-success']")
    private WebElement placeOrderButton;
    @FindBy(xpath = "//input[@id='name']")
    private WebElement nameField;
    @FindBy(xpath = "//input[@id='country']")
    private WebElement countryField;
    @FindBy(xpath = "//input[@id='city']")
    private WebElement cityField;
    @FindBy(xpath = "//input[@id='card']")
    private WebElement creditCardField;
    @FindBy(xpath = "//input[@id='month']")
    private WebElement monthField;
    @FindBy(xpath = "//input[@id='year']")
    private WebElement yearField;
    @FindBy(xpath = "//button[.='Purchase']")
    private WebElement purchaseButton;
    @FindBy(xpath = "//h2[.='Thank you for your purchase!']")
    private WebElement thankYouNotification;

    public void clickCartNavigation(){
        cartNavigation.click();
    }
    public boolean verifyCartPage(){
        return cartPage.isDisplayed();
    }
    public boolean verifyImageProduct(){
        return imageProduct.isDisplayed();
    }
    public boolean verifyNameProduct(){
        return nameProduct.isDisplayed();
    }
    public boolean verifyPriceProduct(){
        return priceProduct.isDisplayed();
    }
    public boolean verifyTotalPriceProduct(){
        return totalPriceProduct.isDisplayed();
    }
    public void clickDeleteButton(){
        deleteButton.click();
    }
    public void clickPlaceOrderButton(){
        placeOrderButton.click();
    }
    public void inputNameField(String name){
        nameField.sendKeys(name);
    }
    public void inputCountryField(String country){
        countryField.sendKeys(country);
    }
    public void inputCityField(String city){
        cityField.sendKeys(city);
    }
    public void inputCreditCardField(String creditCard){
        creditCardField.sendKeys(creditCard);
    }
    public void inputMonthField(String month){
        monthField.sendKeys(month);
    }
    public void inputYearField(String year){
        yearField.sendKeys(year);
    }
    public void clickPurchaseButton(){
        purchaseButton.click();
    }
    public boolean verifyThankYouNotification(){
        return thankYouNotification.isDisplayed();
    }

}
