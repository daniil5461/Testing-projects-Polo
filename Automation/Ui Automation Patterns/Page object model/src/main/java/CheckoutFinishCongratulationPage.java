import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class CheckoutFinishCongratulationPage {
    WebDriver driver;
    @FindBy(id="back-to-products")
    private WebElement backHome;
    public CatalogPage backHomeClick(){
        backHome.click();
        return new CatalogPage(driver);
    }
    public boolean backHomeIsDisplayed(){

        return backHome.isDisplayed();
    }
    public CheckoutFinishCongratulationPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
