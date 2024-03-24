package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    public static WebDriver webDriver;

    public HomePage(WebDriver driver){
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }
    @FindBy(xpath = "//img[@alt='First slide']")
    private WebElement carouselImage1;
    @FindBy(xpath = "//img[@alt='Second slide']")
    private WebElement carouselImage2;
    @FindBy(xpath = "//img[@alt='Third slide']")
    private WebElement carouselImage3;
    @FindBy(xpath = "//span[@class='carousel-control-next-icon']")
    private WebElement nextButtonCarousel;
    @FindBy(xpath = "//span[@class='carousel-control-prev-icon']")
    private WebElement prevButtonCarousel;
    @FindBy(xpath = "//a[.='Phones']")
    private WebElement phoneCategories;
    @FindBy(xpath = "//a[.='Monitors']")
    private WebElement monitorCategories;
    @FindBy(xpath = "//div[@id='tbodyid']/div[contains(.,'Samsung galaxy s6$360The Samsung Galaxy S6 is powered by 1.5GHz octa-core Samsun')]")
    private WebElement phoneItem;
    @FindBy(xpath = "//div[@id='tbodyid']/div[contains(.,'ASUS Full HD$230ASUS VS247H-P 23.6- Inch Full HD')]")
    private WebElement monitorItem;
    @FindBy(xpath = "//div[@id='tbodyid']/div[1]//img[@src='imgs/galaxy_s6.jpg']")
    private WebElement imageProductCard;
    @FindBy(xpath = "//a[.='Samsung galaxy s6']")
    private WebElement nameProductCard;
    @FindBy(xpath = "//div[@id='tbodyid']/div[contains(.,'Samsung galaxy s7$800The Samsung Galaxy S7 is powered by 1.6GHz octa-core it com')]")
    private WebElement phoneItem2;
    @FindBy(xpath = "//h5[.='$360']")
    private WebElement priceProductCard;
    @FindBy(xpath = "//div[@id='tbodyid']/div[1]//p[@id='article']")
    private WebElement descProductCard;
    @FindBy(xpath = "//button[.='Next']")
    private WebElement nextProductButton;
    @FindBy(xpath = "//button[.='Previous']")
    private WebElement prevProductButton;

    public boolean verifyCarouselImage(){
        return carouselImage1.isDisplayed();
    }
    public void clickNextButtonCarousel(){
        nextButtonCarousel.click();
    }
    public boolean verifyNextButtonCarousel(){
        return carouselImage2.isDisplayed();
    }
    public void clickPrevButtonCarousel(){
        prevButtonCarousel.click();
    }
    public boolean verifyPrevButtonCarousel(){
        return carouselImage3.isDisplayed();
    }
    public void clickPhoneCategories(){
        phoneCategories.click();
    }
    public void clickMonitorCategories(){
        monitorCategories.click();
    }
    public boolean verifyRelevantItemPhone(){
        return phoneItem.isDisplayed();
    }
    public boolean verifyRelevantItemPhone2(){
        return phoneItem2.isDisplayed();
    }
    public boolean verifyRelevantItemMonitor(){
        return monitorItem.isDisplayed();
    }
    public boolean verifyImageProductCard(){
        return imageProductCard.isDisplayed();
    }
    public void clickProductCard(){
        imageProductCard.click();
    }
    public boolean verifyNameProductCard(){
        return nameProductCard.isDisplayed();
    }
    public boolean verifyPriceProductCard(){
        return priceProductCard.isDisplayed();
    }
    public boolean verifyDescProductCard(){
        return descProductCard.isDisplayed();
    }
    public void clickNextProductButton(){
        nextProductButton.click();
    }
    public void clickPrevProductButton(){
        prevProductButton.click();
    }
}
