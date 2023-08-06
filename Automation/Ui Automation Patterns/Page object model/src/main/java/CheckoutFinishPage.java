import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class CheckoutFinishPage {
    WebDriver driver;
    @FindBy(id="finish")
    private WebElement finish;
    @FindBy(id="cancel")
    private WebElement cancel;
    public CheckoutFinishCongratulationPage FinishClick(){

        finish.click();
        return new CheckoutFinishCongratulationPage(driver);
    }
    public CheckoutFinishPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

}
