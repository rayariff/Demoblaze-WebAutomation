package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
    public static WebDriver webDriver;

    public ProductPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }
    @FindBy(xpath = "//div[@class='product-content product-wrap clearfix product-deatil']")
    private WebElement productPage;
    @FindBy(xpath = "//img[@src='imgs/galaxy_s6.jpg']")
    private WebElement productImage;
    @FindBy(xpath = "//h2[@class='name']")
    private WebElement productName;
    @FindBy(xpath = "//h3[@class='price-container']")
    private WebElement productPrice;
    @FindBy(xpath = "//div[@id='more-information']/p[1]")
    private WebElement productDescription;
    @FindBy(xpath = "//a[.='Add to cart']")
    private WebElement addCartButton;

    public boolean verifyProductPage(){
        return productPage.isDisplayed();
    }
    public boolean verifyProductImage(){
        return productImage.isDisplayed();
    }
    public boolean verifyProductName(){
        return productName.isDisplayed();
    }
    public boolean verifyProductPrice(){
        return productPrice.isDisplayed();
    }
    public boolean verifyProductDesc(){
        return productDescription.isDisplayed();
    }
    public void clickAddCartButton(){
        addCartButton.click();
    }
}
