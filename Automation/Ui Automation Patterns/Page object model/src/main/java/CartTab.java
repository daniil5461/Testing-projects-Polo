import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class CartTab {
    WebDriver driver;
    @FindBy(id="continue-shopping")
    private WebElement continueShopping;
    @FindBy(id="checkout")
    private WebElement checkout;
    public CatalogPage ContinueShopping(){
        continueShopping.click();
        return new CatalogPage(driver);
    }
    public CheckoutPage CheckoutClick(){

        checkout.click();
        return new CheckoutPage(driver);
    }
    public CartTab(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

}
