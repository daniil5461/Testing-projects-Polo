import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StartingPage {
    WebDriver driver;
    @FindBy(id="email")
    private WebElement email;
    @FindBy(id="password")
    private WebElement password;
    @FindBy(id="submit")
    private WebElement submitBtn;
    @FindBy(id="signup")
    private WebElement signupBtn;
    public HomePage login(String user, String pass){
        email.sendKeys(user);
        password.sendKeys(pass);
        submitBtn.click();
        return new HomePage(driver);

    }
    public SignupPage signup(){
        signupBtn.click();
        return new SignupPage(driver);
    }

    public StartingPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
