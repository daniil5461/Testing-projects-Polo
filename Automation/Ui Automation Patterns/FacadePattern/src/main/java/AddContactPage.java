import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddContactPage {
    WebDriver driver;
    @FindBy(id="firstName")
    private WebElement firstName;
    @FindBy(id="lastName")
    private WebElement lastName;
    @FindBy(id="birthdate")
    private WebElement birthdate;
    @FindBy(id="email")
    private WebElement email;
    @FindBy(id="phone")
    private WebElement phone;
    @FindBy(id="street1")
    private WebElement street1;
    @FindBy(id="city")
    private WebElement city;
    @FindBy(id="street2")
    private WebElement street2;
    @FindBy(id="stateProvince")
    private WebElement stateProvince;
    @FindBy(id="postalCode")
    private WebElement postalCode;
    @FindBy(id="country")
    private WebElement country;
    @FindBy(id="submit")
    private WebElement submit;
    @FindBy(id="cancel")
    private WebElement cancel;
    public HomePage addContact(String fn, String ln, String date, String streetn, String streetn2, String state, String postal,String count ){
        firstName.sendKeys(fn);
        lastName.sendKeys(ln);
        birthdate.sendKeys(date);
        street1.sendKeys(streetn);
        street2.sendKeys(streetn2);
        stateProvince.sendKeys(state);
        postalCode.sendKeys(postal);
        country.sendKeys(count);
        submit.click();
        return new HomePage(driver);
    }
    public HomePage cancel(){
        cancel.click();
        return new HomePage(driver);
    }

    public AddContactPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
