import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    AddContactPage acp;
    WebDriver driver;
    @FindBy(id="add-contact")
    private WebElement addContact;
    @FindBy(id="logout")
    private WebElement logout;


    public AddContactPage addContact(){
        addContact.click();
        return new AddContactPage(driver);
    }
    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
