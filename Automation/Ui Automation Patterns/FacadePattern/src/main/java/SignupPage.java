import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SignupPage {
    WebDriver driver;
    @FindBy(id="firstName")
    private WebElement firstName;
    @FindBy(id="lastName")
    private WebElement lastName;
    @FindBy(id="email")
    private WebElement email;
    @FindBy(id="password")
    private WebElement password;
    @FindBy(id="submit")
    private WebElement submit;
    @FindBy(id="cancel")
    private WebElement cancel;
    public HomePage signUp(String fn, String ln, String em, String pass){
        firstName.sendKeys(fn);
        lastName.sendKeys(ln);
        email.sendKeys(em);
        password.sendKeys(pass);
        submit.click();
        return new HomePage(driver);
    }
    public void cancel() {
        cancel.click();
    }
    public SignupPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

}
