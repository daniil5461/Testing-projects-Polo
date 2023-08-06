import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
public class LoginPage {
WebDriver driver;
    @FindBy(id="user-name")
    private WebElement username;
    @FindBy(id="password")
    private WebElement password;
    @FindBy(id="login-button")
    private WebElement loginButton;
    @FindBy(xpath="//a[@class='shopping_cart_link']")
    private WebElement cartBtn;
    public  CatalogPage Login(String user, String pass){
        username.sendKeys(user);
        password.sendKeys(pass);
        loginButton.click();
        return new CatalogPage(driver);
    }
public boolean usernameIsDisplayed(){
        return username.isDisplayed();
}
    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

}
