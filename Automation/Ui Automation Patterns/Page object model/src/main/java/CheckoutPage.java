import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class CheckoutPage {
    WebDriver driver;
    @FindBy(id="first-name")
    private WebElement firstname;
    @FindBy(id="last-name")
    private WebElement lastname;
    @FindBy(id="postal-code")
    private WebElement zipcode;
    @FindBy(id="continue")
    private WebElement continueBtn;
    @FindBy(id="cancel")
    private WebElement cancel;
    public void InfoFillout(String FirstName, String LastName, String PostalCode){

        firstname.sendKeys(FirstName);

        lastname.sendKeys(LastName);

        zipcode.sendKeys(PostalCode);

    }
public CheckoutFinishPage continueClick(){

        continueBtn.click();
        return new CheckoutFinishPage(driver);
}
    public CheckoutPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
