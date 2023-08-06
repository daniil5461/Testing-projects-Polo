import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class CatalogPage {
    WebDriver driver;
    @FindBy(xpath="//button[@id='react-burger-menu-btn']")
    private WebElement leftMenuBtn;
    @FindBy(xpath="//a[@id='inventory_sidebar_link']")
    private WebElement allItemsBtn;
    @FindBy(xpath="//a[@id='about_sidebar_link']")
    private WebElement aboutBtn;
    @FindBy(xpath="//a[@id='logout_sidebar_link']")
    private WebElement logoutBtn;
    @FindBy(xpath="//a[@id='reset_sidebar_link']")
    private WebElement resetAppStateBtn;
    @FindBy(xpath="//button[@id='react-burger-cross-btn']")
    private WebElement crossBtn;
    @FindBy(xpath="//a[@class='shopping_cart_link']")
    private WebElement cartBtn;
    @FindBy(xpath="//select[@class='product_sort_container']")
    private WebElement sortGlider;

    public CartTab cartClick(){
        cartBtn.click();
        return new CartTab(driver);
    }
    public CatalogPage leftSideBar(){
        leftMenuBtn.click();
        return new CatalogPage(driver);
    }
    public void allItems(){
        allItemsBtn.click();
    }
    public void about(){
        aboutBtn.click();
    }
    public LoginPage logoutClick(){

        logoutBtn.click();
        return new LoginPage(driver);
    }
    public void resetAppState(){
        resetAppStateBtn.click();
    }
public void sortGlider(){
        sortGlider.click();
}
    public boolean cartisDisplayed(){
        return cartBtn.isDisplayed();
    }
    public CatalogPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

}
